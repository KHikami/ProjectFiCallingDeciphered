package defpackage;

public final class mdb extends nyx<mdb> {
    public Integer a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mdb() {
        d();
    }

    private mdb d() {
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
            nyu.c(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.c(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.g(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.g(3, this.c.intValue());
        }
        return b;
    }

    private mdb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
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
