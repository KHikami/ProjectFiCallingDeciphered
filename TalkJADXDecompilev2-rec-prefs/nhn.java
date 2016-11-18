package p000;

public final class nhn extends nyx<nhn> {
    public nhm f29839a;

    public /* synthetic */ nzf m34977a(nyt nyt) {
        return m34975b(nyt);
    }

    public nhn() {
        m34976d();
    }

    private nhn m34976d() {
        this.f29839a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34978a(nyu nyu) {
        if (this.f29839a != null) {
            nyu.m37182b(1, this.f29839a);
        }
        super.a(nyu);
    }

    protected int m34979b() {
        int b = super.b();
        if (this.f29839a != null) {
            return b + nyu.m37145d(1, this.f29839a);
        }
        return b;
    }

    private nhn m34975b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29839a == null) {
                        this.f29839a = new nhm();
                    }
                    nyt.m37101a(this.f29839a);
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
