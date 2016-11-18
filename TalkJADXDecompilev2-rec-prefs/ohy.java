package p000;

public final class ohy extends nyx<ohy> {
    public ohu f32947a;

    public /* synthetic */ nzf m38426a(nyt nyt) {
        return m38424b(nyt);
    }

    public ohy() {
        m38425d();
    }

    private ohy m38425d() {
        this.f32947a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38427a(nyu nyu) {
        if (this.f32947a != null) {
            nyu.m37182b(1, this.f32947a);
        }
        super.a(nyu);
    }

    protected int m38428b() {
        int b = super.b();
        if (this.f32947a != null) {
            return b + nyu.m37145d(1, this.f32947a);
        }
        return b;
    }

    private ohy m38424b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32947a == null) {
                        this.f32947a = new ohu();
                    }
                    nyt.m37101a(this.f32947a);
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
