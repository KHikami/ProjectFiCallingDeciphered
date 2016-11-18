package p000;

public final class nzo extends nyx<nzo> {
    public String f31358a;
    public String f31359b;

    public /* synthetic */ nzf m37276a(nyt nyt) {
        return m37275b(nyt);
    }

    public nzo() {
        this.f31358a = null;
        this.f31359b = null;
        this.cachedSize = -1;
    }

    public void m37277a(nyu nyu) {
        nyu.m37170a(1, this.f31358a);
        nyu.m37170a(2, this.f31359b);
        super.a(nyu);
    }

    protected int m37278b() {
        return (super.b() + nyu.m37137b(1, this.f31358a)) + nyu.m37137b(2, this.f31359b);
    }

    private nzo m37275b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31358a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f31359b = nyt.m37117j();
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
