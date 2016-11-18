package p000;

public final class myp extends nyx<myp> {
    public String f29165a;
    public String f29166b;

    public /* synthetic */ nzf m33841a(nyt nyt) {
        return m33839b(nyt);
    }

    public myp() {
        m33840d();
    }

    private myp m33840d() {
        this.f29165a = null;
        this.f29166b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33842a(nyu nyu) {
        if (this.f29165a != null) {
            nyu.m37170a(1, this.f29165a);
        }
        if (this.f29166b != null) {
            nyu.m37170a(2, this.f29166b);
        }
        super.a(nyu);
    }

    protected int m33843b() {
        int b = super.b();
        if (this.f29165a != null) {
            b += nyu.m37137b(1, this.f29165a);
        }
        if (this.f29166b != null) {
            return b + nyu.m37137b(2, this.f29166b);
        }
        return b;
    }

    private myp m33839b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29165a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29166b = nyt.m37117j();
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
