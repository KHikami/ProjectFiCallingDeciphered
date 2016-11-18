package defpackage;

public final class niv extends nyx<niv> {
    private static volatile niv[] n;
    public njo a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public nig g;
    public nhw h;
    public nob i;
    public njk j;
    public njm k;
    public njm l;
    public njj m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static niv[] d() {
        if (n == null) {
            synchronized (nzc.c) {
                if (n == null) {
                    n = new niv[0];
                }
            }
        }
        return n;
    }

    public niv() {
        g();
    }

    private niv g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.h != null) {
            nyu.b(5, this.h);
        }
        if (this.a != null) {
            nyu.b(6, this.a);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.b(8, this.j);
        }
        if (this.k != null) {
            nyu.b(10, this.k);
        }
        if (this.m != null) {
            nyu.b(11, this.m);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.g != null) {
            nyu.b(13, this.g);
        }
        if (this.e != null) {
            nyu.a(15, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.h != null) {
            b += nyu.d(5, this.h);
        }
        if (this.a != null) {
            b += nyu.d(6, this.a);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            b += nyu.d(8, this.j);
        }
        if (this.k != null) {
            b += nyu.d(10, this.k);
        }
        if (this.m != null) {
            b += nyu.d(11, this.m);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.g != null) {
            b += nyu.d(13, this.g);
        }
        if (this.e != null) {
            return b + nyu.b(15, this.e);
        }
        return b;
    }

    private niv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    if (this.h == null) {
                        this.h = new nhw();
                    }
                    nyt.a(this.h);
                    continue;
                case 50:
                    if (this.a == null) {
                        this.a = new njo();
                    }
                    nyt.a(this.a);
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new nob();
                    }
                    nyt.a(this.i);
                    continue;
                case 66:
                    if (this.j == null) {
                        this.j = new njk();
                    }
                    nyt.a(this.j);
                    continue;
                case 82:
                    if (this.k == null) {
                        this.k = new njm();
                    }
                    nyt.a(this.k);
                    continue;
                case 90:
                    if (this.m == null) {
                        this.m = new njj();
                    }
                    nyt.a(this.m);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new njm();
                    }
                    nyt.a(this.l);
                    continue;
                case 106:
                    if (this.g == null) {
                        this.g = new nig();
                    }
                    nyt.a(this.g);
                    continue;
                case 122:
                    this.e = nyt.j();
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
