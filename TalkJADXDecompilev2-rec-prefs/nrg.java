package p000;

public final class nrg extends nyx<nrg> {
    public String f30584a;

    public /* synthetic */ nzf m36247a(nyt nyt) {
        return m36246b(nyt);
    }

    public nrg() {
        this.f30584a = null;
        this.cachedSize = -1;
    }

    public void m36248a(nyu nyu) {
        if (this.f30584a != null) {
            nyu.m37170a(1, this.f30584a);
        }
        super.a(nyu);
    }

    protected int m36249b() {
        int b = super.b();
        if (this.f30584a != null) {
            return b + nyu.m37137b(1, this.f30584a);
        }
        return b;
    }

    private nrg m36246b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30584a = nyt.m37117j();
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
