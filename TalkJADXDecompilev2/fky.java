package defpackage;

public final class fky extends flb {
    final String a;
    final int b;

    public fky(fps fps) {
        this.a = fps.a();
        this.b = fps.b();
    }

    public fky(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public void a(blo blo, fhc fhc) {
        if (this.a == null) {
            fhc.a(new evd(null, this.b));
            return;
        }
        b(blo);
        if (blo.a(this.a)) {
            switch (this.b) {
                case 10:
                    blo.l(this.a, 8);
                    blo.k(this.a, 16);
                    return;
                case 20:
                case wi.dz /*25*/:
                case 30:
                    blo.k(this.a, 8);
                    blo.l(this.a, 16);
                    return;
                default:
                    return;
            }
        }
        fhc.a(new evd(this.a, this.b));
    }

    public void a(blo blo) {
        b(blo);
    }

    private void b(blo blo) {
        if (glk.a("Babel", 3)) {
            String str = this.a;
            glk.a("Babel", new StringBuilder(String.valueOf(str).length() + 90).append("updateConversationNotificationLevelLocally conversationId: ").append(str).append(" notificationLevel: ").append(this.b).toString(), new Object[0]);
        }
        blo.a();
        try {
            blo.b(this.a, this.b);
            c(blo);
            blo.b();
        } finally {
            blo.c();
        }
    }

    private void c(blo blo) {
        for (String b : blo.ad(this.a)) {
            blo.b(b, this.b);
        }
    }
}
