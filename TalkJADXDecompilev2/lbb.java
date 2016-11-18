package defpackage;

public final class lbb extends nyx<lbb> {
    public lbf a;
    public lbl b;
    public lbk c;
    public lbi d;
    public lbd e;
    public lbc f;
    public lbi g;
    public lbh h;
    public lbj i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbb() {
        d();
    }

    private lbb d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.b(7, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.f != null) {
            nyu.b(10, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.d(7, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.f != null) {
            return b + nyu.d(10, this.f);
        }
        return b;
    }

    private lbb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new lbf();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lbl();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lbk();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new lbi();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new lbd();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new lbi();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    if (this.h == null) {
                        this.h = new lbh();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new lbj();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.f == null) {
                        this.f = new lbc();
                    }
                    nyt.a(this.f);
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
