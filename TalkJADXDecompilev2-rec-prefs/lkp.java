package p000;

public final class lkp extends nyx<lkp> {
    public Integer f25177a;
    public Long f25178b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29243b(nyt);
    }

    public lkp() {
        m29244d();
    }

    private lkp m29244d() {
        this.f25178b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25177a != null) {
            nyu.a(1, this.f25177a.intValue());
        }
        if (this.f25178b != null) {
            nyu.b(2, this.f25178b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25177a != null) {
            b += nyu.f(1, this.f25177a.intValue());
        }
        if (this.f25178b != null) {
            return b + nyu.f(2, this.f25178b.longValue());
        }
        return b;
    }

    private lkp m29243b(nyt nyt) {
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
                            this.f25177a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25178b = Long.valueOf(nyt.e());
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
