package defpackage;

public final class njx extends nyx<njx> {
    public String a;
    public Long b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public njx() {
        d();
    }

    private njx d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.c(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.longValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.longValue());
        }
        return b;
    }

    private njx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.b = Long.valueOf(nyt.g());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
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
