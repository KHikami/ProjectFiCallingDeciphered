package p000;

public final class nmn extends nyx<nmn> {
    private static volatile nmn[] f30248b;
    public Integer f30249a;

    public /* synthetic */ nzf m35659a(nyt nyt) {
        return m35656b(nyt);
    }

    public static nmn[] m35657d() {
        if (f30248b == null) {
            synchronized (nzc.f31309c) {
                if (f30248b == null) {
                    f30248b = new nmn[0];
                }
            }
        }
        return f30248b;
    }

    public nmn() {
        m35658g();
    }

    private nmn m35658g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35660a(nyu nyu) {
        if (this.f30249a != null) {
            nyu.m37168a(1, this.f30249a.intValue());
        }
        super.a(nyu);
    }

    protected int m35661b() {
        int b = super.b();
        if (this.f30249a != null) {
            return b + nyu.m37147f(1, this.f30249a.intValue());
        }
        return b;
    }

    private nmn m35656b(nyt nyt) {
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
                        case 4:
                            this.f30249a = Integer.valueOf(a);
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
