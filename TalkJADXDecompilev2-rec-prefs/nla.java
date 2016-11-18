package p000;

public final class nla extends nyx<nla> {
    private static volatile nla[] f30092d;
    public Integer f30093a;
    public noh f30094b;
    public String f30095c;

    public /* synthetic */ nzf m35455a(nyt nyt) {
        return m35452b(nyt);
    }

    public static nla[] m35453d() {
        if (f30092d == null) {
            synchronized (nzc.f31309c) {
                if (f30092d == null) {
                    f30092d = new nla[0];
                }
            }
        }
        return f30092d;
    }

    public nla() {
        m35454g();
    }

    private nla m35454g() {
        this.f30094b = null;
        this.f30095c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35456a(nyu nyu) {
        if (this.f30093a != null) {
            nyu.m37168a(1, this.f30093a.intValue());
        }
        if (this.f30094b != null) {
            nyu.m37182b(2, this.f30094b);
        }
        if (this.f30095c != null) {
            nyu.m37170a(3, this.f30095c);
        }
        super.a(nyu);
    }

    protected int m35457b() {
        int b = super.b();
        if (this.f30093a != null) {
            b += nyu.m37147f(1, this.f30093a.intValue());
        }
        if (this.f30094b != null) {
            b += nyu.m37145d(2, this.f30094b);
        }
        if (this.f30095c != null) {
            return b + nyu.m37137b(3, this.f30095c);
        }
        return b;
    }

    private nla m35452b(nyt nyt) {
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
                            this.f30093a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30094b == null) {
                        this.f30094b = new noh();
                    }
                    nyt.m37101a(this.f30094b);
                    continue;
                case wi.dx /*26*/:
                    this.f30095c = nyt.m37117j();
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
