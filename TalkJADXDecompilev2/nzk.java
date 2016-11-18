package defpackage;

public final class nzk extends nyx<nzk> {
    private static volatile nzk[] g;
    public int a;
    public Double b;
    public String c;
    public Boolean d;
    public nzg e;
    public nze f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nzk[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new nzk[0];
                }
            }
        }
        return g;
    }

    public nzk() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(6, this.f);
        }
        return b;
    }

    private nzk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nzg();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nze();
                    }
                    nyt.a(this.f);
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
