package p000;

public final class oos extends nyx<oos> {
    public Integer f33478a;
    public Integer f33479b;
    public Integer f33480c;
    public Integer f33481d;

    public /* synthetic */ nzf m38954a(nyt nyt) {
        return m38952b(nyt);
    }

    public oos() {
        m38953d();
    }

    private oos m38953d() {
        this.f33478a = null;
        this.f33479b = null;
        this.f33480c = null;
        this.f33481d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38955a(nyu nyu) {
        if (this.f33478a != null) {
            nyu.m37168a(1, this.f33478a.intValue());
        }
        if (this.f33479b != null) {
            nyu.m37168a(2, this.f33479b.intValue());
        }
        if (this.f33480c != null) {
            nyu.m37168a(3, this.f33480c.intValue());
        }
        if (this.f33481d != null) {
            nyu.m37168a(4, this.f33481d.intValue());
        }
        super.a(nyu);
    }

    protected int m38956b() {
        int b = super.b();
        if (this.f33478a != null) {
            b += nyu.m37147f(1, this.f33478a.intValue());
        }
        if (this.f33479b != null) {
            b += nyu.m37147f(2, this.f33479b.intValue());
        }
        if (this.f33480c != null) {
            b += nyu.m37147f(3, this.f33480c.intValue());
        }
        if (this.f33481d != null) {
            return b + nyu.m37147f(4, this.f33481d.intValue());
        }
        return b;
    }

    private oos m38952b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33478a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33479b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33480c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f33481d = Integer.valueOf(nyt.m37112f());
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
