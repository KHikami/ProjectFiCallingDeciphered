package p000;

public final class oqt extends nyx<oqt> {
    public String f33790a;
    public Boolean f33791b;
    public Boolean f33792c;
    public String f33793d;
    public String f33794e;
    public String f33795f;
    public String f33796g;
    public String f33797h;
    public String f33798i;
    public String f33799j;

    public /* synthetic */ nzf m39236a(nyt nyt) {
        return m39234b(nyt);
    }

    public oqt() {
        m39235d();
    }

    private oqt m39235d() {
        this.f33790a = null;
        this.f33791b = null;
        this.f33792c = null;
        this.f33793d = null;
        this.f33794e = null;
        this.f33795f = null;
        this.f33796g = null;
        this.f33797h = null;
        this.f33798i = null;
        this.f33799j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39237a(nyu nyu) {
        if (this.f33790a != null) {
            nyu.m37170a(1, this.f33790a);
        }
        if (this.f33791b != null) {
            nyu.m37172a(2, this.f33791b.booleanValue());
        }
        if (this.f33792c != null) {
            nyu.m37172a(3, this.f33792c.booleanValue());
        }
        if (this.f33793d != null) {
            nyu.m37170a(4, this.f33793d);
        }
        if (this.f33794e != null) {
            nyu.m37170a(5, this.f33794e);
        }
        if (this.f33795f != null) {
            nyu.m37170a(6, this.f33795f);
        }
        if (this.f33796g != null) {
            nyu.m37170a(8, this.f33796g);
        }
        if (this.f33797h != null) {
            nyu.m37170a(9, this.f33797h);
        }
        if (this.f33798i != null) {
            nyu.m37170a(10, this.f33798i);
        }
        if (this.f33799j != null) {
            nyu.m37170a(11, this.f33799j);
        }
        super.a(nyu);
    }

    protected int m39238b() {
        int b = super.b();
        if (this.f33790a != null) {
            b += nyu.m37137b(1, this.f33790a);
        }
        if (this.f33791b != null) {
            this.f33791b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f33792c != null) {
            this.f33792c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f33793d != null) {
            b += nyu.m37137b(4, this.f33793d);
        }
        if (this.f33794e != null) {
            b += nyu.m37137b(5, this.f33794e);
        }
        if (this.f33795f != null) {
            b += nyu.m37137b(6, this.f33795f);
        }
        if (this.f33796g != null) {
            b += nyu.m37137b(8, this.f33796g);
        }
        if (this.f33797h != null) {
            b += nyu.m37137b(9, this.f33797h);
        }
        if (this.f33798i != null) {
            b += nyu.m37137b(10, this.f33798i);
        }
        if (this.f33799j != null) {
            return b + nyu.m37137b(11, this.f33799j);
        }
        return b;
    }

    private oqt m39234b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33790a = nyt.m37117j();
                    continue;
                case 16:
                    this.f33791b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f33792c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 34:
                    this.f33793d = nyt.m37117j();
                    continue;
                case 42:
                    this.f33794e = nyt.m37117j();
                    continue;
                case 50:
                    this.f33795f = nyt.m37117j();
                    continue;
                case 66:
                    this.f33796g = nyt.m37117j();
                    continue;
                case 74:
                    this.f33797h = nyt.m37117j();
                    continue;
                case 82:
                    this.f33798i = nyt.m37117j();
                    continue;
                case 90:
                    this.f33799j = nyt.m37117j();
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
