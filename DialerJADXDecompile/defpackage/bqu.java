package defpackage;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bqu */
public class bqu {
    @Deprecated
    public static final int a;
    static final AtomicBoolean b;
    private static boolean c;
    private static boolean d;
    private static int e;
    private static final Object f;
    private static String g;
    private static Integer h;
    private static final AtomicBoolean i;

    static {
        a = 8487000;
        c = false;
        d = false;
        e = -1;
        f = new Object();
        g = null;
        h = null;
        b = new AtomicBoolean();
        i = new AtomicBoolean();
    }

    public static boolean a(Context context, int i) {
        if (!bqu.a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            bqv bqv = bqv.a;
            PackageManager packageManager = context.getPackageManager();
            if (packageInfo == null) {
                return false;
            }
            if (bqu.a(packageManager)) {
                return bqv.a(packageInfo, true);
            }
            boolean a = bqv.a(packageInfo, false);
            if (a || !bqv.a(packageInfo, true)) {
                return a;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return a;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @TargetApi(19)
    private static boolean a(Context context, int i, String str) {
        if (buf.x()) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(21)
    static boolean a(android.content.Context r5, java.lang.String r6) {
        /*
        r1 = 1;
        r2 = 0;
        r0 = defpackage.buf.z();
        if (r0 == 0) goto L_0x0030;
    L_0x0008:
        r0 = r5.getPackageManager();
        r0 = r0.getPackageInstaller();
        r0 = r0.getAllSessions();
        r3 = r0.iterator();
    L_0x0018:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0030;
    L_0x001e:
        r0 = r3.next();
        r0 = (android.content.pm.PackageInstaller.SessionInfo) r0;
        r0 = r0.getAppPackageName();
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = defpackage.buf.w();
        if (r0 == 0) goto L_0x005a;
    L_0x0036:
        r0 = "user";
        r0 = r5.getSystemService(r0);
        r0 = (android.os.UserManager) r0;
        r3 = r5.getPackageName();
        r0 = r0.getApplicationRestrictions(r3);
        if (r0 == 0) goto L_0x005a;
    L_0x0048:
        r3 = "true";
        r4 = "restricted_profile";
        r0 = r0.getString(r4);
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x005a;
    L_0x0056:
        if (r1 == 0) goto L_0x005c;
    L_0x0058:
        r0 = r2;
        goto L_0x002f;
    L_0x005a:
        r1 = r2;
        goto L_0x0056;
    L_0x005c:
        r0 = r5.getPackageManager();
        r1 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r0.getApplicationInfo(r6, r1);	 Catch:{ NameNotFoundException -> 0x0069 }
        r0 = r0.enabled;	 Catch:{ NameNotFoundException -> 0x0069 }
        goto L_0x002f;
    L_0x0069:
        r0 = move-exception;
        r0 = r2;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: bqu.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean a(PackageManager packageManager) {
        return bqu.b(packageManager) || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static int b(Context context) {
        if (btq.a) {
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(buf.ma);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || i.get())) {
            Integer num;
            synchronized (f) {
                if (g == null) {
                    g = context.getPackageName();
                    try {
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            h = Integer.valueOf(bundle.getInt("com.google.android.gms.version"));
                        } else {
                            h = null;
                        }
                    } catch (Throwable e) {
                        Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
                    }
                } else if (!g.equals(context.getPackageName())) {
                    throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + g + "' and this call used package '" + context.getPackageName() + "'.");
                }
                num = h;
            }
            if (num == null) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (num.intValue() != a) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + a + " but" + " found " + num + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            bqv bqv = bqv.a;
            if (!buf.V(context)) {
                try {
                    if (bqv.a(packageManager.getPackageInfo("com.android.vending", 8256), cdt.a) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (bqv.a(packageInfo, bqv.a(packageManager.getPackageInfo("com.android.vending", 8256), cdt.a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } catch (NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return 9;
                }
            } else if (bqv.a(packageInfo, cdt.a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo.versionCode / 1000 < a / 1000) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + a + " but found " + packageInfo.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e3) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e3);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static String b(int i) {
        return ConnectionResult.a(i);
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        return i == 18 ? true : i == 1 ? bqu.a(context, "com.google.android.gms") : false;
    }

    private static boolean b(PackageManager packageManager) {
        boolean z = true;
        synchronized (f) {
            if (e == -1) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
                    bqv bqv = bqv.a;
                    if (bqv.a(packageInfo, cdt.a[1]) != null) {
                        e = 1;
                    } else {
                        e = 0;
                    }
                } catch (NameNotFoundException e) {
                    e = 0;
                }
            }
            if (e == 0) {
                z = false;
            }
        }
        return z;
    }

    @Deprecated
    public static boolean c(int i) {
        switch (i) {
            case rq.b /*1*/:
            case rq.c /*2*/:
            case rl.e /*3*/:
            case rl.l /*9*/:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static void d(Context context) {
        if (!b.getAndSet(true)) {
            try {
                ((NotificationManager) context.getSystemService("notification")).cancel(10436);
            } catch (SecurityException e) {
            }
        }
    }

    public static String e(Context context) {
        Object obj = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    @Deprecated
    public static void c(Context context) {
        int a = bqp.c.a(context);
        if (a != 0) {
            Intent a2 = bqp.c.a(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new bqq(a);
            }
            throw new bqr(a, "Google Play Services not available", a2);
        }
    }
}
