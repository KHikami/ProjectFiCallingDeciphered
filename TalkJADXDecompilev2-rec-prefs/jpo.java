package p000;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.provider.Settings.Secure;

public final class jpo {
    public static final Uri f20705a = Uri.parse("https://lh3.googleusercontent.com");
    public static int f20706b = -1;
    static Context f20707c;
    private static jpq f20708d = new jpq();

    static int m24933a(Context context) {
        if (context == null) {
            return 0;
        }
        String string = Secure.getString(f20707c.getContentResolver(), "android_id");
        if (string == null) {
            return 0;
        }
        int abs = Math.abs(string.hashCode());
        if (abs == 0) {
            return 1;
        }
        return abs;
    }

    public static String m24940a(String str, int i, RectF rectF) {
        String a = jpo.m24937a(str, i, 0, 0, 0, -1, -1, rectF, jpp.f20709a, -1);
        if (a == null) {
            return jpr.m24954a(-1, str);
        }
        return a;
    }

    public static String m24939a(String str, int i, int i2, RectF rectF) {
        String a = jpo.m24937a(str, i, i2, 0, 0, -1, -1, rectF, jpp.f20709a, -1);
        if (a == null) {
            return jpr.m24954a(i2, str);
        }
        return a;
    }

    public static String m24936a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        String a = jpo.m24937a(str, i, 0, i2, i3, i5, i6, null, jpp.f20709a, i4);
        if (a != null) {
            return a;
        }
        if (i2 == 0 && i3 == 0) {
            return str;
        }
        return jpr.m24953a(i2, i3, str);
    }

    public static String m24938a(String str, int i, int i2, int i3, int i4, int i5, RectF rectF) {
        String a = jpo.m24937a(str, i, 0, i2, i3, i4, i5, rectF, jpp.f20709a, -1);
        if (a != null) {
            return a;
        }
        if (i2 == 0 && i3 == 0) {
            return str;
        }
        return jpr.m24953a(i2, i3, str);
    }

    public static boolean m24941a(String str) {
        if (str == null) {
            return false;
        }
        return f20708d.m24950a(str);
    }

    private static String m24937a(String str, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF, int i7, int i8) {
        return f20708d.m24949a(str, i, i2, i3, i4, i5, i6, rectF, i7, i8);
    }

    public static String m24935a(RectF rectF, int i) {
        RectF rectF2 = new RectF();
        String valueOf = String.valueOf(jpo.m24934a(rectF.left));
        String valueOf2 = String.valueOf(jpo.m24934a(rectF.top));
        String valueOf3 = String.valueOf(jpo.m24934a(rectF.right));
        String valueOf4 = String.valueOf(jpo.m24934a(rectF.bottom));
        return new StringBuilder((((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("-fcrop64=1,").append(valueOf).append(valueOf2).append(valueOf3).append(valueOf4).toString();
    }

    private static String m24934a(float f) {
        if (((double) f) < 0.0d || ((double) f) > 1.0d) {
            f = Math.max(0.0f, Math.min(1.0f, f));
        }
        String num = Integer.toString((int) (65535.0f * f), 16);
        String valueOf = String.valueOf("0000".substring(0, 4 - num.length()));
        num = String.valueOf(num);
        return num.length() != 0 ? valueOf.concat(num) : new String(valueOf);
    }
}
