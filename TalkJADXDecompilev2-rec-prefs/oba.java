package p000;

public final class oba extends nyx<oba> {
    private static volatile oba[] f31887c;
    public String f31888a;
    public Integer f31889b;

    public /* synthetic */ nzf m37585a(nyt nyt) {
        return m37582b(nyt);
    }

    public static oba[] m37583d() {
        if (f31887c == null) {
            synchronized (nzc.f31309c) {
                if (f31887c == null) {
                    f31887c = new oba[0];
                }
            }
        }
        return f31887c;
    }

    public oba() {
        m37584g();
    }

    private oba m37584g() {
        this.f31888a = null;
        this.f31889b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37586a(nyu nyu) {
        if (this.f31888a != null) {
            nyu.m37170a(1, this.f31888a);
        }
        if (this.f31889b != null) {
            nyu.m37168a(2, this.f31889b.intValue());
        }
        super.a(nyu);
    }

    protected int m37587b() {
        int b = super.b();
        if (this.f31888a != null) {
            b += nyu.m37137b(1, this.f31888a);
        }
        if (this.f31889b != null) {
            return b + nyu.m37147f(2, this.f31889b.intValue());
        }
        return b;
    }

    private oba m37582b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31888a = nyt.m37117j();
                    continue;
                case 16:
                    this.f31889b = Integer.valueOf(nyt.m37112f());
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
