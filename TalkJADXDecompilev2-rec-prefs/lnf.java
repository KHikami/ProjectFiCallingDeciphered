package p000;

public final class lnf extends nyx<lnf> {
    public mwb f25761a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29592b(nyt);
    }

    public lnf() {
        m29593d();
    }

    private lnf m29593d() {
        this.f25761a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25761a != null) {
            nyu.b(1, this.f25761a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25761a != null) {
            return b + nyu.d(1, this.f25761a);
        }
        return b;
    }

    private lnf m29592b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25761a == null) {
                        this.f25761a = new mwb();
                    }
                    nyt.a(this.f25761a);
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
