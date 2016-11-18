package p000;

public final class lpd extends nyx<lpd> {
    private static volatile lpd[] f25986c;
    public Long f25987a;
    public Integer f25988b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29867b(nyt);
    }

    public static lpd[] m29868d() {
        if (f25986c == null) {
            synchronized (nzc.c) {
                if (f25986c == null) {
                    f25986c = new lpd[0];
                }
            }
        }
        return f25986c;
    }

    public lpd() {
        m29869g();
    }

    private lpd m29869g() {
        this.f25987a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25987a != null) {
            nyu.a(1, this.f25987a.longValue());
        }
        if (this.f25988b != null) {
            nyu.a(2, this.f25988b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25987a != null) {
            b += nyu.e(1, this.f25987a.longValue());
        }
        if (this.f25988b != null) {
            return b + nyu.f(2, this.f25988b.intValue());
        }
        return b;
    }

    private lpd m29867b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25987a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25988b = Integer.valueOf(a);
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
