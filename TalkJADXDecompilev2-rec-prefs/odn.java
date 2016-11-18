package p000;

public final class odn extends nyx<odn> {
    public Float f32437a;
    public Float f32438b;

    public /* synthetic */ nzf m37874a(nyt nyt) {
        return m37873b(nyt);
    }

    public odn() {
        this.f32437a = null;
        this.f32438b = null;
        this.cachedSize = -1;
    }

    public void m37875a(nyu nyu) {
        if (this.f32437a != null) {
            nyu.m37167a(1, this.f32437a.floatValue());
        }
        if (this.f32438b != null) {
            nyu.m37167a(2, this.f32438b.floatValue());
        }
        super.a(nyu);
    }

    protected int m37876b() {
        int b = super.b();
        if (this.f32437a != null) {
            this.f32437a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32438b == null) {
            return b;
        }
        this.f32438b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private odn m37873b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32437a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f32438b = Float.valueOf(nyt.m37106c());
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
