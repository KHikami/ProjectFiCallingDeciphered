package p000;

public final class ndc extends nyx<ndc> {
    public Boolean f29548a;

    public /* synthetic */ nzf m34395a(nyt nyt) {
        return m34394b(nyt);
    }

    public ndc() {
        this.f29548a = null;
        this.cachedSize = -1;
    }

    public void m34396a(nyu nyu) {
        if (this.f29548a != null) {
            nyu.m37172a(1, this.f29548a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34397b() {
        int b = super.b();
        if (this.f29548a == null) {
            return b;
        }
        this.f29548a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndc m34394b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29548a = Boolean.valueOf(nyt.m37116i());
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
