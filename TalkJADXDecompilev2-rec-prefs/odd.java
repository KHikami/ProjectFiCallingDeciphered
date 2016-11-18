package p000;

public final class odd extends nyx<odd> {
    private static volatile odd[] f32360k;
    public Float f32361a;
    public Float f32362b;
    public Float f32363c;
    public Boolean f32364d;
    public Float f32365e;
    public Float f32366f;
    public Float f32367g;
    public Float f32368h;
    public Float f32369i;
    public Float f32370j;

    public /* synthetic */ nzf m37831a(nyt nyt) {
        return m37829b(nyt);
    }

    public static odd[] m37830d() {
        if (f32360k == null) {
            synchronized (nzc.f31309c) {
                if (f32360k == null) {
                    f32360k = new odd[0];
                }
            }
        }
        return f32360k;
    }

    public odd() {
        this.f32361a = null;
        this.f32362b = null;
        this.f32363c = null;
        this.f32364d = null;
        this.f32365e = null;
        this.f32366f = null;
        this.f32367g = null;
        this.f32368h = null;
        this.f32369i = null;
        this.f32370j = null;
        this.cachedSize = -1;
    }

    public void m37832a(nyu nyu) {
        if (this.f32361a != null) {
            nyu.m37167a(1, this.f32361a.floatValue());
        }
        if (this.f32362b != null) {
            nyu.m37167a(2, this.f32362b.floatValue());
        }
        if (this.f32363c != null) {
            nyu.m37167a(3, this.f32363c.floatValue());
        }
        if (this.f32364d != null) {
            nyu.m37172a(4, this.f32364d.booleanValue());
        }
        if (this.f32365e != null) {
            nyu.m37167a(5, this.f32365e.floatValue());
        }
        if (this.f32366f != null) {
            nyu.m37167a(6, this.f32366f.floatValue());
        }
        if (this.f32367g != null) {
            nyu.m37167a(7, this.f32367g.floatValue());
        }
        if (this.f32368h != null) {
            nyu.m37167a(8, this.f32368h.floatValue());
        }
        if (this.f32369i != null) {
            nyu.m37167a(9, this.f32369i.floatValue());
        }
        if (this.f32370j != null) {
            nyu.m37167a(10, this.f32370j.floatValue());
        }
        super.a(nyu);
    }

    protected int m37833b() {
        int b = super.b();
        if (this.f32361a != null) {
            this.f32361a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32362b != null) {
            this.f32362b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f32363c != null) {
            this.f32363c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f32364d != null) {
            this.f32364d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f32365e != null) {
            this.f32365e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f32366f != null) {
            this.f32366f.floatValue();
            b += nyu.m37154h(6) + 4;
        }
        if (this.f32367g != null) {
            this.f32367g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f32368h != null) {
            this.f32368h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f32369i != null) {
            this.f32369i.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f32370j == null) {
            return b;
        }
        this.f32370j.floatValue();
        return b + (nyu.m37154h(10) + 4);
    }

    private odd m37829b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32361a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f32362b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f32363c = Float.valueOf(nyt.m37106c());
                    continue;
                case 32:
                    this.f32364d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 45:
                    this.f32365e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f32366f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f32367g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f32368h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f32369i = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f32370j = Float.valueOf(nyt.m37106c());
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
