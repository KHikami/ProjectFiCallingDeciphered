package p000;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.os.UserManager;

public final class eao {
    public static volatile boolean f11055a = false;
    public static volatile boolean f11056b = false;
    private static volatile boolean f11057c = false;
    private static volatile boolean f11058d = false;

    private static boolean m13369a(Context context, String str) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            LauncherApps launcherApps = (LauncherApps) context.getSystemService("launcherapps");
            for (UserHandle isPackageEnabled : ((UserManager) context.getSystemService("user")).getUserProfiles()) {
                if (launcherApps.isPackageEnabled(str, isPackageEnabled)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = eao.m13371b(context, str);
        }
        if (ecm.f11020p) {
            new StringBuilder(String.valueOf(str).length() + 39).append("isCompanionAppInstalled ").append(str).append(" returned ").append(z);
        }
        return z;
    }

    private static boolean m13371b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean m13368a(Context context) {
        if (!f11055a) {
            f11057c = eao.m13369a(context, "com.google.android.wearable.app");
            f11055a = true;
        }
        if (f11057c && gwb.m1906a(context, "babel_wear_enable", true)) {
            return true;
        }
        return false;
    }

    static boolean m13370b(Context context) {
        if (!f11056b) {
            f11058d = eao.m13369a(context, "com.google.android.projection.gearhead");
            f11056b = true;
        }
        return f11058d;
    }

    static boolean m13372c(Context context) {
        return gwb.m2107c() || eao.m13368a(context) || eao.m13370b(context);
    }
}
