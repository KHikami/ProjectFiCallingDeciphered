package p000;

public final class mya extends nyx<mya> {
    private static volatile mya[] f29115b;
    public Integer f29116a;

    public /* synthetic */ nzf m33765a(nyt nyt) {
        return m33762b(nyt);
    }

    public static mya[] m33763d() {
        if (f29115b == null) {
            synchronized (nzc.f31309c) {
                if (f29115b == null) {
                    f29115b = new mya[0];
                }
            }
        }
        return f29115b;
    }

    public mya() {
        m33764g();
    }

    private mya m33764g() {
        this.f29116a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33766a(nyu nyu) {
        if (this.f29116a != null) {
            nyu.m37168a(1, this.f29116a.intValue());
        }
        super.a(nyu);
    }

    protected int m33767b() {
        int b = super.b();
        if (this.f29116a != null) {
            return b + nyu.m37147f(1, this.f29116a.intValue());
        }
        return b;
    }

    private mya m33762b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29116a = Integer.valueOf(nyt.m37112f());
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
