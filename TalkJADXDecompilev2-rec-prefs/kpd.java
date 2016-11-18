package p000;

public final class kpd extends nyx<kpd> {
    public Integer f22613a;
    public Integer f22614b;
    public Integer f22615c;
    public String f22616d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26884b(nyt);
    }

    public kpd() {
        m26885d();
    }

    private kpd m26885d() {
        this.f22613a = null;
        this.f22614b = null;
        this.f22615c = null;
        this.f22616d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22613a != null) {
            nyu.a(1, this.f22613a.intValue());
        }
        if (this.f22614b != null) {
            nyu.a(2, this.f22614b.intValue());
        }
        if (this.f22615c != null) {
            nyu.a(3, this.f22615c.intValue());
        }
        if (this.f22616d != null) {
            nyu.a(4, this.f22616d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22613a != null) {
            b += nyu.f(1, this.f22613a.intValue());
        }
        if (this.f22614b != null) {
            b += nyu.f(2, this.f22614b.intValue());
        }
        if (this.f22615c != null) {
            b += nyu.f(3, this.f22615c.intValue());
        }
        if (this.f22616d != null) {
            return b + nyu.b(4, this.f22616d);
        }
        return b;
    }

    private kpd m26884b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22613a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f22614b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f22615c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f22616d = nyt.j();
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
