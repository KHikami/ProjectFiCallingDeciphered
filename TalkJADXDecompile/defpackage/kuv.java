package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: kuv */
public final class kuv extends nyx<kuv> {
    private static volatile kuv[] l;
    public String a;
    public String b;
    public String[] c;
    public String d;
    public ksl e;
    public String f;
    public ksu g;
    public kuu h;
    public Boolean i;
    public kuv[] j;
    public Integer k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kuv[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new kuv[0];
                }
            }
        }
        return l;
    }

    public kuv() {
        g();
    }

    private kuv g() {
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = kuv.d();
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
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.i != null) {
            nyu.a(7, this.i.booleanValue());
        }
        if (this.j != null && this.j.length > 0) {
            while (i < this.j.length) {
                nzf nzf = this.j[i];
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
                i++;
            }
        }
        if (this.k != null) {
            nyu.a(9, this.k.intValue());
        }
        if (this.g != null) {
            nyu.b(10, this.g);
        }
        if (this.h != null) {
            nyu.b(11, this.h);
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
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.c) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.j != null && this.j.length > 0) {
            while (i < this.j.length) {
                nzf nzf = this.j[i];
                if (nzf != null) {
                    b += nyu.d(8, nzf);
                }
                i++;
            }
        }
        if (this.k != null) {
            b += nyu.f(9, this.k.intValue());
        }
        if (this.g != null) {
            b += nyu.d(10, this.g);
        }
        if (this.h != null) {
            return b + nyu.d(11, this.h);
        }
        return b;
    }

    private kuv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ksl();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new kuv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuv();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case 100:
                        case 101:
                        case 110:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.g == null) {
                        this.g = new ksu();
                    }
                    nyt.a(this.g);
                    continue;
                case 90:
                    if (this.h == null) {
                        this.h = new kuu();
                    }
                    nyt.a(this.h);
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
