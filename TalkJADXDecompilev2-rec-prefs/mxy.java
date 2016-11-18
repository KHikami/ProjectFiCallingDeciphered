package p000;

public final class mxy extends nyx<mxy> {
    private static volatile mxy[] f29105f;
    public Float f29106a;
    public Float f29107b;
    public Float f29108c;
    public Float f29109d;
    public Float f29110e;

    public /* synthetic */ nzf m33752a(nyt nyt) {
        return m33749b(nyt);
    }

    public static mxy[] m33750d() {
        if (f29105f == null) {
            synchronized (nzc.f31309c) {
                if (f29105f == null) {
                    f29105f = new mxy[0];
                }
            }
        }
        return f29105f;
    }

    public mxy() {
        m33751g();
    }

    private mxy m33751g() {
        this.f29106a = null;
        this.f29107b = null;
        this.f29108c = null;
        this.f29109d = null;
        this.f29110e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33753a(nyu nyu) {
        if (this.f29106a != null) {
            nyu.m37167a(1, this.f29106a.floatValue());
        }
        if (this.f29107b != null) {
            nyu.m37167a(2, this.f29107b.floatValue());
        }
        if (this.f29108c != null) {
            nyu.m37167a(3, this.f29108c.floatValue());
        }
        if (this.f29109d != null) {
            nyu.m37167a(4, this.f29109d.floatValue());
        }
        if (this.f29110e != null) {
            nyu.m37167a(5, this.f29110e.floatValue());
        }
        super.a(nyu);
    }

    protected int m33754b() {
        int b = super.b();
        if (this.f29106a != null) {
            this.f29106a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f29107b != null) {
            this.f29107b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f29108c != null) {
            this.f29108c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f29109d != null) {
            this.f29109d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f29110e == null) {
            return b;
        }
        this.f29110e.floatValue();
        return b + (nyu.m37154h(5) + 4);
    }

    private mxy m33749b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f29106a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f29107b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f29108c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f29109d = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f29110e = Float.valueOf(nyt.m37106c());
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
