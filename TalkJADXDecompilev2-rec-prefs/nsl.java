package p000;

public final class nsl extends nyx<nsl> {
    public String f30712a;
    public String f30713b;

    public /* synthetic */ nzf m36375a(nyt nyt) {
        return m36374b(nyt);
    }

    public nsl() {
        this.f30712a = null;
        this.f30713b = null;
        this.cachedSize = -1;
    }

    public void m36376a(nyu nyu) {
        if (this.f30712a != null) {
            nyu.m37170a(1, this.f30712a);
        }
        if (this.f30713b != null) {
            nyu.m37170a(2, this.f30713b);
        }
        super.a(nyu);
    }

    protected int m36377b() {
        int b = super.b();
        if (this.f30712a != null) {
            b += nyu.m37137b(1, this.f30712a);
        }
        if (this.f30713b != null) {
            return b + nyu.m37137b(2, this.f30713b);
        }
        return b;
    }

    private nsl m36374b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30712a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30713b = nyt.m37117j();
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
