package p000;

public final class oso extends nyx<oso> {
    public String f34169a;

    public /* synthetic */ nzf m39595a(nyt nyt) {
        return m39593b(nyt);
    }

    public oso() {
        m39594d();
    }

    private oso m39594d() {
        this.f34169a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39596a(nyu nyu) {
        if (this.f34169a != null) {
            nyu.m37170a(1, this.f34169a);
        }
        super.a(nyu);
    }

    protected int m39597b() {
        int b = super.b();
        if (this.f34169a != null) {
            return b + nyu.m37137b(1, this.f34169a);
        }
        return b;
    }

    private oso m39593b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34169a = nyt.m37117j();
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
