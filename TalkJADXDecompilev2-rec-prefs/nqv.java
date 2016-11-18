package p000;

public final class nqv extends nyx<nqv> {
    public Boolean f30529a;

    public /* synthetic */ nzf m36201a(nyt nyt) {
        return m36200b(nyt);
    }

    public nqv() {
        this.f30529a = null;
        this.cachedSize = -1;
    }

    public void m36202a(nyu nyu) {
        if (this.f30529a != null) {
            nyu.m37172a(1, this.f30529a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36203b() {
        int b = super.b();
        if (this.f30529a == null) {
            return b;
        }
        this.f30529a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nqv m36200b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30529a = Boolean.valueOf(nyt.m37116i());
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
