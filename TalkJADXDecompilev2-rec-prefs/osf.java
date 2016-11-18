package p000;

public final class osf extends nyx<osf> {
    private static volatile osf[] f34120d;
    public String f34121a;
    public Integer f34122b;
    public Integer f34123c;

    public /* synthetic */ nzf m39548a(nyt nyt) {
        return m39545b(nyt);
    }

    public static osf[] m39546d() {
        if (f34120d == null) {
            synchronized (nzc.f31309c) {
                if (f34120d == null) {
                    f34120d = new osf[0];
                }
            }
        }
        return f34120d;
    }

    public osf() {
        m39547g();
    }

    private osf m39547g() {
        this.f34121a = null;
        this.f34122b = null;
        this.f34123c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39549a(nyu nyu) {
        if (this.f34121a != null) {
            nyu.m37170a(1, this.f34121a);
        }
        if (this.f34122b != null) {
            nyu.m37168a(2, this.f34122b.intValue());
        }
        if (this.f34123c != null) {
            nyu.m37168a(3, this.f34123c.intValue());
        }
        super.a(nyu);
    }

    protected int m39550b() {
        int b = super.b();
        if (this.f34121a != null) {
            b += nyu.m37137b(1, this.f34121a);
        }
        if (this.f34122b != null) {
            b += nyu.m37147f(2, this.f34122b.intValue());
        }
        if (this.f34123c != null) {
            return b + nyu.m37147f(3, this.f34123c.intValue());
        }
        return b;
    }

    private osf m39545b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34121a = nyt.m37117j();
                    continue;
                case 16:
                    this.f34122b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34123c = Integer.valueOf(nyt.m37112f());
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
