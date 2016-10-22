public final class lnl extends nyx<lnl> {
    public String a;
    public double b;
    public boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnl() {
        d();
    }

    private lnl d() {
        this.a = "";
        this.b = 0.0d;
        this.c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            nyu.a(2, this.b);
        }
        if (this.c) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            double d = this.b;
            b += nyu.h(2) + 8;
        }
        if (!this.c) {
            return b;
        }
        boolean z = this.c;
        return b + (nyu.h(3) + 1);
    }

    private lnl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.b = nyt.b();
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.i();
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
