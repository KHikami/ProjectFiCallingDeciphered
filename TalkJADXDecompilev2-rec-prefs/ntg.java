package p000;

public final class ntg extends nyx<ntg> {
    public Boolean f30746a;
    public nth f30747b;

    public /* synthetic */ nzf m36463a(nyt nyt) {
        return m36461b(nyt);
    }

    public ntg() {
        m36462d();
    }

    private ntg m36462d() {
        this.f30746a = null;
        this.f30747b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36464a(nyu nyu) {
        if (this.f30746a != null) {
            nyu.m37172a(1, this.f30746a.booleanValue());
        }
        if (this.f30747b != null) {
            nyu.m37182b(2, this.f30747b);
        }
        super.a(nyu);
    }

    protected int m36465b() {
        int b = super.b();
        if (this.f30746a != null) {
            this.f30746a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30747b != null) {
            return b + nyu.m37145d(2, this.f30747b);
        }
        return b;
    }

    private ntg m36461b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30746a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30747b == null) {
                        this.f30747b = new nth();
                    }
                    nyt.m37101a(this.f30747b);
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
