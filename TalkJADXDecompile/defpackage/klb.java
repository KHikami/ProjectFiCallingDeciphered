package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: klb */
public final class klb extends nyx<klb> {
    private static volatile klb[] p;
    public klk a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static klb[] d() {
        if (p == null) {
            synchronized (nzc.c) {
                if (p == null) {
                    p = new klb[0];
                }
            }
        }
        return p;
    }

    public klb() {
        g();
    }

    private klb g() {
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
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.a(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.k != null) {
            nyu.a(9, this.k);
        }
        if (this.l != null) {
            nyu.a(10, this.l);
        }
        if (this.n != null) {
            nyu.a(11, this.n);
        }
        if (this.o != null) {
            nyu.a(12, this.o);
        }
        if (this.c != null) {
            nyu.a(13, this.c);
        }
        if (this.j != null) {
            nyu.a(14, this.j);
        }
        if (this.m != null) {
            nyu.a(15, this.m);
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
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            b += nyu.b(6, this.g);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.k != null) {
            b += nyu.b(9, this.k);
        }
        if (this.l != null) {
            b += nyu.b(10, this.l);
        }
        if (this.n != null) {
            b += nyu.b(11, this.n);
        }
        if (this.o != null) {
            b += nyu.b(12, this.o);
        }
        if (this.c != null) {
            b += nyu.b(13, this.c);
        }
        if (this.j != null) {
            b += nyu.b(14, this.j);
        }
        if (this.m != null) {
            return b + nyu.b(15, this.m);
        }
        return b;
    }

    private klb b(nyt nyt) {
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
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    this.g = nyt.j();
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.k = nyt.j();
                    continue;
                case 82:
                    this.l = nyt.j();
                    continue;
                case 90:
                    this.n = nyt.j();
                    continue;
                case 98:
                    this.o = nyt.j();
                    continue;
                case 106:
                    this.c = nyt.j();
                    continue;
                case 114:
                    this.j = nyt.j();
                    continue;
                case 122:
                    this.m = nyt.j();
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
