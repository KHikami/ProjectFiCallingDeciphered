package p000;

public final class nho extends nyx<nho> {
    public nhn f29840a;

    public /* synthetic */ nzf m34982a(nyt nyt) {
        return m34980b(nyt);
    }

    public nho() {
        m34981d();
    }

    private nho m34981d() {
        this.f29840a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34983a(nyu nyu) {
        if (this.f29840a != null) {
            nyu.m37182b(1, this.f29840a);
        }
        super.a(nyu);
    }

    protected int m34984b() {
        int b = super.b();
        if (this.f29840a != null) {
            return b + nyu.m37145d(1, this.f29840a);
        }
        return b;
    }

    private nho m34980b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29840a == null) {
                        this.f29840a = new nhn();
                    }
                    nyt.m37101a(this.f29840a);
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
