package p000;

public final class ksy extends nyx<ksy> {
    public ksp f23183a;
    public Long f23184b;
    public Integer f23185c;
    public Integer f23186d;
    public String f23187e;
    public String f23188f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27395b(nyt);
    }

    public ksy() {
        m27396d();
    }

    private ksy m27396d() {
        this.f23183a = null;
        this.f23184b = null;
        this.f23185c = null;
        this.f23186d = null;
        this.f23187e = null;
        this.f23188f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23183a != null) {
            nyu.b(1, this.f23183a);
        }
        nyu.b(2, this.f23184b.longValue());
        if (this.f23185c != null) {
            nyu.a(3, this.f23185c.intValue());
        }
        if (this.f23186d != null) {
            nyu.a(4, this.f23186d.intValue());
        }
        if (this.f23187e != null) {
            nyu.a(5, this.f23187e);
        }
        if (this.f23188f != null) {
            nyu.a(6, this.f23188f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23183a != null) {
            b += nyu.d(1, this.f23183a);
        }
        b += nyu.f(2, this.f23184b.longValue());
        if (this.f23185c != null) {
            b += nyu.f(3, this.f23185c.intValue());
        }
        if (this.f23186d != null) {
            b += nyu.f(4, this.f23186d.intValue());
        }
        if (this.f23187e != null) {
            b += nyu.b(5, this.f23187e);
        }
        if (this.f23188f != null) {
            return b + nyu.b(6, this.f23188f);
        }
        return b;
    }

    private ksy m27395b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23183a == null) {
                        this.f23183a = new ksp();
                    }
                    nyt.a(this.f23183a);
                    continue;
                case 16:
                    this.f23184b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f23185c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f23186d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    this.f23187e = nyt.j();
                    continue;
                case 50:
                    this.f23188f = nyt.j();
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
