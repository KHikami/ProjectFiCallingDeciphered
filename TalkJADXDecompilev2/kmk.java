package defpackage;

public final class kmk extends nyx<kmk> {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kmk() {
        d();
    }

    private kmk d() {
        this.a = null;
        this.b = null;
        this.c = null;
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
            nyu.a(5, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(6, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g.booleanValue());
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
            b += nyu.f(5, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(7, this.f.intValue());
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(8) + 1);
    }

    private kmk b(nyt nyt) {
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
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
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
