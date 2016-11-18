package p000;

public final class nel extends nyx<nel> {
    public ngg f29614a;

    public /* synthetic */ nzf m34563a(nyt nyt) {
        return m34561b(nyt);
    }

    public nel() {
        m34562d();
    }

    private nel m34562d() {
        this.f29614a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34564a(nyu nyu) {
        if (this.f29614a != null) {
            nyu.m37182b(1, this.f29614a);
        }
        super.a(nyu);
    }

    protected int m34565b() {
        int b = super.b();
        if (this.f29614a != null) {
            return b + nyu.m37145d(1, this.f29614a);
        }
        return b;
    }

    private nel m34561b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29614a == null) {
                        this.f29614a = new ngg();
                    }
                    nyt.m37101a(this.f29614a);
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
