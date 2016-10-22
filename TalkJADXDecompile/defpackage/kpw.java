package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: kpw */
public final class kpw extends nyx<kpw> {
    private static volatile kpw[] j;
    public kqd a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public String[] g;
    public krg[] h;
    public Integer i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kpw[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new kpw[0];
                }
            }
        }
        return j;
    }

    public kpw() {
        g();
    }

    private kpw g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = nzl.f;
        this.h = krg.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
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
        if (this.g != null && this.g.length > 0) {
            for (String str : this.g) {
                if (str != null) {
                    nyu.a(7, str);
                }
            }
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf = this.h[i];
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
                i++;
            }
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
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
        if (this.g != null && this.g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.g) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf = this.h[i];
                if (nzf != null) {
                    b += nyu.d(8, nzf);
                }
                i++;
            }
        }
        if (this.i != null) {
            return b + nyu.f(9, this.i.intValue());
        }
        return b;
    }

    private kpw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new kqd();
                    }
                    nyt.a(this.a);
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
                case 58:
                    b = nzl.b(nyt, 58);
                    a = this.g == null ? 0 : this.g.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.g = obj;
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new krg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new krg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new krg();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
