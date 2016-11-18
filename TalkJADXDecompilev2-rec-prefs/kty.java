package p000;

public final class kty extends nyx<kty> {
    public Double f23342a;
    public Double f23343b;
    public Double f23344c;
    public Double f23345d;
    public Double f23346e;
    public Boolean f23347f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27520b(nyt);
    }

    public kty() {
        this.f23342a = null;
        this.f23343b = null;
        this.f23344c = null;
        this.f23345d = null;
        this.f23346e = null;
        this.f23347f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23342a.doubleValue());
        nyu.a(2, this.f23343b.doubleValue());
        if (this.f23344c != null) {
            nyu.a(3, this.f23344c.doubleValue());
        }
        if (this.f23345d != null) {
            nyu.a(4, this.f23345d.doubleValue());
        }
        if (this.f23346e != null) {
            nyu.a(5, this.f23346e.doubleValue());
        }
        if (this.f23347f != null) {
            nyu.a(6, this.f23347f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23342a.doubleValue();
        b += nyu.h(1) + 8;
        this.f23343b.doubleValue();
        b += nyu.h(2) + 8;
        if (this.f23344c != null) {
            this.f23344c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.f23345d != null) {
            this.f23345d.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.f23346e != null) {
            this.f23346e.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.f23347f == null) {
            return b;
        }
        this.f23347f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private kty m27520b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23342a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23343b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.f23344c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.f23345d = Double.valueOf(nyt.b());
                    continue;
                case 41:
                    this.f23346e = Double.valueOf(nyt.b());
                    continue;
                case 48:
                    this.f23347f = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
