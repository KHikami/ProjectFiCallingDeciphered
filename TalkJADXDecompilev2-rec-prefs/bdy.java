package p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public final class bdy implements bdv {
    public ery mo497a() {
        return new bdw();
    }

    public boolean mo498a(Context context) {
        int a = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        try {
            bdm bdm = (bdm) jyn.m25426a(context, bdm.class);
            int a2 = bdm.mo501a(a, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            CharSequence b = bdm.mo503b(a);
            glk.m17979c("Babel_ForcedUpgrade", new StringBuilder(String.valueOf(b).length() + 39).append("Upgrade type: ").append(a2).append(" upgrade URL: ").append(b).toString(), new Object[0]);
            if (a2 != 2 || TextUtils.isEmpty(b)) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    public int mo499b() {
        return 17170443;
    }
}
