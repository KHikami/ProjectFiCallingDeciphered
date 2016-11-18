package p000;

public final class myw extends nyx<myw> {
    private static volatile myw[] f29189c;
    public String f29190a;
    public nca f29191b;

    public /* synthetic */ nzf m33875a(nyt nyt) {
        return m33873b(nyt);
    }

    public static myw[] m33874d() {
        if (f29189c == null) {
            synchronized (nzc.f31309c) {
                if (f29189c == null) {
                    f29189c = new myw[0];
                }
            }
        }
        return f29189c;
    }

    public myw() {
        this.f29190a = null;
        this.cachedSize = -1;
    }

    public void m33876a(nyu nyu) {
        if (this.f29190a != null) {
            nyu.m37170a(1, this.f29190a);
        }
        if (this.f29191b != null) {
            nyu.m37182b(2, this.f29191b);
        }
        super.a(nyu);
    }

    protected int m33877b() {
        int b = super.b();
        if (this.f29190a != null) {
            b += nyu.m37137b(1, this.f29190a);
        }
        if (this.f29191b != null) {
            return b + nyu.m37145d(2, this.f29191b);
        }
        return b;
    }

    private myw m33873b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29190a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29191b == null) {
                        this.f29191b = new nca();
                    }
                    nyt.m37101a(this.f29191b);
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
