package p000;

public final class lww extends nyx<lww> {
    private static volatile lww[] f26730c;
    public lor f26731a;
    public Long f26732b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30933b(nyt);
    }

    public static lww[] m30934d() {
        if (f26730c == null) {
            synchronized (nzc.c) {
                if (f26730c == null) {
                    f26730c = new lww[0];
                }
            }
        }
        return f26730c;
    }

    public lww() {
        m30935g();
    }

    private lww m30935g() {
        this.f26731a = null;
        this.f26732b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26731a != null) {
            nyu.b(1, this.f26731a);
        }
        if (this.f26732b != null) {
            nyu.a(2, this.f26732b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26731a != null) {
            b += nyu.d(1, this.f26731a);
        }
        if (this.f26732b != null) {
            return b + nyu.e(2, this.f26732b.longValue());
        }
        return b;
    }

    private lww m30933b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26731a == null) {
                        this.f26731a = new lor();
                    }
                    nyt.a(this.f26731a);
                    continue;
                case 16:
                    this.f26732b = Long.valueOf(nyt.d());
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
