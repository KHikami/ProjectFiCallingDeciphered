package p000;

public final class nns extends nyx<nns> {
    public Boolean f30308a;
    public Boolean f30309b;
    public Integer f30310c;
    public Boolean f30311d;

    public /* synthetic */ nzf m35818a(nyt nyt) {
        return m35816b(nyt);
    }

    public nns() {
        m35817d();
    }

    private nns m35817d() {
        this.f30308a = null;
        this.f30309b = null;
        this.f30310c = null;
        this.f30311d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35819a(nyu nyu) {
        if (this.f30308a != null) {
            nyu.m37172a(1, this.f30308a.booleanValue());
        }
        if (this.f30309b != null) {
            nyu.m37172a(2, this.f30309b.booleanValue());
        }
        if (this.f30310c != null) {
            nyu.m37168a(3, this.f30310c.intValue());
        }
        if (this.f30311d != null) {
            nyu.m37172a(4, this.f30311d.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35820b() {
        int b = super.b();
        if (this.f30308a != null) {
            this.f30308a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30309b != null) {
            this.f30309b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f30310c != null) {
            b += nyu.m37147f(3, this.f30310c.intValue());
        }
        if (this.f30311d == null) {
            return b;
        }
        this.f30311d.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private nns m35816b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30308a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30309b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f30310c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30311d = Boolean.valueOf(nyt.m37116i());
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
