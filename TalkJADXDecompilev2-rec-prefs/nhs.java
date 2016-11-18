package p000;

public final class nhs extends nyx<nhs> {
    public Boolean f29845a;

    public /* synthetic */ nzf m35002a(nyt nyt) {
        return m35000b(nyt);
    }

    public nhs() {
        m35001d();
    }

    private nhs m35001d() {
        this.f29845a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35003a(nyu nyu) {
        if (this.f29845a != null) {
            nyu.m37172a(1, this.f29845a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35004b() {
        int b = super.b();
        if (this.f29845a == null) {
            return b;
        }
        this.f29845a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhs m35000b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29845a = Boolean.valueOf(nyt.m37116i());
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
