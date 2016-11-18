package defpackage;

public final class lbq extends nyx<lbq> {
    public String a;
    public laa b;
    public lbr c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbq() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            return b + nyu.d(4, this.c);
        }
        return b;
    }

    private lbq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new laa();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new lbr();
                    }
                    nyt.a(this.c);
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
