package p000;

public final class nsp extends nyx<nsp> {
    public nsr f30719a;

    public /* synthetic */ nzf m36391a(nyt nyt) {
        return m36390b(nyt);
    }

    public nsp() {
        this.cachedSize = -1;
    }

    public void m36392a(nyu nyu) {
        if (this.f30719a != null) {
            nyu.m37182b(2, this.f30719a);
        }
        super.a(nyu);
    }

    protected int m36393b() {
        int b = super.b();
        if (this.f30719a != null) {
            return b + nyu.m37145d(2, this.f30719a);
        }
        return b;
    }

    private nsp m36390b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f30719a == null) {
                        this.f30719a = new nsr();
                    }
                    nyt.m37101a(this.f30719a);
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
