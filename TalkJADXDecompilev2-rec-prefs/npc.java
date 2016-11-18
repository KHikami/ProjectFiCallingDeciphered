package p000;

public final class npc extends nyx<npc> {
    public ofx f30423a;
    public Long f30424b;

    public /* synthetic */ nzf m36004a(nyt nyt) {
        return m36003b(nyt);
    }

    public npc() {
        this.f30424b = null;
        this.cachedSize = -1;
    }

    public void m36005a(nyu nyu) {
        if (this.f30423a != null) {
            nyu.m37182b(1, this.f30423a);
        }
        if (this.f30424b != null) {
            nyu.m37181b(2, this.f30424b.longValue());
        }
        super.a(nyu);
    }

    protected int m36006b() {
        int b = super.b();
        if (this.f30423a != null) {
            b += nyu.m37145d(1, this.f30423a);
        }
        if (this.f30424b != null) {
            return b + nyu.m37148f(2, this.f30424b.longValue());
        }
        return b;
    }

    private npc m36003b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30423a == null) {
                        this.f30423a = new ofx();
                    }
                    nyt.m37101a(this.f30423a);
                    continue;
                case 16:
                    this.f30424b = Long.valueOf(nyt.m37110e());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
