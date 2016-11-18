package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

final class bed implements fne {
    private final Context f3140a;

    bed(Context context) {
        this.f3140a = context;
    }

    public void mo500a(int i, fnd fnd, fnf fnf) {
        int i2 = 1;
        if (fnf != fnf.PENDING) {
            jyn.m25426a(this.f3140a, bdm.class);
            int i3 = fnd.f13487d;
            boolean z = i3 == 2;
            int i4;
            if (i3 == 1) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            Object b = ((jcf) jyn.m25426a(this.f3140a, jcf.class)).mo3464b(i);
            if (z || r1 != 0) {
                String str = fnd.f13488e;
                try {
                    PackageInfo packageInfo = this.f3140a.getPackageManager().getPackageInfo(this.f3140a.getPackageName(), 0);
                    glk.m17979c("Babel_AppUpgrade", new StringBuilder(String.valueOf(str).length() + 27).append("Upgrade URL: ").append(str).append(" forced: ").append(z).toString(), new Object[0]);
                    int i5 = packageInfo.versionCode;
                    String str2 = "app_upgrade_type";
                    if (z) {
                        i2 = 2;
                    }
                    b.mo3443c(str2, i2);
                    b.mo3445c("app_upgrade_url", str);
                    b.mo3443c("app_upgrade_version_code", i5);
                    b.mo3444c("app_upgrade_timestamp", glj.m17956a());
                } catch (NameNotFoundException e) {
                    throw new AssertionError(e);
                }
            }
            glk.m17979c("Babel_AppUpgrade", "Clearing app upgrade", new Object[0]);
            b.mo3451i("app_upgrade_type");
            b.mo3451i("app_upgrade_url");
            b.mo3451i("app_upgrade_version_code");
            b.mo3451i("app_upgrade_timestamp");
            b.m23891d();
        }
    }
}
