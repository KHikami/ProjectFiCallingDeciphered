package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class kll extends nyx<kll> {
    public Integer f22236a;
    public Boolean f22237b;
    public String[] f22238c;
    public String[] f22239d;
    public String[] f22240e;
    public long[] f22241f;
    public kjm[] f22242g;
    public kjo f22243h;
    public long[] f22244i;
    public long[] f22245j;
    public Boolean f22246k;
    public String[] f22247l;
    public Long f22248m;
    public kmc f22249n;
    public kkm f22250o;
    public Integer f22251p;
    public String f22252q;
    public int[] f22253r;
    public Integer f22254s;
    public Integer f22255t;
    public int[] f22256u;
    public int[] f22257v;
    public Boolean f22258w;
    public klp f22259x;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26400b(nyt);
    }

    public kll() {
        m26401d();
    }

    private kll m26401d() {
        this.f22237b = null;
        this.f22238c = nzl.f;
        this.f22239d = nzl.f;
        this.f22240e = nzl.f;
        this.f22241f = nzl.b;
        this.f22242g = kjm.m26109d();
        this.f22243h = null;
        this.f22244i = nzl.b;
        this.f22245j = nzl.b;
        this.f22246k = null;
        this.f22247l = nzl.f;
        this.f22248m = null;
        this.f22249n = null;
        this.f22250o = null;
        this.f22252q = null;
        this.f22253r = nzl.a;
        this.f22256u = nzl.a;
        this.f22257v = nzl.a;
        this.f22258w = null;
        this.f22259x = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22237b != null) {
            nyu.a(1, this.f22237b.booleanValue());
        }
        if (this.f22244i != null && this.f22244i.length > 0) {
            for (long b : this.f22244i) {
                nyu.b(2, b);
            }
        }
        if (this.f22245j != null && this.f22245j.length > 0) {
            for (long b2 : this.f22245j) {
                nyu.b(3, b2);
            }
        }
        if (this.f22252q != null) {
            nyu.a(4, this.f22252q);
        }
        if (this.f22254s != null) {
            nyu.a(5, this.f22254s.intValue());
        }
        if (this.f22241f != null && this.f22241f.length > 0) {
            for (long b22 : this.f22241f) {
                nyu.b(6, b22);
            }
        }
        if (this.f22246k != null) {
            nyu.a(7, this.f22246k.booleanValue());
        }
        if (this.f22238c != null && this.f22238c.length > 0) {
            for (String str : this.f22238c) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.f22239d != null && this.f22239d.length > 0) {
            for (String str2 : this.f22239d) {
                if (str2 != null) {
                    nyu.a(9, str2);
                }
            }
        }
        if (this.f22256u != null && this.f22256u.length > 0) {
            for (int a : this.f22256u) {
                nyu.a(10, a);
            }
        }
        if (this.f22257v != null && this.f22257v.length > 0) {
            for (int a2 : this.f22257v) {
                nyu.a(11, a2);
            }
        }
        if (this.f22258w != null) {
            nyu.a(12, this.f22258w.booleanValue());
        }
        if (this.f22253r != null && this.f22253r.length > 0) {
            for (int a22 : this.f22253r) {
                nyu.a(13, a22);
            }
        }
        if (this.f22255t != null) {
            nyu.a(14, this.f22255t.intValue());
        }
        if (this.f22247l != null && this.f22247l.length > 0) {
            for (String str22 : this.f22247l) {
                if (str22 != null) {
                    nyu.a(15, str22);
                }
            }
        }
        if (this.f22248m != null) {
            nyu.b(16, this.f22248m.longValue());
        }
        if (this.f22242g != null && this.f22242g.length > 0) {
            for (nzf nzf : this.f22242g) {
                if (nzf != null) {
                    nyu.b(17, nzf);
                }
            }
        }
        if (this.f22240e != null && this.f22240e.length > 0) {
            while (i < this.f22240e.length) {
                String str3 = this.f22240e[i];
                if (str3 != null) {
                    nyu.a(19, str3);
                }
                i++;
            }
        }
        if (this.f22249n != null) {
            nyu.b(20, this.f22249n);
        }
        if (this.f22259x != null) {
            nyu.b(21, this.f22259x);
        }
        if (this.f22250o != null) {
            nyu.b(22, this.f22250o);
        }
        if (this.f22251p != null) {
            nyu.a(23, this.f22251p.intValue());
        }
        if (this.f22243h != null) {
            nyu.b(24, this.f22243h);
        }
        if (this.f22236a != null) {
            nyu.a(25, this.f22236a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.f22237b != null) {
            this.f22237b.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22244i != null && this.f22244i.length > 0) {
            i = 0;
            for (long f : this.f22244i) {
                i += nyu.f(f);
            }
            b = (b + i) + (this.f22244i.length * 1);
        }
        if (this.f22245j != null && this.f22245j.length > 0) {
            i = 0;
            for (long f2 : this.f22245j) {
                i += nyu.f(f2);
            }
            b = (b + i) + (this.f22245j.length * 1);
        }
        if (this.f22252q != null) {
            b += nyu.b(4, this.f22252q);
        }
        if (this.f22254s != null) {
            b += nyu.f(5, this.f22254s.intValue());
        }
        if (this.f22241f != null && this.f22241f.length > 0) {
            i = 0;
            for (long f22 : this.f22241f) {
                i += nyu.f(f22);
            }
            b = (b + i) + (this.f22241f.length * 1);
        }
        if (this.f22246k != null) {
            this.f22246k.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f22238c != null && this.f22238c.length > 0) {
            i = 0;
            i3 = 0;
            for (String str : this.f22238c) {
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f22239d != null && this.f22239d.length > 0) {
            i = 0;
            i3 = 0;
            for (String str2 : this.f22239d) {
                if (str2 != null) {
                    i3++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f22256u != null && this.f22256u.length > 0) {
            i = 0;
            for (int i32 : this.f22256u) {
                i += nyu.g(i32);
            }
            b = (b + i) + (this.f22256u.length * 1);
        }
        if (this.f22257v != null && this.f22257v.length > 0) {
            i = 0;
            for (int i322 : this.f22257v) {
                i += nyu.g(i322);
            }
            b = (b + i) + (this.f22257v.length * 1);
        }
        if (this.f22258w != null) {
            this.f22258w.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f22253r != null && this.f22253r.length > 0) {
            i = 0;
            for (int i3222 : this.f22253r) {
                i += nyu.g(i3222);
            }
            b = (b + i) + (this.f22253r.length * 1);
        }
        if (this.f22255t != null) {
            b += nyu.f(14, this.f22255t.intValue());
        }
        if (this.f22247l != null && this.f22247l.length > 0) {
            i = 0;
            i3222 = 0;
            for (String str22 : this.f22247l) {
                if (str22 != null) {
                    i3222++;
                    i += nyu.b(str22);
                }
            }
            b = (b + i) + (i3222 * 1);
        }
        if (this.f22248m != null) {
            b += nyu.f(16, this.f22248m.longValue());
        }
        if (this.f22242g != null && this.f22242g.length > 0) {
            i2 = b;
            for (nzf nzf : this.f22242g) {
                if (nzf != null) {
                    i2 += nyu.d(17, nzf);
                }
            }
            b = i2;
        }
        if (this.f22240e != null && this.f22240e.length > 0) {
            i2 = 0;
            i = 0;
            while (i4 < this.f22240e.length) {
                String str3 = this.f22240e[i4];
                if (str3 != null) {
                    i++;
                    i2 += nyu.b(str3);
                }
                i4++;
            }
            b = (b + i2) + (i * 2);
        }
        if (this.f22249n != null) {
            b += nyu.d(20, this.f22249n);
        }
        if (this.f22259x != null) {
            b += nyu.d(21, this.f22259x);
        }
        if (this.f22250o != null) {
            b += nyu.d(22, this.f22250o);
        }
        if (this.f22251p != null) {
            b += nyu.f(23, this.f22251p.intValue());
        }
        if (this.f22243h != null) {
            b += nyu.d(24, this.f22243h);
        }
        if (this.f22236a != null) {
            return b + nyu.f(25, this.f22236a.intValue());
        }
        return b;
    }

    private kll m26400b(nyt nyt) {
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
                    this.f22237b = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f22244i == null ? 0 : this.f22244i.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22244i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f22244i = obj;
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
                    b = this.f22244i == null ? 0 : this.f22244i.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f22244i, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f22244i = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.f22245j == null ? 0 : this.f22245j.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22245j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f22245j = obj;
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
                    b = this.f22245j == null ? 0 : this.f22245j.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f22245j, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f22245j = obj2;
                    nyt.e(d);
                    continue;
                case 34:
                    this.f22252q = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22254s = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    b = nzl.b(nyt, 48);
                    a = this.f22241f == null ? 0 : this.f22241f.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22241f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f22241f = obj;
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
                    b = this.f22241f == null ? 0 : this.f22241f.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f22241f, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f22241f = obj2;
                    nyt.e(d);
                    continue;
                case 56:
                    this.f22246k = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    a = this.f22238c == null ? 0 : this.f22238c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22238c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22238c = obj;
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    a = this.f22239d == null ? 0 : this.f22239d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22239d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22239d = obj;
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
                        a = this.f22256u == null ? 0 : this.f22256u.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f22256u, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.f22256u = obj4;
                            break;
                        }
                        this.f22256u = obj3;
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
                        if (this.f22256u == null) {
                            b = 0;
                        } else {
                            b = this.f22256u.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f22256u, 0, obj5, 0, b);
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
                        this.f22256u = obj5;
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
                        a = this.f22257v == null ? 0 : this.f22257v.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f22257v, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.f22257v = obj4;
                            break;
                        }
                        this.f22257v = obj3;
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
                        if (this.f22257v == null) {
                            b = 0;
                        } else {
                            b = this.f22257v.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f22257v, 0, obj5, 0, b);
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
                        this.f22257v = obj5;
                    }
                    nyt.e(d);
                    continue;
                case 96:
                    this.f22258w = Boolean.valueOf(nyt.i());
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
                        a = this.f22253r == null ? 0 : this.f22253r.length;
                        if (a != 0 || b != obj3.length) {
                            obj4 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f22253r, 0, obj4, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj4, a, b);
                            this.f22253r = obj4;
                            break;
                        }
                        this.f22253r = obj3;
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
                        if (this.f22253r == null) {
                            b = 0;
                        } else {
                            b = this.f22253r.length;
                        }
                        obj5 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f22253r, 0, obj5, 0, b);
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
                        this.f22253r = obj5;
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
                            this.f22255t = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 122:
                    b = nzl.b(nyt, 122);
                    a = this.f22247l == null ? 0 : this.f22247l.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22247l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22247l = obj;
                    continue;
                case 128:
                    this.f22248m = Long.valueOf(nyt.e());
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.f22242g == null) {
                        a = 0;
                    } else {
                        a = this.f22242g.length;
                    }
                    obj = new kjm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22242g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjm();
                    nyt.a(obj[a]);
                    this.f22242g = obj;
                    continue;
                case 154:
                    b = nzl.b(nyt, 154);
                    a = this.f22240e == null ? 0 : this.f22240e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22240e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22240e = obj;
                    continue;
                case 162:
                    if (this.f22249n == null) {
                        this.f22249n = new kmc();
                    }
                    nyt.a(this.f22249n);
                    continue;
                case 170:
                    if (this.f22259x == null) {
                        this.f22259x = new klp();
                    }
                    nyt.a(this.f22259x);
                    continue;
                case 178:
                    if (this.f22250o == null) {
                        this.f22250o = new kkm();
                    }
                    nyt.a(this.f22250o);
                    continue;
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22251p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 194:
                    if (this.f22243h == null) {
                        this.f22243h = new kjo();
                    }
                    nyt.a(this.f22243h);
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22236a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
