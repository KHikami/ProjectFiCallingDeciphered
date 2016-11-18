package p000;

public final class mbn extends nyx<mbn> {
    private static volatile mbn[] f27232e;
    public String f27233a;
    public String f27234b;
    public String f27235c;
    public Integer f27236d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31598b(nyt);
    }

    public static mbn[] m31599d() {
        if (f27232e == null) {
            synchronized (nzc.c) {
                if (f27232e == null) {
                    f27232e = new mbn[0];
                }
            }
        }
        return f27232e;
    }

    public mbn() {
        m31600g();
    }

    private mbn m31600g() {
        this.f27233a = null;
        this.f27234b = null;
        this.f27235c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27233a != null) {
            nyu.a(1, this.f27233a);
        }
        if (this.f27234b != null) {
            nyu.a(2, this.f27234b);
        }
        if (this.f27235c != null) {
            nyu.a(3, this.f27235c);
        }
        if (this.f27236d != null) {
            nyu.a(4, this.f27236d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27233a != null) {
            b += nyu.b(1, this.f27233a);
        }
        if (this.f27234b != null) {
            b += nyu.b(2, this.f27234b);
        }
        if (this.f27235c != null) {
            b += nyu.b(3, this.f27235c);
        }
        if (this.f27236d != null) {
            return b + nyu.f(4, this.f27236d.intValue());
        }
        return b;
    }

    private mbn m31598b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27233a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27234b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27235c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f27236d = Integer.valueOf(a);
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
