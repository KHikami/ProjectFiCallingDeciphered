public final class lvr extends nyx<lvr> {
    public ltz a;
    public lpt b;
    public lpl c;
    public lth d;
    public lrz e;
    public lwh f;
    public lws g;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lvr() {
        d();
    }

    private lvr d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.b(5, this.c);
        }
        if (this.d != null) {
            nyu.b(6, this.d);
        }
        if (this.e != null) {
            nyu.b(7, this.e);
        }
        if (this.f != null) {
            nyu.b(8, this.f);
        }
        if (this.g != null) {
            nyu.b(9, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            b += nyu.d(5, this.c);
        }
        if (this.d != null) {
            b += nyu.d(6, this.d);
        }
        if (this.e != null) {
            b += nyu.d(7, this.e);
        }
        if (this.f != null) {
            b += nyu.d(8, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(9, this.g);
        }
        return b;
    }

    private lvr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new ltz();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lpt();
                    }
                    nyt.a(this.b);
                    continue;
                case 42:
                    if (this.c == null) {
                        this.c = new lpl();
                    }
                    nyt.a(this.c);
                    continue;
                case 50:
                    if (this.d == null) {
                        this.d = new lth();
                    }
                    nyt.a(this.d);
                    continue;
                case 58:
                    if (this.e == null) {
                        this.e = new lrz();
                    }
                    nyt.a(this.e);
                    continue;
                case 66:
                    if (this.f == null) {
                        this.f = new lwh();
                    }
                    nyt.a(this.f);
                    continue;
                case 74:
                    if (this.g == null) {
                        this.g = new lws();
                    }
                    nyt.a(this.g);
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
