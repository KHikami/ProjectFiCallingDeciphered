package p000;

public final class lbc extends nyx<lbc> {
    public ldm f24458a;
    public lbe f24459b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28441b(nyt);
    }

    public lbc() {
        m28442d();
    }

    private lbc m28442d() {
        this.f24458a = null;
        this.f24459b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24458a != null) {
            nyu.b(1, this.f24458a);
        }
        if (this.f24459b != null) {
            nyu.b(2, this.f24459b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24458a != null) {
            b += nyu.d(1, this.f24458a);
        }
        if (this.f24459b != null) {
            return b + nyu.d(2, this.f24459b);
        }
        return b;
    }

    private lbc m28441b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24458a == null) {
                        this.f24458a = new ldm();
                    }
                    nyt.a(this.f24458a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24459b == null) {
                        this.f24459b = new lbe();
                    }
                    nyt.a(this.f24459b);
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
