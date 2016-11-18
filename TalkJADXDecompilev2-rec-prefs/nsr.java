package p000;

public final class nsr extends nyx<nsr> {
    public Boolean f30721a;

    public /* synthetic */ nzf m36399a(nyt nyt) {
        return m36398b(nyt);
    }

    public nsr() {
        this.f30721a = null;
        this.cachedSize = -1;
    }

    public void m36400a(nyu nyu) {
        if (this.f30721a != null) {
            nyu.m37172a(1, this.f30721a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36401b() {
        int b = super.b();
        if (this.f30721a == null) {
            return b;
        }
        this.f30721a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nsr m36398b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30721a = Boolean.valueOf(nyt.m37116i());
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
