package defpackage;

public final class oqg extends nyx<oqg> {
    public oqi[] a;
    public oqi b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public oqh m;
    public String n;
    public Boolean o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqg() {
        d();
    }

    private oqg d() {
        this.a = oqi.d();
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
        this.n = null;
        this.o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(11, this.e);
        }
        if (this.f != null) {
            nyu.a(12, this.f);
        }
        if (this.g != null) {
            nyu.a(13, this.g);
        }
        if (this.h != null) {
            nyu.a(14, this.h);
        }
        if (this.i != null) {
            nyu.a(15, this.i);
        }
        if (this.j != null) {
            nyu.a(16, this.j);
        }
        if (this.m != null) {
            nyu.b(17, this.m);
        }
        if (this.n != null) {
            nyu.a(18, this.n);
        }
        if (this.o != null) {
            nyu.a(19, this.o.booleanValue());
        }
        if (this.k != null) {
            nyu.a(20, this.k);
        }
        if (this.l != null) {
            nyu.a(21, this.l);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(11, this.e);
        }
        if (this.f != null) {
            b += nyu.b(12, this.f);
        }
        if (this.g != null) {
            b += nyu.b(13, this.g);
        }
        if (this.h != null) {
            b += nyu.b(14, this.h);
        }
        if (this.i != null) {
            b += nyu.b(15, this.i);
        }
        if (this.j != null) {
            b += nyu.b(16, this.j);
        }
        if (this.m != null) {
            b += nyu.d(17, this.m);
        }
        if (this.n != null) {
            b += nyu.b(18, this.n);
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.k != null) {
            b += nyu.b(20, this.k);
        }
        if (this.l != null) {
            return b + nyu.b(21, this.l);
        }
        return b;
    }

    private oqg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new oqi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqi();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new oqi();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 90:
                    this.e = nyt.j();
                    continue;
                case 98:
                    this.f = nyt.j();
                    continue;
                case 106:
                    this.g = nyt.j();
                    continue;
                case 114:
                    this.h = nyt.j();
                    continue;
                case 122:
                    this.i = nyt.j();
                    continue;
                case 130:
                    this.j = nyt.j();
                    continue;
                case 138:
                    if (this.m == null) {
                        this.m = new oqh();
                    }
                    nyt.a(this.m);
                    continue;
                case 146:
                    this.n = nyt.j();
                    continue;
                case 152:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 162:
                    this.k = nyt.j();
                    continue;
                case 170:
                    this.l = nyt.j();
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
