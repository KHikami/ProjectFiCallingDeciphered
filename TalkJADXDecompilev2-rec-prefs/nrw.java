package p000;

public final class nrw extends nyx<nrw> {
    public String f30625a;

    public /* synthetic */ nzf m36313a(nyt nyt) {
        return m36312b(nyt);
    }

    public nrw() {
        this.f30625a = null;
        this.cachedSize = -1;
    }

    public void m36314a(nyu nyu) {
        if (this.f30625a != null) {
            nyu.m37170a(1, this.f30625a);
        }
        super.a(nyu);
    }

    protected int m36315b() {
        int b = super.b();
        if (this.f30625a != null) {
            return b + nyu.m37137b(1, this.f30625a);
        }
        return b;
    }

    private nrw m36312b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30625a = nyt.m37117j();
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
