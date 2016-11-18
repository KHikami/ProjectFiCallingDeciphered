package p000;

public final class nfe extends nyx<nfe> {
    public Boolean f29657a;

    public /* synthetic */ nzf m34658a(nyt nyt) {
        return m34656b(nyt);
    }

    public nfe() {
        m34657d();
    }

    private nfe m34657d() {
        this.f29657a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34659a(nyu nyu) {
        if (this.f29657a != null) {
            nyu.m37172a(1, this.f29657a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34660b() {
        int b = super.b();
        if (this.f29657a == null) {
            return b;
        }
        this.f29657a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfe m34656b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29657a = Boolean.valueOf(nyt.m37116i());
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
