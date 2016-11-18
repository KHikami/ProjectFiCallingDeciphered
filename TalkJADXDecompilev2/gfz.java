package defpackage;

public final class gfz extends nzf {
    public int a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public gfz() {
        d();
    }

    private gfz d() {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (!(this.c == null || this.c.equals(""))) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (this.c == null || this.c.equals("")) {
            return b;
        }
        return b + nyu.b(3, this.c);
    }

    private gfz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = nyt.f();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
