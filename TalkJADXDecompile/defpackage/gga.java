package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: gga */
public final class gga extends nzf {
    private static volatile gga[] j;
    public gfy a;
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public gfz h;
    public boolean i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static gga[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new gga[0];
                }
            }
        }
        return j;
    }

    public gga() {
        e();
    }

    private gga e() {
        this.a = null;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = null;
        this.i = false;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (this.c != 0) {
            nyu.b(3, this.c);
        }
        if (this.d != 0) {
            nyu.b(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(5, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            nyu.a(6, this.f);
        }
        if (this.g != 0) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i) {
            nyu.a(9, this.i);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (this.c != 0) {
            b += nyu.f(3, this.c);
        }
        if (this.d != 0) {
            b += nyu.f(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            b += nyu.b(5, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            b += nyu.b(6, this.f);
        }
        if (this.g != 0) {
            b += nyu.f(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (!this.i) {
            return b;
        }
        boolean z = this.i;
        return b + (nyu.h(9) + 1);
    }

    private gga b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new gfy();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.e();
                    continue;
                case 32:
                    this.d = nyt.e();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.g = nyt.f();
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new gfz();
                    }
                    nyt.a(this.h);
                    continue;
                case 72:
                    this.i = nyt.i();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
