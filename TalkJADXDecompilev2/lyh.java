package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class lyh extends nyx<lyh> {
    private static volatile lyh[] C;
    public String A;
    public String B;
    public String a;
    public Integer b;
    public lyg c;
    public Boolean d;
    public Long e;
    public Long f;
    public String g;
    public lor h;
    public Boolean i;
    public Long j;
    public Long k;
    public String l;
    public Integer m;
    public String[] n;
    public Boolean o;
    public Integer p;
    public lze q;
    public Boolean r;
    public Integer s;
    public lyf t;
    public Integer u;
    public Integer v;
    public Integer w;
    public int[] x;
    public String y;
    public String z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lyh[] d() {
        if (C == null) {
            synchronized (nzc.c) {
                if (C == null) {
                    C = new lyh[0];
                }
            }
        }
        return C;
    }

    public lyh() {
        g();
    }

    private lyh g() {
        this.a = null;
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
        this.n = nzl.f;
        this.o = null;
        this.q = null;
        this.r = null;
        this.t = null;
        this.x = nzl.a;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.b(6, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(7, this.f.longValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.h != null) {
            nyu.b(9, this.h);
        }
        if (this.i != null) {
            nyu.a(10, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.b(11, this.j.longValue());
        }
        if (this.k != null) {
            nyu.b(12, this.k.longValue());
        }
        if (this.l != null) {
            nyu.a(13, this.l);
        }
        if (this.m != null) {
            nyu.a(14, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            for (String str : this.n) {
                if (str != null) {
                    nyu.a(15, str);
                }
            }
        }
        if (this.o != null) {
            nyu.a(16, this.o.booleanValue());
        }
        if (this.q != null) {
            nyu.b(17, this.q);
        }
        if (this.r != null) {
            nyu.a(18, this.r.booleanValue());
        }
        if (this.t != null) {
            nyu.b(19, this.t);
        }
        if (this.u != null) {
            nyu.a(21, this.u.intValue());
        }
        if (this.v != null) {
            nyu.a(22, this.v.intValue());
        }
        if (this.w != null) {
            nyu.a(23, this.w.intValue());
        }
        if (this.p != null) {
            nyu.a(24, this.p.intValue());
        }
        if (this.s != null) {
            nyu.a(25, this.s.intValue());
        }
        if (this.x != null && this.x.length > 0) {
            while (i < this.x.length) {
                nyu.a(26, this.x[i]);
                i++;
            }
        }
        if (this.y != null) {
            nyu.a(27, this.y);
        }
        if (this.z != null) {
            nyu.a(28, this.z);
        }
        if (this.A != null) {
            nyu.a(29, this.A);
        }
        if (this.B != null) {
            nyu.a(30, this.B);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.f(7, this.f.longValue());
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.h != null) {
            b += nyu.d(9, this.h);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.j != null) {
            b += nyu.f(11, this.j.longValue());
        }
        if (this.k != null) {
            b += nyu.f(12, this.k.longValue());
        }
        if (this.l != null) {
            b += nyu.b(13, this.l);
        }
        if (this.m != null) {
            b += nyu.f(14, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.n) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.q != null) {
            b += nyu.d(17, this.q);
        }
        if (this.r != null) {
            this.r.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.t != null) {
            b += nyu.d(19, this.t);
        }
        if (this.u != null) {
            b += nyu.f(21, this.u.intValue());
        }
        if (this.v != null) {
            b += nyu.f(22, this.v.intValue());
        }
        if (this.w != null) {
            b += nyu.f(23, this.w.intValue());
        }
        if (this.p != null) {
            b += nyu.f(24, this.p.intValue());
        }
        if (this.s != null) {
            b += nyu.f(25, this.s.intValue());
        }
        if (this.x != null && this.x.length > 0) {
            i = 0;
            while (i2 < this.x.length) {
                i += nyu.g(this.x[i2]);
                i2++;
            }
            b = (b + i) + (this.x.length * 2);
        }
        if (this.y != null) {
            b += nyu.b(27, this.y);
        }
        if (this.z != null) {
            b += nyu.b(28, this.z);
        }
        if (this.A != null) {
            b += nyu.b(29, this.A);
        }
        if (this.B != null) {
            return b + nyu.b(30, this.B);
        }
        return b;
    }

    private lyh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
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
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lyg();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new lor();
                    }
                    nyt.a(this.h);
                    continue;
                case 80:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.j = Long.valueOf(nyt.e());
                    continue;
                case 96:
                    this.k = Long.valueOf(nyt.e());
                    continue;
                case 106:
                    this.l = nyt.j();
                    continue;
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 122:
                    b = nzl.b(nyt, 122);
                    a = this.n == null ? 0 : this.n.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.n = obj;
                    continue;
                case 128:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    if (this.q == null) {
                        this.q = new lze();
                    }
                    nyt.a(this.q);
                    continue;
                case 144:
                    this.r = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    if (this.t == null) {
                        this.t = new lyf();
                    }
                    nyt.a(this.t);
                    continue;
                case 168:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.u = Integer.valueOf(a);
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
                            this.v = Integer.valueOf(a);
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
                            this.w = Integer.valueOf(a);
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
                            this.p = Integer.valueOf(a);
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
                            this.s = Integer.valueOf(a);
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
                        a = this.x == null ? 0 : this.x.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.x, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.x = obj3;
                            break;
                        }
                        this.x = obj2;
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
                        if (this.x == null) {
                            b = 0;
                        } else {
                            b = this.x.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.x, 0, obj4, 0, b);
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
                        this.x = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 218:
                    this.y = nyt.j();
                    continue;
                case 226:
                    this.z = nyt.j();
                    continue;
                case 234:
                    this.A = nyt.j();
                    continue;
                case 242:
                    this.B = nyt.j();
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
