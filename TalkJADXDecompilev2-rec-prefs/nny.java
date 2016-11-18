package p000;

public final class nny extends nyx<nny> {
    public Boolean f30317a;
    public Boolean f30318b;

    public /* synthetic */ nzf m35848a(nyt nyt) {
        return m35846b(nyt);
    }

    public nny() {
        m35847d();
    }

    private nny m35847d() {
        this.f30317a = null;
        this.f30318b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35849a(nyu nyu) {
        if (this.f30317a != null) {
            nyu.m37172a(1, this.f30317a.booleanValue());
        }
        if (this.f30318b != null) {
            nyu.m37172a(2, this.f30318b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35850b() {
        int b = super.b();
        if (this.f30317a != null) {
            this.f30317a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30318b == null) {
            return b;
        }
        this.f30318b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nny m35846b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30317a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30318b = Boolean.valueOf(nyt.m37116i());
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
