package p000;

public final class nkp extends nyx<nkp> {
    public Boolean f30058a;

    public /* synthetic */ nzf m35390a(nyt nyt) {
        return m35388b(nyt);
    }

    public nkp() {
        m35389d();
    }

    private nkp m35389d() {
        this.f30058a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35391a(nyu nyu) {
        if (this.f30058a != null) {
            nyu.m37172a(1, this.f30058a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35392b() {
        int b = super.b();
        if (this.f30058a == null) {
            return b;
        }
        this.f30058a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nkp m35388b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30058a = Boolean.valueOf(nyt.m37116i());
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
