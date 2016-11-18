package p000;

public final class kyw extends nyx<kyw> {
    public String f24113a;
    public String f24114b;
    public String f24115c;
    public String f24116d;
    public Integer f24117e;
    public Integer f24118f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28139b(nyt);
    }

    public kyw() {
        m28140d();
    }

    private kyw m28140d() {
        this.f24113a = null;
        this.f24114b = null;
        this.f24115c = null;
        this.f24116d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24113a != null) {
            nyu.a(1, this.f24113a);
        }
        if (this.f24114b != null) {
            nyu.a(2, this.f24114b);
        }
        if (this.f24115c != null) {
            nyu.a(3, this.f24115c);
        }
        if (this.f24116d != null) {
            nyu.a(4, this.f24116d);
        }
        if (this.f24117e != null) {
            nyu.a(5, this.f24117e.intValue());
        }
        if (this.f24118f != null) {
            nyu.a(6, this.f24118f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24113a != null) {
            b += nyu.b(1, this.f24113a);
        }
        if (this.f24114b != null) {
            b += nyu.b(2, this.f24114b);
        }
        if (this.f24115c != null) {
            b += nyu.b(3, this.f24115c);
        }
        if (this.f24116d != null) {
            b += nyu.b(4, this.f24116d);
        }
        if (this.f24117e != null) {
            b += nyu.f(5, this.f24117e.intValue());
        }
        if (this.f24118f != null) {
            return b + nyu.f(6, this.f24118f.intValue());
        }
        return b;
    }

    private kyw m28139b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24113a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24114b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24115c = nyt.j();
                    continue;
                case 34:
                    this.f24116d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f24117e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f24118f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
