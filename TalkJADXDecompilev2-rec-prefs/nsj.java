package p000;

public final class nsj extends nyx<nsj> {
    public Boolean f30704a;
    public not f30705b;

    public /* synthetic */ nzf m36367a(nyt nyt) {
        return m36366b(nyt);
    }

    public nsj() {
        this.f30704a = null;
        this.cachedSize = -1;
    }

    public void m36368a(nyu nyu) {
        if (this.f30705b != null) {
            nyu.m37182b(3, this.f30705b);
        }
        if (this.f30704a != null) {
            nyu.m37172a(4, this.f30704a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36369b() {
        int b = super.b();
        if (this.f30705b != null) {
            b += nyu.m37145d(3, this.f30705b);
        }
        if (this.f30704a == null) {
            return b;
        }
        this.f30704a.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private nsj m36366b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dx /*26*/:
                    if (this.f30705b == null) {
                        this.f30705b = new not();
                    }
                    nyt.m37101a(this.f30705b);
                    continue;
                case 32:
                    this.f30704a = Boolean.valueOf(nyt.m37116i());
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
