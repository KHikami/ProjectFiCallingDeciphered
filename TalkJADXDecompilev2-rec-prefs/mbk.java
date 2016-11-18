package p000;

public final class mbk extends nyx<mbk> {
    private static volatile mbk[] f27222b;
    public String f27223a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31582b(nyt);
    }

    public static mbk[] m31583d() {
        if (f27222b == null) {
            synchronized (nzc.c) {
                if (f27222b == null) {
                    f27222b = new mbk[0];
                }
            }
        }
        return f27222b;
    }

    public mbk() {
        m31584g();
    }

    private mbk m31584g() {
        this.f27223a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27223a != null) {
            nyu.a(1, this.f27223a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27223a != null) {
            return b + nyu.b(1, this.f27223a);
        }
        return b;
    }

    private mbk m31582b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27223a = nyt.j();
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
