package defpackage;

import nyt;
import nyu;

/* renamed from: kqk */
public final class kqk extends nyx<kqk> {
    public kqd a;
    public Float b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kqk() {
        d();
    }

    private kqk d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        nyu.a(2, this.b.floatValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        this.b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private kqk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new kqd();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.f /*21*/:
                    this.b = Float.valueOf(nyt.c());
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
