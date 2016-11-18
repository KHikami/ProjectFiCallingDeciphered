package defpackage;

public final class kiy extends nyx<kiy> {
    public Long a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kiy() {
        d();
    }

    private kiy d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(2, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(2, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.c != null) {
            return b + nyu.b(4, this.c);
        }
        return b;
    }

    private kiy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    this.c = nyt.j();
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
