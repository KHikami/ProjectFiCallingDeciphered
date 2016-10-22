public final class lbk extends nyx<lbk> {
    public Boolean a;
    public ldm b;
    public ldm c;
    public ldm d;
    public lbe e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbk() {
        d();
    }

    private lbk d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(5, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.b(6, this.b);
        }
        if (this.c != null) {
            nyu.b(7, this.c);
        }
        if (this.d != null) {
            nyu.b(8, this.d);
        }
        if (this.e != null) {
            nyu.b(9, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.b != null) {
            b += nyu.d(6, this.b);
        }
        if (this.c != null) {
            b += nyu.d(7, this.c);
        }
        if (this.d != null) {
            b += nyu.d(8, this.d);
        }
        if (this.e != null) {
            return b + nyu.d(9, this.e);
        }
        return b;
    }

    private lbk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 40:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.b == null) {
                        this.b = new ldm();
                    }
                    nyt.a(this.b);
                    continue;
                case 58:
                    if (this.c == null) {
                        this.c = new ldm();
                    }
                    nyt.a(this.c);
                    continue;
                case 66:
                    if (this.d == null) {
                        this.d = new ldm();
                    }
                    nyt.a(this.d);
                    continue;
                case 74:
                    if (this.e == null) {
                        this.e = new lbe();
                    }
                    nyt.a(this.e);
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
