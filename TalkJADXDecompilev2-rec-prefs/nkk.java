package p000;

public final class nkk extends nyx<nkk> {
    public Boolean f30038a;
    public nkx f30039b;

    public /* synthetic */ nzf m35365a(nyt nyt) {
        return m35363b(nyt);
    }

    public nkk() {
        m35364d();
    }

    private nkk m35364d() {
        this.f30038a = null;
        this.f30039b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35366a(nyu nyu) {
        if (this.f30038a != null) {
            nyu.m37172a(1, this.f30038a.booleanValue());
        }
        if (this.f30039b != null) {
            nyu.m37182b(2, this.f30039b);
        }
        super.a(nyu);
    }

    protected int m35367b() {
        int b = super.b();
        if (this.f30038a != null) {
            this.f30038a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30039b != null) {
            return b + nyu.m37145d(2, this.f30039b);
        }
        return b;
    }

    private nkk m35363b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30038a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30039b == null) {
                        this.f30039b = new nkx();
                    }
                    nyt.m37101a(this.f30039b);
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
