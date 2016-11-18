package p000;

public final class oat extends nyx<oat> {
    private static volatile oat[] f31801c;
    public String f31802a;
    public Integer f31803b;

    public /* synthetic */ nzf m37465a(nyt nyt) {
        return m37463b(nyt);
    }

    public static oat[] m37464d() {
        if (f31801c == null) {
            synchronized (nzc.f31309c) {
                if (f31801c == null) {
                    f31801c = new oat[0];
                }
            }
        }
        return f31801c;
    }

    public oat() {
        this.f31802a = null;
        this.f31803b = null;
        this.cachedSize = -1;
    }

    public void m37466a(nyu nyu) {
        if (this.f31802a != null) {
            nyu.m37170a(1, this.f31802a);
        }
        if (this.f31803b != null) {
            nyu.m37168a(2, this.f31803b.intValue());
        }
        super.a(nyu);
    }

    protected int m37467b() {
        int b = super.b();
        if (this.f31802a != null) {
            b += nyu.m37137b(1, this.f31802a);
        }
        if (this.f31803b != null) {
            return b + nyu.m37147f(2, this.f31803b.intValue());
        }
        return b;
    }

    private oat m37463b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31802a = nyt.m37117j();
                    continue;
                case 16:
                    this.f31803b = Integer.valueOf(nyt.m37112f());
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
