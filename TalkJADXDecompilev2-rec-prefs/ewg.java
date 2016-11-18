package p000;

import java.util.List;

public final class ewg extends evz {
    private static final long serialVersionUID = 1;
    private final byte[] f12410g;
    private final List<fbv> f12411h;
    private final boolean f12412i;

    public ewg(lpa lpa) {
        boolean z;
        super(lpa, lpa.responseHeader, -1);
        if (lpa.f25978b != null) {
            this.f12410g = nzf.m1029a(lpa.f25978b);
        } else {
            this.f12410g = null;
        }
        this.f12411h = fbv.m14926a(lpa.f25979c);
        if (lpa.f25980d == null || gwb.m2061b(lpa.f25980d)) {
            z = false;
        } else {
            z = true;
        }
        this.f12412i = z;
        if (evz.f5798a) {
            String valueOf = String.valueOf(lpa);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("CreateConversationResponse from:").append(valueOf);
        }
    }

    private fpg m14710k() {
        try {
            if (this.f12410g == null) {
                return null;
            }
            return new fpg((lom) nzf.m1027a(new lom(), this.f12410g), (byte) 0);
        } catch (nzd e) {
            return null;
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        fpg k = m14710k();
        String str = ((eup) this.b).f12309k;
        String str2 = 3;
        if (glk.m17973a("Babel", 3)) {
            str2 = String.valueOf(k.m15886o());
            String valueOf = String.valueOf(k.m15827a());
            String valueOf2 = String.valueOf(k.toString());
            str2 = new StringBuilder((((String.valueOf(str).length() + 99) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processCreateConversationResponse requestClientGeneratedId: ").append(str).append(" clientGeneratedId: ").append(str2).append(" conversationId: ").append(valueOf).append("; ").append(valueOf2).toString();
            glk.m17976b("Babel", str2, new Object[0]);
        }
        blo.m5958a();
        try {
            int i = this.c.f12529b;
            blj blj = new blj();
            if (i == 6) {
                long a = glj.m17956a() * 1000;
                long y = k.m15896y();
                if (y != 0) {
                    a = y;
                }
                k.m15872a(a);
            }
            blf.m5799a(blo, k, 0, str, fhc, blj, true);
            str2 = blj.f3701a;
            if (this.f12411h.size() > 0) {
                long y2 = serialVersionUID + k.m15896y();
                blf.m5793a(blo, this.f12411h, str2, String.valueOf(y2), y2, -1);
            }
            if (this.f12412i) {
                fhc.m15308a(new euw(str2, true, true, false, null, 0, null, 0, null));
            }
            blo.m6015b();
            if (str2 != null) {
                blf.m5818c(blo, str2);
                blf.m5821d(blo, str2);
            }
        } finally {
            blo.m6028c();
        }
    }
}
