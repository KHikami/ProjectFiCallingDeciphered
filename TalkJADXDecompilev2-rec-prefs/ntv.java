package p000;

public final class ntv extends nyx<ntv> {
    private static volatile ntv[] f30791e;
    public Integer f30792a;
    public Integer f30793b;
    public Integer f30794c;
    public String f30795d;

    public /* synthetic */ nzf m36529a(nyt nyt) {
        return m36527b(nyt);
    }

    public static ntv[] m36528d() {
        if (f30791e == null) {
            synchronized (nzc.f31309c) {
                if (f30791e == null) {
                    f30791e = new ntv[0];
                }
            }
        }
        return f30791e;
    }

    public ntv() {
        this.f30792a = null;
        this.f30793b = null;
        this.f30794c = null;
        this.f30795d = null;
        this.cachedSize = -1;
    }

    public void m36530a(nyu nyu) {
        if (this.f30792a != null) {
            nyu.m37168a(1, this.f30792a.intValue());
        }
        if (this.f30793b != null) {
            nyu.m37168a(2, this.f30793b.intValue());
        }
        if (this.f30794c != null) {
            nyu.m37168a(3, this.f30794c.intValue());
        }
        if (this.f30795d != null) {
            nyu.m37170a(4, this.f30795d);
        }
        super.a(nyu);
    }

    protected int m36531b() {
        int b = super.b();
        if (this.f30792a != null) {
            b += nyu.m37147f(1, this.f30792a.intValue());
        }
        if (this.f30793b != null) {
            b += nyu.m37147f(2, this.f30793b.intValue());
        }
        if (this.f30794c != null) {
            b += nyu.m37147f(3, this.f30794c.intValue());
        }
        if (this.f30795d != null) {
            return b + nyu.m37137b(4, this.f30795d);
        }
        return b;
    }

    private ntv m36527b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30792a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30793b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f30794c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    this.f30795d = nyt.m37117j();
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
