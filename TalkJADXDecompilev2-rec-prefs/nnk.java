package p000;

public final class nnk extends nyx<nnk> {
    private static volatile nnk[] f30291c;
    public Integer f30292a;
    public Integer f30293b;

    public /* synthetic */ nzf m35777a(nyt nyt) {
        return m35774b(nyt);
    }

    public static nnk[] m35775d() {
        if (f30291c == null) {
            synchronized (nzc.f31309c) {
                if (f30291c == null) {
                    f30291c = new nnk[0];
                }
            }
        }
        return f30291c;
    }

    public nnk() {
        m35776g();
    }

    private nnk m35776g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35778a(nyu nyu) {
        if (this.f30292a != null) {
            nyu.m37168a(1, this.f30292a.intValue());
        }
        if (this.f30293b != null) {
            nyu.m37168a(2, this.f30293b.intValue());
        }
        super.a(nyu);
    }

    protected int m35779b() {
        int b = super.b();
        if (this.f30292a != null) {
            b += nyu.m37147f(1, this.f30292a.intValue());
        }
        if (this.f30293b != null) {
            return b + nyu.m37147f(2, this.f30293b.intValue());
        }
        return b;
    }

    private nnk m35774b(nyt nyt) {
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
                        case 5:
                            this.f30292a = Integer.valueOf(a);
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
                        case 3:
                            this.f30293b = Integer.valueOf(a);
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
