package p000;

public final class njd extends nyx<njd> {
    public Integer f29972a;
    public Boolean f29973b;
    public njc f29974c;

    public /* synthetic */ nzf m35198a(nyt nyt) {
        return m35196b(nyt);
    }

    public njd() {
        m35197d();
    }

    private njd m35197d() {
        this.f29972a = null;
        this.f29973b = null;
        this.f29974c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35199a(nyu nyu) {
        if (this.f29972a != null) {
            nyu.m37168a(1, this.f29972a.intValue());
        }
        if (this.f29973b != null) {
            nyu.m37172a(2, this.f29973b.booleanValue());
        }
        if (this.f29974c != null) {
            nyu.m37182b(3, this.f29974c);
        }
        super.a(nyu);
    }

    protected int m35200b() {
        int b = super.b();
        if (this.f29972a != null) {
            b += nyu.m37147f(1, this.f29972a.intValue());
        }
        if (this.f29973b != null) {
            this.f29973b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29974c != null) {
            return b + nyu.m37145d(3, this.f29974c);
        }
        return b;
    }

    private njd m35196b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29972a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29973b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f29974c == null) {
                        this.f29974c = new njc();
                    }
                    nyt.m37101a(this.f29974c);
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
