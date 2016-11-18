package p000;

public final class nqz extends nyx<nqz> {
    public String f30536a;
    public nra f30537b;

    public /* synthetic */ nzf m36217a(nyt nyt) {
        return m36216b(nyt);
    }

    public nqz() {
        this.f30536a = null;
        this.cachedSize = -1;
    }

    public void m36218a(nyu nyu) {
        if (this.f30536a != null) {
            nyu.m37170a(1, this.f30536a);
        }
        if (this.f30537b != null) {
            nyu.m37182b(2, this.f30537b);
        }
        super.a(nyu);
    }

    protected int m36219b() {
        int b = super.b();
        if (this.f30536a != null) {
            b += nyu.m37137b(1, this.f30536a);
        }
        if (this.f30537b != null) {
            return b + nyu.m37145d(2, this.f30537b);
        }
        return b;
    }

    private nqz m36216b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30536a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30537b == null) {
                        this.f30537b = new nra();
                    }
                    nyt.m37101a(this.f30537b);
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
