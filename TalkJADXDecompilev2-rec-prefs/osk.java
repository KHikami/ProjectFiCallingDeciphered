package p000;

public final class osk extends nyx<osk> {
    public oos f34152a;
    public oqu f34153b;
    public Integer f34154c;

    public /* synthetic */ nzf m39574a(nyt nyt) {
        return m39572b(nyt);
    }

    public osk() {
        m39573d();
    }

    private osk m39573d() {
        this.f34152a = null;
        this.f34153b = null;
        this.f34154c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39575a(nyu nyu) {
        if (this.f34152a != null) {
            nyu.m37182b(1, this.f34152a);
        }
        if (this.f34153b != null) {
            nyu.m37182b(2, this.f34153b);
        }
        if (this.f34154c != null) {
            nyu.m37168a(3, this.f34154c.intValue());
        }
        super.a(nyu);
    }

    protected int m39576b() {
        int b = super.b();
        if (this.f34152a != null) {
            b += nyu.m37145d(1, this.f34152a);
        }
        if (this.f34153b != null) {
            b += nyu.m37145d(2, this.f34153b);
        }
        if (this.f34154c != null) {
            return b + nyu.m37147f(3, this.f34154c.intValue());
        }
        return b;
    }

    private osk m39572b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34152a == null) {
                        this.f34152a = new oos();
                    }
                    nyt.m37101a(this.f34152a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34153b == null) {
                        this.f34153b = new oqu();
                    }
                    nyt.m37101a(this.f34153b);
                    continue;
                case wi.dA /*24*/:
                    this.f34154c = Integer.valueOf(nyt.m37112f());
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
