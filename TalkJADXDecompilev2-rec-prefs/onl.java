package p000;

public final class onl extends nyx<onl> {
    public Boolean f33313a;
    public oog f33314b;

    public /* synthetic */ nzf m38812a(nyt nyt) {
        return m38811b(nyt);
    }

    public onl() {
        this.f33313a = null;
        this.cachedSize = -1;
    }

    public void m38813a(nyu nyu) {
        if (this.f33313a != null) {
            nyu.m37172a(1, this.f33313a.booleanValue());
        }
        if (this.f33314b != null) {
            nyu.m37182b(2, this.f33314b);
        }
        super.a(nyu);
    }

    protected int m38814b() {
        int b = super.b();
        if (this.f33313a != null) {
            this.f33313a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f33314b != null) {
            return b + nyu.m37145d(2, this.f33314b);
        }
        return b;
    }

    private onl m38811b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33313a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f33314b == null) {
                        this.f33314b = new oog();
                    }
                    nyt.m37101a(this.f33314b);
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
