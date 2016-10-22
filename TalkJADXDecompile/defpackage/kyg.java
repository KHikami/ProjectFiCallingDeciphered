package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: kyg */
public final class kyg extends nyx<kyg> {
    public Integer a;
    public Integer b;
    public Float c;
    public Float d;
    public String e;
    public String f;
    public String g;
    public String h;
    public kyh i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Boolean n;
    public Double o;
    public Boolean p;
    public String q;
    public kyn[] r;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kyg() {
        d();
    }

    private kyg d() {
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
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = kyn.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(1, this.c.floatValue());
        }
        if (this.d != null) {
            nyu.a(2, this.d.floatValue());
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.i != null) {
            nyu.b(7, this.i);
        }
        if (this.j != null) {
            nyu.a(8, this.j);
        }
        if (this.k != null) {
            nyu.a(9, this.k);
        }
        if (this.l != null) {
            nyu.a(10, this.l);
        }
        if (this.m != null) {
            nyu.a(11, this.m);
        }
        if (this.n != null) {
            nyu.a(12, this.n.booleanValue());
        }
        if (this.o != null) {
            nyu.a(13, this.o.doubleValue());
        }
        if (this.a != null) {
            nyu.a(14, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(15, this.b.intValue());
        }
        if (this.p != null) {
            nyu.a(16, this.p.booleanValue());
        }
        if (this.q != null) {
            nyu.a(17, this.q);
        }
        if (this.r != null && this.r.length > 0) {
            for (nzf nzf : this.r) {
                if (nzf != null) {
                    nyu.b(18, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            this.c.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.i != null) {
            b += nyu.d(7, this.i);
        }
        if (this.j != null) {
            b += nyu.b(8, this.j);
        }
        if (this.k != null) {
            b += nyu.b(9, this.k);
        }
        if (this.l != null) {
            b += nyu.b(10, this.l);
        }
        if (this.m != null) {
            b += nyu.b(11, this.m);
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.o != null) {
            this.o.doubleValue();
            b += nyu.h(13) + 8;
        }
        if (this.a != null) {
            b += nyu.f(14, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(15, this.b.intValue());
        }
        if (this.p != null) {
            this.p.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.q != null) {
            b += nyu.b(17, this.q);
        }
        if (this.r == null || this.r.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.r) {
            if (nzf != null) {
                i += nyu.d(18, nzf);
            }
        }
        return i;
    }

    private kyg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dD /*13*/:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case wi.f /*21*/:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 58:
                    if (this.i == null) {
                        this.i = new kyh();
                    }
                    nyt.a(this.i);
                    continue;
                case 66:
                    this.j = nyt.j();
                    continue;
                case 74:
                    this.k = nyt.j();
                    continue;
                case 82:
                    this.l = nyt.j();
                    continue;
                case 90:
                    this.m = nyt.j();
                    continue;
                case 96:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 105:
                    this.o = Double.valueOf(nyt.b());
                    continue;
                case 112:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 120:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    this.p = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    this.q = nyt.j();
                    continue;
                case 146:
                    int b = nzl.b(nyt, 146);
                    if (this.r == null) {
                        a = 0;
                    } else {
                        a = this.r.length;
                    }
                    Object obj = new kyn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyn();
                    nyt.a(obj[a]);
                    this.r = obj;
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
