package p000;

public final class ngt extends nyx<ngt> {
    public ngu f29801a;

    public /* synthetic */ nzf m34871a(nyt nyt) {
        return m34869b(nyt);
    }

    public ngt() {
        m34870d();
    }

    private ngt m34870d() {
        this.f29801a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34872a(nyu nyu) {
        if (this.f29801a != null) {
            nyu.m37182b(2, this.f29801a);
        }
        super.a(nyu);
    }

    protected int m34873b() {
        int b = super.b();
        if (this.f29801a != null) {
            return b + nyu.m37145d(2, this.f29801a);
        }
        return b;
    }

    private ngt m34869b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f29801a == null) {
                        this.f29801a = new ngu();
                    }
                    nyt.m37101a(this.f29801a);
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
