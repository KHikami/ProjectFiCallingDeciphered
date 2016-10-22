import android.content.Context;
import android.graphics.Point;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.WindowManager;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
public class bjr {
    private static final String a;
    private static final String[] b;
    private static final String c;
    private static final String[] d;
    private static final String e;
    private static Map f;
    private static Map g;

    static {
        a = bjr.class.getSimpleName();
        b = new String[]{"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.peopleapi.readwrite"};
        String str = "oauth2:";
        String valueOf = String.valueOf(TextUtils.join(" ", b));
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        c = valueOf;
        d = new String[]{"https://www.googleapis.com/auth/plus.contactphotos"};
        str = "oauth2:";
        valueOf = String.valueOf(TextUtils.join(" ", d));
        e = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        f = new ArrayMap();
        g = new ArrayMap();
    }

    private static synchronized void a(Context context, String str) {
        synchronized (bjr.class) {
            bps.a(context, (String) f.get(str));
            f.remove(str);
        }
    }

    private static synchronized void b(Context context, String str) {
        synchronized (bjr.class) {
            bps.a(context, (String) g.get(str));
            g.remove(str);
        }
    }

    public final bjt a(Context context, String str, String str2, String str3, boolean z, boolean z2) {
        Objects.requireNonNull(str2);
        Objects.requireNonNull(str);
        try {
            return b(context, str, str2, str3, z, z2);
        } catch (Exception e) {
            bdf.c(a, "Authentication error. Already invalidated auth token and retried. Aborting lookup.");
            a(context, str);
            try {
                return b(context, str, str2, str3, z, z2);
            } catch (bld e2) {
                bdf.a(a, "Tried again but still got auth error during phone number lookup.", e);
                return null;
            }
        }
    }

    public static InputStream a(Context context, String str, String str2) {
        InputStream inputStream = null;
        List a;
        if (str2.startsWith(bjy.b())) {
            String a2 = blm.a(context, str, e);
            if (a2 != null) {
                a = blm.a(a2);
                try {
                    TrafficStats.setThreadStatsTag(47787);
                    inputStream = blo.a(context, str2, "GET", a);
                } catch (Exception e) {
                    bdf.c(a, "Authentication error. Already invalidated auth token and retried. Aborting lookup.");
                    b(context, str);
                    try {
                        inputStream = blo.a(context, str2, "GET", a);
                    } catch (bld e2) {
                        bdf.a(a, "Tried again but still got auth error during image lookup.", e);
                        TrafficStats.clearThreadStatsTag();
                    }
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } else {
            Object obj = inputStream;
            TrafficStats.setThreadStatsTag(47787);
            inputStream = blo.a(context, str2, "GET", a);
        }
        return inputStream;
    }

    private final bjt b(Context context, String str, String str2, String str3, boolean z, boolean z2) {
        String a = blm.a(context, str, c);
        if (a == null) {
            return null;
        }
        String a2 = a(context, str2, z, z2);
        if (a2 != null) {
            return a(context, a2, str2, str3, a);
        }
        return null;
    }

    private final bjt a(Context context, String str, String str2, String str3, String str4) {
        String b;
        try {
            TrafficStats.setThreadStatsTag(47786);
            b = blo.b(context, str, "GET", blm.a(str4));
        } catch (IOException e) {
            b = e;
            bdf.a(a, "Error looking up phone number.", (Exception) b);
            b = null;
            if (b == null) {
                return null;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return bjs.a(b, str2, str3, bjy.b(), Math.min(540, point.x / 2));
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
        if (b == null) {
            return null;
        }
        WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
        Point point2 = new Point();
        windowManager2.getDefaultDisplay().getSize(point2);
        return bjs.a(b, str2, str3, bjy.b(), Math.min(540, point2.x / 2));
    }

    private static String a(Context context, String str, boolean z, boolean z2) {
        StringBuilder stringBuilder = new StringBuilder("https://www.googleapis.com/plus/v2whitelisted/people/lookup?");
        stringBuilder.append(bjy.c());
        stringBuilder.append("&type=phone&fields=kind,items(id,metadata(objectType,plusPageType,attributions),names,phoneNumbers(value,type,formattedType,canonicalizedForm),addresses(value,type,formattedType),images(url,metadata(container)),urls(value),placeDetails)");
        if (z) {
            stringBuilder.append("&includePlaces=1");
        }
        stringBuilder.append("&callType=");
        if (z2) {
            stringBuilder.append("incoming");
        } else {
            stringBuilder.append("outgoing");
        }
        try {
            stringBuilder.append("&id=").append(URLEncoder.encode(str, "UTF-8"));
            return stringBuilder.toString();
        } catch (Exception e) {
            bdf.a(a, "Error encoding phone number.  UTF-8 is not supported?!", e);
            return null;
        }
    }
}
