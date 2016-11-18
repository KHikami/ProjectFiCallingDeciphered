package p000;

public final class khj extends nyx<khj> {
    private static volatile khj[] f21762b;
    public Integer f21763a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25843b(nyt);
    }

    public static khj[] m25844d() {
        if (f21762b == null) {
            synchronized (nzc.c) {
                if (f21762b == null) {
                    f21762b = new khj[0];
                }
            }
        }
        return f21762b;
    }

    public khj() {
        m25845g();
    }

    private khj m25845g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21763a != null) {
            nyu.a(1, this.f21763a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21763a != null) {
            return b + nyu.f(1, this.f21763a.intValue());
        }
        return b;
    }

    private khj m25843b(nyt nyt) {
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
                            this.f21763a = Integer.valueOf(a);
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
