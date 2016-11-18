package p000;

public final class nlq extends nyx<nlq> {
    public String f30154a;

    public /* synthetic */ nzf m35536a(nyt nyt) {
        return m35534b(nyt);
    }

    public nlq() {
        m35535d();
    }

    private nlq m35535d() {
        this.f30154a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35537a(nyu nyu) {
        if (this.f30154a != null) {
            nyu.m37170a(1, this.f30154a);
        }
        super.a(nyu);
    }

    protected int m35538b() {
        int b = super.b();
        if (this.f30154a != null) {
            return b + nyu.m37137b(1, this.f30154a);
        }
        return b;
    }

    private nlq m35534b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30154a = nyt.m37117j();
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
