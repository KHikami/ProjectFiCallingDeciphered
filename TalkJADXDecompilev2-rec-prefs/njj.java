package p000;

public final class njj extends nyx<njj> {
    public Boolean f29989a;

    public /* synthetic */ nzf m35229a(nyt nyt) {
        return m35227b(nyt);
    }

    public njj() {
        m35228d();
    }

    private njj m35228d() {
        this.f29989a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35230a(nyu nyu) {
        if (this.f29989a != null) {
            nyu.m37172a(1, this.f29989a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35231b() {
        int b = super.b();
        if (this.f29989a == null) {
            return b;
        }
        this.f29989a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private njj m35227b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29989a = Boolean.valueOf(nyt.m37116i());
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
