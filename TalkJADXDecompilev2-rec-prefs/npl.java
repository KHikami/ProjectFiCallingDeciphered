package p000;

public final class npl extends nyx<npl> {
    public Boolean f30439a;

    public /* synthetic */ nzf m36040a(nyt nyt) {
        return m36039b(nyt);
    }

    public npl() {
        this.f30439a = null;
        this.cachedSize = -1;
    }

    public void m36041a(nyu nyu) {
        if (this.f30439a != null) {
            nyu.m37172a(1, this.f30439a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36042b() {
        int b = super.b();
        if (this.f30439a == null) {
            return b;
        }
        this.f30439a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private npl m36039b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30439a = Boolean.valueOf(nyt.m37116i());
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
