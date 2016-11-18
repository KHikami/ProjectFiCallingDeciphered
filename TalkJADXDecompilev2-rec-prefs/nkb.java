package p000;

public final class nkb extends nyx<nkb> {
    public String f30029a;

    public /* synthetic */ nzf m35320a(nyt nyt) {
        return m35318b(nyt);
    }

    public nkb() {
        m35319d();
    }

    private nkb m35319d() {
        this.f30029a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35321a(nyu nyu) {
        if (this.f30029a != null) {
            nyu.m37170a(1, this.f30029a);
        }
        super.a(nyu);
    }

    protected int m35322b() {
        int b = super.b();
        if (this.f30029a != null) {
            return b + nyu.m37137b(1, this.f30029a);
        }
        return b;
    }

    private nkb m35318b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30029a = nyt.m37117j();
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
