package p000;

public final class oqd extends nyx<oqd> {
    public String f33712a;
    public String f33713b;
    public osq f33714c;

    public /* synthetic */ nzf m39150a(nyt nyt) {
        return m39148b(nyt);
    }

    public oqd() {
        m39149d();
    }

    private oqd m39149d() {
        this.f33712a = null;
        this.f33713b = null;
        this.f33714c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39151a(nyu nyu) {
        if (this.f33712a != null) {
            nyu.m37170a(1, this.f33712a);
        }
        if (this.f33713b != null) {
            nyu.m37170a(2, this.f33713b);
        }
        if (this.f33714c != null) {
            nyu.m37182b(3, this.f33714c);
        }
        super.a(nyu);
    }

    protected int m39152b() {
        int b = super.b();
        if (this.f33712a != null) {
            b += nyu.m37137b(1, this.f33712a);
        }
        if (this.f33713b != null) {
            b += nyu.m37137b(2, this.f33713b);
        }
        if (this.f33714c != null) {
            return b + nyu.m37145d(3, this.f33714c);
        }
        return b;
    }

    private oqd m39148b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33712a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33713b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f33714c == null) {
                        this.f33714c = new osq();
                    }
                    nyt.m37101a(this.f33714c);
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
