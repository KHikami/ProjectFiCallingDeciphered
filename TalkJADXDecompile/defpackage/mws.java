package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: mws */
public final class mws extends nyx<mws> {
    private static volatile mws[] e;
    public mwp a;
    public Long b;
    public Float c;
    public Float d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mws[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new mws[0];
                }
            }
        }
        return e;
    }

    public mws() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d.floatValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.c == null) {
            return b;
        }
        this.c.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mws b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new mwp();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case 29:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.c = Float.valueOf(nyt.c());
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
