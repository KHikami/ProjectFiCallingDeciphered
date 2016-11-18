package defpackage;

public final class neu extends nyx<neu> {
    public Boolean a;
    public ngg b;
    public neq c;
    public nfh d;
    public ngg e;
    public net f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public neu() {
        d();
    }

    private neu d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
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
            nyu.a(3, this.a.booleanValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
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
            this.a.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(6, this.f);
        }
        return b;
    }

    private neu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new ngg();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new neq();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dA /*24*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new nfh();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ngg();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new net();
                    }
                    nyt.a(this.f);
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
