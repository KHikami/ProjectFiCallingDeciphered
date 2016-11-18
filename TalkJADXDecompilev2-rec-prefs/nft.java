package p000;

public final class nft extends nyx<nft> {
    public Long f29728a;
    public Long f29729b;

    public /* synthetic */ nzf m34735a(nyt nyt) {
        return m34733b(nyt);
    }

    public nft() {
        m34734d();
    }

    private nft m34734d() {
        this.f29728a = null;
        this.f29729b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34736a(nyu nyu) {
        if (this.f29728a != null) {
            nyu.m37181b(1, this.f29728a.longValue());
        }
        if (this.f29729b != null) {
            nyu.m37181b(2, this.f29729b.longValue());
        }
        super.a(nyu);
    }

    protected int m34737b() {
        int b = super.b();
        if (this.f29728a != null) {
            b += nyu.m37148f(1, this.f29728a.longValue());
        }
        if (this.f29729b != null) {
            return b + nyu.m37148f(2, this.f29729b.longValue());
        }
        return b;
    }

    private nft m34733b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29728a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29729b = Long.valueOf(nyt.m37110e());
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
