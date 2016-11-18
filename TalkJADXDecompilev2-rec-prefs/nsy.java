package p000;

public final class nsy extends nyx<nsy> {
    public Boolean f30732a;
    public ndq f30733b;

    public /* synthetic */ nzf m36428a(nyt nyt) {
        return m36427b(nyt);
    }

    public nsy() {
        this.f30732a = null;
        this.cachedSize = -1;
    }

    public void m36429a(nyu nyu) {
        if (this.f30732a != null) {
            nyu.m37172a(1, this.f30732a.booleanValue());
        }
        if (this.f30733b != null) {
            nyu.m37182b(2, this.f30733b);
        }
        super.a(nyu);
    }

    protected int m36430b() {
        int b = super.b();
        if (this.f30732a != null) {
            this.f30732a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30733b != null) {
            return b + nyu.m37145d(2, this.f30733b);
        }
        return b;
    }

    private nsy m36427b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30732a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30733b == null) {
                        this.f30733b = new ndq();
                    }
                    nyt.m37101a(this.f30733b);
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
