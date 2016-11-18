package defpackage;

public final class nhf extends nyx<nhf> {
    public ngp a;
    public Boolean b;
    public ngf c;
    public nni d;
    public nhr e;
    public nhr f;
    public nhs g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nhf() {
        d();
    }

    private nhf d() {
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
        if (this.b != null) {
            nyu.a(1, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.f != null) {
            nyu.b(7, this.f);
        }
        if (this.g != null) {
            nyu.b(8, this.g);
        }
        if (this.a != null) {
            nyu.b(12, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.f != null) {
            b += nyu.d(7, this.f);
        }
        if (this.g != null) {
            b += nyu.d(8, this.g);
        }
        if (this.a != null) {
            return b + nyu.d(12, this.a);
        }
        return b;
    }

    private nhf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new ngf();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new nni();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new nhr();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new nhr();
                    }
                    nyt.a(this.f);
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new nhs();
                    }
                    nyt.a(this.g);
                    continue;
                case 98:
                    if (this.a == null) {
                        this.a = new ngp();
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
