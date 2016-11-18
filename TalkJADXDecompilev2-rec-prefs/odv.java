package p000;

public final class odv extends nyx<odv> {
    public Integer f32458a;
    public Integer f32459b;

    public /* synthetic */ nzf m37905a(nyt nyt) {
        return m37904b(nyt);
    }

    public odv() {
        this.f32458a = null;
        this.f32459b = null;
        this.cachedSize = -1;
    }

    public void m37906a(nyu nyu) {
        if (this.f32458a != null) {
            nyu.m37168a(1, this.f32458a.intValue());
        }
        if (this.f32459b != null) {
            nyu.m37168a(2, this.f32459b.intValue());
        }
        super.a(nyu);
    }

    protected int m37907b() {
        int b = super.b();
        if (this.f32458a != null) {
            b += nyu.m37147f(1, this.f32458a.intValue());
        }
        if (this.f32459b != null) {
            return b + nyu.m37147f(2, this.f32459b.intValue());
        }
        return b;
    }

    private odv m37904b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32458a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f32459b = Integer.valueOf(nyt.m37112f());
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
