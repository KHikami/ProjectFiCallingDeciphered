package p000;

public final class oql extends nyx<oql> {
    private static volatile oql[] f33761d;
    public String f33762a;
    public Integer f33763b;
    public Integer f33764c;

    public /* synthetic */ nzf m39194a(nyt nyt) {
        return m39191b(nyt);
    }

    public static oql[] m39192d() {
        if (f33761d == null) {
            synchronized (nzc.f31309c) {
                if (f33761d == null) {
                    f33761d = new oql[0];
                }
            }
        }
        return f33761d;
    }

    public oql() {
        m39193g();
    }

    private oql m39193g() {
        this.f33762a = null;
        this.f33764c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39195a(nyu nyu) {
        if (this.f33762a != null) {
            nyu.m37170a(1, this.f33762a);
        }
        if (this.f33763b != null) {
            nyu.m37168a(2, this.f33763b.intValue());
        }
        if (this.f33764c != null) {
            nyu.m37168a(3, this.f33764c.intValue());
        }
        super.a(nyu);
    }

    protected int m39196b() {
        int b = super.b();
        if (this.f33762a != null) {
            b += nyu.m37137b(1, this.f33762a);
        }
        if (this.f33763b != null) {
            b += nyu.m37147f(2, this.f33763b.intValue());
        }
        if (this.f33764c != null) {
            return b + nyu.m37147f(3, this.f33764c.intValue());
        }
        return b;
    }

    private oql m39191b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33762a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f33763b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f33764c = Integer.valueOf(nyt.m37112f());
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
