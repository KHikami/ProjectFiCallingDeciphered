package defpackage;

import nyt;
import nyu;

/* renamed from: lql */
public final class lql extends nyx<lql> {
    public lqg a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lql() {
        d();
    }

    private lql d() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.d(1, this.a);
        }
        return b;
    }

    private lql b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lqg();
                    }
                    nyt.a(this.a);
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
