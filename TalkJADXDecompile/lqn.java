public final class lqn extends nyx<lqn> {
    public lqo a;
    public lqp b;
    public lod c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lqn() {
        d();
    }

    private lqn d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private lqn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.b == null) {
                        this.b = new lqp();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new lqo();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lod();
                    }
                    nyt.a(this.c);
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
