package defpackage;

import nyt;
import nyu;

/* renamed from: lbm */
public final class lbm extends nyx<lbm> {
    public lbq a;
    public lbw b;
    public lbv c;
    public lbt d;
    public lbo e;
    public lbn f;
    public lbt g;
    public lbs h;
    public lbu i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbm() {
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.b(7, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.f != null) {
            nyu.b(10, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.d(7, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.f != null) {
            return b + nyu.d(10, this.f);
        }
        return b;
    }

    private lbm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lbq();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lbw();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new lbv();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new lbt();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new lbo();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new lbt();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    if (this.h == null) {
                        this.h = new lbs();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new lbu();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.f == null) {
                        this.f = new lbn();
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
