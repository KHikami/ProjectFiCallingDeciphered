package p000;

public final class osd extends nyx<osd> {
    public String f34116a;

    public /* synthetic */ nzf m39537a(nyt nyt) {
        return m39535b(nyt);
    }

    public osd() {
        m39536d();
    }

    private osd m39536d() {
        this.f34116a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39538a(nyu nyu) {
        if (this.f34116a != null) {
            nyu.m37170a(1, this.f34116a);
        }
        super.a(nyu);
    }

    protected int m39539b() {
        int b = super.b();
        if (this.f34116a != null) {
            return b + nyu.m37137b(1, this.f34116a);
        }
        return b;
    }

    private osd m39535b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34116a = nyt.m37117j();
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
