package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public class jno {
    Context a;

    public jno(Context context) {
        this.a = context;
    }

    String a() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            throw new AssertionError();
        }
    }
}
