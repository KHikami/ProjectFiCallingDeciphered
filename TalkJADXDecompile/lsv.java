public final class lsv extends nyx<lsv> {
    public lsw a;
    public lsx b;
    public lsy c;
    public lod d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lsv() {
        d();
    }

    private lsv d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.a != null) {
            nyu.b(3, this.a);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.a != null) {
            b += nyu.d(3, this.a);
        }
        if (this.d != null) {
            return b + nyu.d(4, this.d);
        }
        return b;
    }

    private lsv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.b == null) {
                        this.b = new lsx();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new lsy();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.a == null) {
                        this.a = new lsw();
                    }
                    nyt.a(this.a);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new lod();
                    }
                    nyt.a(this.d);
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
