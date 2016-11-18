package p000;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

final class ixe {
    private static volatile ixe f19326e;
    private final String f19327a;
    private final String f19328b;
    private final int f19329c;
    private final Long f19330d;

    private ixe(String str, String str2, int i, Long l) {
        this.f19327a = str;
        this.f19328b = str2;
        this.f19329c = i;
        this.f19330d = l;
    }

    static ixe m23427a(Application application) {
        if (f19326e == null) {
            synchronized (ixe.class) {
                if (f19326e == null) {
                    f19326e = ixe.m23429c(application);
                }
            }
        }
        return f19326e;
    }

    public static iyr<ixe> m23428b(Application application) {
        ba.m4536a((Object) application);
        return new ixf(application);
    }

    private static ixe m23429c(Application application) {
        int i = 2;
        String packageName = ((Application) ba.m4536a((Object) application)).getPackageName();
        String str = null;
        PackageManager packageManager = application.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (NameNotFoundException e) {
            String.format("Failed to get PackageInfo for: %s, %s", new Object[]{packageName, e});
        }
        if (VERSION.SDK_INT < 20 || !packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 1;
        }
        return new ixe(packageName, str, i, gwb.m1625a(application));
    }

    public ook m23430a(ook ook) {
        if (ook != null) {
            ook.e = new onh();
            ook.e.a = this.f19327a;
            ook.e.c = this.f19329c;
            ook.e.d = this.f19330d;
            ook.e.b = this.f19328b;
        }
        return ook;
    }
}
