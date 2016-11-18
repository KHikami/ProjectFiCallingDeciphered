package p000;

public final class pbq extends nyx<pbq> {
    private static volatile pbq[] f34963e;
    public String f34964a;
    public pbr f34965b;
    public pbs f34966c;
    public String f34967d;

    public /* synthetic */ nzf m40220a(nyt nyt) {
        return m40218b(nyt);
    }

    public static pbq[] m40219d() {
        if (f34963e == null) {
            synchronized (nzc.f31309c) {
                if (f34963e == null) {
                    f34963e = new pbq[0];
                }
            }
        }
        return f34963e;
    }

    public pbq() {
        this.f34964a = null;
        this.f34967d = null;
        this.cachedSize = -1;
    }

    public void m40221a(nyu nyu) {
        if (this.f34964a != null) {
            nyu.m37170a(1, this.f34964a);
        }
        if (this.f34967d != null) {
            nyu.m37170a(2, this.f34967d);
        }
        if (this.f34966c != null) {
            nyu.m37182b(3, this.f34966c);
        }
        if (this.f34965b != null) {
            nyu.m37182b(4, this.f34965b);
        }
        super.a(nyu);
    }

    protected int m40222b() {
        int b = super.b();
        if (this.f34964a != null) {
            b += nyu.m37137b(1, this.f34964a);
        }
        if (this.f34967d != null) {
            b += nyu.m37137b(2, this.f34967d);
        }
        if (this.f34966c != null) {
            b += nyu.m37145d(3, this.f34966c);
        }
        if (this.f34965b != null) {
            return b + nyu.m37145d(4, this.f34965b);
        }
        return b;
    }

    private pbq m40218b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34964a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34967d = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f34966c == null) {
                        this.f34966c = new pbs();
                    }
                    nyt.m37101a(this.f34966c);
                    continue;
                case 34:
                    if (this.f34965b == null) {
                        this.f34965b = new pbr();
                    }
                    nyt.m37101a(this.f34965b);
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
