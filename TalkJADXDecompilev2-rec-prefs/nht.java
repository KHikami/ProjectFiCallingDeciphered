package p000;

public final class nht extends nyx<nht> {
    public ogc f29846a;

    public /* synthetic */ nzf m35007a(nyt nyt) {
        return m35005b(nyt);
    }

    public nht() {
        m35006d();
    }

    private nht m35006d() {
        this.f29846a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35008a(nyu nyu) {
        if (this.f29846a != null) {
            nyu.m37182b(1, this.f29846a);
        }
        super.a(nyu);
    }

    protected int m35009b() {
        int b = super.b();
        if (this.f29846a != null) {
            return b + nyu.m37145d(1, this.f29846a);
        }
        return b;
    }

    private nht m35005b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29846a == null) {
                        this.f29846a = new ogc();
                    }
                    nyt.m37101a(this.f29846a);
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
