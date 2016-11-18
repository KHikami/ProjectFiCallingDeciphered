package defpackage;

public final class mdc extends nyx<mdc> {
    public Long a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mdc() {
        d();
    }

    private mdc d() {
        this.a = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.e(1, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.intValue());
        }
        return b;
    }

    private mdc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
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
