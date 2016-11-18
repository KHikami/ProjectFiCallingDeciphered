package defpackage;

public final class oav extends nyx<oav> {
    public String a;
    public String b;
    public String c;
    public String d;
    public kzl e;
    public ofx f;
    public String g;
    public obi h;
    public oau i;
    public Boolean j;
    public obh k;
    public String l;
    public String m;
    public String n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oav() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.j = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.c != null) {
            nyu.a(6, this.c);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.a(8, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.b(9, this.k);
        }
        if (this.l != null) {
            nyu.a(10, this.l);
        }
        if (this.m != null) {
            nyu.a(11, this.m);
        }
        if (this.n != null) {
            nyu.a(12, this.n);
        }
        if (this.h != null) {
            nyu.b(13, this.h);
        }
        if (this.f != null) {
            nyu.b(14, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.c != null) {
            b += nyu.b(6, this.c);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.k != null) {
            b += nyu.d(9, this.k);
        }
        if (this.l != null) {
            b += nyu.b(10, this.l);
        }
        if (this.m != null) {
            b += nyu.b(11, this.m);
        }
        if (this.n != null) {
            b += nyu.b(12, this.n);
        }
        if (this.h != null) {
            b += nyu.d(13, this.h);
        }
        if (this.f != null) {
            return b + nyu.d(14, this.f);
        }
        return b;
    }

    private oav b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new kzl();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.c = nyt.j();
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new oau();
                    }
                    nyt.a(this.i);
                    continue;
                case 64:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 74:
                    if (this.k == null) {
                        this.k = new obh();
                    }
                    nyt.a(this.k);
                    continue;
                case 82:
                    this.l = nyt.j();
                    continue;
                case 90:
                    this.m = nyt.j();
                    continue;
                case 98:
                    this.n = nyt.j();
                    continue;
                case 106:
                    if (this.h == null) {
                        this.h = new obi();
                    }
                    nyt.a(this.h);
                    continue;
                case 114:
                    if (this.f == null) {
                        this.f = new ofx();
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
