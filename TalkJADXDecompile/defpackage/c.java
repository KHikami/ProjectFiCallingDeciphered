package defpackage;

import nyt;
import nyu;

/* renamed from: c */
public final class c extends nyx<c> {
    public d a;
    public String b;
    public String c;
    public Long d;
    public String e;
    public lma f;
    public llz g;
    public String h;
    public String i;
    public String j;
    public Long k;
    public String l;
    public String m;
    public Long n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public c() {
        d();
    }

    private c d() {
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
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.b(10, this.k.longValue());
        }
        if (this.l != null) {
            nyu.a(11, this.l);
        }
        if (this.g != null) {
            nyu.b(12, this.g);
        }
        if (this.m != null) {
            nyu.a(13, this.m);
        }
        if (this.n != null) {
            nyu.a(14, this.n.longValue());
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
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            b += nyu.f(10, this.k.longValue());
        }
        if (this.l != null) {
            b += nyu.b(11, this.l);
        }
        if (this.g != null) {
            b += nyu.d(12, this.g);
        }
        if (this.m != null) {
            b += nyu.b(13, this.m);
        }
        if (this.n != null) {
            return b + nyu.e(14, this.n.longValue());
        }
        return b;
    }

    private c b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new d();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new lma();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 80:
                    this.k = Long.valueOf(nyt.e());
                    continue;
                case 90:
                    this.l = nyt.j();
                    continue;
                case 98:
                    if (this.g == null) {
                        this.g = new llz();
                    }
                    nyt.a(this.g);
                    continue;
                case 106:
                    this.m = nyt.j();
                    continue;
                case 112:
                    this.n = Long.valueOf(nyt.d());
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
