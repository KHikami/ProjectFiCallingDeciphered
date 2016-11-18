package p000;

public final class ngk extends nyx<ngk> {
    public Boolean f29792a;

    public /* synthetic */ nzf m34826a(nyt nyt) {
        return m34824b(nyt);
    }

    public ngk() {
        m34825d();
    }

    private ngk m34825d() {
        this.f29792a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34827a(nyu nyu) {
        if (this.f29792a != null) {
            nyu.m37172a(1, this.f29792a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34828b() {
        int b = super.b();
        if (this.f29792a == null) {
            return b;
        }
        this.f29792a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngk m34824b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29792a = Boolean.valueOf(nyt.m37116i());
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
