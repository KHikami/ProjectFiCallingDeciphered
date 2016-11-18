package p000;

public final class ntt extends nyx<ntt> {
    private static volatile ntt[] f30782e;
    public int f30783a;
    public Integer f30784b;
    public Integer f30785c;
    public String f30786d;

    public /* synthetic */ nzf m36519a(nyt nyt) {
        return m36517b(nyt);
    }

    public static ntt[] m36518d() {
        if (f30782e == null) {
            synchronized (nzc.f31309c) {
                if (f30782e == null) {
                    f30782e = new ntt[0];
                }
            }
        }
        return f30782e;
    }

    public ntt() {
        this.f30783a = nzf.UNSET_ENUM_VALUE;
        this.f30784b = null;
        this.f30785c = null;
        this.f30786d = null;
        this.cachedSize = -1;
    }

    public void m36520a(nyu nyu) {
        if (this.f30783a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30783a);
        }
        if (this.f30786d != null) {
            nyu.m37170a(2, this.f30786d);
        }
        if (this.f30784b != null) {
            nyu.m37168a(3, this.f30784b.intValue());
        }
        if (this.f30785c != null) {
            nyu.m37168a(4, this.f30785c.intValue());
        }
        super.a(nyu);
    }

    protected int m36521b() {
        int b = super.b();
        if (this.f30783a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30783a);
        }
        if (this.f30786d != null) {
            b += nyu.m37137b(2, this.f30786d);
        }
        if (this.f30784b != null) {
            b += nyu.m37147f(3, this.f30784b.intValue());
        }
        if (this.f30785c != null) {
            return b + nyu.m37147f(4, this.f30785c.intValue());
        }
        return b;
    }

    private ntt m36517b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f30783a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f30786d = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f30784b = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30785c = Integer.valueOf(nyt.m37112f());
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
