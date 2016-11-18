package p000;

public final class npw extends nyx<npw> {
    public nlx f30464a;

    public /* synthetic */ nzf m36092a(nyt nyt) {
        return m36090b(nyt);
    }

    public npw() {
        m36091d();
    }

    private npw m36091d() {
        this.f30464a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36093a(nyu nyu) {
        if (this.f30464a != null) {
            nyu.m37182b(1, this.f30464a);
        }
        super.a(nyu);
    }

    protected int m36094b() {
        int b = super.b();
        if (this.f30464a != null) {
            return b + nyu.m37145d(1, this.f30464a);
        }
        return b;
    }

    private npw m36090b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30464a == null) {
                        this.f30464a = new nlx();
                    }
                    nyt.m37101a(this.f30464a);
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
