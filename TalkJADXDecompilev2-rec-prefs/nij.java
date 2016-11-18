package p000;

public final class nij extends nyx<nij> {
    public njp f29882a;
    public String f29883b;

    public /* synthetic */ nzf m35094a(nyt nyt) {
        return m35092b(nyt);
    }

    public nij() {
        m35093d();
    }

    private nij m35093d() {
        this.f29882a = null;
        this.f29883b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35095a(nyu nyu) {
        if (this.f29882a != null) {
            nyu.m37182b(1, this.f29882a);
        }
        if (this.f29883b != null) {
            nyu.m37170a(2, this.f29883b);
        }
        super.a(nyu);
    }

    protected int m35096b() {
        int b = super.b();
        if (this.f29882a != null) {
            b += nyu.m37145d(1, this.f29882a);
        }
        if (this.f29883b != null) {
            return b + nyu.m37137b(2, this.f29883b);
        }
        return b;
    }

    private nij m35092b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29882a == null) {
                        this.f29882a = new njp();
                    }
                    nyt.m37101a(this.f29882a);
                    continue;
                case wi.dH /*18*/:
                    this.f29883b = nyt.m37117j();
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
