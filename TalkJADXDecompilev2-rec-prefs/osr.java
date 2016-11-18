package p000;

public final class osr extends nyx<osr> {
    public oqu f34176a;

    public /* synthetic */ nzf m39610a(nyt nyt) {
        return m39608b(nyt);
    }

    public osr() {
        m39609d();
    }

    private osr m39609d() {
        this.f34176a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39611a(nyu nyu) {
        if (this.f34176a != null) {
            nyu.m37182b(1, this.f34176a);
        }
        super.a(nyu);
    }

    protected int m39612b() {
        int b = super.b();
        if (this.f34176a != null) {
            return b + nyu.m37145d(1, this.f34176a);
        }
        return b;
    }

    private osr m39608b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34176a == null) {
                        this.f34176a = new oqu();
                    }
                    nyt.m37101a(this.f34176a);
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
