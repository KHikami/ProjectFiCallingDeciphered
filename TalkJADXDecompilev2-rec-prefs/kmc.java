package p000;

public final class kmc extends nyx<kmc> {
    public Long f22341a;
    public Long f22342b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26500b(nyt);
    }

    public kmc() {
        m26501d();
    }

    private kmc m26501d() {
        this.f22341a = null;
        this.f22342b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22341a != null) {
            nyu.b(1, this.f22341a.longValue());
        }
        if (this.f22342b != null) {
            nyu.b(2, this.f22342b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22341a != null) {
            b += nyu.f(1, this.f22341a.longValue());
        }
        if (this.f22342b != null) {
            return b + nyu.f(2, this.f22342b.longValue());
        }
        return b;
    }

    private kmc m26500b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22341a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f22342b = Long.valueOf(nyt.e());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
