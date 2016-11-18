package p000;

public final class ktf extends nyx<ktf> {
    private static volatile ktf[] f23215b;
    public int f23216a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27427b(nyt);
    }

    public static ktf[] m27428d() {
        if (f23215b == null) {
            synchronized (nzc.c) {
                if (f23215b == null) {
                    f23215b = new ktf[0];
                }
            }
        }
        return f23215b;
    }

    public ktf() {
        this.f23216a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23216a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23216a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23216a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f23216a);
        }
        return b;
    }

    private ktf m27427b(nyt nyt) {
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
                            this.f23216a = a;
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
