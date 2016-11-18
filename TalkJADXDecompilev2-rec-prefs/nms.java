package p000;

public final class nms extends nyx<nms> {
    public Boolean f30257a;

    public /* synthetic */ nzf m35685a(nyt nyt) {
        return m35683b(nyt);
    }

    public nms() {
        m35684d();
    }

    private nms m35684d() {
        this.f30257a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35686a(nyu nyu) {
        if (this.f30257a != null) {
            nyu.m37172a(1, this.f30257a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35687b() {
        int b = super.b();
        if (this.f30257a == null) {
            return b;
        }
        this.f30257a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nms m35683b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30257a = Boolean.valueOf(nyt.m37116i());
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
