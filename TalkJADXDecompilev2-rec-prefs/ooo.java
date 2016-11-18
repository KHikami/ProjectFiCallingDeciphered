package p000;

public final class ooo extends nyx<ooo> {
    private static volatile ooo[] f33464d;
    public onp f33465a;
    public Integer f33466b;
    public Long f33467c;

    public /* synthetic */ nzf m38933a(nyt nyt) {
        return m38931b(nyt);
    }

    public static ooo[] m38932d() {
        if (f33464d == null) {
            synchronized (nzc.f31309c) {
                if (f33464d == null) {
                    f33464d = new ooo[0];
                }
            }
        }
        return f33464d;
    }

    public ooo() {
        this.f33466b = null;
        this.f33467c = null;
        this.cachedSize = -1;
    }

    public void m38934a(nyu nyu) {
        if (this.f33465a != null) {
            nyu.m37182b(1, this.f33465a);
        }
        if (this.f33466b != null) {
            nyu.m37168a(2, this.f33466b.intValue());
        }
        if (this.f33467c != null) {
            nyu.m37181b(3, this.f33467c.longValue());
        }
        super.a(nyu);
    }

    protected int m38935b() {
        int b = super.b();
        if (this.f33465a != null) {
            b += nyu.m37145d(1, this.f33465a);
        }
        if (this.f33466b != null) {
            b += nyu.m37147f(2, this.f33466b.intValue());
        }
        if (this.f33467c != null) {
            return b + nyu.m37148f(3, this.f33467c.longValue());
        }
        return b;
    }

    private ooo m38931b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33465a == null) {
                        this.f33465a = new onp();
                    }
                    nyt.m37101a(this.f33465a);
                    continue;
                case 16:
                    this.f33466b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33467c = Long.valueOf(nyt.m37110e());
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
