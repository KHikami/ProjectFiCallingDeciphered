package p000;

public final class nmv extends nyx<nmv> {
    public Boolean f30260a;

    public /* synthetic */ nzf m35700a(nyt nyt) {
        return m35698b(nyt);
    }

    public nmv() {
        m35699d();
    }

    private nmv m35699d() {
        this.f30260a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35701a(nyu nyu) {
        if (this.f30260a != null) {
            nyu.m37172a(1, this.f30260a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35702b() {
        int b = super.b();
        if (this.f30260a == null) {
            return b;
        }
        this.f30260a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nmv m35698b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30260a = Boolean.valueOf(nyt.m37116i());
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
