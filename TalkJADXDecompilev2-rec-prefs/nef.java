package p000;

public final class nef extends nyx<nef> {
    public Boolean f29601a;
    public neg f29602b;

    public /* synthetic */ nzf m34532a(nyt nyt) {
        return m34530b(nyt);
    }

    public nef() {
        m34531d();
    }

    private nef m34531d() {
        this.f29601a = null;
        this.f29602b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34533a(nyu nyu) {
        if (this.f29601a != null) {
            nyu.m37172a(1, this.f29601a.booleanValue());
        }
        if (this.f29602b != null) {
            nyu.m37182b(2, this.f29602b);
        }
        super.a(nyu);
    }

    protected int m34534b() {
        int b = super.b();
        if (this.f29601a != null) {
            this.f29601a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29602b != null) {
            return b + nyu.m37145d(2, this.f29602b);
        }
        return b;
    }

    private nef m34530b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29601a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29602b == null) {
                        this.f29602b = new neg();
                    }
                    nyt.m37101a(this.f29602b);
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
