public final class mbk extends nyx<mbk> {
    private static volatile mbk[] b;
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mbk[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new mbk[0];
                }
            }
        }
        return b;
    }

    public mbk() {
        g();
    }

    private mbk g() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.b(1, this.a);
        }
        return b;
    }

    private mbk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
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
