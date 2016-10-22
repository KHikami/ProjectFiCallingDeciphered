public final class ltr extends nyx<ltr> {
    private static volatile ltr[] c;
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ltr[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ltr[0];
                }
            }
        }
        return c;
    }

    public ltr() {
        g();
    }

    private ltr g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.a != null) {
            return b + nyu.b(2, this.a);
        }
        return b;
    }

    private ltr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
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
