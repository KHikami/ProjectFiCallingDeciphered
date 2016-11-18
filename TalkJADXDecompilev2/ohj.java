package defpackage;

public final class ohj extends nyx<ohj> {
    private static volatile ohj[] r;
    public Long a;
    public ohb b;
    public Boolean c;
    public oha d;
    public byte[] e;
    public ogn f;
    public String g;
    public String[] h;
    public String i;
    public String j;
    public ohm[] k;
    public nzg l;
    public Long m;
    public ohk n;
    public ohh o;
    public ogs p;
    public ogq q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohj[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new ohj[0];
                }
            }
        }
        return r;
    }

    public ohj() {
        this.a = null;
        this.c = null;
        this.e = null;
        this.g = null;
        this.h = nzl.f;
        this.i = null;
        this.j = null;
        this.k = ohm.d();
        this.m = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.e != null) {
            nyu.a(1, this.e);
        }
        if (this.f != null) {
            nyu.b(2, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            for (String str : this.h) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            while (i < this.k.length) {
                nzf nzf = this.k[i];
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
                i++;
            }
        }
        if (this.i != null) {
            nyu.a(6, this.i);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.m != null) {
            nyu.b(8, this.m.longValue());
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.n != null) {
            nyu.b(10, this.n);
        }
        if (this.o != null) {
            nyu.b(11, this.o);
        }
        if (this.a != null) {
            nyu.b(12, this.a.longValue());
        }
        if (this.p != null) {
            nyu.b(13, this.p);
        }
        if (this.q != null) {
            nyu.b(14, this.q);
        }
        if (this.c != null) {
            nyu.a(16, this.c.booleanValue());
        }
        if (this.l != null) {
            nyu.b(17, this.l);
        }
        if (this.b != null) {
            nyu.b(18, this.b);
        }
        if (this.d != null) {
            nyu.b(19, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.e != null) {
            b += nyu.b(1, this.e);
        }
        if (this.f != null) {
            b += nyu.d(2, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.h) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.k != null && this.k.length > 0) {
            while (i < this.k.length) {
                nzf nzf = this.k[i];
                if (nzf != null) {
                    b += nyu.d(4, nzf);
                }
                i++;
            }
        }
        if (this.i != null) {
            b += nyu.b(6, this.i);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.m != null) {
            b += nyu.f(8, this.m.longValue());
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.n != null) {
            b += nyu.d(10, this.n);
        }
        if (this.o != null) {
            b += nyu.d(11, this.o);
        }
        if (this.a != null) {
            b += nyu.f(12, this.a.longValue());
        }
        if (this.p != null) {
            b += nyu.d(13, this.p);
        }
        if (this.q != null) {
            b += nyu.d(14, this.q);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.l != null) {
            b += nyu.d(17, this.l);
        }
        if (this.b != null) {
            b += nyu.d(18, this.b);
        }
        if (this.d != null) {
            return b + nyu.d(19, this.d);
        }
        return b;
    }

    private ohj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.e = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    if (this.f == null) {
                        this.f = new ogn();
                    }
                    nyt.a(this.f);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.h == null ? 0 : this.h.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.h = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.a(obj[a]);
                    this.k = obj;
                    continue;
                case 50:
                    this.i = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 64:
                    this.m = Long.valueOf(nyt.e());
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 82:
                    if (this.n == null) {
                        this.n = new ohk();
                    }
                    nyt.a(this.n);
                    continue;
                case 90:
                    if (this.o == null) {
                        this.o = new ohh();
                    }
                    nyt.a(this.o);
                    continue;
                case 96:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 106:
                    if (this.p == null) {
                        this.p = new ogs();
                    }
                    nyt.a(this.p);
                    continue;
                case 114:
                    if (this.q == null) {
                        this.q = new ogq();
                    }
                    nyt.a(this.q);
                    continue;
                case 128:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    if (this.l == null) {
                        this.l = new nzg();
                    }
                    nyt.a(this.l);
                    continue;
                case 146:
                    if (this.b == null) {
                        this.b = new ohb();
                    }
                    nyt.a(this.b);
                    continue;
                case 154:
                    if (this.d == null) {
                        this.d = new oha();
                    }
                    nyt.a(this.d);
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
