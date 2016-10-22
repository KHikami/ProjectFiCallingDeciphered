package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: lzy */
public final class lzy extends nyx<lzy> {
    private static volatile lzy[] g;
    public String a;
    public lzt[] b;
    public lzt[] c;
    public mas[] d;
    public String[] e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lzy[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new lzy[0];
                }
            }
        }
        return g;
    }

    public lzy() {
        g();
    }

    private lzy g() {
        this.a = null;
        this.b = lzt.d();
        this.c = lzt.d();
        this.d = mas.d();
        this.e = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf22 : this.d) {
                if (nzf22 != null) {
                    nyu.b(5, nzf22);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                String str = this.e[i];
                if (str != null) {
                    nyu.a(6, str);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.a(7, this.f.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    i += nyu.d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf22 : this.d) {
                if (nzf22 != null) {
                    i += nyu.d(5, nzf22);
                }
            }
            b = i;
        }
        if (this.e != null && this.e.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.e.length) {
                String str = this.e[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f != null) {
            return b + nyu.f(7, this.f.intValue());
        }
        return b;
    }

    private lzy b(nyt nyt) {
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
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new lzt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzt();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lzt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzt();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new mas[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mas();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mas();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.f = Integer.valueOf(a);
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
