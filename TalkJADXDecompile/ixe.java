import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

final class ixe {
    private static volatile ixe e;
    private final String a;
    private final String b;
    private final int c;
    private final Long d;

    private ixe(String str, String str2, int i, Long l) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
    }

    static ixe a(Application application) {
        if (e == null) {
            synchronized (ixe.class) {
                if (e == null) {
                    e = c(application);
                }
            }
        }
        return e;
    }

    public static iyr<ixe> b(Application application) {
        ba.a((Object) application);
        return new ixf(application);
    }

    private static ixe c(Application application) {
        int i = 2;
        String packageName = ((Application) ba.a((Object) application)).getPackageName();
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
        return new ixe(packageName, str, i, gwb.a(application));
    }

    public ook a(ook ook) {
        if (ook != null) {
            ook.e = new onh();
            ook.e.a = this.a;
            ook.e.c = this.c;
            ook.e.d = this.d;
            ook.e.b = this.b;
        }
        return ook;
    }
}
