package defpackage;

import nyt;
import nyu;

/* renamed from: lqk */
public final class lqk extends nyx<lqk> {
    public Long a;
    public byte[] b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lqk() {
        d();
    }

    private lqk d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(1, this.c);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.a != null) {
            nyu.a(3, this.a.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.b(1, this.c);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.a != null) {
            return b + nyu.e(3, this.a.longValue());
        }
        return b;
    }

    private lqk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.c = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.a = Long.valueOf(nyt.d());
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
