package p000;

public final class njf extends nyx<njf> {
    public oga f29979a;

    public /* synthetic */ nzf m35208a(nyt nyt) {
        return m35206b(nyt);
    }

    public njf() {
        m35207d();
    }

    private njf m35207d() {
        this.f29979a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35209a(nyu nyu) {
        if (this.f29979a != null) {
            nyu.m37182b(1, this.f29979a);
        }
        super.a(nyu);
    }

    protected int m35210b() {
        int b = super.b();
        if (this.f29979a != null) {
            return b + nyu.m37145d(1, this.f29979a);
        }
        return b;
    }

    private njf m35206b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29979a == null) {
                        this.f29979a = new oga();
                    }
                    nyt.m37101a(this.f29979a);
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
