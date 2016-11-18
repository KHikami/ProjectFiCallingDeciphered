package p000;

public final class nmt extends nyx<nmt> {
    public Boolean f30258a;

    public /* synthetic */ nzf m35690a(nyt nyt) {
        return m35688b(nyt);
    }

    public nmt() {
        m35689d();
    }

    private nmt m35689d() {
        this.f30258a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35691a(nyu nyu) {
        if (this.f30258a != null) {
            nyu.m37172a(1, this.f30258a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35692b() {
        int b = super.b();
        if (this.f30258a == null) {
            return b;
        }
        this.f30258a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nmt m35688b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30258a = Boolean.valueOf(nyt.m37116i());
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
