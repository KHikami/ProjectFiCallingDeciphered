package p000;

public final class ldu extends nyx<ldu> {
    public Integer f24724a;
    public String f24725b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28792b(nyt);
    }

    public ldu() {
        m28793d();
    }

    private ldu m28793d() {
        this.f24725b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24724a != null) {
            nyu.a(1, this.f24724a.intValue());
        }
        if (this.f24725b != null) {
            nyu.a(2, this.f24725b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24724a != null) {
            b += nyu.f(1, this.f24724a.intValue());
        }
        if (this.f24725b != null) {
            return b + nyu.b(2, this.f24725b);
        }
        return b;
    }

    private ldu m28792b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                            this.f24724a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24725b = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
