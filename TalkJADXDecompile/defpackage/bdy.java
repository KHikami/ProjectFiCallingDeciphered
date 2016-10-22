package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: bdy */
public final class bdy implements bdv {
    public ery a() {
        return new bdw();
    }

    public boolean a(Context context) {
        int a = ((jca) jyn.a(context, jca.class)).a();
        try {
            bdm bdm = (bdm) jyn.a(context, bdm.class);
            int a2 = bdm.a(a, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            CharSequence b = bdm.b(a);
            glk.c("Babel_ForcedUpgrade", new StringBuilder(String.valueOf(b).length() + 39).append("Upgrade type: ").append(a2).append(" upgrade URL: ").append(b).toString(), new Object[0]);
            if (a2 != 2 || TextUtils.isEmpty(b)) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    public int b() {
        return 17170443;
    }
}
