import com.google.api.client.http.HttpStatusCodes;

public final class mrp extends nyx<mrp> {
    public Integer a;
    public Integer b;
    public int[] c;
    public Integer d;
    public mrr e;
    public mrr f;
    public mrr g;
    public String[] h;
    public Boolean i;
    public Long j;
    public Integer k;
    public Integer l;
    public Integer m;
    public long[] n;
    public String o;
    public mrs[] p;
    public Boolean q;
    public int[] r;
    public Integer s;
    public mrq t;
    public String u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public mrt[] z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mrp() {
        d();
    }

    private mrp d() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = nzl.f;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = nzl.b;
        this.o = null;
        this.p = mrs.d();
        this.q = null;
        this.r = nzl.a;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = mrt.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                nyu.a(3, a);
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
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
        if (this.h != null && this.h.length > 0) {
            for (String str : this.h) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.b(10, this.j.longValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            for (long b : this.n) {
                nyu.b(14, b);
            }
        }
        if (this.o != null) {
            nyu.a(15, this.o);
        }
        if (this.p != null && this.p.length > 0) {
            for (nzf nzf : this.p) {
                if (nzf != null) {
                    nyu.b(16, nzf);
                }
            }
        }
        if (this.q != null) {
            nyu.a(17, this.q.booleanValue());
        }
        if (this.r != null && this.r.length > 0) {
            for (int a2 : this.r) {
                nyu.a(18, a2);
            }
        }
        if (this.s != null) {
            nyu.a(19, this.s.intValue());
        }
        if (this.t != null) {
            nyu.b(20, this.t);
        }
        if (this.u != null) {
            nyu.a(21, this.u);
        }
        if (this.v != null) {
            nyu.a(22, this.v.intValue());
        }
        if (this.w != null) {
            nyu.a(23, this.w.intValue());
        }
        if (this.x != null) {
            nyu.a(24, this.x.intValue());
        }
        if (this.y != null) {
            nyu.a(25, this.y.intValue());
        }
        if (this.z != null && this.z.length > 0) {
            while (i < this.z.length) {
                nzf nzf2 = this.z[i];
                if (nzf2 != null) {
                    nyu.b(26, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a != null) {
            this.a.intValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            i = 0;
            for (int g : this.c) {
                int g2;
                i += nyu.g(g2);
            }
            b = (b + i) + (this.c.length * 1);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
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
        if (this.h != null && this.h.length > 0) {
            i = 0;
            g2 = 0;
            for (String str : this.h) {
                if (str != null) {
                    g2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (g2 * 1);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.longValue());
        }
        if (this.k != null) {
            b += nyu.f(11, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(12, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.f(13, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            i = 0;
            for (long f : this.n) {
                i += nyu.f(f);
            }
            b = (b + i) + (this.n.length * 1);
        }
        if (this.o != null) {
            b += nyu.b(15, this.o);
        }
        if (this.p != null && this.p.length > 0) {
            i2 = b;
            for (nzf nzf : this.p) {
                if (nzf != null) {
                    i2 += nyu.d(16, nzf);
                }
            }
            b = i2;
        }
        if (this.q != null) {
            this.q.booleanValue();
            b += nyu.h(17) + 1;
        }
        if (this.r != null && this.r.length > 0) {
            i = 0;
            for (int g22 : this.r) {
                i += nyu.g(g22);
            }
            b = (b + i) + (this.r.length * 2);
        }
        if (this.s != null) {
            b += nyu.f(19, this.s.intValue());
        }
        if (this.t != null) {
            b += nyu.d(20, this.t);
        }
        if (this.u != null) {
            b += nyu.b(21, this.u);
        }
        if (this.v != null) {
            b += nyu.f(22, this.v.intValue());
        }
        if (this.w != null) {
            b += nyu.f(23, this.w.intValue());
        }
        if (this.x != null) {
            b += nyu.f(24, this.x.intValue());
        }
        if (this.y != null) {
            b += nyu.f(25, this.y.intValue());
        }
        if (this.z != null && this.z.length > 0) {
            while (i3 < this.z.length) {
                nzf nzf2 = this.z[i3];
                if (nzf2 != null) {
                    b += nyu.d(26, nzf2);
                }
                i3++;
            }
        }
        return b;
    }

    private mrp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dD /*13*/:
                    this.a = Integer.valueOf(nyt.h());
                    continue;
                case wi.dI /*16*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.c = obj2;
                    nyt.e(d);
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new mrr();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new mrr();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new mrr();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
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
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.j = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    b = nzl.b(nyt, 112);
                    a = this.n == null ? 0 : this.n.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.n = obj;
                    continue;
                case 114:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.n == null ? 0 : this.n.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.n, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.n = obj2;
                    nyt.e(d);
                    continue;
                case 122:
                    this.o = nyt.j();
                    continue;
                case 130:
                    b = nzl.b(nyt, 130);
                    if (this.p == null) {
                        a = 0;
                    } else {
                        a = this.p.length;
                    }
                    obj = new mrs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mrs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mrs();
                    nyt.a(obj[a]);
                    this.p = obj;
                    continue;
                case 136:
                    this.q = Boolean.valueOf(nyt.i());
                    continue;
                case 144:
                    b = nzl.b(nyt, 144);
                    a = this.r == null ? 0 : this.r.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.r = obj;
                    continue;
                case 146:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.r == null ? 0 : this.r.length;
                    obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.r, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.r = obj2;
                    nyt.e(d);
                    continue;
                case 152:
                    this.s = Integer.valueOf(nyt.f());
                    continue;
                case 162:
                    if (this.t == null) {
                        this.t = new mrq();
                    }
                    nyt.a(this.t);
                    continue;
                case 170:
                    this.u = nyt.j();
                    continue;
                case 176:
                    this.v = Integer.valueOf(nyt.f());
                    continue;
                case 184:
                    this.w = Integer.valueOf(nyt.f());
                    continue;
                case 192:
                    this.x = Integer.valueOf(nyt.f());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.y = Integer.valueOf(nyt.f());
                    continue;
                case 210:
                    b = nzl.b(nyt, 210);
                    if (this.z == null) {
                        a = 0;
                    } else {
                        a = this.z.length;
                    }
                    obj = new mrt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.z, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mrt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mrt();
                    nyt.a(obj[a]);
                    this.z = obj;
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
