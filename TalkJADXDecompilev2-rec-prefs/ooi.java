package p000;

public final class ooi extends nyx<ooi> {
    private static volatile ooi[] f33387b;
    public String f33388a;

    public /* synthetic */ nzf m38906a(nyt nyt) {
        return m38904b(nyt);
    }

    public static ooi[] m38905d() {
        if (f33387b == null) {
            synchronized (nzc.f31309c) {
                if (f33387b == null) {
                    f33387b = new ooi[0];
                }
            }
        }
        return f33387b;
    }

    public ooi() {
        this.f33388a = null;
        this.cachedSize = -1;
    }

    public void m38907a(nyu nyu) {
        if (this.f33388a != null) {
            nyu.m37170a(1, this.f33388a);
        }
        super.a(nyu);
    }

    protected int m38908b() {
        int b = super.b();
        if (this.f33388a != null) {
            return b + nyu.m37137b(1, this.f33388a);
        }
        return b;
    }

    private ooi m38904b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33388a = nyt.m37117j();
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
