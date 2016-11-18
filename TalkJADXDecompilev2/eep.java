package defpackage;

import android.content.Context;
import android.os.Bundle;

public final class eep implements dlc {
    private final Context a;

    public eep(Context context) {
        this.a = context;
    }

    public lkm a(lkm lkm, Bundle bundle) {
        String str;
        boolean z;
        int i = bundle.getInt("account_id");
        boolean b = fdq.a.b(i);
        Boolean d = fdq.a.d();
        Boolean a = fdq.a.a(i);
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
        glk.a(str2, str3, objArr);
        if (!b || eem.a(this.a, i)) {
            z = false;
        } else {
            z = true;
        }
        lkm.useP2P = Boolean.valueOf(z);
        return lkm;
    }
}
