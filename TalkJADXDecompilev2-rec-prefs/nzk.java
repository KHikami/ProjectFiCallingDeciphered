package p000;

public final class nzk extends nyx<nzk> {
    private static volatile nzk[] f31320g;
    public int f31321a;
    public Double f31322b;
    public String f31323c;
    public Boolean f31324d;
    public nzg f31325e;
    public nze f31326f;

    public /* synthetic */ nzf m37261a(nyt nyt) {
        return m37259b(nyt);
    }

    public static nzk[] m37260d() {
        if (f31320g == null) {
            synchronized (nzc.f31309c) {
                if (f31320g == null) {
                    f31320g = new nzk[0];
                }
            }
        }
        return f31320g;
    }

    public nzk() {
        this.f31321a = nzf.UNSET_ENUM_VALUE;
        this.f31322b = null;
        this.f31323c = null;
        this.f31324d = null;
        this.cachedSize = -1;
    }

    public void m37262a(nyu nyu) {
        if (this.f31321a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f31321a);
        }
        if (this.f31322b != null) {
            nyu.m37166a(2, this.f31322b.doubleValue());
        }
        if (this.f31323c != null) {
            nyu.m37170a(3, this.f31323c);
        }
        if (this.f31324d != null) {
            nyu.m37172a(4, this.f31324d.booleanValue());
        }
        if (this.f31325e != null) {
            nyu.m37182b(5, this.f31325e);
        }
        if (this.f31326f != null) {
            nyu.m37182b(6, this.f31326f);
        }
        super.a(nyu);
    }

    protected int m37263b() {
        int b = super.b();
        if (this.f31321a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f31321a);
        }
        if (this.f31322b != null) {
            this.f31322b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f31323c != null) {
            b += nyu.m37137b(3, this.f31323c);
        }
        if (this.f31324d != null) {
            this.f31324d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31325e != null) {
            b += nyu.m37145d(5, this.f31325e);
        }
        if (this.f31326f != null) {
            return b + nyu.m37145d(6, this.f31326f);
        }
        return b;
    }

    private nzk m37259b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                            this.f31321a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.f31322b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dx /*26*/:
                    this.f31323c = nyt.m37117j();
                    continue;
                case 32:
                    this.f31324d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    if (this.f31325e == null) {
                        this.f31325e = new nzg();
                    }
                    nyt.m37101a(this.f31325e);
                    continue;
                case 50:
                    if (this.f31326f == null) {
                        this.f31326f = new nze();
                    }
                    nyt.m37101a(this.f31326f);
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
