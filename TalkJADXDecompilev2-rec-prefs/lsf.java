package p000;

public final class lsf extends nyx<lsf> {
    public muu f26306a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30291b(nyt);
    }

    public lsf() {
        m30292d();
    }

    private lsf m30292d() {
        this.f26306a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26306a != null) {
            nyu.b(1, this.f26306a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26306a != null) {
            return b + nyu.d(1, this.f26306a);
        }
        return b;
    }

    private lsf m30291b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26306a == null) {
                        this.f26306a = new muu();
                    }
                    nyt.a(this.f26306a);
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
