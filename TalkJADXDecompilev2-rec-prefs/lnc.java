package p000;

public final class lnc extends nyx<lnc> {
    public byte[] f25730a;
    public byte[] f25731b;
    public Integer f25732c;
    public Boolean f25733d;
    public Long f25734e;
    public byte[] f25735f;
    public Long f25736g;
    public Integer f25737h;
    public Boolean f25738i;
    public Long f25739j;
    public Long f25740k;
    public String f25741l;
    public String f25742m;
    public String f25743n;
    public String f25744o;
    public Integer f25745p;
    public int f25746q;
    public int[] f25747r;
    public String f25748s;
    public String f25749t;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29578b(nyt);
    }

    public lnc() {
        this.f25730a = null;
        this.f25731b = null;
        this.f25732c = null;
        this.f25733d = null;
        this.f25734e = null;
        this.f25735f = null;
        this.f25736g = null;
        this.f25737h = null;
        this.f25738i = null;
        this.f25739j = null;
        this.f25740k = null;
        this.f25741l = null;
        this.f25742m = null;
        this.f25743n = null;
        this.f25744o = null;
        this.f25745p = null;
        this.f25746q = nzf.UNSET_ENUM_VALUE;
        this.f25747r = nzl.a;
        this.f25748s = null;
        this.f25749t = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25730a);
        if (this.f25731b != null) {
            nyu.a(2, this.f25731b);
        }
        nyu.c(3, this.f25732c.intValue());
        if (this.f25733d != null) {
            nyu.a(5, this.f25733d.booleanValue());
        }
        if (this.f25739j != null) {
            nyu.a(6, this.f25739j.longValue());
        }
        if (this.f25736g != null) {
            nyu.a(8, this.f25736g.longValue());
        }
        if (this.f25734e != null) {
            nyu.a(9, this.f25734e.longValue());
        }
        if (this.f25737h != null) {
            nyu.c(10, this.f25737h.intValue());
        }
        if (this.f25740k != null) {
            nyu.a(11, this.f25740k.longValue());
        }
        if (this.f25741l != null) {
            nyu.a(13, this.f25741l);
        }
        if (this.f25742m != null) {
            nyu.a(14, this.f25742m);
        }
        if (this.f25738i != null) {
            nyu.a(15, this.f25738i.booleanValue());
        }
        if (this.f25743n != null) {
            nyu.a(16, this.f25743n);
        }
        if (this.f25744o != null) {
            nyu.a(17, this.f25744o);
        }
        if (this.f25745p != null) {
            nyu.c(18, this.f25745p.intValue());
        }
        if (this.f25746q != nzf.UNSET_ENUM_VALUE) {
            nyu.a(19, this.f25746q);
        }
        if (this.f25747r != null && this.f25747r.length > 0) {
            for (int a : this.f25747r) {
                nyu.a(20, a);
            }
        }
        if (this.f25748s != null) {
            nyu.a(21, this.f25748s);
        }
        if (this.f25735f != null) {
            nyu.a(22, this.f25735f);
        }
        if (this.f25749t != null) {
            nyu.a(23, this.f25749t);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b() + nyu.b(1, this.f25730a);
        if (this.f25731b != null) {
            b += nyu.b(2, this.f25731b);
        }
        b += nyu.g(3, this.f25732c.intValue());
        if (this.f25733d != null) {
            this.f25733d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f25739j != null) {
            b += nyu.e(6, this.f25739j.longValue());
        }
        if (this.f25736g != null) {
            b += nyu.e(8, this.f25736g.longValue());
        }
        if (this.f25734e != null) {
            b += nyu.e(9, this.f25734e.longValue());
        }
        if (this.f25737h != null) {
            b += nyu.g(10, this.f25737h.intValue());
        }
        if (this.f25740k != null) {
            b += nyu.e(11, this.f25740k.longValue());
        }
        if (this.f25741l != null) {
            b += nyu.b(13, this.f25741l);
        }
        if (this.f25742m != null) {
            b += nyu.b(14, this.f25742m);
        }
        if (this.f25738i != null) {
            this.f25738i.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.f25743n != null) {
            b += nyu.b(16, this.f25743n);
        }
        if (this.f25744o != null) {
            b += nyu.b(17, this.f25744o);
        }
        if (this.f25745p != null) {
            b += nyu.g(18, this.f25745p.intValue());
        }
        if (this.f25746q != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(19, this.f25746q);
        }
        if (this.f25747r != null && this.f25747r.length > 0) {
            int i2 = 0;
            while (i < this.f25747r.length) {
                i2 += nyu.g(this.f25747r[i]);
                i++;
            }
            b = (b + i2) + (this.f25747r.length * 2);
        }
        if (this.f25748s != null) {
            b += nyu.b(21, this.f25748s);
        }
        if (this.f25735f != null) {
            b += nyu.b(22, this.f25735f);
        }
        if (this.f25749t != null) {
            return b + nyu.b(23, this.f25749t);
        }
        return b;
    }

    private lnc m29578b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25730a = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    this.f25731b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f25732c = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    this.f25733d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f25739j = Long.valueOf(nyt.d());
                    continue;
                case 64:
                    this.f25736g = Long.valueOf(nyt.d());
                    continue;
                case 72:
                    this.f25734e = Long.valueOf(nyt.d());
                    continue;
                case 80:
                    this.f25737h = Integer.valueOf(nyt.l());
                    continue;
                case 88:
                    this.f25740k = Long.valueOf(nyt.d());
                    continue;
                case 106:
                    this.f25741l = nyt.j();
                    continue;
                case 114:
                    this.f25742m = nyt.j();
                    continue;
                case 120:
                    this.f25738i = Boolean.valueOf(nyt.i());
                    continue;
                case 130:
                    this.f25743n = nyt.j();
                    continue;
                case 138:
                    this.f25744o = nyt.j();
                    continue;
                case 144:
                    this.f25745p = Integer.valueOf(nyt.l());
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
                            this.f25746q = a;
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
                        a = this.f25747r == null ? 0 : this.f25747r.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f25747r, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f25747r = obj2;
                            break;
                        }
                        this.f25747r = obj;
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
                        if (this.f25747r == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f25747r.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f25747r, 0, obj3, 0, i2);
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
                        this.f25747r = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 170:
                    this.f25748s = nyt.j();
                    continue;
                case 178:
                    this.f25735f = nyt.k();
                    continue;
                case 186:
                    this.f25749t = nyt.j();
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
