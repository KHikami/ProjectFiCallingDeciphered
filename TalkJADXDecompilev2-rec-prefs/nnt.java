package p000;

public final class nnt extends nyx<nnt> {
    public Boolean f30312a;

    public /* synthetic */ nzf m35823a(nyt nyt) {
        return m35821b(nyt);
    }

    public nnt() {
        m35822d();
    }

    private nnt m35822d() {
        this.f30312a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35824a(nyu nyu) {
        if (this.f30312a != null) {
            nyu.m37172a(1, this.f30312a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35825b() {
        int b = super.b();
        if (this.f30312a == null) {
            return b;
        }
        this.f30312a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnt m35821b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30312a = Boolean.valueOf(nyt.m37116i());
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
