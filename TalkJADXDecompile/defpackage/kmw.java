package defpackage;

import nyt;
import nyu;

/* renamed from: kmw */
public final class kmw extends nyx<kmw> {
    public lfa a;
    public kmu apiHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kmw() {
        d();
    }

    private kmw d() {
        this.apiHeader = null;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.a != null) {
            return b + nyu.d(2, this.a);
        }
        return b;
    }

    private kmw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.apiHeader == null) {
                        this.apiHeader = new kmu();
                    }
                    nyt.a(this.apiHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new lfa();
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
