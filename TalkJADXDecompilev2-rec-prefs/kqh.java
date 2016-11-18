package p000;

public final class kqh extends nyx<kqh> {
    private static volatile kqh[] f22760b;
    public String f22761a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27043b(nyt);
    }

    public static kqh[] m27044d() {
        if (f22760b == null) {
            synchronized (nzc.c) {
                if (f22760b == null) {
                    f22760b = new kqh[0];
                }
            }
        }
        return f22760b;
    }

    public kqh() {
        m27045g();
    }

    private kqh m27045g() {
        this.f22761a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22761a != null) {
            nyu.a(1, this.f22761a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22761a != null) {
            return b + nyu.b(1, this.f22761a);
        }
        return b;
    }

    private kqh m27043b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22761a = nyt.j();
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
