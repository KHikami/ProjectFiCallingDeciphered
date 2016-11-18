package p000;

public final class nuf extends nyx<nuf> {
    private static volatile nuf[] f30828b;
    public nhx f30829a;

    public /* synthetic */ nzf m36581a(nyt nyt) {
        return m36578b(nyt);
    }

    public static nuf[] m36579d() {
        if (f30828b == null) {
            synchronized (nzc.f31309c) {
                if (f30828b == null) {
                    f30828b = new nuf[0];
                }
            }
        }
        return f30828b;
    }

    public nuf() {
        m36580g();
    }

    private nuf m36580g() {
        this.f30829a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36582a(nyu nyu) {
        if (this.f30829a != null) {
            nyu.m37182b(1, this.f30829a);
        }
        super.a(nyu);
    }

    protected int m36583b() {
        int b = super.b();
        if (this.f30829a != null) {
            return b + nyu.m37145d(1, this.f30829a);
        }
        return b;
    }

    private nuf m36578b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30829a == null) {
                        this.f30829a = new nhx();
                    }
                    nyt.m37101a(this.f30829a);
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
