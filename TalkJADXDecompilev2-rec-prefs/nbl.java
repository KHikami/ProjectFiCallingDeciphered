package p000;

public final class nbl extends nyx<nbl> {
    private static volatile nbl[] f29435c;
    public String f29436a;
    public Integer f29437b;

    public /* synthetic */ nzf m34192a(nyt nyt) {
        return m34190b(nyt);
    }

    public static nbl[] m34191d() {
        if (f29435c == null) {
            synchronized (nzc.f31309c) {
                if (f29435c == null) {
                    f29435c = new nbl[0];
                }
            }
        }
        return f29435c;
    }

    public nbl() {
        this.f29436a = null;
        this.f29437b = null;
        this.cachedSize = -1;
    }

    public void m34193a(nyu nyu) {
        if (this.f29436a != null) {
            nyu.m37170a(1, this.f29436a);
        }
        if (this.f29437b != null) {
            nyu.m37168a(2, this.f29437b.intValue());
        }
        super.a(nyu);
    }

    protected int m34194b() {
        int b = super.b();
        if (this.f29436a != null) {
            b += nyu.m37137b(1, this.f29436a);
        }
        if (this.f29437b != null) {
            return b + nyu.m37147f(2, this.f29437b.intValue());
        }
        return b;
    }

    private nbl m34190b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29436a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29437b = Integer.valueOf(nyt.m37112f());
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
