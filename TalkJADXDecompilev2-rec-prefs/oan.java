package p000;

public final class oan extends nyx<oan> {
    private static volatile oan[] f31657e;
    public int f31658a;
    public String f31659b;
    public String f31660c;
    public String f31661d;

    public /* synthetic */ nzf m37437a(nyt nyt) {
        return m37435b(nyt);
    }

    public static oan[] m37436d() {
        if (f31657e == null) {
            synchronized (nzc.f31309c) {
                if (f31657e == null) {
                    f31657e = new oan[0];
                }
            }
        }
        return f31657e;
    }

    public oan() {
        this.f31658a = nzf.UNSET_ENUM_VALUE;
        this.f31659b = null;
        this.f31660c = null;
        this.f31661d = null;
        this.cachedSize = -1;
    }

    public void m37438a(nyu nyu) {
        if (this.f31658a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f31658a);
        }
        if (this.f31659b != null) {
            nyu.m37170a(2, this.f31659b);
        }
        if (this.f31660c != null) {
            nyu.m37170a(3, this.f31660c);
        }
        if (this.f31661d != null) {
            nyu.m37170a(4, this.f31661d);
        }
        super.a(nyu);
    }

    protected int m37439b() {
        int b = super.b();
        if (this.f31658a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f31658a);
        }
        if (this.f31659b != null) {
            b += nyu.m37137b(2, this.f31659b);
        }
        if (this.f31660c != null) {
            b += nyu.m37137b(3, this.f31660c);
        }
        if (this.f31661d != null) {
            return b + nyu.m37137b(4, this.f31661d);
        }
        return b;
    }

    private oan m37435b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f31658a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f31659b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31660c = nyt.m37117j();
                    continue;
                case 34:
                    this.f31661d = nyt.m37117j();
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
