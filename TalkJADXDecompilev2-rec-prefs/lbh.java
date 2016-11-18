package p000;

public final class lbh extends nyx<lbh> {
    public Integer f24473a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28466b(nyt);
    }

    public lbh() {
        m28467d();
    }

    private lbh m28467d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24473a != null) {
            nyu.a(1, this.f24473a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24473a != null) {
            return b + nyu.f(1, this.f24473a.intValue());
        }
        return b;
    }

    private lbh m28466b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.f24473a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
