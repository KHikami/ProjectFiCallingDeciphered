package p000;

public final class nsx extends nyx<nsx> {
    public nsy f30731a;

    public /* synthetic */ nzf m36424a(nyt nyt) {
        return m36423b(nyt);
    }

    public nsx() {
        this.cachedSize = -1;
    }

    public void m36425a(nyu nyu) {
        if (this.f30731a != null) {
            nyu.m37182b(2, this.f30731a);
        }
        super.a(nyu);
    }

    protected int m36426b() {
        int b = super.b();
        if (this.f30731a != null) {
            return b + nyu.m37145d(2, this.f30731a);
        }
        return b;
    }

    private nsx m36423b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f30731a == null) {
                        this.f30731a = new nsy();
                    }
                    nyt.m37101a(this.f30731a);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
