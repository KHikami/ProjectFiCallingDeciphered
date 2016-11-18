package p000;

public final class nih extends nyx<nih> {
    public Boolean f29880a;

    public /* synthetic */ nzf m35084a(nyt nyt) {
        return m35082b(nyt);
    }

    public nih() {
        m35083d();
    }

    private nih m35083d() {
        this.f29880a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35085a(nyu nyu) {
        if (this.f29880a != null) {
            nyu.m37172a(1, this.f29880a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35086b() {
        int b = super.b();
        if (this.f29880a == null) {
            return b;
        }
        this.f29880a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nih m35082b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29880a = Boolean.valueOf(nyt.m37116i());
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
