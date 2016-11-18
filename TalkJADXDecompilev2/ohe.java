package defpackage;

public final class ohe extends nyx<ohe> {
    public String a;
    public Long b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ohe() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.b != null) {
            nyu.b(3, this.b.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(1, this.a);
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.b != null) {
            return b + nyu.f(3, this.b.longValue());
        }
        return b;
    }

    private ohe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.b = Long.valueOf(nyt.e());
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
