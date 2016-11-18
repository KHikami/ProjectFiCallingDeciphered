package p000;

import android.content.Context;
import android.text.TextUtils;

public final class fnn extends evz {
    private static final long serialVersionUID = 1;
    private final String f13526g;
    private int f13527h;
    private String f13528i;

    public fnn(luh luh) {
        super(luh, luh.responseHeader, -1);
        this.f13527h = gwb.m1507a(luh.f26477a);
        this.f13528i = luh.f26478b;
        this.f13526g = luh.f26480d;
    }

    public void mo1960a(fok fok) {
        super.mo1960a(fok);
        fnm fnm = (fnm) this.b;
        if (fnm.f13524v != null) {
            this.f13527h = 2;
            this.f13528i = fnm.f13524v;
        }
    }

    public int m15740k() {
        return ((fnm) this.b).f13509c;
    }

    public String m15741l() {
        return this.f13526g;
    }

    public int m15742m() {
        return this.f13527h;
    }

    public String m15743n() {
        return this.f13528i;
    }

    public boolean m15744o() {
        return ((fnm) this.b).f13514l;
    }

    public void mo1958a(Context context, bko bko) {
        super.mo1958a(context, bko);
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(bko.m5638g()).m23879b("full_jid", this.f13526g).m23891d();
        ((fnq) jyn.m25426a(context, fnc.class)).m15756a(this, bko.m5638g());
        if (m15740k() == 2) {
            Object obj = ((fnm) this.b).f13516n;
            String str;
            if (TextUtils.isEmpty(obj)) {
                String str2 = "Babel_Registration";
                str = "Account unregistered: ";
                String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
                glk.m17979c(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                return;
            }
            str = String.valueOf(glk.m17974b(bko.m5629a()));
            glk.m17979c("Babel_Registration", new StringBuilder((String.valueOf(obj).length() + 44) + String.valueOf(str).length()).append("Removed account ").append(obj).append(" unregistered using account:").append(str).toString(), new Object[0]);
        }
    }
}
