package p000;

public final class nup extends nyx<nup> {
    public Boolean f30961a;

    public /* synthetic */ nzf m36626a(nyt nyt) {
        return m36624b(nyt);
    }

    public nup() {
        m36625d();
    }

    private nup m36625d() {
        this.f30961a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36627a(nyu nyu) {
        if (this.f30961a != null) {
            nyu.m37172a(1, this.f30961a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36628b() {
        int b = super.b();
        if (this.f30961a == null) {
            return b;
        }
        this.f30961a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nup m36624b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30961a = Boolean.valueOf(nyt.m37116i());
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
