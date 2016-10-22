public final class ldw extends nyx<ldw> {
    private static volatile ldw[] e;
    public ldx a;
    public lee b;
    public Boolean c;
    public leh d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ldw[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ldw[0];
                }
            }
        }
        return e;
    }

    public ldw() {
        g();
    }

    private ldw g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            return b + nyu.d(5, this.d);
        }
        return b;
    }

    private ldw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new ldx();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lee();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new leh();
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
