package defpackage;

public final class oqr extends nyx<oqr> {
    public Integer a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqr() {
        d();
    }

    private oqr d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.d(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.d(2, this.b.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.intValue();
            b += nyu.h(1) + 4;
        }
        if (this.b == null) {
            return b;
        }
        this.b.intValue();
        return b + (nyu.h(2) + 4);
    }

    private oqr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Integer.valueOf(nyt.n());
                    continue;
                case 21:
                    this.b = Integer.valueOf(nyt.n());
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
