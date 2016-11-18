package p000;

public final class odt extends nyx<odt> {
    public Float f32454a;
    public Float f32455b;
    public Float f32456c;
    public Float f32457d;

    public /* synthetic */ nzf m37899a(nyt nyt) {
        return m37898b(nyt);
    }

    public odt() {
        this.f32454a = null;
        this.f32455b = null;
        this.f32456c = null;
        this.f32457d = null;
        this.cachedSize = -1;
    }

    public void m37900a(nyu nyu) {
        if (this.f32454a != null) {
            nyu.m37167a(1, this.f32454a.floatValue());
        }
        if (this.f32455b != null) {
            nyu.m37167a(2, this.f32455b.floatValue());
        }
        if (this.f32456c != null) {
            nyu.m37167a(3, this.f32456c.floatValue());
        }
        if (this.f32457d != null) {
            nyu.m37167a(4, this.f32457d.floatValue());
        }
        super.a(nyu);
    }

    protected int m37901b() {
        int b = super.b();
        if (this.f32454a != null) {
            this.f32454a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32455b != null) {
            this.f32455b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f32456c != null) {
            this.f32456c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f32457d == null) {
            return b;
        }
        this.f32457d.floatValue();
        return b + (nyu.m37154h(4) + 4);
    }

    private odt m37898b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32454a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f32455b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f32456c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f32457d = Float.valueOf(nyt.m37106c());
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
