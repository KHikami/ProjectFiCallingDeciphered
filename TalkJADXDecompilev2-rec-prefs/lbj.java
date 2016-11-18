package p000;

public final class lbj extends nyx<lbj> {
    public Boolean f24477a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28476b(nyt);
    }

    public lbj() {
        m28477d();
    }

    private lbj m28477d() {
        this.f24477a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24477a.booleanValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f24477a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private lbj m28476b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24477a = Boolean.valueOf(nyt.i());
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
