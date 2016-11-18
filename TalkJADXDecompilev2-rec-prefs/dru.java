package p000;

import android.content.Context;

public final class dru extends evz {
    private static final long serialVersionUID = 1;
    private final String f10411g;

    private dru(ltp ltp) {
        super(ltp, ltp.responseHeader, -1);
        this.f10411g = ltp.f26395a.f25931a;
    }

    public static evz m12575a(ltp ltp) {
        if (evz.m8120a(ltp.responseHeader)) {
            return new ewv((nzf) ltp, ltp.responseHeader);
        }
        return new dru(ltp);
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            String valueOf = String.valueOf(this.c.f12528a);
            glk.m17976b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(valueOf).toString(), new Object[0]);
        }
        Context f = blo.m6049f();
        ayo bow = new bow(this.f10411g, blo.m6061h(), box.JOIN_CONVERSATION_BY_LINK);
        gid gid = (gid) jyn.m25426a(f, gid.class);
        if (this.c.f12529b == 1) {
            if (blf.m5801a(blo, this.f10411g, 0, new fhc(), null)) {
                gid.mo2276a(bow, bow.m6328a());
                return;
            } else {
                gid.mo2277a(bow, new drb(), bow.m6328a());
                return;
            }
        }
        int i2 = this.c.f12529b;
        String valueOf2 = String.valueOf(this.c.f12528a);
        gid.mo2277a(bow, new Exception(new StringBuilder(String.valueOf(valueOf2).length() + 49).append("response status: ").append(i2).append(", error description: ").append(valueOf2).toString()), bow.m6328a());
    }
}
