package defpackage;

import nyt;
import nyu;

/* renamed from: muf */
public final class muf extends nyx<muf> {
    public mug a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public muf() {
        d();
    }

    private muf d() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(15, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.d(15, this.a);
        }
        return b;
    }

    private muf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 122:
                    if (this.a == null) {
                        this.a = new mug();
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
