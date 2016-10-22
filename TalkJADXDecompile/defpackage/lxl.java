package defpackage;

import nyt;
import nyu;

/* renamed from: lxl */
public final class lxl extends nyx<lxl> {
    public Integer a;
    public Long b;
    public Boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lxl() {
        d();
    }

    private lxl d() {
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(3, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(4, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(5, this.c.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(3, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(4, this.b.longValue());
        }
        if (this.c == null) {
            return b;
        }
        this.c.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private lxl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.c = Boolean.valueOf(nyt.i());
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
