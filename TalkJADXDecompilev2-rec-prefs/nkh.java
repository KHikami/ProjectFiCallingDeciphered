package p000;

public final class nkh extends nyx<nkh> {
    public Boolean f30035a;

    public /* synthetic */ nzf m35350a(nyt nyt) {
        return m35348b(nyt);
    }

    public nkh() {
        m35349d();
    }

    private nkh m35349d() {
        this.f30035a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35351a(nyu nyu) {
        if (this.f30035a != null) {
            nyu.m37172a(1, this.f30035a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35352b() {
        int b = super.b();
        if (this.f30035a == null) {
            return b;
        }
        this.f30035a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkh m35348b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30035a = Boolean.valueOf(nyt.m37116i());
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
