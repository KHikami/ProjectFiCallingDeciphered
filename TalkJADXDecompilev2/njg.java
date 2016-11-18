package defpackage;

public final class njg extends nyx<njg> {
    public ofv a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public njg() {
        d();
    }

    private njg d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.f(2, this.b.longValue());
        }
        return b;
    }

    private njg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new ofv();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
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
