package p000;

public final class npg extends nyx<npg> {
    public String f30430a;

    public /* synthetic */ nzf m36020a(nyt nyt) {
        return m36019b(nyt);
    }

    public npg() {
        this.f30430a = null;
        this.cachedSize = -1;
    }

    public void m36021a(nyu nyu) {
        if (this.f30430a != null) {
            nyu.m37170a(1, this.f30430a);
        }
        super.a(nyu);
    }

    protected int m36022b() {
        int b = super.b();
        if (this.f30430a != null) {
            return b + nyu.m37137b(1, this.f30430a);
        }
        return b;
    }

    private npg m36019b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30430a = nyt.m37117j();
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
