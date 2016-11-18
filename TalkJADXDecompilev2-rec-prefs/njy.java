package p000;

public final class njy extends nyx<njy> {
    public String f30022a;

    public /* synthetic */ nzf m35304a(nyt nyt) {
        return m35302b(nyt);
    }

    public njy() {
        m35303d();
    }

    private njy m35303d() {
        this.f30022a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35305a(nyu nyu) {
        if (this.f30022a != null) {
            nyu.m37170a(1, this.f30022a);
        }
        super.a(nyu);
    }

    protected int m35306b() {
        int b = super.b();
        if (this.f30022a != null) {
            return b + nyu.m37137b(1, this.f30022a);
        }
        return b;
    }

    private njy m35302b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30022a = nyt.m37117j();
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
