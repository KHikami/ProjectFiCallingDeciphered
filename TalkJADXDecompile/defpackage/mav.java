package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: mav */
public final class mav extends nyx<mav> {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public lko f;
    public lkx g;
    public lkz h;
    public llc i;
    public llj j;
    public lkw k;
    public llf l;
    public lld m;
    public String[] n;
    public Boolean o;
    public Integer p;
    public String q;
    public String r;
    public Boolean s;
    public Long t;
    public Long u;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mav() {
        d();
    }

    private mav d() {
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
        this.n = nzl.f;
        this.o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.g != null) {
            nyu.b(5, this.g);
        }
        if (this.h != null) {
            nyu.b(6, this.h);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.b(8, this.j);
        }
        if (this.p != null) {
            nyu.a(9, this.p.intValue());
        }
        if (this.k != null) {
            nyu.b(10, this.k);
        }
        if (this.n != null && this.n.length > 0) {
            for (String str : this.n) {
                if (str != null) {
                    nyu.a(11, str);
                }
            }
        }
        if (this.o != null) {
            nyu.a(12, this.o.booleanValue());
        }
        if (this.q != null) {
            nyu.a(13, this.q);
        }
        if (this.c != null) {
            nyu.a(14, this.c);
        }
        if (this.m != null) {
            nyu.b(15, this.m);
        }
        if (this.r != null) {
            nyu.a(16, this.r);
        }
        if (this.l != null) {
            nyu.b(17, this.l);
        }
        if (this.s != null) {
            nyu.a(18, this.s.booleanValue());
        }
        if (this.t != null) {
            nyu.b(19, this.t.longValue());
        }
        if (this.u != null) {
            nyu.b(20, this.u.longValue());
        }
        if (this.d != null) {
            nyu.a(21, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.g != null) {
            b += nyu.d(5, this.g);
        }
        if (this.h != null) {
            b += nyu.d(6, this.h);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            b += nyu.d(8, this.j);
        }
        if (this.p != null) {
            b += nyu.f(9, this.p.intValue());
        }
        if (this.k != null) {
            b += nyu.d(10, this.k);
        }
        if (this.n != null && this.n.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.n.length) {
                String str = this.n[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.q != null) {
            b += nyu.b(13, this.q);
        }
        if (this.c != null) {
            b += nyu.b(14, this.c);
        }
        if (this.m != null) {
            b += nyu.d(15, this.m);
        }
        if (this.r != null) {
            b += nyu.b(16, this.r);
        }
        if (this.l != null) {
            b += nyu.d(17, this.l);
        }
        if (this.s != null) {
            this.s.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.t != null) {
            b += nyu.f(19, this.t.longValue());
        }
        if (this.u != null) {
            b += nyu.f(20, this.u.longValue());
        }
        if (this.d != null) {
            return b + nyu.b(21, this.d);
        }
        return b;
    }

    private mav b(nyt nyt) {
        while (true) {
            int a = nyt.a();
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
                    this.e = nyt.j();
                    continue;
                case 34:
                    if (this.f == null) {
                        this.f = new lko();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    if (this.g == null) {
                        this.g = new lkx();
                    }
                    nyt.a(this.g);
                    continue;
                case 50:
                    if (this.h == null) {
                        this.h = new lkz();
                    }
                    nyt.a(this.h);
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new llc();
                    }
                    nyt.a(this.i);
                    continue;
                case 66:
                    if (this.j == null) {
                        this.j = new llj();
                    }
                    nyt.a(this.j);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 37:
                        case 42:
                        case 43:
                        case 55:
                        case 58:
                        case 59:
                        case 60:
                            this.p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.k == null) {
                        this.k = new lkw();
                    }
                    nyt.a(this.k);
                    continue;
                case 90:
                    int b = nzl.b(nyt, 90);
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
                case 96:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    this.q = nyt.j();
                    continue;
                case 114:
                    this.c = nyt.j();
                    continue;
                case 122:
                    if (this.m == null) {
                        this.m = new lld();
                    }
                    nyt.a(this.m);
                    continue;
                case 130:
                    this.r = nyt.j();
                    continue;
                case 138:
                    if (this.l == null) {
                        this.l = new llf();
                    }
                    nyt.a(this.l);
                    continue;
                case 144:
                    this.s = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    this.t = Long.valueOf(nyt.e());
                    continue;
                case 160:
                    this.u = Long.valueOf(nyt.e());
                    continue;
                case 170:
                    this.d = nyt.j();
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
