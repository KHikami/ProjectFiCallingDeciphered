package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: lym */
public final class lym extends nyx<lym> {
    private static volatile lym[] y;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public Boolean g;
    public lyn[] h;
    public String[] i;
    public Boolean j;
    public String k;
    public String l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public int[] r;
    public Boolean s;
    public muo t;
    public Long u;
    public Integer v;
    public String w;
    public String[] x;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lym[] d() {
        if (y == null) {
            synchronized (nzc.c) {
                if (y == null) {
                    y = new lym[0];
                }
            }
        }
        return y;
    }

    public lym() {
        g();
    }

    private lym g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = lyn.d();
        this.i = nzl.f;
        this.j = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.r = nzl.a;
        this.s = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = nzl.f;
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
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.i != null && this.i.length > 0) {
            for (String str : this.i) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.j != null) {
            nyu.a(9, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.a(10, this.k);
        }
        if (this.l != null) {
            nyu.a(11, this.l);
        }
        if (this.m != null) {
            nyu.a(12, this.m.intValue());
        }
        if (this.n != null) {
            nyu.a(13, this.n.intValue());
        }
        if (this.o != null) {
            nyu.a(14, this.o.intValue());
        }
        if (this.p != null) {
            nyu.a(17, this.p.intValue());
        }
        if (this.q != null) {
            nyu.a(18, this.q.booleanValue());
        }
        if (this.r != null && this.r.length > 0) {
            for (int a : this.r) {
                nyu.a(19, a);
            }
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    nyu.b(20, nzf);
                }
            }
        }
        if (this.s != null) {
            nyu.a(21, this.s.booleanValue());
        }
        if (this.t != null) {
            nyu.b(22, this.t);
        }
        if (this.u != null) {
            nyu.b(23, this.u.longValue());
        }
        if (this.v != null) {
            nyu.a(24, this.v.intValue());
        }
        if (this.w != null) {
            nyu.a(25, this.w);
        }
        if (this.x != null && this.x.length > 0) {
            while (i < this.x.length) {
                String str2 = this.x[i];
                if (str2 != null) {
                    nyu.a(26, str2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.i != null && this.i.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.i) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.k != null) {
            b += nyu.b(10, this.k);
        }
        if (this.l != null) {
            b += nyu.b(11, this.l);
        }
        if (this.m != null) {
            b += nyu.f(12, this.m.intValue());
        }
        if (this.n != null) {
            b += nyu.f(13, this.n.intValue());
        }
        if (this.o != null) {
            b += nyu.f(14, this.o.intValue());
        }
        if (this.p != null) {
            b += nyu.f(17, this.p.intValue());
        }
        if (this.q != null) {
            this.q.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.r != null && this.r.length > 0) {
            i = 0;
            for (int i22 : this.r) {
                i += nyu.g(i22);
            }
            b = (b + i) + (this.r.length * 2);
        }
        if (this.h != null && this.h.length > 0) {
            i3 = b;
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    i3 += nyu.d(20, nzf);
                }
            }
            b = i3;
        }
        if (this.s != null) {
            this.s.booleanValue();
            b += nyu.h(21) + 1;
        }
        if (this.t != null) {
            b += nyu.d(22, this.t);
        }
        if (this.u != null) {
            b += nyu.f(23, this.u.longValue());
        }
        if (this.v != null) {
            b += nyu.f(24, this.v.intValue());
        }
        if (this.w != null) {
            b += nyu.b(25, this.w);
        }
        if (this.x == null || this.x.length <= 0) {
            return b;
        }
        i3 = 0;
        i = 0;
        while (i4 < this.x.length) {
            String str2 = this.x[i4];
            if (str2 != null) {
                i++;
                i3 += nyu.b(str2);
            }
            i4++;
        }
        return (b + i3) + (i * 2);
    }

    private lym b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    a = this.i == null ? 0 : this.i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.i = obj;
                    continue;
                case 72:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.k = nyt.j();
                    continue;
                case 90:
                    this.l = nyt.j();
                    continue;
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                            this.n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.o = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                            this.p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.q = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    int b2 = nzl.b(nyt, 152);
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
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
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
                        a = this.r == null ? 0 : this.r.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.r, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.r = obj3;
                            break;
                        }
                        this.r = obj2;
                        break;
                    }
                    continue;
                case 154:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
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
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.r, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.r = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new lyn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyn();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 168:
                    this.s = Boolean.valueOf(nyt.i());
                    continue;
                case 178:
                    if (this.t == null) {
                        this.t = new muo();
                    }
                    nyt.a(this.t);
                    continue;
                case 184:
                    this.u = Long.valueOf(nyt.e());
                    continue;
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.v = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 202:
                    this.w = nyt.j();
                    continue;
                case 210:
                    b = nzl.b(nyt, 210);
                    a = this.x == null ? 0 : this.x.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.x = obj;
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
