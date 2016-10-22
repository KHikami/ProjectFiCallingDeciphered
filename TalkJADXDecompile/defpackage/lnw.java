package defpackage;

import nyt;
import nyu;

/* renamed from: lnw */
public final class lnw extends nyx<lnw> {
    public String a;
    public Long b;
    public Long c;
    public Long d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnw() {
        d();
    }

    private lnw d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.e(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.e(3, this.c.longValue());
        }
        if (this.d != null) {
            return b + nyu.e(4, this.d.longValue());
        }
        return b;
    }

    private lnw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.d());
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
