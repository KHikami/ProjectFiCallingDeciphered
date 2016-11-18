package p000;

public final class ndv extends nyx<ndv> {
    private static volatile ndv[] f29581b;
    public Integer f29582a;

    public /* synthetic */ nzf m34479a(nyt nyt) {
        return m34476b(nyt);
    }

    public static ndv[] m34477d() {
        if (f29581b == null) {
            synchronized (nzc.f31309c) {
                if (f29581b == null) {
                    f29581b = new ndv[0];
                }
            }
        }
        return f29581b;
    }

    public ndv() {
        m34478g();
    }

    private ndv m34478g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34480a(nyu nyu) {
        if (this.f29582a != null) {
            nyu.m37168a(1, this.f29582a.intValue());
        }
        super.a(nyu);
    }

    protected int m34481b() {
        int b = super.b();
        if (this.f29582a != null) {
            return b + nyu.m37147f(1, this.f29582a.intValue());
        }
        return b;
    }

    private ndv m34476b(nyt nyt) {
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
                            this.f29582a = Integer.valueOf(a);
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
