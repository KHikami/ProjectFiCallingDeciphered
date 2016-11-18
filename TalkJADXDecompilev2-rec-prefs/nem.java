package p000;

public final class nem extends nyx<nem> {
    public nen f29615a;

    public /* synthetic */ nzf m34568a(nyt nyt) {
        return m34566b(nyt);
    }

    public nem() {
        m34567d();
    }

    private nem m34567d() {
        this.f29615a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34569a(nyu nyu) {
        if (this.f29615a != null) {
            nyu.m37182b(1, this.f29615a);
        }
        super.a(nyu);
    }

    protected int m34570b() {
        int b = super.b();
        if (this.f29615a != null) {
            return b + nyu.m37145d(1, this.f29615a);
        }
        return b;
    }

    private nem m34566b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29615a == null) {
                        this.f29615a = new nen();
                    }
                    nyt.m37101a(this.f29615a);
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
