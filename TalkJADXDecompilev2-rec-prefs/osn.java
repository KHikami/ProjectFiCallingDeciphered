package p000;

public final class osn extends nyx<osn> {
    private static volatile osn[] f34164e;
    public String f34165a;
    public Integer f34166b;
    public Integer f34167c;
    public Boolean f34168d;

    public /* synthetic */ nzf m39590a(nyt nyt) {
        return m39587b(nyt);
    }

    public static osn[] m39588d() {
        if (f34164e == null) {
            synchronized (nzc.f31309c) {
                if (f34164e == null) {
                    f34164e = new osn[0];
                }
            }
        }
        return f34164e;
    }

    public osn() {
        m39589g();
    }

    private osn m39589g() {
        this.f34165a = null;
        this.f34166b = null;
        this.f34167c = null;
        this.f34168d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39591a(nyu nyu) {
        nyu.m37170a(1, this.f34165a);
        nyu.m37186c(2, this.f34166b.intValue());
        nyu.m37186c(3, this.f34167c.intValue());
        if (this.f34168d != null) {
            nyu.m37172a(4, this.f34168d.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39592b() {
        int b = ((super.b() + nyu.m37137b(1, this.f34165a)) + nyu.m37151g(2, this.f34166b.intValue())) + nyu.m37151g(3, this.f34167c.intValue());
        if (this.f34168d == null) {
            return b;
        }
        this.f34168d.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private osn m39587b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34165a = nyt.m37117j();
                    continue;
                case 16:
                    this.f34166b = Integer.valueOf(nyt.m37119l());
                    continue;
                case wi.dA /*24*/:
                    this.f34167c = Integer.valueOf(nyt.m37119l());
                    continue;
                case 32:
                    this.f34168d = Boolean.valueOf(nyt.m37116i());
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
