package p000;

public final class mvu extends nyx<mvu> {
    public long f28521a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33135b(nyt);
    }

    public mvu() {
        m33136d();
    }

    private mvu m33136d() {
        this.f28521a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28521a != 0) {
            nyu.b(1, this.f28521a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28521a != 0) {
            return b + nyu.f(1, this.f28521a);
        }
        return b;
    }

    private mvu m33135b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28521a = nyt.e();
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
