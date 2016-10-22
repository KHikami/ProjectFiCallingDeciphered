import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

final class bed implements fne {
    private final Context a;

    bed(Context context) {
        this.a = context;
    }

    public void a(int i, fnd fnd, fnf fnf) {
        int i2 = 1;
        if (fnf != fnf.PENDING) {
            jyn.a(this.a, bdm.class);
            int i3 = fnd.d;
            boolean z = i3 == 2;
            int i4;
            if (i3 == 1) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            Object b = ((jcf) jyn.a(this.a, jcf.class)).b(i);
            if (z || r1 != 0) {
                String str = fnd.e;
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                    glk.c("Babel_AppUpgrade", new StringBuilder(String.valueOf(str).length() + 27).append("Upgrade URL: ").append(str).append(" forced: ").append(z).toString(), new Object[0]);
                    int i5 = packageInfo.versionCode;
                    String str2 = "app_upgrade_type";
                    if (z) {
                        i2 = 2;
                    }
                    b.c(str2, i2);
                    b.c("app_upgrade_url", str);
                    b.c("app_upgrade_version_code", i5);
                    b.c("app_upgrade_timestamp", glj.a());
                } catch (NameNotFoundException e) {
                    throw new AssertionError(e);
                }
            }
            glk.c("Babel_AppUpgrade", "Clearing app upgrade", new Object[0]);
            b.i("app_upgrade_type");
            b.i("app_upgrade_url");
            b.i("app_upgrade_version_code");
            b.i("app_upgrade_timestamp");
            b.d();
        }
    }
}
