package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public class jno {
    Context f20546a;

    public jno(Context context) {
        this.f20546a = context;
    }

    String m24757a() {
        try {
            return this.f20546a.getPackageManager().getPackageInfo(this.f20546a.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            throw new AssertionError();
        }
    }
}
