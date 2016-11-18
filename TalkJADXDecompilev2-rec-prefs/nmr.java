package p000;

public final class nmr extends nyx<nmr> {
    public nms f30255a;
    public Boolean f30256b;

    public /* synthetic */ nzf m35680a(nyt nyt) {
        return m35678b(nyt);
    }

    public nmr() {
        m35679d();
    }

    private nmr m35679d() {
        this.f30255a = null;
        this.f30256b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35681a(nyu nyu) {
        if (this.f30255a != null) {
            nyu.m37182b(1, this.f30255a);
        }
        if (this.f30256b != null) {
            nyu.m37172a(2, this.f30256b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35682b() {
        int b = super.b();
        if (this.f30255a != null) {
            b += nyu.m37145d(1, this.f30255a);
        }
        if (this.f30256b == null) {
            return b;
        }
        this.f30256b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nmr m35678b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30255a == null) {
                        this.f30255a = new nms();
                    }
                    nyt.m37101a(this.f30255a);
                    continue;
                case 16:
                    this.f30256b = Boolean.valueOf(nyt.m37116i());
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
