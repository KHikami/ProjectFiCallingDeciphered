package p000;

public final class mzm extends nyx<mzm> {
    public Double f29253a;

    public /* synthetic */ nzf m33953a(nyt nyt) {
        return m33951b(nyt);
    }

    public mzm() {
        m33952d();
    }

    private mzm m33952d() {
        this.f29253a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33954a(nyu nyu) {
        if (this.f29253a != null) {
            nyu.m37166a(1, this.f29253a.doubleValue());
        }
        super.a(nyu);
    }

    protected int m33955b() {
        int b = super.b();
        if (this.f29253a == null) {
            return b;
        }
        this.f29253a.doubleValue();
        return b + (nyu.m37154h(1) + 8);
    }

    private mzm m33951b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29253a = Double.valueOf(nyt.m37104b());
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
