package p000;

public final class mab extends nyx<mab> {
    private static volatile mab[] f27081i;
    public String f27082a;
    public String f27083b;
    public String f27084c;
    public Integer f27085d;
    public mad f27086e;
    public mac f27087f;
    public maf f27088g;
    public mae f27089h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31387b(nyt);
    }

    public static mab[] m31388d() {
        if (f27081i == null) {
            synchronized (nzc.c) {
                if (f27081i == null) {
                    f27081i = new mab[0];
                }
            }
        }
        return f27081i;
    }

    public mab() {
        m31389g();
    }

    private mab m31389g() {
        this.f27082a = null;
        this.f27083b = null;
        this.f27084c = null;
        this.f27086e = null;
        this.f27087f = null;
        this.f27088g = null;
        this.f27089h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27082a != null) {
            nyu.a(1, this.f27082a);
        }
        if (this.f27083b != null) {
            nyu.a(2, this.f27083b);
        }
        if (this.f27084c != null) {
            nyu.a(3, this.f27084c);
        }
        if (this.f27085d != null) {
            nyu.a(4, this.f27085d.intValue());
        }
        if (this.f27086e != null) {
            nyu.b(5, this.f27086e);
        }
        if (this.f27087f != null) {
            nyu.b(6, this.f27087f);
        }
        if (this.f27088g != null) {
            nyu.b(7, this.f27088g);
        }
        if (this.f27089h != null) {
            nyu.b(8, this.f27089h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27082a != null) {
            b += nyu.b(1, this.f27082a);
        }
        if (this.f27083b != null) {
            b += nyu.b(2, this.f27083b);
        }
        if (this.f27084c != null) {
            b += nyu.b(3, this.f27084c);
        }
        if (this.f27085d != null) {
            b += nyu.f(4, this.f27085d.intValue());
        }
        if (this.f27086e != null) {
            b += nyu.d(5, this.f27086e);
        }
        if (this.f27087f != null) {
            b += nyu.d(6, this.f27087f);
        }
        if (this.f27088g != null) {
            b += nyu.d(7, this.f27088g);
        }
        if (this.f27089h != null) {
            return b + nyu.d(8, this.f27089h);
        }
        return b;
    }

    private mab m31387b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27082a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27083b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27084c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27085d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f27086e == null) {
                        this.f27086e = new mad();
                    }
                    nyt.a(this.f27086e);
                    continue;
                case 50:
                    if (this.f27087f == null) {
                        this.f27087f = new mac();
                    }
                    nyt.a(this.f27087f);
                    continue;
                case 58:
                    if (this.f27088g == null) {
                        this.f27088g = new maf();
                    }
                    nyt.a(this.f27088g);
                    continue;
                case 66:
                    if (this.f27089h == null) {
                        this.f27089h = new mae();
                    }
                    nyt.a(this.f27089h);
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
