package defpackage;

public final class mvh extends nyx<mvh> {
    public long a;
    public long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvh() {
        d();
    }

    private mvh d() {
        this.a = 0;
        this.b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.b(1, this.a);
        }
        if (this.b != 0) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (this.b != 0) {
            return b + nyu.f(2, this.b);
        }
        return b;
    }

    private mvh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = nyt.e();
                    continue;
                case 16:
                    this.b = nyt.e();
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
