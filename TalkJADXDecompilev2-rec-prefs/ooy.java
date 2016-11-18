package p000;

public final class ooy extends nyx<ooy> {
    public oqu f33509a;
    public String f33510b;

    public /* synthetic */ nzf m38986a(nyt nyt) {
        return m38984b(nyt);
    }

    public ooy() {
        m38985d();
    }

    private ooy m38985d() {
        this.f33509a = null;
        this.f33510b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38987a(nyu nyu) {
        if (this.f33509a != null) {
            nyu.m37182b(1, this.f33509a);
        }
        if (this.f33510b != null) {
            nyu.m37170a(2, this.f33510b);
        }
        super.a(nyu);
    }

    protected int m38988b() {
        int b = super.b();
        if (this.f33509a != null) {
            b += nyu.m37145d(1, this.f33509a);
        }
        if (this.f33510b != null) {
            return b + nyu.m37137b(2, this.f33510b);
        }
        return b;
    }

    private ooy m38984b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33509a == null) {
                        this.f33509a = new oqu();
                    }
                    nyt.m37101a(this.f33509a);
                    continue;
                case wi.dH /*18*/:
                    this.f33510b = nyt.m37117j();
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
