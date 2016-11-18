package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class gtv {
    private static String f16136a = null;
    @Deprecated
    public static final int f16137b = gwb.wU;
    public static boolean f16138c = false;
    public static boolean f16139d = false;
    static boolean f16140e = false;
    static final AtomicBoolean f16141f = new AtomicBoolean();
    private static int f16142g = 0;
    private static boolean f16143h = false;
    private static final AtomicBoolean f16144i = new AtomicBoolean();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m18568a(Context context) {
        if (!f16143h) {
            try {
                f16136a = context.getPackageName();
                hhf a = hhg.f16968a.m19794a(context);
                f16142g = gxl.m18915a(context);
                PackageInfo b = a.m19793b("com.google.android.gms", 64);
                if (b != null) {
                    if (gtw.m18593a(context).m18595a(b, gya.f16367a[1]) != null) {
                        f16140e = true;
                        f16143h = true;
                    }
                }
                f16140e = false;
                f16143h = true;
            } catch (NameNotFoundException e) {
            } catch (Throwable th) {
                f16143h = true;
            }
        }
    }

    @Deprecated
    public static boolean m18569a(Context context, int i) {
        return gwb.m2366u(context, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m18570a(Context context, String str) {
        Object obj = 1;
        if (gwb.ag()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        if (gwb.ad()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
            }
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 8192).enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @Deprecated
    public static boolean m18571b(Context context, int i) {
        return i == 18 ? true : i == 1 ? gtv.m18570a(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static int m18572c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(gwb.wR);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f16144i.get())) {
            gtv.m18568a(context);
            if (f16142g == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (f16142g != f16137b) {
                int i = f16137b;
                int i2 = f16142g;
                String valueOf = String.valueOf("com.google.android.gms.version");
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(i).append(" but found ").append(i2).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(valueOf).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            gtw a = gtw.m18593a(context);
            if (!gwb.m1465X(context)) {
                try {
                    if (a.m18595a(packageManager.getPackageInfo("com.android.vending", 8256), gya.f16367a) == null) {
                        return 9;
                    }
                    if (a.m18595a(packageInfo, a.m18595a(packageManager.getPackageInfo("com.android.vending", 8256), gya.f16367a)) == null) {
                        return 9;
                    }
                } catch (NameNotFoundException e) {
                    return 9;
                }
            } else if (a.m18595a(packageInfo, gya.f16367a) == null) {
                return 9;
            }
            if (packageInfo.versionCode / 1000 < f16137b / 1000) {
                new StringBuilder(77).append("Google Play services out of date.  Requires ").append(f16137b).append(" but found ").append(packageInfo.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            return 1;
        }
    }

    @Deprecated
    public static boolean m18573c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static void m18576f(Context context) {
        if (!f16141f.getAndSet(true)) {
            try {
                ((NotificationManager) context.getSystemService("notification")).cancel(10436);
            } catch (SecurityException e) {
            }
        }
    }

    public static Context m18577g(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static String m18578h(Context context) {
        String str = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ApplicationInfo a;
        str = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            a = hhg.f16968a.m19794a(context).m19791a(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            a = null;
        }
        return a != null ? packageManager.getApplicationLabel(a).toString() : str;
    }

    @Deprecated
    public static void m18574d(Context context) {
        int a = gtq.f16130d.mo2334a(context);
        if (a != 0) {
            Intent a2 = gtq.f16130d.mo2337a(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new gtr(a);
            }
            throw new gts(a, "Google Play Services not available", a2);
        }
    }

    public static boolean m18575e(Context context) {
        gtv.m18568a(context);
        return f16140e || !"user".equals(Build.TYPE);
    }
}
