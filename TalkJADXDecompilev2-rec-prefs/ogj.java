package p000;

public final class ogj extends nyx<ogj> {
    public Integer f32722a;
    public Integer f32723b;

    public /* synthetic */ nzf m38192a(nyt nyt) {
        return m38191b(nyt);
    }

    public ogj() {
        this.f32722a = null;
        this.f32723b = null;
        this.cachedSize = -1;
    }

    public void m38193a(nyu nyu) {
        if (this.f32722a != null) {
            nyu.m37168a(1, this.f32722a.intValue());
        }
        if (this.f32723b != null) {
            nyu.m37168a(2, this.f32723b.intValue());
        }
        super.a(nyu);
    }

    protected int m38194b() {
        int b = super.b();
        if (this.f32722a != null) {
            b += nyu.m37147f(1, this.f32722a.intValue());
        }
        if (this.f32723b != null) {
            return b + nyu.m37147f(2, this.f32723b.intValue());
        }
        return b;
    }

    private ogj m38191b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32722a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f32723b = Integer.valueOf(nyt.m37112f());
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
