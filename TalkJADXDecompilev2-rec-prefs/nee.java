package p000;

public final class nee extends nyx<nee> {
    public Boolean f29599a;
    public nef f29600b;

    public /* synthetic */ nzf m34527a(nyt nyt) {
        return m34525b(nyt);
    }

    public nee() {
        m34526d();
    }

    private nee m34526d() {
        this.f29599a = null;
        this.f29600b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34528a(nyu nyu) {
        if (this.f29599a != null) {
            nyu.m37172a(1, this.f29599a.booleanValue());
        }
        if (this.f29600b != null) {
            nyu.m37182b(2, this.f29600b);
        }
        super.a(nyu);
    }

    protected int m34529b() {
        int b = super.b();
        if (this.f29599a != null) {
            this.f29599a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29600b != null) {
            return b + nyu.m37145d(2, this.f29600b);
        }
        return b;
    }

    private nee m34525b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29599a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29600b == null) {
                        this.f29600b = new nef();
                    }
                    nyt.m37101a(this.f29600b);
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
