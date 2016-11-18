package defpackage;

import android.content.Context;
import android.text.TextUtils;

final class gbu implements fne, jnh {
    private final jcf a;
    private final gmp b;
    private final fit c;

    gbu(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
        this.b = (gmp) jyn.a(context, gmp.class);
        this.c = (fit) jyn.a(context, fit.class);
        ((fnc) jyn.a(context, fnc.class)).a((fne) this);
    }

    public void a(int i, fnd fnd, fnf fnf) {
        if (fnf == fnf.REGISTERED) {
            jci b = this.a.b(i);
            CharSequence b2 = b.b("SyncManager.reg_build_version");
            String c = this.b.c();
            if (!TextUtils.equals(b2, c)) {
                String str = "Babel_SyncManager";
                String str2 = "Perform warm sync in case there are messages missed before the device is registered for account ";
                String valueOf = String.valueOf(glk.b(b.b("account_name")));
                glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                this.c.a(i, false, fjl.NO_DELAY, flt.ACCOUNT_LOGIN_SYNC);
            }
            b.b("SyncManager.reg_build_version", c);
            b.d();
        }
    }

    public void a(int i) {
        if (this.a.a(i).c("logged_out")) {
            this.a.b(i).e("SyncManager.reg_build_version").d();
        }
    }
}
