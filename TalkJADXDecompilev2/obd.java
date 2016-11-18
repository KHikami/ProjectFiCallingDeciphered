package defpackage;

public final class obd extends nyx<obd> {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public obd() {
        d();
    }

    private obd d() {
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
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
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
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private obd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
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
