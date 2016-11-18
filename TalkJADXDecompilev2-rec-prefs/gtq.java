package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public class gtq {
    public static final int f16129c = gtv.f16137b;
    public static final gtq f16130d = new gtq();

    gtq() {
    }

    private static String m18542b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f16129c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    public int mo2334a(Context context) {
        int c = gtv.m18572c(context);
        return gtv.m18571b(context, c) ? 18 : c;
    }

    public PendingIntent mo2335a(Context context, int i, int i2) {
        return mo2336a(context, i, i2, null);
    }

    public PendingIntent mo2336a(Context context, int i, int i2, String str) {
        if (gwb.m1465X(context) && i == 2) {
            i = 42;
        }
        Intent a = mo2337a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, 268435456);
    }

    public Intent mo2337a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return gwo.m18804a("com.google.android.gms", gtq.m18542b(context, str));
            case 3:
                return gwo.m18803a("com.google.android.gms");
            case 42:
                return gwo.m18802a();
            default:
                return null;
        }
    }

    public boolean mo2338a(int i) {
        return gtv.m18573c(i);
    }

    public boolean mo2339a(Context context, int i) {
        return gtv.m18571b(context, i);
    }

    public boolean m18549a(Context context, String str) {
        return gtv.m18570a(context, str);
    }

    @Deprecated
    public Intent mo2340b(int i) {
        return mo2337a(null, i, null);
    }

    public void m18551b(Context context) {
        gtv.m18574d(context);
    }

    public void m18552c(Context context) {
        gtv.m18576f(context);
    }
}
