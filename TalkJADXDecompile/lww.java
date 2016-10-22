public final class lww extends nyx<lww> {
    private static volatile lww[] c;
    public lor a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lww[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lww[0];
                }
            }
        }
        return c;
    }

    public lww() {
        g();
    }

    private lww g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.e(2, this.b.longValue());
        }
        return b;
    }

    private lww b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lor();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
