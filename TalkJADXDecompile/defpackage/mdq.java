package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import nyt;
import nyu;
import nzl;

/* renamed from: mdq */
public final class mdq extends nyx<mdq> {
    public mdo A;
    public Long B;
    public String C;
    public String D;
    public mdl[] E;
    public mdn F;
    public Integer a;
    public mds b;
    public String c;
    public Integer d;
    public int[] e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public String j;
    public String k;
    public mdt[] l;
    public mdt m;
    public Long n;
    public String o;
    public Long p;
    public Integer q;
    public Integer r;
    public Boolean s;
    public Long t;
    public Integer u;
    public mdl v;
    public Integer w;
    public mdr x;
    public String y;
    public mdp[] z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mdq() {
        d();
    }

    private mdq d() {
        this.b = null;
        this.c = null;
        this.e = nzl.a;
        this.h = null;
        this.j = null;
        this.k = null;
        this.l = mdt.d();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = null;
        this.x = null;
        this.y = null;
        this.z = mdp.d();
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = mdl.d();
        this.F = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a.intValue());
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(5, this.g.intValue());
        }
        if (this.h != null) {
            nyu.a(6, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(7, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(8, this.j);
        }
        if (this.k != null) {
            nyu.a(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.n != null) {
            nyu.a(11, this.n.longValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                nyu.a(12, a);
            }
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        if (this.o != null) {
            nyu.a(14, this.o);
        }
        if (this.p != null) {
            nyu.a(15, this.p.longValue());
        }
        if (this.q != null) {
            nyu.c(16, this.q.intValue());
        }
        if (this.r != null) {
            nyu.a(17, this.r.intValue());
        }
        if (this.s != null) {
            nyu.a(18, this.s.booleanValue());
        }
        if (this.t != null) {
            nyu.a(19, this.t.longValue());
        }
        if (this.c != null) {
            nyu.a(20, this.c);
        }
        if (this.u != null) {
            nyu.a(21, this.u.intValue());
        }
        if (this.v != null) {
            nyu.b(22, this.v);
        }
        if (this.w != null) {
            nyu.a(23, this.w.intValue());
        }
        if (this.x != null) {
            nyu.b(24, this.x);
        }
        if (this.y != null) {
            nyu.a(25, this.y);
        }
        if (this.z != null && this.z.length > 0) {
            for (nzf nzf2 : this.z) {
                if (nzf2 != null) {
                    nyu.b(26, nzf2);
                }
            }
        }
        if (this.A != null) {
            nyu.b(27, this.A);
        }
        if (this.B != null) {
            nyu.a(28, this.B.longValue());
        }
        if (this.C != null) {
            nyu.a(29, this.C);
        }
        if (this.D != null) {
            nyu.a(30, this.D);
        }
        if (this.E != null && this.E.length > 0) {
            while (i < this.E.length) {
                nzf nzf3 = this.E[i];
                if (nzf3 != null) {
                    nyu.b(31, nzf3);
                }
                i++;
            }
        }
        if (this.F != null) {
            nyu.b(32, this.F);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.f(1, this.a.intValue());
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.f != null) {
            b += nyu.f(4, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(5, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.f(6, this.h.intValue());
        }
        if (this.i != null) {
            b += nyu.f(7, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.b(8, this.j);
        }
        if (this.k != null) {
            b += nyu.b(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            i = b;
            for (nzf nzf : this.l) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.n != null) {
            b += nyu.e(11, this.n.longValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i3 = 0;
            for (int g : this.e) {
                i3 += nyu.g(g);
            }
            b = (b + i3) + (this.e.length * 1);
        }
        if (this.m != null) {
            b += nyu.d(13, this.m);
        }
        if (this.o != null) {
            b += nyu.b(14, this.o);
        }
        if (this.p != null) {
            b += nyu.e(15, this.p.longValue());
        }
        if (this.q != null) {
            b += nyu.g(16, this.q.intValue());
        }
        if (this.r != null) {
            b += nyu.f(17, this.r.intValue());
        }
        if (this.s != null) {
            this.s.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.t != null) {
            b += nyu.e(19, this.t.longValue());
        }
        if (this.c != null) {
            b += nyu.b(20, this.c);
        }
        if (this.u != null) {
            b += nyu.f(21, this.u.intValue());
        }
        if (this.v != null) {
            b += nyu.d(22, this.v);
        }
        if (this.w != null) {
            b += nyu.f(23, this.w.intValue());
        }
        if (this.x != null) {
            b += nyu.d(24, this.x);
        }
        if (this.y != null) {
            b += nyu.b(25, this.y);
        }
        if (this.z != null && this.z.length > 0) {
            i = b;
            for (nzf nzf2 : this.z) {
                if (nzf2 != null) {
                    i += nyu.d(26, nzf2);
                }
            }
            b = i;
        }
        if (this.A != null) {
            b += nyu.d(27, this.A);
        }
        if (this.B != null) {
            b += nyu.e(28, this.B.longValue());
        }
        if (this.C != null) {
            b += nyu.b(29, this.C);
        }
        if (this.D != null) {
            b += nyu.b(30, this.D);
        }
        if (this.E != null && this.E.length > 0) {
            while (i2 < this.E.length) {
                nzf nzf3 = this.E[i2];
                if (nzf3 != null) {
                    b += nyu.d(31, nzf3);
                }
                i2++;
            }
        }
        if (this.F != null) {
            return b + nyu.d(32, this.F);
        }
        return b;
    }

    private mdq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case wi.i /*27*/:
                        case wi.o /*28*/:
                        case 29:
                        case 30:
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mds();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case 701:
                        case 702:
                        case 703:
                        case 704:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case wi.i /*27*/:
                        case wi.o /*28*/:
                        case 29:
                        case 30:
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
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.j = nyt.j();
                    continue;
                case 74:
                    this.k = nyt.j();
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new mdt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mdt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mdt();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 88:
                    this.n = Long.valueOf(nyt.d());
                    continue;
                case 96:
                    int b2 = nzl.b(nyt, 96);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                            case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
                            case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                            case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                            case 305:
                            case 501:
                            case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                            case 504:
                            case 505:
                            case 506:
                            case 507:
                            case 701:
                            case 702:
                            case 703:
                            case 704:
                            case 705:
                            case 706:
                            case 801:
                            case 802:
                            case 803:
                            case 901:
                            case 902:
                            case 903:
                            case 904:
                            case 905:
                            case 1001:
                            case 1002:
                            case 1003:
                            case 1004:
                            case 1100:
                            case 1101:
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
                        a = this.e == null ? 0 : this.e.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.e, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.e = obj3;
                            break;
                        }
                        this.e = obj2;
                        break;
                    }
                    continue;
                case 98:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                            case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
                            case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                            case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                            case 305:
                            case 501:
                            case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                            case 504:
                            case 505:
                            case 506:
                            case 507:
                            case 701:
                            case 702:
                            case 703:
                            case 704:
                            case 705:
                            case 706:
                            case 801:
                            case 802:
                            case 803:
                            case 901:
                            case 902:
                            case 903:
                            case 904:
                            case 905:
                            case 1001:
                            case 1002:
                            case 1003:
                            case 1004:
                            case 1100:
                            case 1101:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.e == null) {
                            b = 0;
                        } else {
                            b = this.e.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.e, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                                case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
                                case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                                case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                                case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                                case 305:
                                case 501:
                                case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                                case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                                case 504:
                                case 505:
                                case 506:
                                case 507:
                                case 701:
                                case 702:
                                case 703:
                                case 704:
                                case 705:
                                case 706:
                                case 801:
                                case 802:
                                case 803:
                                case 901:
                                case 902:
                                case 903:
                                case 904:
                                case 905:
                                case 1001:
                                case 1002:
                                case 1003:
                                case 1004:
                                case 1100:
                                case 1101:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.e = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new mdt();
                    }
                    nyt.a(this.m);
                    continue;
                case 114:
                    this.o = nyt.j();
                    continue;
                case 120:
                    this.p = Long.valueOf(nyt.d());
                    continue;
                case 128:
                    this.q = Integer.valueOf(nyt.l());
                    continue;
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dx /*26*/:
                        case wi.i /*27*/:
                        case wi.o /*28*/:
                        case 29:
                        case 30:
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
                            this.r = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.s = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    this.t = Long.valueOf(nyt.d());
                    continue;
                case 162:
                    this.c = nyt.j();
                    continue;
                case 168:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.u = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 178:
                    if (this.v == null) {
                        this.v = new mdl();
                    }
                    nyt.a(this.v);
                    continue;
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.w = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 194:
                    if (this.x == null) {
                        this.x = new mdr();
                    }
                    nyt.a(this.x);
                    continue;
                case 202:
                    this.y = nyt.j();
                    continue;
                case 210:
                    b = nzl.b(nyt, 210);
                    if (this.z == null) {
                        a = 0;
                    } else {
                        a = this.z.length;
                    }
                    obj = new mdp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.z, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mdp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mdp();
                    nyt.a(obj[a]);
                    this.z = obj;
                    continue;
                case 218:
                    if (this.A == null) {
                        this.A = new mdo();
                    }
                    nyt.a(this.A);
                    continue;
                case 224:
                    this.B = Long.valueOf(nyt.d());
                    continue;
                case 234:
                    this.C = nyt.j();
                    continue;
                case 242:
                    this.D = nyt.j();
                    continue;
                case 250:
                    b = nzl.b(nyt, 250);
                    if (this.E == null) {
                        a = 0;
                    } else {
                        a = this.E.length;
                    }
                    obj = new mdl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.E, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mdl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mdl();
                    nyt.a(obj[a]);
                    this.E = obj;
                    continue;
                case 258:
                    if (this.F == null) {
                        this.F = new mdn();
                    }
                    nyt.a(this.F);
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
