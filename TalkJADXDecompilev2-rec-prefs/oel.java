package p000;

public final class oel extends nyx<oel> {
    public mxb f32464a;

    public /* synthetic */ nzf m37959a(nyt nyt) {
        return m37958b(nyt);
    }

    public oel() {
        this.cachedSize = -1;
    }

    public void m37960a(nyu nyu) {
        if (this.f32464a != null) {
            nyu.m37182b(2, this.f32464a);
        }
        super.a(nyu);
    }

    protected int m37961b() {
        int b = super.b();
        if (this.f32464a != null) {
            return b + nyu.m37145d(2, this.f32464a);
        }
        return b;
    }

    private oel m37958b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f32464a == null) {
                        this.f32464a = new mxb();
                    }
                    nyt.m37101a(this.f32464a);
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
