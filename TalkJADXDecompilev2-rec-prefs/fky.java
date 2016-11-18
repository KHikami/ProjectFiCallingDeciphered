package p000;

public final class fky extends flb {
    final String f13351a;
    final int f13352b;

    public fky(fps fps) {
        this.f13351a = fps.m15929a();
        this.f13352b = fps.m15931b();
    }

    public fky(String str, int i) {
        this.f13351a = str;
        this.f13352b = i;
    }

    public void m15593a(blo blo, fhc fhc) {
        if (this.f13351a == null) {
            fhc.m15308a(new evd(null, this.f13352b));
            return;
        }
        m15590b(blo);
        if (blo.m5871a(this.f13351a)) {
            switch (this.f13352b) {
                case 10:
                    blo.m6082l(this.f13351a, 8);
                    blo.m6077k(this.f13351a, 16);
                    return;
                case 20:
                case wi.dz /*25*/:
                case 30:
                    blo.m6077k(this.f13351a, 8);
                    blo.m6082l(this.f13351a, 16);
                    return;
                default:
                    return;
            }
        }
        fhc.m15308a(new evd(this.f13351a, this.f13352b));
    }

    public void m15592a(blo blo) {
        m15590b(blo);
    }

    private void m15590b(blo blo) {
        if (glk.m17973a("Babel", 3)) {
            String str = this.f13351a;
            glk.m17970a("Babel", new StringBuilder(String.valueOf(str).length() + 90).append("updateConversationNotificationLevelLocally conversationId: ").append(str).append(" notificationLevel: ").append(this.f13352b).toString(), new Object[0]);
        }
        blo.m5958a();
        try {
            blo.m6017b(this.f13351a, this.f13352b);
            m15591c(blo);
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }

    private void m15591c(blo blo) {
        for (String b : blo.ad(this.f13351a)) {
            blo.m6017b(b, this.f13352b);
        }
    }
}
