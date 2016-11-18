package p000;

public final class mza extends nyx<mza> {
    public String f29208a;
    public String f29209b;
    public Long f29210c;

    public /* synthetic */ nzf m33898a(nyt nyt) {
        return m33896b(nyt);
    }

    public mza() {
        m33897d();
    }

    private mza m33897d() {
        this.f29208a = null;
        this.f29209b = null;
        this.f29210c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33899a(nyu nyu) {
        if (this.f29208a != null) {
            nyu.m37170a(1, this.f29208a);
        }
        if (this.f29209b != null) {
            nyu.m37170a(2, this.f29209b);
        }
        if (this.f29210c != null) {
            nyu.m37187c(3, this.f29210c.longValue());
        }
        super.a(nyu);
    }

    protected int m33900b() {
        int b = super.b();
        if (this.f29208a != null) {
            b += nyu.m37137b(1, this.f29208a);
        }
        if (this.f29209b != null) {
            b += nyu.m37137b(2, this.f29209b);
        }
        if (this.f29210c == null) {
            return b;
        }
        this.f29210c.longValue();
        return b + (nyu.m37154h(3) + 8);
    }

    private mza m33896b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29208a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29209b = nyt.m37117j();
                    continue;
                case wi.dz /*25*/:
                    this.f29210c = Long.valueOf(nyt.m37114g());
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
