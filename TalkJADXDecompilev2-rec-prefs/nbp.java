package p000;

public final class nbp extends nyx<nbp> {
    public String f29452a;

    public /* synthetic */ nzf m34209a(nyt nyt) {
        return m34208b(nyt);
    }

    public nbp() {
        this.f29452a = null;
        this.cachedSize = -1;
    }

    public void m34210a(nyu nyu) {
        if (this.f29452a != null) {
            nyu.m37170a(1, this.f29452a);
        }
        super.a(nyu);
    }

    protected int m34211b() {
        int b = super.b();
        if (this.f29452a != null) {
            return b + nyu.m37137b(1, this.f29452a);
        }
        return b;
    }

    private nbp m34208b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29452a = nyt.m37117j();
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
