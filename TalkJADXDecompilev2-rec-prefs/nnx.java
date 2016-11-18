package p000;

public final class nnx extends nyx<nnx> {
    public Boolean f30316a;

    public /* synthetic */ nzf m35843a(nyt nyt) {
        return m35841b(nyt);
    }

    public nnx() {
        m35842d();
    }

    private nnx m35842d() {
        this.f30316a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35844a(nyu nyu) {
        if (this.f30316a != null) {
            nyu.m37172a(1, this.f30316a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35845b() {
        int b = super.b();
        if (this.f30316a == null) {
            return b;
        }
        this.f30316a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnx m35841b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30316a = Boolean.valueOf(nyt.m37116i());
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
