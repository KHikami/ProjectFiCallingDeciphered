package p000;

public final class orx extends nyx<orx> {
    public String f34085a;
    public String f34086b;
    public String f34087c;
    public String f34088d;
    public String f34089e;

    public /* synthetic */ nzf m39505a(nyt nyt) {
        return m39503b(nyt);
    }

    public orx() {
        m39504d();
    }

    private orx m39504d() {
        this.f34085a = null;
        this.f34086b = null;
        this.f34087c = null;
        this.f34088d = null;
        this.f34089e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39506a(nyu nyu) {
        if (this.f34085a != null) {
            nyu.m37170a(1, this.f34085a);
        }
        if (this.f34086b != null) {
            nyu.m37170a(2, this.f34086b);
        }
        if (this.f34087c != null) {
            nyu.m37170a(3, this.f34087c);
        }
        if (this.f34088d != null) {
            nyu.m37170a(4, this.f34088d);
        }
        if (this.f34089e != null) {
            nyu.m37170a(5, this.f34089e);
        }
        super.a(nyu);
    }

    protected int m39507b() {
        int b = super.b();
        if (this.f34085a != null) {
            b += nyu.m37137b(1, this.f34085a);
        }
        if (this.f34086b != null) {
            b += nyu.m37137b(2, this.f34086b);
        }
        if (this.f34087c != null) {
            b += nyu.m37137b(3, this.f34087c);
        }
        if (this.f34088d != null) {
            b += nyu.m37137b(4, this.f34088d);
        }
        if (this.f34089e != null) {
            return b + nyu.m37137b(5, this.f34089e);
        }
        return b;
    }

    private orx m39503b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34085a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34086b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34087c = nyt.m37117j();
                    continue;
                case 34:
                    this.f34088d = nyt.m37117j();
                    continue;
                case 42:
                    this.f34089e = nyt.m37117j();
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
