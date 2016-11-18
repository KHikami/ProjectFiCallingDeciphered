package p000;

public final class mbr extends nyx<mbr> {
    public Long f27262a;
    public String f27263b;
    public Long f27264c;
    public Long f27265d;
    public Integer f27266e;
    public Integer f27267f;
    public Integer f27268g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31619b(nyt);
    }

    public mbr() {
        m31620d();
    }

    private mbr m31620d() {
        this.f27262a = null;
        this.f27263b = null;
        this.f27264c = null;
        this.f27265d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27262a != null) {
            nyu.b(1, this.f27262a.longValue());
        }
        if (this.f27263b != null) {
            nyu.a(2, this.f27263b);
        }
        if (this.f27264c != null) {
            nyu.b(3, this.f27264c.longValue());
        }
        if (this.f27265d != null) {
            nyu.b(4, this.f27265d.longValue());
        }
        if (this.f27266e != null) {
            nyu.a(5, this.f27266e.intValue());
        }
        if (this.f27267f != null) {
            nyu.a(6, this.f27267f.intValue());
        }
        if (this.f27268g != null) {
            nyu.a(7, this.f27268g.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27262a != null) {
            b += nyu.f(1, this.f27262a.longValue());
        }
        if (this.f27263b != null) {
            b += nyu.b(2, this.f27263b);
        }
        if (this.f27264c != null) {
            b += nyu.f(3, this.f27264c.longValue());
        }
        if (this.f27265d != null) {
            b += nyu.f(4, this.f27265d.longValue());
        }
        if (this.f27266e != null) {
            b += nyu.f(5, this.f27266e.intValue());
        }
        if (this.f27267f != null) {
            b += nyu.f(6, this.f27267f.intValue());
        }
        if (this.f27268g != null) {
            return b + nyu.f(7, this.f27268g.intValue());
        }
        return b;
    }

    private mbr m31619b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27262a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.f27263b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f27264c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f27265d = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f27266e = Integer.valueOf(a);
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
                        case 3:
                            this.f27267f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27268g = Integer.valueOf(a);
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
