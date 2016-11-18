package defpackage;

public final class nmb extends nyx<nmb> {
    public Boolean a;
    public ngw b;
    public ngv c;
    public ntg d;
    public Boolean e;
    public Boolean f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmb() {
        d();
    }

    private nmb d() {
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
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.e != null) {
            nyu.a(6, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(4, this.c);
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f == null) {
            return b;
        }
        this.f.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private nmb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ngw();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new ngv();
                    }
                    nyt.a(this.c);
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new ntg();
                    }
                    nyt.a(this.d);
                    continue;
                case 48:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f = Boolean.valueOf(nyt.i());
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
