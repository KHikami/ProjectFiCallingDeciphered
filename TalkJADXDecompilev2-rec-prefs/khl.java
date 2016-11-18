package p000;

public final class khl extends nyx<khl> {
    private static volatile khl[] f21765b;
    public int f21766a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25854b(nyt);
    }

    public static khl[] m25855d() {
        if (f21765b == null) {
            synchronized (nzc.c) {
                if (f21765b == null) {
                    f21765b = new khl[0];
                }
            }
        }
        return f21765b;
    }

    public khl() {
        this.f21766a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21766a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f21766a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21766a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f21766a);
        }
        return b;
    }

    private khl m25854b(nyt nyt) {
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
                        case 5:
                        case 6:
                            this.f21766a = a;
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
