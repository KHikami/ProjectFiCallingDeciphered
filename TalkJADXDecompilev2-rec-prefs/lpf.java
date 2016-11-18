package p000;

public final class lpf extends nyx<lpf> {
    private static volatile lpf[] f25989c;
    public Long f25990a;
    public Integer f25991b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29878b(nyt);
    }

    public static lpf[] m29879d() {
        if (f25989c == null) {
            synchronized (nzc.c) {
                if (f25989c == null) {
                    f25989c = new lpf[0];
                }
            }
        }
        return f25989c;
    }

    public lpf() {
        m29880g();
    }

    private lpf m29880g() {
        this.f25990a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25990a != null) {
            nyu.a(1, this.f25990a.longValue());
        }
        if (this.f25991b != null) {
            nyu.a(2, this.f25991b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25990a != null) {
            b += nyu.e(1, this.f25990a.longValue());
        }
        if (this.f25991b != null) {
            return b + nyu.f(2, this.f25991b.intValue());
        }
        return b;
    }

    private lpf m29878b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25990a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25991b = Integer.valueOf(a);
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
