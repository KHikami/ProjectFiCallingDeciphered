package defpackage;

public final class lnc extends nyx<lnc> {
    public byte[] a;
    public byte[] b;
    public Integer c;
    public Boolean d;
    public Long e;
    public byte[] f;
    public Long g;
    public Integer h;
    public Boolean i;
    public Long j;
    public Long k;
    public String l;
    public String m;
    public String n;
    public String o;
    public Integer p;
    public int q;
    public int[] r;
    public String s;
    public String t;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnc() {
        this.a = null;
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
        this.p = null;
        this.q = nzf.UNSET_ENUM_VALUE;
        this.r = nzl.a;
        this.s = null;
        this.t = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        nyu.c(3, this.c.intValue());
        if (this.d != null) {
            nyu.a(5, this.d.booleanValue());
        }
        if (this.j != null) {
            nyu.a(6, this.j.longValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g.longValue());
        }
        if (this.e != null) {
            nyu.a(9, this.e.longValue());
        }
        if (this.h != null) {
            nyu.c(10, this.h.intValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.longValue());
        }
        if (this.l != null) {
            nyu.a(13, this.l);
        }
        if (this.m != null) {
            nyu.a(14, this.m);
        }
        if (this.i != null) {
            nyu.a(15, this.i.booleanValue());
        }
        if (this.n != null) {
            nyu.a(16, this.n);
        }
        if (this.o != null) {
            nyu.a(17, this.o);
        }
        if (this.p != null) {
            nyu.c(18, this.p.intValue());
        }
        if (this.q != nzf.UNSET_ENUM_VALUE) {
            nyu.a(19, this.q);
        }
        if (this.r != null && this.r.length > 0) {
            for (int a : this.r) {
                nyu.a(20, a);
            }
        }
        if (this.s != null) {
            nyu.a(21, this.s);
        }
        if (this.f != null) {
            nyu.a(22, this.f);
        }
        if (this.t != null) {
            nyu.a(23, this.t);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b() + nyu.b(1, this.a);
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        b += nyu.g(3, this.c.intValue());
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.j != null) {
            b += nyu.e(6, this.j.longValue());
        }
        if (this.g != null) {
            b += nyu.e(8, this.g.longValue());
        }
        if (this.e != null) {
            b += nyu.e(9, this.e.longValue());
        }
        if (this.h != null) {
            b += nyu.g(10, this.h.intValue());
        }
        if (this.k != null) {
            b += nyu.e(11, this.k.longValue());
        }
        if (this.l != null) {
            b += nyu.b(13, this.l);
        }
        if (this.m != null) {
            b += nyu.b(14, this.m);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.n != null) {
            b += nyu.b(16, this.n);
        }
        if (this.o != null) {
            b += nyu.b(17, this.o);
        }
        if (this.p != null) {
            b += nyu.g(18, this.p.intValue());
        }
        if (this.q != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(19, this.q);
        }
        if (this.r != null && this.r.length > 0) {
            int i2 = 0;
            while (i < this.r.length) {
                i2 += nyu.g(this.r[i]);
                i++;
            }
            b = (b + i2) + (this.r.length * 2);
        }
        if (this.s != null) {
            b += nyu.b(21, this.s);
        }
        if (this.f != null) {
            b += nyu.b(22, this.f);
        }
        if (this.t != null) {
            return b + nyu.b(23, this.t);
        }
        return b;
    }

    private lnc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.j = Long.valueOf(nyt.d());
                    continue;
                case 64:
                    this.g = Long.valueOf(nyt.d());
                    continue;
                case 72:
                    this.e = Long.valueOf(nyt.d());
                    continue;
                case 80:
                    this.h = Integer.valueOf(nyt.l());
                    continue;
                case 88:
                    this.k = Long.valueOf(nyt.d());
                    continue;
                case 106:
                    this.l = nyt.j();
                    continue;
                case 114:
                    this.m = nyt.j();
                    continue;
                case 120:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    this.n = nyt.j();
                    continue;
                case 138:
                    this.o = nyt.j();
                    continue;
                case 144:
                    this.p = Integer.valueOf(nyt.l());
                    continue;
                case 152:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.q = a;
                            break;
                        default:
                            continue;
                    }
                case 160:
                    int b = nzl.b(nyt, 160);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case 20:
                            case 21:
                            case 22:
                            case wi.do /*23*/:
                            case wi.dA /*24*/:
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case 27:
                            case 28:
                            case 29:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.r == null ? 0 : this.r.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.r, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.r = obj2;
                            break;
                        }
                        this.r = obj;
                        break;
                    }
                    continue;
                case 162:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
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
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case 20:
                            case 21:
                            case 22:
                            case wi.do /*23*/:
                            case wi.dA /*24*/:
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case 27:
                            case 28:
                            case 29:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.r == null) {
                            i2 = 0;
                        } else {
                            i2 = this.r.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.r, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case wi.dK /*17*/:
                                case wi.dH /*18*/:
                                case wi.dL /*19*/:
                                case 20:
                                case 21:
                                case 22:
                                case wi.do /*23*/:
                                case wi.dA /*24*/:
                                case wi.dz /*25*/:
                                case wi.dx /*26*/:
                                case 27:
                                case 28:
                                case 29:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.r = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 170:
                    this.s = nyt.j();
                    continue;
                case 178:
                    this.f = nyt.k();
                    continue;
                case 186:
                    this.t = nyt.j();
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
