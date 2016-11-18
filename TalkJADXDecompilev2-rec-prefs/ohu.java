package p000;

public final class ohu extends nyx<ohu> {
    private static volatile ohu[] f32937b;
    public String f32938a;

    public /* synthetic */ nzf m38404a(nyt nyt) {
        return m38401b(nyt);
    }

    public static ohu[] m38402d() {
        if (f32937b == null) {
            synchronized (nzc.f31309c) {
                if (f32937b == null) {
                    f32937b = new ohu[0];
                }
            }
        }
        return f32937b;
    }

    public ohu() {
        m38403g();
    }

    private ohu m38403g() {
        this.f32938a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38405a(nyu nyu) {
        if (this.f32938a != null) {
            nyu.m37170a(1, this.f32938a);
        }
        super.a(nyu);
    }

    protected int m38406b() {
        int b = super.b();
        if (this.f32938a != null) {
            return b + nyu.m37137b(1, this.f32938a);
        }
        return b;
    }

    private ohu m38401b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32938a = nyt.m37117j();
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
