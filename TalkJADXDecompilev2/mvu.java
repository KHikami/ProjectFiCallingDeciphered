package defpackage;

public final class mvu extends nyx<mvu> {
    public long a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvu() {
        d();
    }

    private mvu d() {
        this.a = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.b(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            return b + nyu.f(1, this.a);
        }
        return b;
    }

    private mvu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = nyt.e();
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
