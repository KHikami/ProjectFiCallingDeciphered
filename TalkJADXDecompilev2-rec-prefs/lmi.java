package p000;

public final class lmi extends nyx<lmi> {
    public byte[] f25535a;
    public byte[] f25536b;
    public Integer f25537c;
    public Boolean f25538d;
    public Long f25539e;
    public byte[] f25540f;
    public Long f25541g;
    public Integer f25542h;
    public Boolean f25543i;
    public Long f25544j;
    public Long f25545k;
    public String f25546l;
    public String f25547m;
    public String f25548n;
    public String f25549o;
    public Integer f25550p;
    public Integer f25551q;
    public int[] f25552r;
    public String f25553s;
    public String f25554t;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29482b(nyt);
    }

    public lmi() {
        m29483d();
    }

    private lmi m29483d() {
        this.f25535a = null;
        this.f25536b = null;
        this.f25537c = null;
        this.f25538d = null;
        this.f25539e = null;
        this.f25540f = null;
        this.f25541g = null;
        this.f25542h = null;
        this.f25543i = null;
        this.f25544j = null;
        this.f25545k = null;
        this.f25546l = null;
        this.f25547m = null;
        this.f25548n = null;
        this.f25549o = null;
        this.f25550p = null;
        this.f25552r = nzl.a;
        this.f25553s = null;
        this.f25554t = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25535a);
        if (this.f25536b != null) {
            nyu.a(2, this.f25536b);
        }
        nyu.c(3, this.f25537c.intValue());
        if (this.f25538d != null) {
            nyu.a(5, this.f25538d.booleanValue());
        }
        if (this.f25544j != null) {
            nyu.a(6, this.f25544j.longValue());
        }
        if (this.f25541g != null) {
            nyu.a(8, this.f25541g.longValue());
        }
        if (this.f25539e != null) {
            nyu.a(9, this.f25539e.longValue());
        }
        if (this.f25542h != null) {
            nyu.c(10, this.f25542h.intValue());
        }
        if (this.f25545k != null) {
            nyu.a(11, this.f25545k.longValue());
        }
        if (this.f25546l != null) {
            nyu.a(13, this.f25546l);
        }
        if (this.f25547m != null) {
            nyu.a(14, this.f25547m);
        }
        if (this.f25543i != null) {
            nyu.a(15, this.f25543i.booleanValue());
        }
        if (this.f25548n != null) {
            nyu.a(16, this.f25548n);
        }
        if (this.f25549o != null) {
            nyu.a(17, this.f25549o);
        }
        if (this.f25550p != null) {
            nyu.c(18, this.f25550p.intValue());
        }
        if (this.f25551q != null) {
            nyu.a(19, this.f25551q.intValue());
        }
        if (this.f25552r != null && this.f25552r.length > 0) {
            for (int a : this.f25552r) {
                nyu.a(20, a);
            }
        }
        if (this.f25553s != null) {
            nyu.a(21, this.f25553s);
        }
        if (this.f25540f != null) {
            nyu.a(22, this.f25540f);
        }
        if (this.f25554t != null) {
            nyu.a(23, this.f25554t);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b() + nyu.b(1, this.f25535a);
        if (this.f25536b != null) {
            b += nyu.b(2, this.f25536b);
        }
        b += nyu.g(3, this.f25537c.intValue());
        if (this.f25538d != null) {
            this.f25538d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f25544j != null) {
            b += nyu.e(6, this.f25544j.longValue());
        }
        if (this.f25541g != null) {
            b += nyu.e(8, this.f25541g.longValue());
        }
        if (this.f25539e != null) {
            b += nyu.e(9, this.f25539e.longValue());
        }
        if (this.f25542h != null) {
            b += nyu.g(10, this.f25542h.intValue());
        }
        if (this.f25545k != null) {
            b += nyu.e(11, this.f25545k.longValue());
        }
        if (this.f25546l != null) {
            b += nyu.b(13, this.f25546l);
        }
        if (this.f25547m != null) {
            b += nyu.b(14, this.f25547m);
        }
        if (this.f25543i != null) {
            this.f25543i.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.f25548n != null) {
            b += nyu.b(16, this.f25548n);
        }
        if (this.f25549o != null) {
            b += nyu.b(17, this.f25549o);
        }
        if (this.f25550p != null) {
            b += nyu.g(18, this.f25550p.intValue());
        }
        if (this.f25551q != null) {
            b += nyu.f(19, this.f25551q.intValue());
        }
        if (this.f25552r != null && this.f25552r.length > 0) {
            int i2 = 0;
            while (i < this.f25552r.length) {
                i2 += nyu.g(this.f25552r[i]);
                i++;
            }
            b = (b + i2) + (this.f25552r.length * 2);
        }
        if (this.f25553s != null) {
            b += nyu.b(21, this.f25553s);
        }
        if (this.f25540f != null) {
            b += nyu.b(22, this.f25540f);
        }
        if (this.f25554t != null) {
            return b + nyu.b(23, this.f25554t);
        }
        return b;
    }

    private lmi m29482b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25535a = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    this.f25536b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f25537c = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    this.f25538d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f25544j = Long.valueOf(nyt.d());
                    continue;
                case 64:
                    this.f25541g = Long.valueOf(nyt.d());
                    continue;
                case 72:
                    this.f25539e = Long.valueOf(nyt.d());
                    continue;
                case 80:
                    this.f25542h = Integer.valueOf(nyt.l());
                    continue;
                case 88:
                    this.f25545k = Long.valueOf(nyt.d());
                    continue;
                case 106:
                    this.f25546l = nyt.j();
                    continue;
                case 114:
                    this.f25547m = nyt.j();
                    continue;
                case 120:
                    this.f25543i = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    this.f25548n = nyt.j();
                    continue;
                case 138:
                    this.f25549o = nyt.j();
                    continue;
                case 144:
                    this.f25550p = Integer.valueOf(nyt.l());
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
                            this.f25551q = Integer.valueOf(a);
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
                            case wi.f29038do /*23*/:
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
                        a = this.f25552r == null ? 0 : this.f25552r.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f25552r, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f25552r = obj2;
                            break;
                        }
                        this.f25552r = obj;
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
                            case wi.f29038do /*23*/:
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
                        if (this.f25552r == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f25552r.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f25552r, 0, obj3, 0, i2);
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
                                case wi.f29038do /*23*/:
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
                        this.f25552r = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 170:
                    this.f25553s = nyt.j();
                    continue;
                case 178:
                    this.f25540f = nyt.k();
                    continue;
                case 186:
                    this.f25554t = nyt.j();
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
