package defpackage;

import nyt;
import nyu;
import nzc;
import ofx;

/* renamed from: ktw */
public final class ktw extends nyx<ktw> {
    private static volatile ktw[] o;
    public String a;
    public String b;
    public String c;
    public kzl d;
    public kvp e;
    public ofx f;
    public String g;
    public Long h;
    public Long i;
    public kul j;
    public int k;
    public int l;
    public String m;
    public kvg n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ktw[] d() {
        if (o == null) {
            synchronized (nzc.c) {
                if (o == null) {
                    o = new ktw[0];
                }
            }
        }
        return o;
    }

    public ktw() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = nzf.UNSET_ENUM_VALUE;
        this.l = nzf.UNSET_ENUM_VALUE;
        this.m = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        nyu.a(3, this.g);
        if (this.j != null) {
            nyu.b(4, this.j);
        }
        if (this.k != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.k);
        }
        if (this.l != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.l);
        }
        if (this.m != null) {
            nyu.a(7, this.m);
        }
        if (this.n != null) {
            nyu.b(8, this.n);
        }
        if (this.c != null) {
            nyu.a(9, this.c);
        }
        if (this.h != null) {
            nyu.b(10, this.h.longValue());
        }
        if (this.i != null) {
            nyu.b(11, this.i.longValue());
        }
        if (this.d != null) {
            nyu.b(12, this.d);
        }
        if (this.e != null) {
            nyu.b(13, this.e);
        }
        if (this.f != null) {
            nyu.b(14, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b)) + nyu.b(3, this.g);
        if (this.j != null) {
            b += nyu.d(4, this.j);
        }
        if (this.k != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.k);
        }
        if (this.l != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(6, this.l);
        }
        if (this.m != null) {
            b += nyu.b(7, this.m);
        }
        if (this.n != null) {
            b += nyu.d(8, this.n);
        }
        if (this.c != null) {
            b += nyu.b(9, this.c);
        }
        if (this.h != null) {
            b += nyu.f(10, this.h.longValue());
        }
        if (this.i != null) {
            b += nyu.f(11, this.i.longValue());
        }
        if (this.d != null) {
            b += nyu.d(12, this.d);
        }
        if (this.e != null) {
            b += nyu.d(13, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(14, this.f);
        }
        return b;
    }

    private ktw b(nyt nyt) {
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
                    this.g = nyt.j();
                    continue;
                case 34:
                    if (this.j == null) {
                        this.j = new kul();
                    }
                    nyt.a(this.j);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.k = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.l = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.m = nyt.j();
                    continue;
                case 66:
                    if (this.n == null) {
                        this.n = new kvg();
                    }
                    nyt.a(this.n);
                    continue;
                case 74:
                    this.c = nyt.j();
                    continue;
                case 80:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.d == null) {
                        this.d = new kzl();
                    }
                    nyt.a(this.d);
                    continue;
                case 106:
                    if (this.e == null) {
                        this.e = new kvp();
                    }
                    nyt.a(this.e);
                    continue;
                case 114:
                    if (this.f == null) {
                        this.f = new ofx();
                    }
                    nyt.a(this.f);
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
