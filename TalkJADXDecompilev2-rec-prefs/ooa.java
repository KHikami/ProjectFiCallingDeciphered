package p000;

public final class ooa extends nyx<ooa> {
    private static volatile ooa[] f33352e;
    public String f33353a;
    public Integer f33354b;
    public Integer f33355c;
    public String f33356d;

    public /* synthetic */ nzf m38871a(nyt nyt) {
        return m38869b(nyt);
    }

    public static ooa[] m38870d() {
        if (f33352e == null) {
            synchronized (nzc.f31309c) {
                if (f33352e == null) {
                    f33352e = new ooa[0];
                }
            }
        }
        return f33352e;
    }

    public ooa() {
        this.f33353a = null;
        this.f33354b = null;
        this.f33355c = null;
        this.f33356d = null;
        this.cachedSize = -1;
    }

    public void m38872a(nyu nyu) {
        if (this.f33353a != null) {
            nyu.m37170a(1, this.f33353a);
        }
        if (this.f33354b != null) {
            nyu.m37168a(2, this.f33354b.intValue());
        }
        if (this.f33355c != null) {
            nyu.m37168a(3, this.f33355c.intValue());
        }
        if (this.f33356d != null) {
            nyu.m37170a(4, this.f33356d);
        }
        super.a(nyu);
    }

    protected int m38873b() {
        int b = super.b();
        if (this.f33353a != null) {
            b += nyu.m37137b(1, this.f33353a);
        }
        if (this.f33354b != null) {
            b += nyu.m37147f(2, this.f33354b.intValue());
        }
        if (this.f33355c != null) {
            b += nyu.m37147f(3, this.f33355c.intValue());
        }
        if (this.f33356d != null) {
            return b + nyu.m37137b(4, this.f33356d);
        }
        return b;
    }

    private ooa m38869b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33353a = nyt.m37117j();
                    continue;
                case 16:
                    this.f33354b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33355c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    this.f33356d = nyt.m37117j();
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
