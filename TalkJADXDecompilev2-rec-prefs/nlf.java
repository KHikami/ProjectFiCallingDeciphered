package p000;

public final class nlf extends nyx<nlf> {
    private static volatile nlf[] f30104b;
    public njz f30105a;

    public /* synthetic */ nzf m35481a(nyt nyt) {
        return m35478b(nyt);
    }

    public static nlf[] m35479d() {
        if (f30104b == null) {
            synchronized (nzc.f31309c) {
                if (f30104b == null) {
                    f30104b = new nlf[0];
                }
            }
        }
        return f30104b;
    }

    public nlf() {
        m35480g();
    }

    private nlf m35480g() {
        this.f30105a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35482a(nyu nyu) {
        if (this.f30105a != null) {
            nyu.m37182b(1, this.f30105a);
        }
        super.a(nyu);
    }

    protected int m35483b() {
        int b = super.b();
        if (this.f30105a != null) {
            return b + nyu.m37145d(1, this.f30105a);
        }
        return b;
    }

    private nlf m35478b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30105a == null) {
                        this.f30105a = new njz();
                    }
                    nyt.m37101a(this.f30105a);
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
