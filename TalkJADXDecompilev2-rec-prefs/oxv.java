package p000;

public final class oxv extends nyx<oxv> {
    public Integer f34558a;

    public /* synthetic */ nzf m39839a(nyt nyt) {
        return m39837b(nyt);
    }

    public oxv() {
        m39838d();
    }

    private oxv m39838d() {
        this.f34558a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39840a(nyu nyu) {
        if (this.f34558a != null) {
            nyu.m37168a(1, this.f34558a.intValue());
        }
        super.a(nyu);
    }

    protected int m39841b() {
        int b = super.b();
        if (this.f34558a != null) {
            return b + nyu.m37147f(1, this.f34558a.intValue());
        }
        return b;
    }

    private oxv m39837b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34558a = Integer.valueOf(nyt.m37112f());
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
