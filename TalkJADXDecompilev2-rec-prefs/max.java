package p000;

public final class max extends nyx<max> {
    private static volatile max[] f27183c;
    public String f27184a;
    public Long f27185b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31502b(nyt);
    }

    public static max[] m31503d() {
        if (f27183c == null) {
            synchronized (nzc.c) {
                if (f27183c == null) {
                    f27183c = new max[0];
                }
            }
        }
        return f27183c;
    }

    public max() {
        m31504g();
    }

    private max m31504g() {
        this.f27184a = null;
        this.f27185b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27184a != null) {
            nyu.a(1, this.f27184a);
        }
        if (this.f27185b != null) {
            nyu.b(2, this.f27185b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27184a != null) {
            b += nyu.b(1, this.f27184a);
        }
        if (this.f27185b != null) {
            return b + nyu.f(2, this.f27185b.longValue());
        }
        return b;
    }

    private max m31502b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27184a = nyt.j();
                    continue;
                case 16:
                    this.f27185b = Long.valueOf(nyt.e());
                    continue;
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
