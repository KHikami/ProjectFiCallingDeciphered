public final class kpz extends nyx<kpz> {
    private static volatile kpz[] c;
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kpz[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new kpz[0];
                }
            }
        }
        return c;
    }

    public kpz() {
        g();
    }

    private kpz g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
    }

    private kpz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
