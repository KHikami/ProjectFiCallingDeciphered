package p000;

public final class mwi extends nyx<mwi> {
    public Integer f28591a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33205b(nyt);
    }

    public mwi() {
        this.f28591a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28591a != null) {
            nyu.a(1, this.f28591a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28591a != null) {
            return b + nyu.f(1, this.f28591a.intValue());
        }
        return b;
    }

    private mwi m33205b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28591a = Integer.valueOf(nyt.f());
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
