package p000;

public final class oxy extends nyx<oxy> {
    public Integer f34564a;

    public /* synthetic */ nzf m39853a(nyt nyt) {
        return m39852b(nyt);
    }

    public oxy() {
        this.f34564a = null;
        this.cachedSize = -1;
    }

    public void m39854a(nyu nyu) {
        if (this.f34564a != null) {
            nyu.m37168a(1, this.f34564a.intValue());
        }
        super.a(nyu);
    }

    protected int m39855b() {
        int b = super.b();
        if (this.f34564a != null) {
            return b + nyu.m37147f(1, this.f34564a.intValue());
        }
        return b;
    }

    private oxy m39852b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34564a = Integer.valueOf(nyt.m37112f());
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
