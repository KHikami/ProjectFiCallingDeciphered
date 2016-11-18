package p000;

public final class lbz extends nyx<lbz> {
    public String f24533a;
    public String f24534b;
    public String f24535c;
    public String f24536d;
    public String f24537e;
    public Boolean f24538f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28543b(nyt);
    }

    public lbz() {
        this.f24533a = null;
        this.f24534b = null;
        this.f24535c = null;
        this.f24536d = null;
        this.f24537e = null;
        this.f24538f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24533a != null) {
            nyu.a(1, this.f24533a);
        }
        if (this.f24534b != null) {
            nyu.a(2, this.f24534b);
        }
        if (this.f24535c != null) {
            nyu.a(3, this.f24535c);
        }
        if (this.f24536d != null) {
            nyu.a(4, this.f24536d);
        }
        if (this.f24537e != null) {
            nyu.a(5, this.f24537e);
        }
        if (this.f24538f != null) {
            nyu.a(6, this.f24538f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24533a != null) {
            b += nyu.b(1, this.f24533a);
        }
        if (this.f24534b != null) {
            b += nyu.b(2, this.f24534b);
        }
        if (this.f24535c != null) {
            b += nyu.b(3, this.f24535c);
        }
        if (this.f24536d != null) {
            b += nyu.b(4, this.f24536d);
        }
        if (this.f24537e != null) {
            b += nyu.b(5, this.f24537e);
        }
        if (this.f24538f == null) {
            return b;
        }
        this.f24538f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lbz m28543b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24533a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24534b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24535c = nyt.j();
                    continue;
                case 34:
                    this.f24536d = nyt.j();
                    continue;
                case 42:
                    this.f24537e = nyt.j();
                    continue;
                case 48:
                    this.f24538f = Boolean.valueOf(nyt.i());
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
