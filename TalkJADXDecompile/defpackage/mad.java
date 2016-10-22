package defpackage;

import nyt;
import nyu;

/* renamed from: mad */
public final class mad extends nyx<mad> {
    public Boolean a;
    public String b;
    public Float c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mad() {
        d();
    }

    private mad d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.booleanValue());
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.booleanValue();
        b += nyu.h(1) + 1;
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c == null) {
            return b;
        }
        this.c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private mad b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case 29:
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
