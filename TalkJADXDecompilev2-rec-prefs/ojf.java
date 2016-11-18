package p000;

public final class ojf extends nyx<ojf> {
    private static volatile ojf[] f33076d;
    public Long f33077a;
    public String f33078b;
    public String f33079c;

    public /* synthetic */ nzf m38553a(nyt nyt) {
        return m38550b(nyt);
    }

    public static ojf[] m38551d() {
        if (f33076d == null) {
            synchronized (nzc.f31309c) {
                if (f33076d == null) {
                    f33076d = new ojf[0];
                }
            }
        }
        return f33076d;
    }

    public ojf() {
        m38552g();
    }

    private ojf m38552g() {
        this.f33077a = null;
        this.f33078b = null;
        this.f33079c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38554a(nyu nyu) {
        nyu.m37181b(1, this.f33077a.longValue());
        nyu.m37170a(2, this.f33078b);
        nyu.m37170a(3, this.f33079c);
        super.a(nyu);
    }

    protected int m38555b() {
        return ((super.b() + nyu.m37148f(1, this.f33077a.longValue())) + nyu.m37137b(2, this.f33078b)) + nyu.m37137b(3, this.f33079c);
    }

    private ojf m38550b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33077a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f33078b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33079c = nyt.m37117j();
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
