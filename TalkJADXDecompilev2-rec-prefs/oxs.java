package p000;

public final class oxs extends nyx<oxs> {
    public Integer f34537a;

    public /* synthetic */ nzf m39824a(nyt nyt) {
        return m39823b(nyt);
    }

    public oxs() {
        this.f34537a = null;
        this.cachedSize = -1;
    }

    public void m39825a(nyu nyu) {
        if (this.f34537a != null) {
            nyu.m37168a(1, this.f34537a.intValue());
        }
        super.a(nyu);
    }

    protected int m39826b() {
        int b = super.b();
        if (this.f34537a != null) {
            return b + nyu.m37147f(1, this.f34537a.intValue());
        }
        return b;
    }

    private oxs m39823b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34537a = Integer.valueOf(nyt.m37112f());
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
