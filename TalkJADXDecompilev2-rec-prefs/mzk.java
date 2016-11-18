package p000;

public final class mzk extends nyx<mzk> {
    public String f29250a;
    public String f29251b;

    public /* synthetic */ nzf m33944a(nyt nyt) {
        return m33943b(nyt);
    }

    public mzk() {
        this.f29250a = null;
        this.f29251b = null;
        this.cachedSize = -1;
    }

    public void m33945a(nyu nyu) {
        if (this.f29250a != null) {
            nyu.m37170a(1, this.f29250a);
        }
        if (this.f29251b != null) {
            nyu.m37170a(2, this.f29251b);
        }
        super.a(nyu);
    }

    protected int m33946b() {
        int b = super.b();
        if (this.f29250a != null) {
            b += nyu.m37137b(1, this.f29250a);
        }
        if (this.f29251b != null) {
            return b + nyu.m37137b(2, this.f29251b);
        }
        return b;
    }

    private mzk m33943b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29250a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29251b = nyt.m37117j();
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
