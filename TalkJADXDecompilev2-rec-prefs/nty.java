package p000;

public final class nty extends nyx<nty> {
    public Boolean f30801a;

    public /* synthetic */ nzf m36541a(nyt nyt) {
        return m36540b(nyt);
    }

    public nty() {
        this.f30801a = null;
        this.cachedSize = -1;
    }

    public void m36542a(nyu nyu) {
        if (this.f30801a != null) {
            nyu.m37172a(1, this.f30801a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36543b() {
        int b = super.b();
        if (this.f30801a == null) {
            return b;
        }
        this.f30801a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nty m36540b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30801a = Boolean.valueOf(nyt.m37116i());
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
