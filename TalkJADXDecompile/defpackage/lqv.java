package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: lqv */
public final class lqv extends nyx<lqv> {
    private static volatile lqv[] d;
    public ltr a;
    public lor b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lqv[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new lqv[0];
                }
            }
        }
        return d;
    }

    public lqv() {
        g();
    }

    private lqv g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.b != null) {
            return b + nyu.d(3, this.b);
        }
        return b;
    }

    private lqv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new ltr();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lor();
                    }
                    nyt.a(this.b);
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
