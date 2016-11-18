package p000;

import android.content.Context;
import android.text.TextUtils;

final class gbu implements fne, jnh {
    private final jcf f14625a;
    private final gmp f14626b;
    private final fit f14627c;

    gbu(Context context) {
        this.f14625a = (jcf) jyn.m25426a(context, jcf.class);
        this.f14626b = (gmp) jyn.m25426a(context, gmp.class);
        this.f14627c = (fit) jyn.m25426a(context, fit.class);
        ((fnc) jyn.m25426a(context, fnc.class)).mo2046a((fne) this);
    }

    public void mo500a(int i, fnd fnd, fnf fnf) {
        if (fnf == fnf.REGISTERED) {
            jci b = this.f14625a.mo3464b(i);
            CharSequence b2 = b.mo3440b("SyncManager.reg_build_version");
            String c = this.f14626b.mo2300c();
            if (!TextUtils.equals(b2, c)) {
                String str = "Babel_SyncManager";
                String str2 = "Perform warm sync in case there are messages missed before the device is registered for account ";
                String valueOf = String.valueOf(glk.m17974b(b.mo3440b("account_name")));
                glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                this.f14627c.mo2001a(i, false, fjl.NO_DELAY, flt.ACCOUNT_LOGIN_SYNC);
            }
            b.m23879b("SyncManager.reg_build_version", c);
            b.m23891d();
        }
    }

    public void mo609a(int i) {
        if (this.f14625a.mo3456a(i).mo3448c("logged_out")) {
            this.f14625a.mo3464b(i).m23893e("SyncManager.reg_build_version").m23891d();
        }
    }
}
