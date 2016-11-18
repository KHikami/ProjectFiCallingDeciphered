package p000;

public final class mzl extends nyx<mzl> {
    public Double f29252a;

    public /* synthetic */ nzf m33948a(nyt nyt) {
        return m33947b(nyt);
    }

    public mzl() {
        this.f29252a = null;
        this.cachedSize = -1;
    }

    public void m33949a(nyu nyu) {
        if (this.f29252a != null) {
            nyu.m37166a(1, this.f29252a.doubleValue());
        }
        super.a(nyu);
    }

    protected int m33950b() {
        int b = super.b();
        if (this.f29252a == null) {
            return b;
        }
        this.f29252a.doubleValue();
        return b + (nyu.m37154h(1) + 8);
    }

    private mzl m33947b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29252a = Double.valueOf(nyt.m37104b());
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
