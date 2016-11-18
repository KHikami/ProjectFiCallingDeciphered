package p000;

public final class nre extends nyx<nre> {
    public Boolean f30582a;

    public /* synthetic */ nzf m36239a(nyt nyt) {
        return m36238b(nyt);
    }

    public nre() {
        this.f30582a = null;
        this.cachedSize = -1;
    }

    public void m36240a(nyu nyu) {
        if (this.f30582a != null) {
            nyu.m37172a(1, this.f30582a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36241b() {
        int b = super.b();
        if (this.f30582a == null) {
            return b;
        }
        this.f30582a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nre m36238b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30582a = Boolean.valueOf(nyt.m37116i());
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
