package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: kjx */
public final class kjx extends nyx<kjx> {
    private static volatile kjx[] i;
    public klk a;
    public String b;
    public String c;
    public String d;
    public String e;
    public kka[] f;
    public kjy[] g;
    public kmj h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kjx[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new kjx[0];
                }
            }
        }
        return i;
    }

    public kjx() {
        g();
    }

    private kjx g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = kka.d();
        this.g = kjy.d();
        this.h = null;
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
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(6, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                nzf nzf2 = this.g[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.h != null) {
            nyu.b(8, this.h);
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
        if (this.f != null && this.f.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null) {
            b += nyu.b(6, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                nzf nzf2 = this.g[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.h != null) {
            return b + nyu.d(8, this.h);
        }
        return b;
    }

    private kjx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new klk();
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
                    b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new kka[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kka();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kka();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 50:
                    this.e = nyt.j();
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new kjy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjy();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new kmj();
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
