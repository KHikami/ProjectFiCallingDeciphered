package p000;

public final class npr extends nyx<npr> {
    public npn f30448a;
    public npn f30449b;

    public /* synthetic */ nzf m36068a(nyt nyt) {
        return m36066b(nyt);
    }

    public npr() {
        m36067d();
    }

    private npr m36067d() {
        this.f30448a = null;
        this.f30449b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36069a(nyu nyu) {
        if (this.f30448a != null) {
            nyu.m37182b(4, this.f30448a);
        }
        if (this.f30449b != null) {
            nyu.m37182b(5, this.f30449b);
        }
        super.a(nyu);
    }

    protected int m36070b() {
        int b = super.b();
        if (this.f30448a != null) {
            b += nyu.m37145d(4, this.f30448a);
        }
        if (this.f30449b != null) {
            return b + nyu.m37145d(5, this.f30449b);
        }
        return b;
    }

    private npr m36066b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f30448a == null) {
                        this.f30448a = new npn();
                    }
                    nyt.m37101a(this.f30448a);
                    continue;
                case 42:
                    if (this.f30449b == null) {
                        this.f30449b = new npn();
                    }
                    nyt.m37101a(this.f30449b);
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
