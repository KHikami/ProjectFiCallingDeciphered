package p000;

public final class kme extends nyx<kme> {
    private static volatile kme[] f22349b;
    public Integer f22350a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26511b(nyt);
    }

    public static kme[] m26512d() {
        if (f22349b == null) {
            synchronized (nzc.c) {
                if (f22349b == null) {
                    f22349b = new kme[0];
                }
            }
        }
        return f22349b;
    }

    public kme() {
        m26513g();
    }

    private kme m26513g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22350a != null) {
            nyu.a(1, this.f22350a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22350a != null) {
            return b + nyu.f(1, this.f22350a.intValue());
        }
        return b;
    }

    private kme m26511b(nyt nyt) {
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
                            this.f22350a = Integer.valueOf(a);
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
