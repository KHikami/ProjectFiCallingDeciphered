package p000;

public final class nmd extends nyx<nmd> {
    private static volatile nmd[] f30210b;
    public Integer f30211a;

    public /* synthetic */ nzf m35606a(nyt nyt) {
        return m35603b(nyt);
    }

    public static nmd[] m35604d() {
        if (f30210b == null) {
            synchronized (nzc.f31309c) {
                if (f30210b == null) {
                    f30210b = new nmd[0];
                }
            }
        }
        return f30210b;
    }

    public nmd() {
        m35605g();
    }

    private nmd m35605g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35607a(nyu nyu) {
        if (this.f30211a != null) {
            nyu.m37168a(1, this.f30211a.intValue());
        }
        super.a(nyu);
    }

    protected int m35608b() {
        int b = super.b();
        if (this.f30211a != null) {
            return b + nyu.m37147f(1, this.f30211a.intValue());
        }
        return b;
    }

    private nmd m35603b(nyt nyt) {
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
                            this.f30211a = Integer.valueOf(a);
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
