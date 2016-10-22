package defpackage;

import nyt;
import nyu;

/* renamed from: lqp */
public final class lqp extends nyx<lqp> {
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lqp() {
        d();
    }

    private lqp d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c.booleanValue());
        }
        if (this.a != null) {
            nyu.a(3, this.a);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.a != null) {
            b += nyu.b(3, this.a);
        }
        if (this.d == null) {
            return b;
        }
        this.d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lqp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.a = nyt.j();
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
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
