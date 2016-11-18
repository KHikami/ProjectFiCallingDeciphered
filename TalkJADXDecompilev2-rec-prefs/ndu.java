package p000;

public final class ndu extends nyx<ndu> {
    private static volatile ndu[] f29579b;
    public Integer f29580a;

    public /* synthetic */ nzf m34473a(nyt nyt) {
        return m34470b(nyt);
    }

    public static ndu[] m34471d() {
        if (f29579b == null) {
            synchronized (nzc.f31309c) {
                if (f29579b == null) {
                    f29579b = new ndu[0];
                }
            }
        }
        return f29579b;
    }

    public ndu() {
        m34472g();
    }

    private ndu m34472g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34474a(nyu nyu) {
        if (this.f29580a != null) {
            nyu.m37168a(1, this.f29580a.intValue());
        }
        super.a(nyu);
    }

    protected int m34475b() {
        int b = super.b();
        if (this.f29580a != null) {
            return b + nyu.m37147f(1, this.f29580a.intValue());
        }
        return b;
    }

    private ndu m34470b(nyt nyt) {
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
                            this.f29580a = Integer.valueOf(a);
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
