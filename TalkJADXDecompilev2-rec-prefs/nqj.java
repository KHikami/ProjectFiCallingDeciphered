package p000;

public final class nqj extends nyx<nqj> {
    private static volatile nqj[] f30499d;
    public int f30500a;
    public int f30501b;
    public nqk f30502c;

    public /* synthetic */ nzf m36152a(nyt nyt) {
        return m36150b(nyt);
    }

    public static nqj[] m36151d() {
        if (f30499d == null) {
            synchronized (nzc.f31309c) {
                if (f30499d == null) {
                    f30499d = new nqj[0];
                }
            }
        }
        return f30499d;
    }

    public nqj() {
        this.f30500a = nzf.UNSET_ENUM_VALUE;
        this.f30501b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36153a(nyu nyu) {
        if (this.f30500a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30500a);
        }
        if (this.f30501b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30501b);
        }
        if (this.f30502c != null) {
            nyu.m37182b(3, this.f30502c);
        }
        super.a(nyu);
    }

    protected int m36154b() {
        int b = super.b();
        if (this.f30500a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30500a);
        }
        if (this.f30501b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f30501b);
        }
        if (this.f30502c != null) {
            return b + nyu.m37145d(3, this.f30502c);
        }
        return b;
    }

    private nqj m36150b(nyt nyt) {
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
                        case 2:
                        case 3:
                            this.f30500a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30501b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f30502c == null) {
                        this.f30502c = new nqk();
                    }
                    nyt.m37101a(this.f30502c);
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
