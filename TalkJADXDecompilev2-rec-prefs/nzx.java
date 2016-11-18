package p000;

public final class nzx extends nyx<nzx> {
    private static volatile nzx[] f31397e;
    public Integer f31398a;
    public String f31399b;
    public String f31400c;
    public String f31401d;

    public /* synthetic */ nzf m37319a(nyt nyt) {
        return m37316b(nyt);
    }

    public static nzx[] m37317d() {
        if (f31397e == null) {
            synchronized (nzc.f31309c) {
                if (f31397e == null) {
                    f31397e = new nzx[0];
                }
            }
        }
        return f31397e;
    }

    public nzx() {
        m37318g();
    }

    private nzx m37318g() {
        this.f31399b = null;
        this.f31400c = null;
        this.f31401d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37320a(nyu nyu) {
        if (this.f31398a != null) {
            nyu.m37168a(1, this.f31398a.intValue());
        }
        if (this.f31399b != null) {
            nyu.m37170a(2, this.f31399b);
        }
        if (this.f31400c != null) {
            nyu.m37170a(3, this.f31400c);
        }
        if (this.f31401d != null) {
            nyu.m37170a(4, this.f31401d);
        }
        super.a(nyu);
    }

    protected int m37321b() {
        int b = super.b();
        if (this.f31398a != null) {
            b += nyu.m37147f(1, this.f31398a.intValue());
        }
        if (this.f31399b != null) {
            b += nyu.m37137b(2, this.f31399b);
        }
        if (this.f31400c != null) {
            b += nyu.m37137b(3, this.f31400c);
        }
        if (this.f31401d != null) {
            return b + nyu.m37137b(4, this.f31401d);
        }
        return b;
    }

    private nzx m37316b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f31398a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f31399b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31400c = nyt.m37117j();
                    continue;
                case 34:
                    this.f31401d = nyt.m37117j();
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
