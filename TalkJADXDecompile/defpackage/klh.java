package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: klh */
public final class klh extends nyx<klh> {
    private static volatile klh[] r;
    public klk a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public String k;
    public String l;
    public Long m;
    public Long n;
    public Boolean o;
    public Long p;
    public Long q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static klh[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new klh[0];
                }
            }
        }
        return r;
    }

    public klh() {
        g();
    }

    private klh g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
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
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.j != null) {
            nyu.a(10, this.j.intValue());
        }
        if (this.m != null) {
            nyu.b(11, this.m.longValue());
        }
        if (this.n != null) {
            nyu.b(12, this.n.longValue());
        }
        if (this.o != null) {
            nyu.a(13, this.o.booleanValue());
        }
        if (this.p != null) {
            nyu.b(14, this.p.longValue());
        }
        if (this.q != null) {
            nyu.b(15, this.q.longValue());
        }
        if (this.k != null) {
            nyu.a(16, this.k);
        }
        if (this.l != null) {
            nyu.a(17, this.l);
        }
        super.a(nyu);
    }

    protected int b() {
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
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.intValue());
        }
        if (this.m != null) {
            b += nyu.f(11, this.m.longValue());
        }
        if (this.n != null) {
            b += nyu.f(12, this.n.longValue());
        }
        if (this.o != null) {
            this.o.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.p != null) {
            b += nyu.f(14, this.p.longValue());
        }
        if (this.q != null) {
            b += nyu.f(15, this.q.longValue());
        }
        if (this.k != null) {
            b += nyu.b(16, this.k);
        }
        if (this.l != null) {
            return b + nyu.b(17, this.l);
        }
        return b;
    }

    private klh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
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
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    this.m = Long.valueOf(nyt.e());
                    continue;
                case 96:
                    this.n = Long.valueOf(nyt.e());
                    continue;
                case 104:
                    this.o = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.p = Long.valueOf(nyt.e());
                    continue;
                case 120:
                    this.q = Long.valueOf(nyt.e());
                    continue;
                case 130:
                    this.k = nyt.j();
                    continue;
                case 138:
                    this.l = nyt.j();
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
