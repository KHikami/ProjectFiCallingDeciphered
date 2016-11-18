package p000;

public final class ngs extends nyx<ngs> {
    public nhm f29800a;

    public /* synthetic */ nzf m34866a(nyt nyt) {
        return m34864b(nyt);
    }

    public ngs() {
        m34865d();
    }

    private ngs m34865d() {
        this.f29800a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34867a(nyu nyu) {
        if (this.f29800a != null) {
            nyu.m37182b(1, this.f29800a);
        }
        super.a(nyu);
    }

    protected int m34868b() {
        int b = super.b();
        if (this.f29800a != null) {
            return b + nyu.m37145d(1, this.f29800a);
        }
        return b;
    }

    private ngs m34864b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29800a == null) {
                        this.f29800a = new nhm();
                    }
                    nyt.m37101a(this.f29800a);
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
