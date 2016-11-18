package defpackage;

public final class nif extends nyx<nif> {
    public Integer a;
    public Boolean b;
    public Boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nif() {
        d();
    }

    private nif d() {
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c == null) {
            return b;
        }
        this.c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private nif b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
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
