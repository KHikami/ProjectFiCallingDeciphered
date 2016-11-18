package p000;

public final class oop extends nyx<oop> {
    private static volatile oop[] f33468e;
    public String f33469a;
    public String f33470b;
    public Long f33471c;
    public String f33472d;

    public /* synthetic */ nzf m38939a(nyt nyt) {
        return m38936b(nyt);
    }

    public static oop[] m38937d() {
        if (f33468e == null) {
            synchronized (nzc.f31309c) {
                if (f33468e == null) {
                    f33468e = new oop[0];
                }
            }
        }
        return f33468e;
    }

    public oop() {
        m38938g();
    }

    private oop m38938g() {
        this.f33469a = null;
        this.f33470b = null;
        this.f33471c = null;
        this.f33472d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38940a(nyu nyu) {
        if (this.f33469a != null) {
            nyu.m37170a(1, this.f33469a);
        }
        if (this.f33470b != null) {
            nyu.m37170a(2, this.f33470b);
        }
        if (this.f33472d != null) {
            nyu.m37170a(3, this.f33472d);
        }
        if (this.f33471c != null) {
            nyu.m37169a(4, this.f33471c.longValue());
        }
        super.a(nyu);
    }

    protected int m38941b() {
        int b = super.b();
        if (this.f33469a != null) {
            b += nyu.m37137b(1, this.f33469a);
        }
        if (this.f33470b != null) {
            b += nyu.m37137b(2, this.f33470b);
        }
        if (this.f33472d != null) {
            b += nyu.m37137b(3, this.f33472d);
        }
        if (this.f33471c != null) {
            return b + nyu.m37146e(4, this.f33471c.longValue());
        }
        return b;
    }

    private oop m38936b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33469a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33470b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33472d = nyt.m37117j();
                    continue;
                case 32:
                    this.f33471c = Long.valueOf(nyt.m37109d());
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
