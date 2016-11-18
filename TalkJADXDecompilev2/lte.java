package defpackage;

public final class lte extends nyx<lte> {
    public lqm a;
    public Integer b;
    public byte[] c;
    public Long d;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lte() {
        d();
    }

    private lte d() {
        this.requestHeader = null;
        this.a = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        if (this.a != null) {
            nyu.b(5, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.d != null) {
            b += nyu.e(4, this.d.longValue());
        }
        if (this.a != null) {
            return b + nyu.d(5, this.a);
        }
        return b;
    }

    private lte b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.a == null) {
                        this.a = new lqm();
                    }
                    nyt.a(this.a);
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
