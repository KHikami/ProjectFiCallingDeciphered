package defpackage;

public final class ook extends nyx<ook> {
    public onv a;
    public Long b;
    public String c;
    public oom d;
    public onh e;
    public onz f;
    public onl g;
    public ooe h;
    public ooc i;
    public onj j;
    public onn k;
    public ons l;
    public ont m;
    public onw n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ook() {
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.c(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        if (this.n != null) {
            nyu.b(14, this.n);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            this.b.longValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null) {
            b += nyu.d(10, this.j);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.m != null) {
            b += nyu.d(13, this.m);
        }
        if (this.n != null) {
            return b + nyu.d(14, this.n);
        }
        return b;
    }

    private ook b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new onv();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dK /*17*/:
                    this.b = Long.valueOf(nyt.g());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new oom();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new onh();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new onz();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new onl();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new ooe();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new ooc();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new onj();
                    }
                    nyt.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new onn();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new ons();
                    }
                    nyt.a(this.l);
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new ont();
                    }
                    nyt.a(this.m);
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new onw();
                    }
                    nyt.a(this.n);
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
