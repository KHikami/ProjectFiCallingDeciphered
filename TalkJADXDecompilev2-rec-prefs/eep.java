package p000;

import android.content.Context;
import android.os.Bundle;

public final class eep implements dlc {
    private final Context f11322a;

    public eep(Context context) {
        this.f11322a = context;
    }

    public lkm mo1596a(lkm lkm, Bundle bundle) {
        String str;
        boolean z;
        int i = bundle.getInt("account_id");
        boolean b = fdq.f12785a.m14370b(i);
        Boolean d = fdq.f12785a.m14373d();
        Boolean a = fdq.f12785a.m14366a(i);
        String.format("%s experiment enabled? %s, (def=%s srv=%s)", new Object[]{"6ab26889", Boolean.valueOf(b), d, a});
        String str2 = "Babel";
        String str3 = "P2P is %s";
        Object[] objArr = new Object[1];
        if (b) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        objArr[0] = str;
        glk.m17970a(str2, str3, objArr);
        if (!b || eem.m13724a(this.f11322a, i)) {
            z = false;
        } else {
            z = true;
        }
        lkm.useP2P = Boolean.valueOf(z);
        return lkm;
    }
}
