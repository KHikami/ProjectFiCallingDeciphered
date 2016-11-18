package p000;

public final class nlc extends nyx<nlc> {
    public String f30099a;
    public Float f30100b;

    public /* synthetic */ nzf m35465a(nyt nyt) {
        return m35463b(nyt);
    }

    public nlc() {
        m35464d();
    }

    private nlc m35464d() {
        this.f30099a = null;
        this.f30100b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35466a(nyu nyu) {
        if (this.f30099a != null) {
            nyu.m37170a(1, this.f30099a);
        }
        if (this.f30100b != null) {
            nyu.m37167a(2, this.f30100b.floatValue());
        }
        super.a(nyu);
    }

    protected int m35467b() {
        int b = super.b();
        if (this.f30099a != null) {
            b += nyu.m37137b(1, this.f30099a);
        }
        if (this.f30100b == null) {
            return b;
        }
        this.f30100b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nlc m35463b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30099a = nyt.m37117j();
                    continue;
                case 21:
                    this.f30100b = Float.valueOf(nyt.m37106c());
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
