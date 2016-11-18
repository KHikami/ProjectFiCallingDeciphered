package defpackage;

public final class ohd extends nyx<ohd> {
    private static volatile ohd[] s;
    public Long a;
    public Long b;
    public Boolean c;
    public String d;
    public String e;
    public ohf f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public ohm[] l;
    public String m;
    public byte[] n;
    public ogn o;
    public String p;
    public ohe q;
    public ogs r;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohd[] d() {
        if (s == null) {
            synchronized (nzc.c) {
                if (s == null) {
                    s = new ohd[0];
                }
            }
        }
        return s;
    }

    public ohd() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = ohm.d();
        this.m = null;
        this.n = null;
        this.p = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.b(5, this.f);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.n != null) {
            nyu.a(7, this.n);
        }
        if (this.o != null) {
            nyu.b(8, this.o);
        }
        if (this.p != null) {
            nyu.a(9, this.p);
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.q != null) {
            nyu.b(11, this.q);
        }
        if (this.m != null) {
            nyu.a(12, this.m);
        }
        if (this.g != null) {
            nyu.b(13, this.g.intValue());
        }
        if (this.c != null) {
            nyu.a(15, this.c.booleanValue());
        }
        if (this.r != null) {
            nyu.b(16, this.r);
        }
        if (this.i != null) {
            nyu.a(17, this.i);
        }
        if (this.j != null) {
            nyu.a(19, this.j);
        }
        if (this.k != null) {
            nyu.a(20, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.d(5, this.f);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.n != null) {
            b += nyu.b(7, this.n);
        }
        if (this.o != null) {
            b += nyu.d(8, this.o);
        }
        if (this.p != null) {
            b += nyu.b(9, this.p);
        }
        if (this.l != null && this.l.length > 0) {
            int i = b;
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.q != null) {
            b += nyu.d(11, this.q);
        }
        if (this.m != null) {
            b += nyu.b(12, this.m);
        }
        if (this.g != null) {
            this.g.intValue();
            b += nyu.h(13) + 4;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.r != null) {
            b += nyu.d(16, this.r);
        }
        if (this.i != null) {
            b += nyu.b(17, this.i);
        }
        if (this.j != null) {
            b += nyu.b(19, this.j);
        }
        if (this.k != null) {
            return b + nyu.b(20, this.k);
        }
        return b;
    }

    private ohd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    if (this.f == null) {
                        this.f = new ohf();
                    }
                    nyt.a(this.f);
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 58:
                    this.n = nyt.k();
                    continue;
                case 66:
                    if (this.o == null) {
                        this.o = new ogn();
                    }
                    nyt.a(this.o);
                    continue;
                case 74:
                    this.p = nyt.j();
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    Object obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 90:
                    if (this.q == null) {
                        this.q = new ohe();
                    }
                    nyt.a(this.q);
                    continue;
                case 98:
                    this.m = nyt.j();
                    continue;
                case 109:
                    this.g = Integer.valueOf(nyt.h());
                    continue;
                case 120:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    if (this.r == null) {
                        this.r = new ogs();
                    }
                    nyt.a(this.r);
                    continue;
                case 138:
                    this.i = nyt.j();
                    continue;
                case 154:
                    this.j = nyt.j();
                    continue;
                case 162:
                    this.k = nyt.j();
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
