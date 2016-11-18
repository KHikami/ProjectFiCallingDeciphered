package p000;

public final class nhx extends nyx<nhx> {
    private static volatile nhx[] f29854b;
    public String f29855a;

    public /* synthetic */ nzf m35030a(nyt nyt) {
        return m35027b(nyt);
    }

    public static nhx[] m35028d() {
        if (f29854b == null) {
            synchronized (nzc.f31309c) {
                if (f29854b == null) {
                    f29854b = new nhx[0];
                }
            }
        }
        return f29854b;
    }

    public nhx() {
        m35029g();
    }

    private nhx m35029g() {
        this.f29855a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35031a(nyu nyu) {
        if (this.f29855a != null) {
            nyu.m37170a(1, this.f29855a);
        }
        super.a(nyu);
    }

    protected int m35032b() {
        int b = super.b();
        if (this.f29855a != null) {
            return b + nyu.m37137b(1, this.f29855a);
        }
        return b;
    }

    private nhx m35027b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29855a = nyt.m37117j();
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
