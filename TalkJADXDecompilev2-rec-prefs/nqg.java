package p000;

public final class nqg extends nyx<nqg> {
    private static volatile nqg[] f30488b;
    public nqz f30489a;

    public /* synthetic */ nzf m36139a(nyt nyt) {
        return m36137b(nyt);
    }

    public static nqg[] m36138d() {
        if (f30488b == null) {
            synchronized (nzc.f31309c) {
                if (f30488b == null) {
                    f30488b = new nqg[0];
                }
            }
        }
        return f30488b;
    }

    public nqg() {
        this.cachedSize = -1;
    }

    public void m36140a(nyu nyu) {
        if (this.f30489a != null) {
            nyu.m37182b(1, this.f30489a);
        }
        super.a(nyu);
    }

    protected int m36141b() {
        int b = super.b();
        if (this.f30489a != null) {
            return b + nyu.m37145d(1, this.f30489a);
        }
        return b;
    }

    private nqg m36137b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30489a == null) {
                        this.f30489a = new nqz();
                    }
                    nyt.m37101a(this.f30489a);
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
