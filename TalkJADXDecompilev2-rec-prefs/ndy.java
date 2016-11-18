package p000;

public final class ndy extends nyx<ndy> {
    public ndz f29586a;

    public /* synthetic */ nzf m34495a(nyt nyt) {
        return m34493b(nyt);
    }

    public ndy() {
        m34494d();
    }

    private ndy m34494d() {
        this.f29586a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34496a(nyu nyu) {
        if (this.f29586a != null) {
            nyu.m37182b(1, this.f29586a);
        }
        super.a(nyu);
    }

    protected int m34497b() {
        int b = super.b();
        if (this.f29586a != null) {
            return b + nyu.m37145d(1, this.f29586a);
        }
        return b;
    }

    private ndy m34493b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29586a == null) {
                        this.f29586a = new ndz();
                    }
                    nyt.m37101a(this.f29586a);
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
