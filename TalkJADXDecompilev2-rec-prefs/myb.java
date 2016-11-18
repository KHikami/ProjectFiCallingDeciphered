package p000;

public final class myb extends nyx<myb> {
    private static volatile myb[] f29117e;
    public mxy f29118a;
    public Long f29119b;
    public Float f29120c;
    public Float f29121d;

    public /* synthetic */ nzf m33771a(nyt nyt) {
        return m33768b(nyt);
    }

    public static myb[] m33769d() {
        if (f29117e == null) {
            synchronized (nzc.f31309c) {
                if (f29117e == null) {
                    f29117e = new myb[0];
                }
            }
        }
        return f29117e;
    }

    public myb() {
        m33770g();
    }

    private myb m33770g() {
        this.f29118a = null;
        this.f29119b = null;
        this.f29120c = null;
        this.f29121d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33772a(nyu nyu) {
        if (this.f29118a != null) {
            nyu.m37182b(1, this.f29118a);
        }
        if (this.f29119b != null) {
            nyu.m37181b(2, this.f29119b.longValue());
        }
        if (this.f29121d != null) {
            nyu.m37167a(3, this.f29121d.floatValue());
        }
        if (this.f29120c != null) {
            nyu.m37167a(4, this.f29120c.floatValue());
        }
        super.a(nyu);
    }

    protected int m33773b() {
        int b = super.b();
        if (this.f29118a != null) {
            b += nyu.m37145d(1, this.f29118a);
        }
        if (this.f29119b != null) {
            b += nyu.m37148f(2, this.f29119b.longValue());
        }
        if (this.f29121d != null) {
            this.f29121d.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f29120c == null) {
            return b;
        }
        this.f29120c.floatValue();
        return b + (nyu.m37154h(4) + 4);
    }

    private myb m33768b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29118a == null) {
                        this.f29118a = new mxy();
                    }
                    nyt.m37101a(this.f29118a);
                    continue;
                case 16:
                    this.f29119b = Long.valueOf(nyt.m37110e());
                    continue;
                case 29:
                    this.f29121d = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f29120c = Float.valueOf(nyt.m37106c());
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
