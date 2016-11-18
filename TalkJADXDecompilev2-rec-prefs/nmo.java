package p000;

public final class nmo extends nyx<nmo> {
    private static volatile nmo[] f30250c;
    public Integer f30251a;
    public Boolean f30252b;

    public /* synthetic */ nzf m35665a(nyt nyt) {
        return m35662b(nyt);
    }

    public static nmo[] m35663d() {
        if (f30250c == null) {
            synchronized (nzc.f31309c) {
                if (f30250c == null) {
                    f30250c = new nmo[0];
                }
            }
        }
        return f30250c;
    }

    public nmo() {
        m35664g();
    }

    private nmo m35664g() {
        this.f30252b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35666a(nyu nyu) {
        if (this.f30251a != null) {
            nyu.m37168a(1, this.f30251a.intValue());
        }
        if (this.f30252b != null) {
            nyu.m37172a(2, this.f30252b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35667b() {
        int b = super.b();
        if (this.f30251a != null) {
            b += nyu.m37147f(1, this.f30251a.intValue());
        }
        if (this.f30252b == null) {
            return b;
        }
        this.f30252b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nmo m35662b(nyt nyt) {
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
                            this.f30251a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f30252b = Boolean.valueOf(nyt.m37116i());
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
