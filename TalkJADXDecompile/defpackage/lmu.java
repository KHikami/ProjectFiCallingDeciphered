package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lmu */
public final class lmu extends nyx<lmu> {
    public lna[] a;
    public Integer b;
    public String c;
    public String[] d;
    public String e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public String n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lmu() {
        this.a = lna.d();
        this.b = null;
        this.c = null;
        this.d = nzl.f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                String str = this.d[i];
                if (str != null) {
                    nyu.a(3, str);
                }
                i++;
            }
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.h != null) {
            nyu.a(7, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(8, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(9, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(10, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(11, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(12, this.m.intValue());
        }
        if (this.n != null) {
            nyu.a(13, this.n);
        }
        if (this.b != null) {
            nyu.a(14, this.b.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.d.length) {
                String str = this.d[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.f(7, this.h.intValue());
        }
        if (this.i != null) {
            b += nyu.f(8, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(9, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.f(10, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(11, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.f(12, this.m.intValue());
        }
        if (this.n != null) {
            b += nyu.b(13, this.n);
        }
        if (this.b != null) {
            return b + nyu.f(14, this.b.intValue());
        }
        return b;
    }

    private lmu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new lna[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lna();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lna();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
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
                case 34:
                    this.e = nyt.j();
                    continue;
                case 40:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.h = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    this.j = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 88:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.m = Integer.valueOf(nyt.f());
                    continue;
                case 106:
                    this.n = nyt.j();
                    continue;
                case 112:
                    this.b = Integer.valueOf(nyt.f());
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
