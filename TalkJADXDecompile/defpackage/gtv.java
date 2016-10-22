package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gtv */
public class gtv {
    private static String a;
    @Deprecated
    public static final int b;
    public static boolean c;
    public static boolean d;
    static boolean e;
    static final AtomicBoolean f;
    private static int g;
    private static boolean h;
    private static final AtomicBoolean i;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r7) {
        /*
        r6 = 1;
        r0 = h;
        if (r0 != 0) goto L_0x003b;
    L_0x0005:
        r0 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        a = r0;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r0 = defpackage.hhg.a;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r0 = r0.a(r7);	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r1 = defpackage.gxl.a(r7);	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        g = r1;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r1 = "com.google.android.gms";
        r2 = 64;
        r0 = r0.b(r1, r2);	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        if (r0 == 0) goto L_0x003c;
    L_0x0021:
        r1 = defpackage.gtw.a(r7);	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r2 = 1;
        r2 = new defpackage.gxx[r2];	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r3 = 0;
        r4 = defpackage.gya.a;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r2[r3] = r4;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        r0 = r1.a(r0, r2);	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        if (r0 == 0) goto L_0x003c;
    L_0x0036:
        r0 = 1;
        e = r0;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
    L_0x0039:
        h = r6;
    L_0x003b:
        return;
    L_0x003c:
        r0 = 0;
        e = r0;	 Catch:{ NameNotFoundException -> 0x0040, all -> 0x0044 }
        goto L_0x0039;
    L_0x0040:
        r0 = move-exception;
        h = r6;
        goto L_0x003b;
    L_0x0044:
        r0 = move-exception;
        h = r6;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gtv.a(android.content.Context):void");
    }

    @Deprecated
    public static boolean a(Context context, int i) {
        return gwb.u(context, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.content.Context r5, java.lang.String r6) {
        /*
        r1 = 1;
        r2 = 0;
        r0 = defpackage.gwb.ag();
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
        r0 = defpackage.gwb.ad();
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
        throw new UnsupportedOperationException("Method not decompiled: gtv.a(android.content.Context, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        return i == 18 ? true : i == 1 ? gtv.a(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static int c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(gwb.wR);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || i.get())) {
            gtv.a(context);
            if (g == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (g != b) {
                int i = b;
                int i2 = g;
                String valueOf = String.valueOf("com.google.android.gms.version");
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(i).append(" but found ").append(i2).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(valueOf).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            gtw a = gtw.a(context);
            if (!gwb.X(context)) {
                try {
                    if (a.a(packageManager.getPackageInfo("com.android.vending", 8256), gya.a) == null) {
                        return 9;
                    }
                    if (a.a(packageInfo, a.a(packageManager.getPackageInfo("com.android.vending", 8256), gya.a)) == null) {
                        return 9;
                    }
                } catch (NameNotFoundException e) {
                    return 9;
                }
            } else if (a.a(packageInfo, gya.a) == null) {
                return 9;
            }
            if (packageInfo.versionCode / 1000 < b / 1000) {
                new StringBuilder(77).append("Google Play services out of date.  Requires ").append(b).append(" but found ").append(packageInfo.versionCode);
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
    public static boolean c(int i) {
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.n /*9*/:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static void f(Context context) {
        if (!f.getAndSet(true)) {
            try {
                ((NotificationManager) context.getSystemService("notification")).cancel(10436);
            } catch (SecurityException e) {
            }
        }
    }

    public static Context g(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static String h(Context context) {
        String str = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ApplicationInfo a;
        str = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            a = hhg.a.a(context).a(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            a = null;
        }
        return a != null ? packageManager.getApplicationLabel(a).toString() : str;
    }

    @Deprecated
    public static void d(Context context) {
        int a = gtq.d.a(context);
        if (a != 0) {
            Intent a2 = gtq.d.a(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new gtr(a);
            }
            throw new gts(a, "Google Play Services not available", a2);
        }
    }

    public static boolean e(Context context) {
        gtv.a(context);
        return e || !"user".equals(Build.TYPE);
    }

    static {
        b = gwb.wU;
        c = false;
        d = false;
        e = false;
        a = null;
        g = 0;
        h = false;
        f = new AtomicBoolean();
        i = new AtomicBoolean();
    }
}
