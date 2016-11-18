package p000;

public final class oxr extends nyx<oxr> {
    public Integer f34536a;

    public /* synthetic */ nzf m39820a(nyt nyt) {
        return m39819b(nyt);
    }

    public oxr() {
        this.f34536a = null;
        this.cachedSize = -1;
    }

    public void m39821a(nyu nyu) {
        if (this.f34536a != null) {
            nyu.m37168a(1, this.f34536a.intValue());
        }
        super.a(nyu);
    }

    protected int m39822b() {
        int b = super.b();
        if (this.f34536a != null) {
            return b + nyu.m37147f(1, this.f34536a.intValue());
        }
        return b;
    }

    private oxr m39819b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34536a = Integer.valueOf(nyt.m37112f());
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
