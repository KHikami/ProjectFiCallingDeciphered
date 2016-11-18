package defpackage;

public final class nlj extends nyx<nlj> {
    public String a;
    public Boolean b;
    public Long c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nlj() {
        d();
    }

    private nlj d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c.longValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.b != null) {
            nyu.a(4, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private nlj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    this.b = Boolean.valueOf(nyt.i());
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
