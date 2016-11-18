package p000;

public final class nqh extends nyx<nqh> {
    public Boolean f30490a;

    public /* synthetic */ nzf m36143a(nyt nyt) {
        return m36142b(nyt);
    }

    public nqh() {
        this.f30490a = null;
        this.cachedSize = -1;
    }

    public void m36144a(nyu nyu) {
        if (this.f30490a != null) {
            nyu.m37172a(1, this.f30490a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36145b() {
        int b = super.b();
        if (this.f30490a == null) {
            return b;
        }
        this.f30490a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nqh m36142b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30490a = Boolean.valueOf(nyt.m37116i());
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
