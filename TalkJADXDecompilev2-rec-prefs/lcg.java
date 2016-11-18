package p000;

public final class lcg extends nyx<lcg> {
    private static volatile lcg[] f24569b;
    public Integer f24570a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28589b(nyt);
    }

    public static lcg[] m28590d() {
        if (f24569b == null) {
            synchronized (nzc.c) {
                if (f24569b == null) {
                    f24569b = new lcg[0];
                }
            }
        }
        return f24569b;
    }

    public lcg() {
        this.f24570a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24570a != null) {
            nyu.a(1, this.f24570a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24570a != null) {
            return b + nyu.f(1, this.f24570a.intValue());
        }
        return b;
    }

    private lcg m28589b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24570a = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
