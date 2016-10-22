package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import nyt;
import nyu;
import nzl;
import oas;

/* renamed from: ktu */
public final class ktu extends nyx<ktu> {
    public Integer A;
    public Integer B;
    public Boolean C;
    public String D;
    public String E;
    public String[] F;
    public Integer G;
    public Integer H;
    public oas[] I;
    public krx[] J;
    public Long K;
    public Long L;
    public String[] M;
    public Boolean N;
    public ktv[] O;
    public kru[] P;
    public Boolean Q;
    public int R;
    public int a;
    public kud b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public lcc n;
    public kxr[] o;
    public kud[] p;
    public String[] q;
    public kul r;
    public int s;
    public Boolean t;
    public int u;
    public String v;
    public kwh[] w;
    public Integer x;
    public Integer y;
    public Boolean z;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ktu() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = nzf.UNSET_ENUM_VALUE;
        this.k = null;
        this.l = null;
        this.m = null;
        this.o = kxr.c;
        this.p = kud.d();
        this.q = nzl.f;
        this.s = nzf.UNSET_ENUM_VALUE;
        this.t = null;
        this.u = nzf.UNSET_ENUM_VALUE;
        this.v = null;
        this.w = kwh.d();
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = nzl.f;
        this.G = null;
        this.H = null;
        this.I = oas.b;
        this.J = krx.d();
        this.K = null;
        this.L = null;
        this.M = nzl.f;
        this.N = null;
        this.O = ktv.d();
        this.P = kru.d();
        this.Q = null;
        this.R = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        nyu.a(3, this.f);
        if (this.g != null) {
            nyu.a(4, this.g);
        }
        if (this.h != null) {
            nyu.a(5, this.h.intValue());
        }
        nyu.a(6, this.i);
        if (this.j != nzf.UNSET_ENUM_VALUE) {
            nyu.a(7, this.j);
        }
        if (this.k != null) {
            nyu.a(8, this.k);
        }
        if (this.l != null) {
            nyu.a(9, this.l);
        }
        if (this.m != null) {
            nyu.a(10, this.m);
        }
        if (this.p != null && this.p.length > 0) {
            for (nzf nzf : this.p) {
                if (nzf != null) {
                    nyu.b(11, nzf);
                }
            }
        }
        if (this.o != null && this.o.length > 0) {
            for (nzf nzf2 : this.o) {
                if (nzf2 != null) {
                    nyu.b(12, nzf2);
                }
            }
        }
        if (this.q != null && this.q.length > 0) {
            for (String str : this.q) {
                if (str != null) {
                    nyu.a(13, str);
                }
            }
        }
        if (this.r != null) {
            nyu.b(14, this.r);
        }
        if (this.s != nzf.UNSET_ENUM_VALUE) {
            nyu.a(15, this.s);
        }
        if (this.F != null && this.F.length > 0) {
            for (String str2 : this.F) {
                if (str2 != null) {
                    nyu.a(16, str2);
                }
            }
        }
        if (this.u != nzf.UNSET_ENUM_VALUE) {
            nyu.a(17, this.u);
        }
        if (this.v != null) {
            nyu.a(18, this.v);
        }
        if (this.t != null) {
            nyu.a(19, this.t.booleanValue());
        }
        if (this.w != null && this.w.length > 0) {
            for (nzf nzf22 : this.w) {
                if (nzf22 != null) {
                    nyu.b(20, nzf22);
                }
            }
        }
        if (this.x != null) {
            nyu.a(21, this.x.intValue());
        }
        if (this.y != null) {
            nyu.a(22, this.y.intValue());
        }
        if (this.z != null) {
            nyu.a(23, this.z.booleanValue());
        }
        if (this.A != null) {
            nyu.a(24, this.A.intValue());
        }
        if (this.B != null) {
            nyu.a(25, this.B.intValue());
        }
        if (this.C != null) {
            nyu.a(26, this.C.booleanValue());
        }
        if (this.E != null) {
            nyu.a(27, this.E);
        }
        if (this.G != null) {
            nyu.a(28, this.G.intValue());
        }
        if (this.H != null) {
            nyu.a(29, this.H.intValue());
        }
        if (this.I != null && this.I.length > 0) {
            for (nzf nzf222 : this.I) {
                if (nzf222 != null) {
                    nyu.b(30, nzf222);
                }
            }
        }
        if (this.D != null) {
            nyu.a(31, this.D);
        }
        if (this.K != null) {
            nyu.b(32, this.K.longValue());
        }
        if (this.c != null) {
            nyu.a(33, this.c.booleanValue());
        }
        if (this.L != null) {
            nyu.b(34, this.L.longValue());
        }
        if (this.M != null && this.M.length > 0) {
            for (String str22 : this.M) {
                if (str22 != null) {
                    nyu.a(35, str22);
                }
            }
        }
        if (this.J != null && this.J.length > 0) {
            for (nzf nzf2222 : this.J) {
                if (nzf2222 != null) {
                    nyu.b(36, nzf2222);
                }
            }
        }
        if (this.N != null) {
            nyu.a(37, this.N.booleanValue());
        }
        if (this.O != null && this.O.length > 0) {
            for (nzf nzf22222 : this.O) {
                if (nzf22222 != null) {
                    nyu.b(38, nzf22222);
                }
            }
        }
        if (this.P != null && this.P.length > 0) {
            while (i < this.P.length) {
                nzf nzf3 = this.P[i];
                if (nzf3 != null) {
                    nyu.b(39, nzf3);
                }
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(40, this.d);
        }
        if (this.Q != null) {
            nyu.a(41, this.Q.booleanValue());
        }
        if (this.R != nzf.UNSET_ENUM_VALUE) {
            nyu.a(42, this.R);
        }
        if (this.n != null) {
            nyu.b(43, this.n);
        }
        if (this.e != null) {
            nyu.a(44, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        b += nyu.b(3, this.f);
        if (this.g != null) {
            b += nyu.b(4, this.g);
        }
        if (this.h != null) {
            b += nyu.f(5, this.h.intValue());
        }
        b += nyu.b(6, this.i);
        if (this.j != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(7, this.j);
        }
        if (this.k != null) {
            b += nyu.b(8, this.k);
        }
        if (this.l != null) {
            b += nyu.b(9, this.l);
        }
        if (this.m != null) {
            b += nyu.b(10, this.m);
        }
        if (this.p != null && this.p.length > 0) {
            i = b;
            for (nzf nzf : this.p) {
                if (nzf != null) {
                    i += nyu.d(11, nzf);
                }
            }
            b = i;
        }
        if (this.o != null && this.o.length > 0) {
            i = b;
            for (nzf nzf2 : this.o) {
                if (nzf2 != null) {
                    i += nyu.d(12, nzf2);
                }
            }
            b = i;
        }
        if (this.q != null && this.q.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str : this.q) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.r != null) {
            b += nyu.d(14, this.r);
        }
        if (this.s != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(15, this.s);
        }
        if (this.F != null && this.F.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str2 : this.F) {
                if (str2 != null) {
                    i3++;
                    i2 += nyu.b(str2);
                }
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.u != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(17, this.u);
        }
        if (this.v != null) {
            b += nyu.b(18, this.v);
        }
        if (this.t != null) {
            this.t.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.w != null && this.w.length > 0) {
            i = b;
            for (nzf nzf22 : this.w) {
                if (nzf22 != null) {
                    i += nyu.d(20, nzf22);
                }
            }
            b = i;
        }
        if (this.x != null) {
            b += nyu.f(21, this.x.intValue());
        }
        if (this.y != null) {
            b += nyu.f(22, this.y.intValue());
        }
        if (this.z != null) {
            this.z.booleanValue();
            b += nyu.h(23) + 1;
        }
        if (this.A != null) {
            b += nyu.f(24, this.A.intValue());
        }
        if (this.B != null) {
            b += nyu.f(25, this.B.intValue());
        }
        if (this.C != null) {
            this.C.booleanValue();
            b += nyu.h(26) + 1;
        }
        if (this.E != null) {
            b += nyu.b(27, this.E);
        }
        if (this.G != null) {
            b += nyu.f(28, this.G.intValue());
        }
        if (this.H != null) {
            b += nyu.f(29, this.H.intValue());
        }
        if (this.I != null && this.I.length > 0) {
            i = b;
            for (nzf nzf222 : this.I) {
                if (nzf222 != null) {
                    i += nyu.d(30, nzf222);
                }
            }
            b = i;
        }
        if (this.D != null) {
            b += nyu.b(31, this.D);
        }
        if (this.K != null) {
            b += nyu.f(32, this.K.longValue());
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(33) + 1;
        }
        if (this.L != null) {
            b += nyu.f(34, this.L.longValue());
        }
        if (this.M != null && this.M.length > 0) {
            i2 = 0;
            i3 = 0;
            for (String str22 : this.M) {
                if (str22 != null) {
                    i3++;
                    i2 += nyu.b(str22);
                }
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.J != null && this.J.length > 0) {
            i = b;
            for (nzf nzf2222 : this.J) {
                if (nzf2222 != null) {
                    i += nyu.d(36, nzf2222);
                }
            }
            b = i;
        }
        if (this.N != null) {
            this.N.booleanValue();
            b += nyu.h(37) + 1;
        }
        if (this.O != null && this.O.length > 0) {
            i = b;
            for (nzf nzf22222 : this.O) {
                if (nzf22222 != null) {
                    i += nyu.d(38, nzf22222);
                }
            }
            b = i;
        }
        if (this.P != null && this.P.length > 0) {
            while (i4 < this.P.length) {
                nzf nzf3 = this.P[i4];
                if (nzf3 != null) {
                    b += nyu.d(39, nzf3);
                }
                i4++;
            }
        }
        if (this.d != null) {
            b += nyu.b(40, this.d);
        }
        if (this.Q != null) {
            this.Q.booleanValue();
            b += nyu.h(41) + 1;
        }
        if (this.R != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(42, this.R);
        }
        if (this.n != null) {
            b += nyu.d(43, this.n);
        }
        if (this.e != null) {
            return b + nyu.b(44, this.e);
        }
        return b;
    }

    private ktu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new kud();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.f = nyt.j();
                    continue;
                case 34:
                    this.g = nyt.j();
                    continue;
                case 40:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.i = nyt.j();
                    continue;
                case 56:
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
                            this.j = a;
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.k = nyt.j();
                    continue;
                case 74:
                    this.l = nyt.j();
                    continue;
                case 82:
                    this.m = nyt.j();
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    if (this.p == null) {
                        a = 0;
                    } else {
                        a = this.p.length;
                    }
                    obj = new kud[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kud();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kud();
                    nyt.a(obj[a]);
                    this.p = obj;
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.o == null) {
                        a = 0;
                    } else {
                        a = this.o.length;
                    }
                    obj = new kxr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxr();
                    nyt.a(obj[a]);
                    this.o = obj;
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    a = this.q == null ? 0 : this.q.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.q, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.q = obj;
                    continue;
                case 114:
                    if (this.r == null) {
                        this.r = new kul();
                    }
                    nyt.a(this.r);
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.s = a;
                            break;
                        default:
                            continue;
                    }
                case 130:
                    b = nzl.b(nyt, 130);
                    a = this.F == null ? 0 : this.F.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.F, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.F = obj;
                    continue;
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                            this.u = a;
                            break;
                        default:
                            continue;
                    }
                case 146:
                    this.v = nyt.j();
                    continue;
                case 152:
                    this.t = Boolean.valueOf(nyt.i());
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.w == null) {
                        a = 0;
                    } else {
                        a = this.w.length;
                    }
                    obj = new kwh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.w, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwh();
                    nyt.a(obj[a]);
                    this.w = obj;
                    continue;
                case 168:
                    this.x = Integer.valueOf(nyt.f());
                    continue;
                case 176:
                    this.y = Integer.valueOf(nyt.f());
                    continue;
                case 184:
                    this.z = Boolean.valueOf(nyt.i());
                    continue;
                case 192:
                    this.A = Integer.valueOf(nyt.f());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.B = Integer.valueOf(nyt.f());
                    continue;
                case 208:
                    this.C = Boolean.valueOf(nyt.i());
                    continue;
                case 218:
                    this.E = nyt.j();
                    continue;
                case 224:
                    this.G = Integer.valueOf(nyt.f());
                    continue;
                case 232:
                    this.H = Integer.valueOf(nyt.f());
                    continue;
                case 242:
                    b = nzl.b(nyt, 242);
                    if (this.I == null) {
                        a = 0;
                    } else {
                        a = this.I.length;
                    }
                    obj = new oas[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.I, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oas();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oas();
                    nyt.a(obj[a]);
                    this.I = obj;
                    continue;
                case 250:
                    this.D = nyt.j();
                    continue;
                case 256:
                    this.K = Long.valueOf(nyt.e());
                    continue;
                case 264:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 272:
                    this.L = Long.valueOf(nyt.e());
                    continue;
                case 282:
                    b = nzl.b(nyt, 282);
                    a = this.M == null ? 0 : this.M.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.M, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.M = obj;
                    continue;
                case 290:
                    b = nzl.b(nyt, 290);
                    if (this.J == null) {
                        a = 0;
                    } else {
                        a = this.J.length;
                    }
                    obj = new krx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.J, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new krx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new krx();
                    nyt.a(obj[a]);
                    this.J = obj;
                    continue;
                case 296:
                    this.N = Boolean.valueOf(nyt.i());
                    continue;
                case 306:
                    b = nzl.b(nyt, 306);
                    if (this.O == null) {
                        a = 0;
                    } else {
                        a = this.O.length;
                    }
                    obj = new ktv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.O, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ktv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ktv();
                    nyt.a(obj[a]);
                    this.O = obj;
                    continue;
                case 314:
                    b = nzl.b(nyt, 314);
                    if (this.P == null) {
                        a = 0;
                    } else {
                        a = this.P.length;
                    }
                    obj = new kru[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.P, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kru();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kru();
                    nyt.a(obj[a]);
                    this.P = obj;
                    continue;
                case 322:
                    this.d = nyt.j();
                    continue;
                case 328:
                    this.Q = Boolean.valueOf(nyt.i());
                    continue;
                case 336:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.R = a;
                            break;
                        default:
                            continue;
                    }
                case 346:
                    if (this.n == null) {
                        this.n = new lcc();
                    }
                    nyt.a(this.n);
                    continue;
                case 354:
                    this.e = nyt.j();
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
