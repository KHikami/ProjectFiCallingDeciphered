package p000;

public final class oah extends nyx<oah> {
    private static volatile oah[] f31549b;
    public String f31550a;

    public /* synthetic */ nzf m37408a(nyt nyt) {
        return m37405b(nyt);
    }

    public static oah[] m37406d() {
        if (f31549b == null) {
            synchronized (nzc.f31309c) {
                if (f31549b == null) {
                    f31549b = new oah[0];
                }
            }
        }
        return f31549b;
    }

    public oah() {
        m37407g();
    }

    private oah m37407g() {
        this.f31550a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37409a(nyu nyu) {
        if (this.f31550a != null) {
            nyu.m37170a(1, this.f31550a);
        }
        super.a(nyu);
    }

    protected int m37410b() {
        int b = super.b();
        if (this.f31550a != null) {
            return b + nyu.m37137b(1, this.f31550a);
        }
        return b;
    }

    private oah m37405b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31550a = nyt.m37117j();
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
