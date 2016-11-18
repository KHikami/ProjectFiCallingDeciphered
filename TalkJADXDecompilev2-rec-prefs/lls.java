package p000;

public final class lls extends nyx<lls> {
    public Integer f25402a;
    public Integer f25403b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29395b(nyt);
    }

    public lls() {
        m29396d();
    }

    private lls m29396d() {
        this.f25402a = null;
        this.f25403b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25402a.intValue());
        nyu.a(2, this.f25403b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f25402a.intValue())) + nyu.f(2, this.f25403b.intValue());
    }

    private lls m29395b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25402a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25403b = Integer.valueOf(nyt.f());
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
