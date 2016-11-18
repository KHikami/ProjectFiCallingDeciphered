package p000;

public final class nez extends nyx<nez> {
    public Boolean f29649a;
    public nfd f29650b;

    public /* synthetic */ nzf m34633a(nyt nyt) {
        return m34631b(nyt);
    }

    public nez() {
        m34632d();
    }

    private nez m34632d() {
        this.f29649a = null;
        this.f29650b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34634a(nyu nyu) {
        if (this.f29649a != null) {
            nyu.m37172a(1, this.f29649a.booleanValue());
        }
        if (this.f29650b != null) {
            nyu.m37182b(2, this.f29650b);
        }
        super.a(nyu);
    }

    protected int m34635b() {
        int b = super.b();
        if (this.f29649a != null) {
            this.f29649a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f29650b != null) {
            return b + nyu.m37145d(2, this.f29650b);
        }
        return b;
    }

    private nez m34631b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29649a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f29650b == null) {
                        this.f29650b = new nfd();
                    }
                    nyt.m37101a(this.f29650b);
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
