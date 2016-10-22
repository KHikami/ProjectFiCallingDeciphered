package defpackage;

import nyt;
import nyu;

/* renamed from: lzq */
public final class lzq extends nyx<lzq> {
    public Integer a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lzq() {
        d();
    }

    private lzq d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.c(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.c(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.g(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.g(2, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.g(3, this.c.intValue());
        }
        return b;
    }

    private lzq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Integer.valueOf(nyt.l());
                    continue;
                case wi.dI /*16*/:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
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
