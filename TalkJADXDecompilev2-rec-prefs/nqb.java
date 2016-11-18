package p000;

public final class nqb extends nyx<nqb> {
    private static volatile nqb[] f30471c;
    public Integer f30472a;
    public Integer f30473b;

    public /* synthetic */ nzf m36118a(nyt nyt) {
        return m36115b(nyt);
    }

    public static nqb[] m36116d() {
        if (f30471c == null) {
            synchronized (nzc.f31309c) {
                if (f30471c == null) {
                    f30471c = new nqb[0];
                }
            }
        }
        return f30471c;
    }

    public nqb() {
        m36117g();
    }

    private nqb m36117g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36119a(nyu nyu) {
        if (this.f30472a != null) {
            nyu.m37168a(1, this.f30472a.intValue());
        }
        if (this.f30473b != null) {
            nyu.m37168a(2, this.f30473b.intValue());
        }
        super.a(nyu);
    }

    protected int m36120b() {
        int b = super.b();
        if (this.f30472a != null) {
            b += nyu.m37147f(1, this.f30472a.intValue());
        }
        if (this.f30473b != null) {
            return b + nyu.m37147f(2, this.f30473b.intValue());
        }
        return b;
    }

    private nqb m36115b(nyt nyt) {
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
                            this.f30472a = Integer.valueOf(a);
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
                            this.f30473b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
