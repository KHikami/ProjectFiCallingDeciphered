package p000;

public final class nno extends nyx<nno> {
    public Boolean f30298a;

    public /* synthetic */ nzf m35797a(nyt nyt) {
        return m35795b(nyt);
    }

    public nno() {
        m35796d();
    }

    private nno m35796d() {
        this.f30298a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35798a(nyu nyu) {
        if (this.f30298a != null) {
            nyu.m37172a(1, this.f30298a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35799b() {
        int b = super.b();
        if (this.f30298a == null) {
            return b;
        }
        this.f30298a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nno m35795b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30298a = Boolean.valueOf(nyt.m37116i());
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
