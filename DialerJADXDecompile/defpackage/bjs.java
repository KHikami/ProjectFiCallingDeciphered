package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: bjs */
public class bjs {
    private static final String a;
    private static final Map b;
    private static final Map c;
    private static final Map d;

    static {
        a = bjs.class.getSimpleName();
        b = new daa().a("displayName", "data1").a("givenName", "data2").a("familyName", "data3").a("honorificPrefix", "data4").a("middleName", "data5").a("honorificSuffix", "data6").a("phoneticGivenName", "data7").a("phoneticFamilyName", "data9").a();
        new daa().a("value", "data1").a("type", "data2").a();
        c = new daa().a("home", Integer.valueOf(1)).a("work", Integer.valueOf(3)).a("mobile", Integer.valueOf(2)).a("homeFax", Integer.valueOf(5)).a("workFax", Integer.valueOf(4)).a("otherFax", Integer.valueOf(13)).a("pager", Integer.valueOf(6)).a("workMobile", Integer.valueOf(17)).a("workPager", Integer.valueOf(18)).a("main", Integer.valueOf(12)).a("googleVoice", Integer.valueOf(0)).a("other", Integer.valueOf(7)).a();
        d = new daa().a("home", Integer.valueOf(1)).a("work", Integer.valueOf(2)).a("other", Integer.valueOf(3)).a();
    }

    public static bjt a(String str, String str2, String str3, String str4, int i) {
        String string;
        String optString;
        String string2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            string = jSONObject.getString("kind");
            if ("plus#peopleList".equals(string)) {
                JSONObject a = bjs.a(jSONObject, "items");
                if (a == null) {
                    return null;
                }
                String[] c;
                Object obj;
                String str5;
                Integer num;
                Object obj2;
                String str6;
                boolean z;
                String string3 = a.getString("id");
                JSONObject optJSONObject = a.optJSONObject("metadata");
                if (optJSONObject != null) {
                    optString = optJSONObject.optString("objectType", null);
                    Object obj3 = optString == null ? 1 : !optString.equals("page") ? 1 : null;
                    c = bjs.c(optJSONObject, "attributions");
                    obj = obj3;
                } else {
                    c = null;
                    int i2 = 1;
                }
                string = null;
                Integer valueOf = Integer.valueOf(obj != null ? 40 : 30);
                if (str3 != null) {
                    str5 = str3;
                } else {
                    str5 = str2;
                }
                int i3 = obj != null ? 2 : 12;
                String str7 = null;
                String str8 = null;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject = bjs.a(a, "names");
                if (jSONObject != null) {
                    string = jSONObject.getString("displayName");
                    jSONObject2.put("vnd.android.cursor.item/name", bjs.a(jSONObject, b));
                }
                jSONObject = bjs.d(a, str2);
                if (jSONObject != null) {
                    str5 = jSONObject.getString("value");
                    string2 = jSONObject.getString("type");
                    String optString2 = jSONObject.optString("formattedType", null);
                    num = (Integer) c.get(string2);
                    obj2 = null;
                    if (num == null || num.intValue() == 0) {
                        obj2 = optString2;
                    }
                    Pair create = Pair.create(num, obj2);
                    i3 = ((Integer) create.first).intValue();
                    str7 = (String) create.second;
                }
                jSONObject = new JSONObject().put("data1", str5).put("data2", i3).putOpt("data3", str7);
                jSONObject2.put("vnd.android.cursor.item/phone_v2", buf.a(jSONObject));
                if (c == null) {
                    if (obj == null) {
                        str6 = "vnd.android.cursor.item/postal-address_v2";
                        JSONObject[] jSONObjectArr = new JSONObject[1];
                        jSONObject = bjs.a(a, "addresses");
                        if (jSONObject == null) {
                            jSONObject = null;
                        } else {
                            Pair create2;
                            String string4 = jSONObject.getString("value");
                            string2 = jSONObject.optString("type", null);
                            str8 = jSONObject.optString("formattedType", null);
                            if (string2 == null) {
                                create2 = Pair.create(null, null);
                            } else {
                                num = (Integer) d.get(string2);
                                obj2 = null;
                                if (num == null || num.intValue() == 0) {
                                    obj2 = str8;
                                }
                                create2 = Pair.create(num, obj2);
                            }
                            jSONObject = new JSONObject().put("data1", string4).putOpt("data2", create2.first).putOpt("data3", create2.second);
                        }
                        jSONObjectArr[0] = jSONObject;
                        jSONObject2.putOpt(str6, buf.a(jSONObjectArr));
                        bjs.a(jSONObject2, bjs.a(a));
                        jSONObject2.putOpt("placeDetails", bjs.a(a, "placeDetails"));
                    }
                    str8 = ble.a(i, bjs.b(a, str4), false, false);
                }
                str6 = new JSONObject().put("display_name", string).put("display_name_source", valueOf).putOpt("photo_uri", str8).put("vnd.android.cursor.item/contact", jSONObject2).toString();
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new bjt(string, str2, str5, i3, str7, str8, str6, z, string3);
            }
            string2 = "Unknown 'kind' when trying to parse people response: ";
            optString = String.valueOf(string);
            if (optString.length() != 0) {
                optString = string2.concat(optString);
            } else {
                optString = new String(string2);
            }
            bdf.b(a, optString);
            string = a;
            string2 = "Json response: ";
            optString = String.valueOf(str);
            if (optString.length() != 0) {
                optString = string2.concat(optString);
            } else {
                optString = new String(string2);
            }
            bdf.a(string, optString);
            return null;
        } catch (Exception e) {
            bdf.a(a, "Required fields not found in json.", e);
            string = a;
            string2 = "Json response: ";
            optString = String.valueOf(str);
            if (optString.length() != 0) {
                optString = string2.concat(optString);
            } else {
                optString = new String(string2);
            }
            bdf.a(string, optString);
        }
    }

    private static JSONObject a(JSONObject jSONObject, Map map) {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : map.keySet()) {
            jSONObject2.putOpt((String) map.get(str), jSONObject.optString(str, null));
        }
        return jSONObject2;
    }

    private static String b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null) {
            return null;
        }
        String str2 = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("metadata");
                if (optJSONObject == null || !"contact".equals(optJSONObject.optString("container"))) {
                    String optString = jSONObject2.optString("url", null);
                    if (TextUtils.isEmpty(optString)) {
                        continue;
                    } else if (!optString.startsWith(str)) {
                        return optString;
                    } else {
                        str2 = optString;
                    }
                }
            }
        }
        return str2;
    }

    private static void a(JSONObject jSONObject, String[] strArr) {
        if (strArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : strArr) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data1", obj);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("vnd.android.cursor.item/website", jSONArray);
        }
    }

    private static String[] a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getJSONObject(i).getString("value");
        }
        return strArr;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        return optJSONArray.getJSONObject(0);
    }

    private static String[] c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static JSONObject d(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("phoneNumbers");
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 != null && str.equals(jSONObject2.optString("canonicalizedForm", null))) {
                return jSONObject2;
            }
        }
        return null;
    }
}
