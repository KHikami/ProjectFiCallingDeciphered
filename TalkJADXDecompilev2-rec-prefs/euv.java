package p000;

import android.content.Context;
import android.text.TextUtils;

public class euv extends esw {
    private static final long serialVersionUID = 1;
    public final String f12316c;
    public final String f12317d;
    public final boolean f12318e;

    public euv(String str, String str2, boolean z) {
        this.f12316c = str;
        this.f12317d = str2;
        this.f12318e = z;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lqy = new lqy();
        lqy.f26187c = Boolean.valueOf(this.f12318e);
        if (!TextUtils.isEmpty(this.f12317d)) {
            muu muu = new muu();
            muu.f28411a = this.f12316c;
            lqy.f26185a = muu;
            lqy.f26186b = this.f12317d;
        }
        return lqy;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        gwb.m1823a(bko, 2050);
        eps eps = (eps) jyn.m25433b(context, eps.class);
        if (eps != null) {
            eps.m14228a(105, false);
        }
    }

    public String mo1947g() {
        return "devices/finishphonenumberverification";
    }
}
