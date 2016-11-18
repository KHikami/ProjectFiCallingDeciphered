package p000;

public final class obg extends nyx<obg> {
    public String f31919a;
    public Integer f31920b;

    public /* synthetic */ nzf m37615a(nyt nyt) {
        return m37613b(nyt);
    }

    public obg() {
        m37614d();
    }

    private obg m37614d() {
        this.f31919a = null;
        this.f31920b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37616a(nyu nyu) {
        if (this.f31919a != null) {
            nyu.m37170a(1, this.f31919a);
        }
        if (this.f31920b != null) {
            nyu.m37168a(2, this.f31920b.intValue());
        }
        super.a(nyu);
    }

    protected int m37617b() {
        int b = super.b();
        if (this.f31919a != null) {
            b += nyu.m37137b(1, this.f31919a);
        }
        if (this.f31920b != null) {
            return b + nyu.m37147f(2, this.f31920b.intValue());
        }
        return b;
    }

    private obg m37613b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31919a = nyt.m37117j();
                    continue;
                case 16:
                    this.f31920b = Integer.valueOf(nyt.m37112f());
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
