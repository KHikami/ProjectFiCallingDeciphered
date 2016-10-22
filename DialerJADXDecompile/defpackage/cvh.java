package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;

/* compiled from: PG */
/* renamed from: cvh */
final class cvh {
    static cvh a;
    String b;
    String c;
    int d;
    private final Application e;

    cvh(Application application) {
        this.e = application;
    }

    static void a() {
        a.b = a.e.getPackageName();
        PackageManager packageManager = a.e.getPackageManager();
        if (VERSION.SDK_INT >= 20) {
            int i;
            cvh cvh = a;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 2;
            } else {
                i = 1;
            }
            cvh.d = i;
        } else {
            a.d = 1;
        }
        try {
            a.c = packageManager.getPackageInfo(a.b, 0).versionName;
        } catch (NameNotFoundException e) {
            Log.w("MetricStamper", String.format("Failed to get Package info for: %s, %s", new Object[]{a.b, e}));
        }
    }
}
