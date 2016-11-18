package defpackage;

public final class orn extends nyx<orn> {
    public Integer a;
    public Integer b;
    public oqr c;
    public String d;
    public Integer e;
    public Long f;
    public String g;
    public String h;
    public String[] i;
    public Boolean j;
    public String k;
    public Integer l;
    public String m;
    public String n;
    public String o;
    public Boolean p;
    public Boolean q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public orn() {
        d();
    }

    private orn d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = nzl.f;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.d(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.d(2, this.b.intValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.e(4, this.e.intValue());
        }
        if (this.f != null) {
            nyu.d(5, this.f.longValue());
        }
        if (this.j != null) {
            nyu.a(6, this.j.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.k != null) {
            nyu.a(8, this.k);
        }
        if (this.l != null) {
            nyu.a(9, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(10, this.m);
        }
        if (this.c != null) {
            nyu.b(11, this.c);
        }
        if (this.n != null) {
            nyu.a(12, this.n);
        }
        if (this.h != null) {
            nyu.a(13, this.h);
        }
        if (this.o != null) {
            nyu.a(14, this.o);
        }
        if (this.i != null && this.i.length > 0) {
            for (String str : this.i) {
                if (str != null) {
                    nyu.a(16, str);
                }
            }
        }
        if (this.p != null) {
            nyu.a(17, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.a(18, this.q.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            this.a.intValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            this.b.intValue();
            b += nyu.h(2) + 4;
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.h(4, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.g(5, this.f.longValue());
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.k != null) {
            b += nyu.b(8, this.k);
        }
        if (this.l != null) {
            b += nyu.f(9, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.b(10, this.m);
        }
        if (this.c != null) {
            b += nyu.d(11, this.c);
        }
        if (this.n != null) {
            b += nyu.b(12, this.n);
        }
        if (this.h != null) {
            b += nyu.b(13, this.h);
        }
        if (this.o != null) {
            b += nyu.b(14, this.o);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.i.length) {
                String str = this.i[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(17) + 1;
        }
        if (this.q == null) {
            return b;
        }
        this.q.booleanValue();
        return b + (nyu.h(18) + 1);
    }

    private orn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Integer.valueOf(nyt.n());
                    continue;
                case 21:
                    this.b = Integer.valueOf(nyt.n());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    this.e = Integer.valueOf(nyt.p());
                    continue;
                case 40:
                    this.f = Long.valueOf(nyt.q());
                    continue;
                case 48:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.k = nyt.j();
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    this.m = nyt.j();
                    continue;
                case 90:
                    if (this.c == null) {
                        this.c = new oqr();
                    }
                    nyt.a(this.c);
                    continue;
                case 98:
                    this.n = nyt.j();
                    continue;
                case 106:
                    this.h = nyt.j();
                    continue;
                case 114:
                    this.o = nyt.j();
                    continue;
                case 130:
                    int b = nzl.b(nyt, 130);
                    a = this.i == null ? 0 : this.i.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.i = obj;
                    continue;
                case 136:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 144:
                    this.q = Boolean.valueOf(nyt.i());
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
