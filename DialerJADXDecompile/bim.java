import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Pair;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class bim implements bea {
    public static bim a;
    private static final String b;
    private final Context c;

    static {
        b = bim.class.getSimpleName();
    }

    public bim(Context context) {
        this.c = context;
    }

    public final boolean a(String str, beb beb) {
        if (beb == null || str == null) {
            return false;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("vnd.android.cursor.item/contact");
            if (optJSONObject == null || bjs.a(optJSONObject, "vnd.android.cursor.item/postal-address_v2") == null) {
                return false;
            }
            new bin(this, a(Calendar.getInstance().get(7), optJSONObject.getJSONObject("placeDetails")), beb).execute(new Address[]{a(r3.optString("data1", null), optJSONObject)});
            return true;
        } catch (JSONException e) {
            String str2 = b;
            String valueOf = String.valueOf(e);
            bdf.e(str2, new StringBuilder(String.valueOf(valueOf).length() + 23).append("JSON parsing exception ").append(valueOf).toString());
            return false;
        }
    }

    private static Address a(String str, JSONObject jSONObject) {
        if (str == null) {
            return null;
        }
        Address address = new Address(Locale.getDefault());
        address.setAddressLine(0, str);
        if (jSONObject == null) {
            return address;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("lat_lng");
        if (optJSONObject == null) {
            return address;
        }
        try {
            address.setLatitude(optJSONObject.getDouble("lat"));
            address.setLongitude(optJSONObject.getDouble("lng"));
            return address;
        } catch (JSONException e) {
            String str2 = b;
            String valueOf = String.valueOf(e);
            bdf.e(str2, new StringBuilder(String.valueOf(valueOf).length() + 23).append("JSON parsing exception ").append(valueOf).toString());
            return address;
        }
    }

    private List a(int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("openingHours");
        if (optJSONObject == null || i > 7) {
            return null;
        }
        try {
            List arrayList = new ArrayList();
            JSONArray jSONArray = optJSONObject.getJSONArray("periods");
            Object obj = null;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj2;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("open");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("close");
                int i3 = i - 1;
                int a = a(jSONObject3.getInt("day") - i3);
                if (a == 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                Object obj3;
                if (a == 1) {
                    obj3 = 1;
                } else {
                    obj3 = null;
                }
                if (obj2 != null || (r3 != null && obj == null)) {
                    Calendar a2 = a(jSONObject3.getString("time"), a(a));
                    Calendar a3 = a(jSONObject4.getString("time"), a(jSONObject4.getInt("day") - i3));
                    if (!(a2 == null || a3 == null)) {
                        if (obj2 != null) {
                            arrayList.add(Pair.create(a2, a3));
                        } else {
                            obj = Pair.create(a2, a3);
                        }
                    }
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            return arrayList;
        } catch (JSONException e) {
            String str = b;
            String valueOf = String.valueOf(e);
            bdf.e(str, new StringBuilder(String.valueOf(valueOf).length() + 23).append("JSON parsing exception ").append(valueOf).toString());
            return null;
        }
    }

    private static int a(int i) {
        return (i < 0 ? 7 : 0) + i;
    }

    private static Date a(String str) {
        try {
            return new SimpleDateFormat("HHmm").parse(str);
        } catch (ParseException e) {
            String str2 = b;
            String str3 = "Could not parse time string ";
            String valueOf = String.valueOf(str);
            bdf.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
    }

    private final Calendar a(String str, int i) {
        Date a = a(str);
        if (a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(a);
        Calendar instance2 = Calendar.getInstance();
        instance.set(instance2.get(1), instance2.get(2), instance2.get(5));
        instance.add(5, i);
        return instance;
    }

    final Address a(Address address) {
        String str;
        String valueOf;
        try {
            if (!Geocoder.isPresent()) {
                return address;
            }
            Geocoder geocoder = new Geocoder(this.c);
            List fromLocationName = geocoder.getFromLocationName(address.getAddressLine(0), 1);
            if (fromLocationName != null && fromLocationName.size() > 0) {
                return (Address) fromLocationName.get(0);
            }
            fromLocationName = geocoder.getFromLocation(address.getLatitude(), address.getLongitude(), 1);
            if (fromLocationName == null || fromLocationName.size() <= 0) {
                return address;
            }
            return (Address) fromLocationName.get(0);
        } catch (IOException e) {
            str = b;
            String valueOf2 = String.valueOf(address.getAddressLine(0));
            valueOf = String.valueOf(e);
            bdf.e(str, new StringBuilder((String.valueOf(valueOf2).length() + 37) + String.valueOf(valueOf).length()).append("Unable to find address details for ").append(valueOf2).append(". ").append(valueOf).toString());
            return address;
        } catch (IllegalStateException e2) {
            valueOf = b;
            str = String.valueOf(address);
            bdf.e(valueOf, new StringBuilder(String.valueOf(str).length() + 29).append("No latitude or longitude for ").append(str).toString());
            return address;
        }
    }
}
