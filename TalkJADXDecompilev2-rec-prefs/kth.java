package p000;

public final class kth extends nyx<kth> {
    private static volatile kth[] f23220b;
    public Integer f23221a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27438b(nyt);
    }

    public static kth[] m27439d() {
        if (f23220b == null) {
            synchronized (nzc.c) {
                if (f23220b == null) {
                    f23220b = new kth[0];
                }
            }
        }
        return f23220b;
    }

    public kth() {
        m27440g();
    }

    private kth m27440g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23221a != null) {
            nyu.a(1, this.f23221a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23221a != null) {
            return b + nyu.f(1, this.f23221a.intValue());
        }
        return b;
    }

    private kth m27438b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23221a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
