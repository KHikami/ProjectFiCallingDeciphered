package p000;

public final class nox extends nyx<nox> {
    private static volatile nox[] f30406d;
    public String f30407a;
    public Float f30408b;
    public String f30409c;

    public /* synthetic */ nzf m35967a(nyt nyt) {
        return m35965b(nyt);
    }

    public static nox[] m35966d() {
        if (f30406d == null) {
            synchronized (nzc.f31309c) {
                if (f30406d == null) {
                    f30406d = new nox[0];
                }
            }
        }
        return f30406d;
    }

    public nox() {
        this.f30407a = null;
        this.f30408b = null;
        this.f30409c = null;
        this.cachedSize = -1;
    }

    public void m35968a(nyu nyu) {
        if (this.f30407a != null) {
            nyu.m37170a(1, this.f30407a);
        }
        if (this.f30408b != null) {
            nyu.m37167a(2, this.f30408b.floatValue());
        }
        if (this.f30409c != null) {
            nyu.m37170a(3, this.f30409c);
        }
        super.a(nyu);
    }

    protected int m35969b() {
        int b = super.b();
        if (this.f30407a != null) {
            b += nyu.m37137b(1, this.f30407a);
        }
        if (this.f30408b != null) {
            this.f30408b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f30409c != null) {
            return b + nyu.m37137b(3, this.f30409c);
        }
        return b;
    }

    private nox m35965b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30407a = nyt.m37117j();
                    continue;
                case 21:
                    this.f30408b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    this.f30409c = nyt.m37117j();
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
