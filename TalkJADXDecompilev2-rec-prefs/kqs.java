package p000;

public final class kqs extends nyx<kqs> {
    public String f22804a;
    public kqt f22805b;
    public Integer f22806c;
    public kqr f22807d;
    public Integer f22808e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27101b(nyt);
    }

    public kqs() {
        m27102d();
    }

    private kqs m27102d() {
        this.f22804a = null;
        this.f22805b = null;
        this.f22807d = null;
        this.f22808e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22804a != null) {
            nyu.a(1, this.f22804a);
        }
        if (this.f22805b != null) {
            nyu.b(2, this.f22805b);
        }
        if (this.f22806c != null) {
            nyu.a(3, this.f22806c.intValue());
        }
        if (this.f22807d != null) {
            nyu.b(4, this.f22807d);
        }
        if (this.f22808e != null) {
            nyu.a(5, this.f22808e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22804a != null) {
            b += nyu.b(1, this.f22804a);
        }
        if (this.f22805b != null) {
            b += nyu.d(2, this.f22805b);
        }
        if (this.f22806c != null) {
            b += nyu.f(3, this.f22806c.intValue());
        }
        if (this.f22807d != null) {
            b += nyu.d(4, this.f22807d);
        }
        if (this.f22808e != null) {
            return b + nyu.f(5, this.f22808e.intValue());
        }
        return b;
    }

    private kqs m27101b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22804a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22805b == null) {
                        this.f22805b = new kqt();
                    }
                    nyt.a(this.f22805b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f22806c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f22807d == null) {
                        this.f22807d = new kqr();
                    }
                    nyt.a(this.f22807d);
                    continue;
                case 40:
                    this.f22808e = Integer.valueOf(nyt.f());
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
