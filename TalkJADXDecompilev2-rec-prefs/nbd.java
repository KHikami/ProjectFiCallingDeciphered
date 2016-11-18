package p000;

public final class nbd extends nyx<nbd> {
    public String f29418a;
    public Integer f29419b;

    public /* synthetic */ nzf m34156a(nyt nyt) {
        return m34154b(nyt);
    }

    public nbd() {
        m34155d();
    }

    private nbd m34155d() {
        this.f29418a = null;
        this.f29419b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34157a(nyu nyu) {
        if (this.f29418a != null) {
            nyu.m37170a(1, this.f29418a);
        }
        if (this.f29419b != null) {
            nyu.m37168a(2, this.f29419b.intValue());
        }
        super.a(nyu);
    }

    protected int m34158b() {
        int b = super.b();
        if (this.f29418a != null) {
            b += nyu.m37137b(1, this.f29418a);
        }
        if (this.f29419b != null) {
            return b + nyu.m37147f(2, this.f29419b.intValue());
        }
        return b;
    }

    private nbd m34154b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29418a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29419b = Integer.valueOf(nyt.m37112f());
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
