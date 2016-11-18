package p000;

public final class nlb extends nyx<nlb> {
    public String f30096a;
    public Long f30097b;
    public nio f30098c;

    public /* synthetic */ nzf m35460a(nyt nyt) {
        return m35458b(nyt);
    }

    public nlb() {
        m35459d();
    }

    private nlb m35459d() {
        this.f30096a = null;
        this.f30097b = null;
        this.f30098c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35461a(nyu nyu) {
        if (this.f30096a != null) {
            nyu.m37170a(1, this.f30096a);
        }
        if (this.f30097b != null) {
            nyu.m37181b(2, this.f30097b.longValue());
        }
        if (this.f30098c != null) {
            nyu.m37182b(3, this.f30098c);
        }
        super.a(nyu);
    }

    protected int m35462b() {
        int b = super.b();
        if (this.f30096a != null) {
            b += nyu.m37137b(1, this.f30096a);
        }
        if (this.f30097b != null) {
            b += nyu.m37148f(2, this.f30097b.longValue());
        }
        if (this.f30098c != null) {
            return b + nyu.m37145d(3, this.f30098c);
        }
        return b;
    }

    private nlb m35458b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30096a = nyt.m37117j();
                    continue;
                case 16:
                    this.f30097b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f30098c == null) {
                        this.f30098c = new nio();
                    }
                    nyt.m37101a(this.f30098c);
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
