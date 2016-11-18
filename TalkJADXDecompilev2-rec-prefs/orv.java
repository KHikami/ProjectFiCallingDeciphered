package p000;

public final class orv extends nyx<orv> {
    private static volatile orv[] f34078d;
    public Integer f34079a;
    public String f34080b;
    public String f34081c;

    public /* synthetic */ nzf m39495a(nyt nyt) {
        return m39492b(nyt);
    }

    public static orv[] m39493d() {
        if (f34078d == null) {
            synchronized (nzc.f31309c) {
                if (f34078d == null) {
                    f34078d = new orv[0];
                }
            }
        }
        return f34078d;
    }

    public orv() {
        m39494g();
    }

    private orv m39494g() {
        this.f34079a = null;
        this.f34080b = null;
        this.f34081c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39496a(nyu nyu) {
        if (this.f34079a != null) {
            nyu.m37168a(1, this.f34079a.intValue());
        }
        if (this.f34080b != null) {
            nyu.m37170a(2, this.f34080b);
        }
        if (this.f34081c != null) {
            nyu.m37170a(3, this.f34081c);
        }
        super.a(nyu);
    }

    protected int m39497b() {
        int b = super.b();
        if (this.f34079a != null) {
            b += nyu.m37147f(1, this.f34079a.intValue());
        }
        if (this.f34080b != null) {
            b += nyu.m37137b(2, this.f34080b);
        }
        if (this.f34081c != null) {
            return b + nyu.m37137b(3, this.f34081c);
        }
        return b;
    }

    private orv m39492b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34079a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    this.f34080b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34081c = nyt.m37117j();
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
