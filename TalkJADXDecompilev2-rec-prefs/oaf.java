package p000;

public final class oaf extends nyx<oaf> {
    private static volatile oaf[] f31521b;
    public String f31522a;

    public /* synthetic */ nzf m37397a(nyt nyt) {
        return m37395b(nyt);
    }

    public static oaf[] m37396d() {
        if (f31521b == null) {
            synchronized (nzc.f31309c) {
                if (f31521b == null) {
                    f31521b = new oaf[0];
                }
            }
        }
        return f31521b;
    }

    public oaf() {
        this.f31522a = null;
        this.cachedSize = -1;
    }

    public void m37398a(nyu nyu) {
        if (this.f31522a != null) {
            nyu.m37170a(1, this.f31522a);
        }
        super.a(nyu);
    }

    protected int m37399b() {
        int b = super.b();
        if (this.f31522a != null) {
            return b + nyu.m37137b(1, this.f31522a);
        }
        return b;
    }

    private oaf m37395b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31522a = nyt.m37117j();
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
