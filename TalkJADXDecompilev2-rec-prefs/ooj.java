package p000;

public final class ooj extends nyx<ooj> {
    private static volatile ooj[] f33389d;
    public onp f33390a;
    public Integer f33391b;
    public Long f33392c;

    public /* synthetic */ nzf m38911a(nyt nyt) {
        return m38909b(nyt);
    }

    public static ooj[] m38910d() {
        if (f33389d == null) {
            synchronized (nzc.f31309c) {
                if (f33389d == null) {
                    f33389d = new ooj[0];
                }
            }
        }
        return f33389d;
    }

    public ooj() {
        this.f33391b = null;
        this.f33392c = null;
        this.cachedSize = -1;
    }

    public void m38912a(nyu nyu) {
        if (this.f33390a != null) {
            nyu.m37182b(1, this.f33390a);
        }
        if (this.f33391b != null) {
            nyu.m37168a(2, this.f33391b.intValue());
        }
        if (this.f33392c != null) {
            nyu.m37181b(3, this.f33392c.longValue());
        }
        super.a(nyu);
    }

    protected int m38913b() {
        int b = super.b();
        if (this.f33390a != null) {
            b += nyu.m37145d(1, this.f33390a);
        }
        if (this.f33391b != null) {
            b += nyu.m37147f(2, this.f33391b.intValue());
        }
        if (this.f33392c != null) {
            return b + nyu.m37148f(3, this.f33392c.longValue());
        }
        return b;
    }

    private ooj m38909b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33390a == null) {
                        this.f33390a = new onp();
                    }
                    nyt.m37101a(this.f33390a);
                    continue;
                case 16:
                    this.f33391b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33392c = Long.valueOf(nyt.m37110e());
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
