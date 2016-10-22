package defpackage;

import java.util.List;

/* renamed from: ewg */
public final class ewg extends evz {
    private static final long serialVersionUID = 1;
    private final byte[] g;
    private final List<fbv> h;
    private final boolean i;

    public ewg(lpa lpa) {
        boolean z;
        super(lpa, lpa.responseHeader, -1);
        if (lpa.b != null) {
            this.g = nzf.a(lpa.b);
        } else {
            this.g = null;
        }
        this.h = fbv.a(lpa.c);
        if (lpa.d == null || gwb.b(lpa.d)) {
            z = false;
        } else {
            z = true;
        }
        this.i = z;
        if (evz.a) {
            String valueOf = String.valueOf(lpa);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("CreateConversationResponse from:").append(valueOf);
        }
    }

    private fpg k() {
        try {
            if (this.g == null) {
                return null;
            }
            return new fpg((lom) nzf.a(new lom(), this.g), (byte) 0);
        } catch (nzd e) {
            return null;
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        fpg k = k();
        String str = ((eup) this.b).k;
        String str2 = 3;
        if (glk.a("Babel", 3)) {
            str2 = String.valueOf(k.o());
            String valueOf = String.valueOf(k.a());
            String valueOf2 = String.valueOf(k.toString());
            str2 = new StringBuilder((((String.valueOf(str).length() + 99) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("processCreateConversationResponse requestClientGeneratedId: ").append(str).append(" clientGeneratedId: ").append(str2).append(" conversationId: ").append(valueOf).append("; ").append(valueOf2).toString();
            glk.b("Babel", str2, new Object[0]);
        }
        blo.a();
        try {
            int i = this.c.b;
            blj blj = new blj();
            if (i == 6) {
                long a = glj.a() * 1000;
                long y = k.y();
                if (y != 0) {
                    a = y;
                }
                k.a(a);
            }
            blf.a(blo, k, 0, str, fhc, blj, true);
            str2 = blj.a;
            if (this.h.size() > 0) {
                long y2 = serialVersionUID + k.y();
                blf.a(blo, this.h, str2, String.valueOf(y2), y2, -1);
            }
            if (this.i) {
                fhc.a(new euw(str2, true, true, false, null, 0, null, 0, null));
            }
            blo.b();
            if (str2 != null) {
                blf.c(blo, str2);
                blf.d(blo, str2);
            }
        } finally {
            blo.c();
        }
    }
}
