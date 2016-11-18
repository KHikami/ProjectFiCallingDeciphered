package p000;

public final class odj extends nyx<odj> {
    public Float f32417a;
    public Float f32418b;
    public Float f32419c;

    public /* synthetic */ nzf m37858a(nyt nyt) {
        return m37857b(nyt);
    }

    public odj() {
        this.f32417a = null;
        this.f32418b = null;
        this.f32419c = null;
        this.cachedSize = -1;
    }

    public void m37859a(nyu nyu) {
        if (this.f32417a != null) {
            nyu.m37167a(1, this.f32417a.floatValue());
        }
        if (this.f32418b != null) {
            nyu.m37167a(2, this.f32418b.floatValue());
        }
        if (this.f32419c != null) {
            nyu.m37167a(3, this.f32419c.floatValue());
        }
        super.a(nyu);
    }

    protected int m37860b() {
        int b = super.b();
        if (this.f32417a != null) {
            this.f32417a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32418b != null) {
            this.f32418b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f32419c == null) {
            return b;
        }
        this.f32419c.floatValue();
        return b + (nyu.m37154h(3) + 4);
    }

    private odj m37857b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32417a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f32418b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f32419c = Float.valueOf(nyt.m37106c());
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
