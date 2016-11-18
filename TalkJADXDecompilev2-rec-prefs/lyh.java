package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lyh extends nyx<lyh> {
    private static volatile lyh[] f26863C;
    public String f26864A;
    public String f26865B;
    public String f26866a;
    public Integer f26867b;
    public lyg f26868c;
    public Boolean f26869d;
    public Long f26870e;
    public Long f26871f;
    public String f26872g;
    public lor f26873h;
    public Boolean f26874i;
    public Long f26875j;
    public Long f26876k;
    public String f26877l;
    public Integer f26878m;
    public String[] f26879n;
    public Boolean f26880o;
    public Integer f26881p;
    public lze f26882q;
    public Boolean f26883r;
    public Integer f26884s;
    public lyf f26885t;
    public Integer f26886u;
    public Integer f26887v;
    public Integer f26888w;
    public int[] f26889x;
    public String f26890y;
    public String f26891z;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31131b(nyt);
    }

    public static lyh[] m31132d() {
        if (f26863C == null) {
            synchronized (nzc.c) {
                if (f26863C == null) {
                    f26863C = new lyh[0];
                }
            }
        }
        return f26863C;
    }

    public lyh() {
        m31133g();
    }

    private lyh m31133g() {
        this.f26866a = null;
        this.f26868c = null;
        this.f26869d = null;
        this.f26870e = null;
        this.f26871f = null;
        this.f26872g = null;
        this.f26873h = null;
        this.f26874i = null;
        this.f26875j = null;
        this.f26876k = null;
        this.f26877l = null;
        this.f26879n = nzl.f;
        this.f26880o = null;
        this.f26882q = null;
        this.f26883r = null;
        this.f26885t = null;
        this.f26889x = nzl.a;
        this.f26890y = null;
        this.f26891z = null;
        this.f26864A = null;
        this.f26865B = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26866a != null) {
            nyu.a(1, this.f26866a);
        }
        if (this.f26867b != null) {
            nyu.a(2, this.f26867b.intValue());
        }
        if (this.f26868c != null) {
            nyu.b(3, this.f26868c);
        }
        if (this.f26869d != null) {
            nyu.a(4, this.f26869d.booleanValue());
        }
        if (this.f26870e != null) {
            nyu.b(6, this.f26870e.longValue());
        }
        if (this.f26871f != null) {
            nyu.b(7, this.f26871f.longValue());
        }
        if (this.f26872g != null) {
            nyu.a(8, this.f26872g);
        }
        if (this.f26873h != null) {
            nyu.b(9, this.f26873h);
        }
        if (this.f26874i != null) {
            nyu.a(10, this.f26874i.booleanValue());
        }
        if (this.f26875j != null) {
            nyu.b(11, this.f26875j.longValue());
        }
        if (this.f26876k != null) {
            nyu.b(12, this.f26876k.longValue());
        }
        if (this.f26877l != null) {
            nyu.a(13, this.f26877l);
        }
        if (this.f26878m != null) {
            nyu.a(14, this.f26878m.intValue());
        }
        if (this.f26879n != null && this.f26879n.length > 0) {
            for (String str : this.f26879n) {
                if (str != null) {
                    nyu.a(15, str);
                }
            }
        }
        if (this.f26880o != null) {
            nyu.a(16, this.f26880o.booleanValue());
        }
        if (this.f26882q != null) {
            nyu.b(17, this.f26882q);
        }
        if (this.f26883r != null) {
            nyu.a(18, this.f26883r.booleanValue());
        }
        if (this.f26885t != null) {
            nyu.b(19, this.f26885t);
        }
        if (this.f26886u != null) {
            nyu.a(21, this.f26886u.intValue());
        }
        if (this.f26887v != null) {
            nyu.a(22, this.f26887v.intValue());
        }
        if (this.f26888w != null) {
            nyu.a(23, this.f26888w.intValue());
        }
        if (this.f26881p != null) {
            nyu.a(24, this.f26881p.intValue());
        }
        if (this.f26884s != null) {
            nyu.a(25, this.f26884s.intValue());
        }
        if (this.f26889x != null && this.f26889x.length > 0) {
            while (i < this.f26889x.length) {
                nyu.a(26, this.f26889x[i]);
                i++;
            }
        }
        if (this.f26890y != null) {
            nyu.a(27, this.f26890y);
        }
        if (this.f26891z != null) {
            nyu.a(28, this.f26891z);
        }
        if (this.f26864A != null) {
            nyu.a(29, this.f26864A);
        }
        if (this.f26865B != null) {
            nyu.a(30, this.f26865B);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f26866a != null) {
            b += nyu.b(1, this.f26866a);
        }
        if (this.f26867b != null) {
            b += nyu.f(2, this.f26867b.intValue());
        }
        if (this.f26868c != null) {
            b += nyu.d(3, this.f26868c);
        }
        if (this.f26869d != null) {
            this.f26869d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26870e != null) {
            b += nyu.f(6, this.f26870e.longValue());
        }
        if (this.f26871f != null) {
            b += nyu.f(7, this.f26871f.longValue());
        }
        if (this.f26872g != null) {
            b += nyu.b(8, this.f26872g);
        }
        if (this.f26873h != null) {
            b += nyu.d(9, this.f26873h);
        }
        if (this.f26874i != null) {
            this.f26874i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.f26875j != null) {
            b += nyu.f(11, this.f26875j.longValue());
        }
        if (this.f26876k != null) {
            b += nyu.f(12, this.f26876k.longValue());
        }
        if (this.f26877l != null) {
            b += nyu.b(13, this.f26877l);
        }
        if (this.f26878m != null) {
            b += nyu.f(14, this.f26878m.intValue());
        }
        if (this.f26879n != null && this.f26879n.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f26879n) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f26880o != null) {
            this.f26880o.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.f26882q != null) {
            b += nyu.d(17, this.f26882q);
        }
        if (this.f26883r != null) {
            this.f26883r.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.f26885t != null) {
            b += nyu.d(19, this.f26885t);
        }
        if (this.f26886u != null) {
            b += nyu.f(21, this.f26886u.intValue());
        }
        if (this.f26887v != null) {
            b += nyu.f(22, this.f26887v.intValue());
        }
        if (this.f26888w != null) {
            b += nyu.f(23, this.f26888w.intValue());
        }
        if (this.f26881p != null) {
            b += nyu.f(24, this.f26881p.intValue());
        }
        if (this.f26884s != null) {
            b += nyu.f(25, this.f26884s.intValue());
        }
        if (this.f26889x != null && this.f26889x.length > 0) {
            i = 0;
            while (i2 < this.f26889x.length) {
                i += nyu.g(this.f26889x[i2]);
                i2++;
            }
            b = (b + i) + (this.f26889x.length * 2);
        }
        if (this.f26890y != null) {
            b += nyu.b(27, this.f26890y);
        }
        if (this.f26891z != null) {
            b += nyu.b(28, this.f26891z);
        }
        if (this.f26864A != null) {
            b += nyu.b(29, this.f26864A);
        }
        if (this.f26865B != null) {
            return b + nyu.b(30, this.f26865B);
        }
        return b;
    }

    private lyh m31131b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26866a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                            this.f26867b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f26868c == null) {
                        this.f26868c = new lyg();
                    }
                    nyt.a(this.f26868c);
                    continue;
                case 32:
                    this.f26869d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f26870e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f26871f = Long.valueOf(nyt.e());
                    continue;
                case 66:
                    this.f26872g = nyt.j();
                    continue;
                case 74:
                    if (this.f26873h == null) {
                        this.f26873h = new lor();
                    }
                    nyt.a(this.f26873h);
                    continue;
                case 80:
                    this.f26874i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.f26875j = Long.valueOf(nyt.e());
                    continue;
                case 96:
                    this.f26876k = Long.valueOf(nyt.e());
                    continue;
                case 106:
                    this.f26877l = nyt.j();
                    continue;
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26878m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 122:
                    b = nzl.b(nyt, 122);
                    a = this.f26879n == null ? 0 : this.f26879n.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26879n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26879n = obj;
                    continue;
                case 128:
                    this.f26880o = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    if (this.f26882q == null) {
                        this.f26882q = new lze();
                    }
                    nyt.a(this.f26882q);
                    continue;
                case 144:
                    this.f26883r = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    if (this.f26885t == null) {
                        this.f26885t = new lyf();
                    }
                    nyt.a(this.f26885t);
                    continue;
                case 168:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26886u = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 176:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26887v = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26888w = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26881p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26884s = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 208:
                    int b2 = nzl.b(nyt, 208);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f26889x == null ? 0 : this.f26889x.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f26889x, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f26889x = obj3;
                            break;
                        }
                        this.f26889x = obj2;
                        break;
                    }
                    continue;
                case 210:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f26889x == null) {
                            b = 0;
                        } else {
                            b = this.f26889x.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f26889x, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26889x = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 218:
                    this.f26890y = nyt.j();
                    continue;
                case 226:
                    this.f26891z = nyt.j();
                    continue;
                case 234:
                    this.f26864A = nyt.j();
                    continue;
                case 242:
                    this.f26865B = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
