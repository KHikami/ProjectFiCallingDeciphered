package p000;

public final class nrt extends nyx<nrt> {
    public Boolean f30619a;

    public /* synthetic */ nzf m36301a(nyt nyt) {
        return m36300b(nyt);
    }

    public nrt() {
        this.f30619a = null;
        this.cachedSize = -1;
    }

    public void m36302a(nyu nyu) {
        if (this.f30619a != null) {
            nyu.m37172a(1, this.f30619a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36303b() {
        int b = super.b();
        if (this.f30619a == null) {
            return b;
        }
        this.f30619a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nrt m36300b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30619a = Boolean.valueOf(nyt.m37116i());
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
