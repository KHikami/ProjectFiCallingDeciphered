package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class kll extends nyx<kll> {
    public Integer a;
    public Boolean b;
    public String[] c;
    public String[] d;
    public String[] e;
    public long[] f;
    public kjm[] g;
    public kjo h;
    public long[] i;
    public long[] j;
    public Boolean k;
    public String[] l;
    public Long m;
    public kmc n;
    public kkm o;
    public Integer p;
    public String q;
    public int[] r;
    public Integer s;
    public Integer t;
    public int[] u;
    public int[] v;
    public Boolean w;
    public klp x;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kll() {
        d();
    }

    private kll d() {
        this.b = null;
        this.c = nzl.f;
        this.d = nzl.f;
        this.e = nzl.f;
        this.f = nzl.b;
        this.g = kjm.d();
        this.h = null;
        this.i = nzl.b;
        this.j = nzl.b;
        this.k = null;
        this.l = nzl.f;
        this.m = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = nzl.a;
        this.u = nzl.a;
        this.v = nzl.a;
        this.w = null;
        this.x = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.b != null) {
            nyu.a(1, this.b.booleanValue());
        }
        if (this.i != null && this.i.length > 0) {
            for (long b : this.i) {
                nyu.b(2, b);
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (long b2 : this.j) {
                nyu.b(3, b2);
            }
        }
        if (this.q != null) {
            nyu.a(4, this.q);
        }
        if (this.s != null) {
            nyu.a(5, this.s.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            for (long b22 : this.f) {
                nyu.b(6, b22);
            }
        }
        if (this.k != null) {
            nyu.a(7, this.k.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (String str2 : this.d) {
                if (str2 != null) {
                    nyu.a(9, str2);
                }
            }
        }
        if (this.u != null && this.u.length > 0) {
            for (int a : this.u) {
                nyu.a(10, a);
            }
        }
        if (this.v != null && this.v.length > 0) {
            for (int a2 : this.v) {
                nyu.a(11, a2);
            }
        }
        if (this.w != null) {
            nyu.a(12, this.w.booleanValue());
        }
        if (this.r != null && this.r.length > 0) {
            for (int a22 : this.r) {
                nyu.a(13, a22);
            }
        }
        if (this.t != null) {
            nyu.a(14, this.t.intValue());
        }
        if (this.l != null && this.l.length > 0) {
            for (String str22 : this.l) {
                if (str22 != null) {
                    nyu.a(15, str22);
                }
            }
        }
        if (this.m != null) {
            nyu.b(16, this.m.longValue());
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf : this.g) {
                if (nzf != null) {
                    nyu.b(17, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                String str3 = this.e[i];
                if (str3 != null) {
                    nyu.a(19, str3);
                }
                i++;
            }
        }
        if (this.n != null) {
            nyu.b(20, this.n);
        }
        if (this.x != null) {
            nyu.b(21, this.x);
        }
        if (this.o != null) {
            nyu.b(22, this.o);
        }
        if (this.p != null) {
            nyu.a(23, this.p.intValue());
        }
        if (this.h != null) {
            nyu.b(24, this.h);
        }
        if (this.a != null) {
            nyu.a(25, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.i != null && this.i.length > 0) {
            i = 0;
            for (long f : this.i) {
                i += nyu.f(f);
            }
            b = (b + i) + (this.i.length * 1);
        }
        if (this.j != null && this.j.length > 0) {
            i = 0;
            for (long f2 : this.j) {
                i += nyu.f(f2);
            }
            b = (b + i) + (this.j.length * 1);
        }
        if (this.q != null) {
            b += nyu.b(4, this.q);
        }
        if (this.s != null) {
            b += nyu.f(5, this.s.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            i = 0;
            for (long f22 : this.f) {
                i += nyu.f(f22);
            }
            b = (b + i) + (this.f.length * 1);
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            i = 0;
            i3 = 0;
            for (String str : this.c) {
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            i = 0;
            i3 = 0;
            for (String str2 : this.d) {
                if (str2 != null) {
                    i3++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.u != null && this.u.length > 0) {
            i = 0;
            for (int i32 : this.u) {
                i += nyu.g(i32);
            }
            b = (b + i) + (this.u.length * 1);
        }
        if (this.v != null && this.v.length > 0) {
            i = 0;
            for (int i322 : this.v) {
                i += nyu.g(i322);
            }
            b = (b + i) + (this.v.length * 1);
        }
        if (this.w != null) {
            this.w.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.r != null && this.r.length > 0) {
            i = 0;
            for (int i3222 : this.r) {
                i += nyu.g(i3222);
            }
            b = (b + i) + (this.r.length * 1);
        }
        if (this.t != null) {
            b += nyu.f(14, this.t.intValue());
        }
        if (this.l != null && this.l.length > 0) {
            i = 0;
            i3222 = 0;
            for (String str22 : this.l) {
                if (str22 != null) {
                    i3222++;
                    i += nyu.b(str22);
                }
            }
            b = (b + i) + (i3222 * 1);
        }
        if (this.m != null) {
            b += nyu.f(16, this.m.longValue());
        }
        if (this.g != null && this.g.length > 0) {
            i2 = b;
            for (nzf nzf : this.g) {
                if (nzf != null) {
                    i2 += nyu.d(17, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null && this.e.length > 0) {
            i2 = 0;
            i = 0;
            while (i4 < this.e.length) {
                String str3 = this.e[i4];
                if (str3 != null) {
                    i++;
                    i2 += nyu.b(str3);
                }
                i4++;
            }
            b = (b + i2) + (i * 2);
        }
        if (this.n != null) {
            b += nyu.d(20, this.n);
        }
        if (this.x != null) {
            b += nyu.d(21, this.x);
        }
        if (this.o != null) {
            b += nyu.d(22, this.o);
        }
        if (this.p != null) {
            b += nyu.f(23, this.p.intValue());
        }
        if (this.h != null) {
            b += nyu.d(24, this.h);
        }
        if (this.a != null) {
            return b + nyu.f(25, this.a.intValue());
        }
        return b;
    }

    private kll b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int d;
            Object obj2;
            int b2;
            Object obj3;
            int f;
            Object obj4;
            Object obj5;
            int f2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.i == null ? 0 : this.i.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.i = obj;
                    continue;
                case wi.dH /*18*/:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.i == null ? 0 : this.i.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.i, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.i = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.j == null ? 0 : this.j.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.j = obj;
                    continue;
                case wi.dx /*26*/:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.j == null ? 0 : this.j.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.j, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.j = obj2;
                    nyt.e(d);
                    continue;
                case 34:
                    this.q = nyt.j();
                    continue;
                case 40:
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
                case 48:
                    b = nzl.b(nyt, 48);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f = obj;
                    continue;
                case 50:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f == null ? 0 : this.f.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f = obj2;
                    nyt.e(d);
                    continue;
                case 56:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.d = obj;
                    continue;
                case 80:
                    b2 = nzl.b(nyt, 80);
                    obj3 = new int[b2];
                    d = 0;
                    b = 0;
                    while (d < b2) {
                        if (d != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 2:
                            case 3:
                                a = b + 1;
                                obj3[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        d++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.u == null ? 0 : this.u.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.u, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.u = obj4;
                            break;
                        }
                        this.u = obj3;
                        break;
                    }
                    continue;
                case 82:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
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
                        if (this.u == null) {
                            b = 0;
                        } else {
                            b = this.u.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.u, 0, obj5, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 2:
                                case 3:
                                    a = b + 1;
                                    obj5[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.u = obj5;
                    }
                    nyt.e(d);
                    continue;
                case 88:
                    b2 = nzl.b(nyt, 88);
                    obj3 = new int[b2];
                    d = 0;
                    b = 0;
                    while (d < b2) {
                        if (d != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 2:
                            case 3:
                                a = b + 1;
                                obj3[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        d++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.v == null ? 0 : this.v.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.v, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.v = obj4;
                            break;
                        }
                        this.v = obj3;
                        break;
                    }
                    continue;
                case 90:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
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
                        if (this.v == null) {
                            b = 0;
                        } else {
                            b = this.v.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.v, 0, obj5, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 2:
                                case 3:
                                    a = b + 1;
                                    obj5[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.v = obj5;
                    }
                    nyt.e(d);
                    continue;
                case 96:
                    this.w = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    b2 = nzl.b(nyt, 104);
                    obj3 = new int[b2];
                    d = 0;
                    b = 0;
                    while (d < b2) {
                        if (d != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                a = b + 1;
                                obj3[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        d++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.r == null ? 0 : this.r.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.r, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.r = obj4;
                            break;
                        }
                        this.r = obj3;
                        break;
                    }
                    continue;
                case 106:
                    d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.r == null) {
                            b = 0;
                        } else {
                            b = this.r.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.r, 0, obj5, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    a = b + 1;
                                    obj5[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.r = obj5;
                    }
                    nyt.e(d);
                    continue;
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.t = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 122:
                    b = nzl.b(nyt, 122);
                    a = this.l == null ? 0 : this.l.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.l = obj;
                    continue;
                case 128:
                    this.m = Long.valueOf(nyt.e());
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new kjm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjm();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 162:
                    if (this.n == null) {
                        this.n = new kmc();
                    }
                    nyt.a(this.n);
                    continue;
                case 170:
                    if (this.x == null) {
                        this.x = new klp();
                    }
                    nyt.a(this.x);
                    continue;
                case 178:
                    if (this.o == null) {
                        this.o = new kkm();
                    }
                    nyt.a(this.o);
                    continue;
                case 184:
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
                case 194:
                    if (this.h == null) {
                        this.h = new kjo();
                    }
                    nyt.a(this.h);
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
