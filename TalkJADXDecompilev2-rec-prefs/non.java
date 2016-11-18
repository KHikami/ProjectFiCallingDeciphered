package p000;

public final class non extends nyx<non> {
    public String f30386a;
    public noo f30387b;

    public /* synthetic */ nzf m35926a(nyt nyt) {
        return m35925b(nyt);
    }

    public non() {
        this.f30386a = null;
        this.cachedSize = -1;
    }

    public void m35927a(nyu nyu) {
        if (this.f30386a != null) {
            nyu.m37170a(1, this.f30386a);
        }
        if (this.f30387b != null) {
            nyu.m37182b(2, this.f30387b);
        }
        super.a(nyu);
    }

    protected int m35928b() {
        int b = super.b();
        if (this.f30386a != null) {
            b += nyu.m37137b(1, this.f30386a);
        }
        if (this.f30387b != null) {
            return b + nyu.m37145d(2, this.f30387b);
        }
        return b;
    }

    private non m35925b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30386a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30387b == null) {
                        this.f30387b = new noo();
                    }
                    nyt.m37101a(this.f30387b);
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
