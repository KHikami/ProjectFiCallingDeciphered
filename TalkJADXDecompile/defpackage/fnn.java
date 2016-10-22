package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: fnn */
public final class fnn extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private int h;
    private String i;

    public fnn(luh luh) {
        super(luh, luh.responseHeader, -1);
        this.h = gwb.a(luh.a);
        this.i = luh.b;
        this.g = luh.d;
    }

    public void a(fok fok) {
        super.a(fok);
        fnm fnm = (fnm) this.b;
        if (fnm.v != null) {
            this.h = 2;
            this.i = fnm.v;
        }
    }

    public int k() {
        return ((fnm) this.b).c;
    }

    public String l() {
        return this.g;
    }

    public int m() {
        return this.h;
    }

    public String n() {
        return this.i;
    }

    public boolean o() {
        return ((fnm) this.b).l;
    }

    public void a(Context context, bko bko) {
        super.a(context, bko);
        ((jcf) jyn.a(context, jcf.class)).b(bko.g()).b("full_jid", this.g).d();
        ((fnq) jyn.a(context, fnc.class)).a(this, bko.g());
        if (k() == 2) {
            Object obj = ((fnm) this.b).n;
            String str;
            if (TextUtils.isEmpty(obj)) {
                String str2 = "Babel_Registration";
                str = "Account unregistered: ";
                String valueOf = String.valueOf(glk.b(bko.a()));
                glk.c(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                return;
            }
            str = String.valueOf(glk.b(bko.a()));
            glk.c("Babel_Registration", new StringBuilder((String.valueOf(obj).length() + 44) + String.valueOf(str).length()).append("Removed account ").append(obj).append(" unregistered using account:").append(str).toString(), new Object[0]);
        }
    }
}
