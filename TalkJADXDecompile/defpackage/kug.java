package defpackage;

import nyt;
import nyu;

/* renamed from: kug */
public final class kug extends nyx<kug> {
    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kug() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.doubleValue());
        nyu.a(2, this.b.doubleValue());
        nyu.a(3, this.c.doubleValue());
        nyu.a(4, this.d.doubleValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.doubleValue();
        b += nyu.h(1) + 8;
        this.b.doubleValue();
        b += nyu.h(2) + 8;
        this.c.doubleValue();
        b += nyu.h(3) + 8;
        this.d.doubleValue();
        return b + (nyu.h(4) + 8);
    }

    private kug b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.n /*9*/:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.d = Double.valueOf(nyt.b());
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
