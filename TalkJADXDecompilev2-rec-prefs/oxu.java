package p000;

public final class oxu extends nyx<oxu> {
    public Integer f34557a;

    public /* synthetic */ nzf m39834a(nyt nyt) {
        return m39832b(nyt);
    }

    public oxu() {
        m39833d();
    }

    private oxu m39833d() {
        this.f34557a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39835a(nyu nyu) {
        if (this.f34557a != null) {
            nyu.m37168a(1, this.f34557a.intValue());
        }
        super.a(nyu);
    }

    protected int m39836b() {
        int b = super.b();
        if (this.f34557a != null) {
            return b + nyu.m37147f(1, this.f34557a.intValue());
        }
        return b;
    }

    private oxu m39832b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34557a = Integer.valueOf(nyt.m37112f());
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
