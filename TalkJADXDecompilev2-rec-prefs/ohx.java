package p000;

public final class ohx extends nyx<ohx> {
    private static volatile ohx[] f32945b;
    public Integer f32946a;

    public /* synthetic */ nzf m38421a(nyt nyt) {
        return m38418b(nyt);
    }

    public static ohx[] m38419d() {
        if (f32945b == null) {
            synchronized (nzc.f31309c) {
                if (f32945b == null) {
                    f32945b = new ohx[0];
                }
            }
        }
        return f32945b;
    }

    public ohx() {
        m38420g();
    }

    private ohx m38420g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38422a(nyu nyu) {
        if (this.f32946a != null) {
            nyu.m37168a(1, this.f32946a.intValue());
        }
        super.a(nyu);
    }

    protected int m38423b() {
        int b = super.b();
        if (this.f32946a != null) {
            return b + nyu.m37147f(1, this.f32946a.intValue());
        }
        return b;
    }

    private ohx m38418b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32946a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
