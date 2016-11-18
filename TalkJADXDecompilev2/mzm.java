package defpackage;

public final class mzm extends nyx<mzm> {
    public Double a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mzm() {
        d();
    }

    private mzm d() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.doubleValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a == null) {
            return b;
        }
        this.a.doubleValue();
        return b + (nyu.h(1) + 8);
    }

    private mzm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Double.valueOf(nyt.b());
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
