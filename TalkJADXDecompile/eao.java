import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.os.UserManager;

public final class eao {
    public static volatile boolean a;
    public static volatile boolean b;
    private static volatile boolean c;
    private static volatile boolean d;

    static {
        a = false;
        c = false;
        b = false;
        d = false;
    }

    private static boolean a(Context context, String str) {
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
            z = b(context, str);
        }
        if (ecm.p) {
            new StringBuilder(String.valueOf(str).length() + 39).append("isCompanionAppInstalled ").append(str).append(" returned ").append(z);
        }
        return z;
    }

    private static boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(Context context) {
        if (!a) {
            c = a(context, "com.google.android.wearable.app");
            a = true;
        }
        if (c && gwb.a(context, "babel_wear_enable", true)) {
            return true;
        }
        return false;
    }

    static boolean b(Context context) {
        if (!b) {
            d = a(context, "com.google.android.projection.gearhead");
            b = true;
        }
        return d;
    }

    static boolean c(Context context) {
        return gwb.c() || a(context) || b(context);
    }
}
