package defpackage;

import nyt;
import nyu;
import nyy;
import nzl;
import ozo;

/* renamed from: llz */
public final class llz extends nyx<llz> {
    public static final nyy<ozo, llz> a;
    private static final llz[] p;
    public String b;
    public lmd[] c;
    public String[] d;
    public String e;
    public Integer f;
    public Integer g;
    public Long h;
    public Long i;
    public String j;
    public String k;
    public Integer l;
    public Boolean m;
    public String n;
    public Boolean o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    static {
        a = nyy.a(11, llz.class, 271416946);
        p = new llz[0];
    }

    public llz() {
        d();
    }

    private llz d() {
        this.b = null;
        this.c = lmd.d();
        this.d = nzl.f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.b);
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        if (this.e != null) {
            nyu.a(8, this.e);
        }
        if (this.h != null) {
            nyu.a(9, this.h.longValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf = this.c[i];
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.c(11, this.g.intValue());
        }
        if (this.f != null) {
            nyu.c(12, this.f.intValue());
        }
        if (this.i != null) {
            nyu.a(13, this.i.longValue());
        }
        if (this.j != null) {
            nyu.a(15, this.j);
        }
        if (this.k != null) {
            nyu.a(16, this.k);
        }
        if (this.l != null) {
            nyu.a(17, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(18, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(19, this.n);
        }
        if (this.o != null) {
            nyu.a(20, this.o.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.b(1, this.b);
        if (this.d == null || this.d.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.e != null) {
            i += nyu.b(8, this.e);
        }
        if (this.h != null) {
            i += nyu.e(9, this.h.longValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf = this.c[i2];
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
                i2++;
            }
        }
        if (this.g != null) {
            i += nyu.g(11, this.g.intValue());
        }
        if (this.f != null) {
            i += nyu.g(12, this.f.intValue());
        }
        if (this.i != null) {
            i += nyu.e(13, this.i.longValue());
        }
        if (this.j != null) {
            i += nyu.b(15, this.j);
        }
        if (this.k != null) {
            i += nyu.b(16, this.k);
        }
        if (this.l != null) {
            i += nyu.f(17, this.l.intValue());
        }
        if (this.m != null) {
            this.m.booleanValue();
            i += nyu.h(18) + 1;
        }
        if (this.n != null) {
            i += nyu.b(19, this.n);
        }
        if (this.o == null) {
            return i;
        }
        this.o.booleanValue();
        return i + (nyu.h(20) + 1);
    }

    private llz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
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
                case 66:
                    this.e = nyt.j();
                    continue;
                case 72:
                    this.h = Long.valueOf(nyt.d());
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lmd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmd();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 88:
                    this.g = Integer.valueOf(nyt.l());
                    continue;
                case 96:
                    this.f = Integer.valueOf(nyt.l());
                    continue;
                case 104:
                    this.i = Long.valueOf(nyt.d());
                    continue;
                case 122:
                    this.j = nyt.j();
                    continue;
                case 130:
                    this.k = nyt.j();
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
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    this.n = nyt.j();
                    continue;
                case 160:
                    this.o = Boolean.valueOf(nyt.i());
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
