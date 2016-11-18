package defpackage;

public final class orh extends nyx<orh> {
    private static volatile orh[] r;
    public String a;
    public String b;
    public oqu c;
    public String[] d;
    public opg e;
    public opg f;
    public opg g;
    public int[] h;
    public Integer i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public String n;
    public String o;
    public String p;
    public Boolean q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static orh[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new orh[0];
                }
            }
        }
        return r;
    }

    public orh() {
        g();
    }

    private orh g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = nzl.f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = nzl.a;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
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
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
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
            while (i < this.h.length) {
                nyu.a(8, this.h[i]);
                i++;
            }
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.a(11, this.k);
        }
        if (this.l != null) {
            nyu.a(12, this.l);
        }
        if (this.m != null) {
            nyu.a(13, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n);
        }
        if (this.o != null) {
            nyu.a(15, this.o);
        }
        if (this.p != null) {
            nyu.a(16, this.p);
        }
        if (this.q != null) {
            nyu.a(17, this.q.booleanValue());
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
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
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
            while (i2 < this.h.length) {
                i += nyu.g(this.h[i2]);
                i2++;
            }
            b = (b + i) + (this.h.length * 1);
        }
        if (this.i != null) {
            b += nyu.f(9, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            b += nyu.b(11, this.k);
        }
        if (this.l != null) {
            b += nyu.b(12, this.l);
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.n != null) {
            b += nyu.b(14, this.n);
        }
        if (this.o != null) {
            b += nyu.b(15, this.o);
        }
        if (this.p != null) {
            b += nyu.b(16, this.p);
        }
        if (this.q == null) {
            return b;
        }
        this.q.booleanValue();
        return b + (nyu.h(17) + 1);
    }

    private orh b(nyt nyt) {
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
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new oqu();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    a = this.d == null ? 0 : this.d.length;
                    Object obj = new String[(b + a)];
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
                case 42:
                    if (this.e == null) {
                        this.e = new opg();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new opg();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new opg();
                    }
                    nyt.a(this.g);
                    continue;
                case 64:
                    int b2 = nzl.b(nyt, 64);
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
                        a = this.h == null ? 0 : this.h.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.h, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.h = obj3;
                            break;
                        }
                        this.h = obj2;
                        break;
                    }
                    continue;
                    break;
                case 66:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.h == null) {
                            b = 0;
                        } else {
                            b = this.h.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.h, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.h = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 72:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 82:
                    this.j = nyt.j();
                    continue;
                case 90:
                    this.k = nyt.j();
                    continue;
                case 98:
                    this.l = nyt.j();
                    continue;
                case 104:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    this.n = nyt.j();
                    continue;
                case 122:
                    this.o = nyt.j();
                    continue;
                case 130:
                    this.p = nyt.j();
                    continue;
                case 136:
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
