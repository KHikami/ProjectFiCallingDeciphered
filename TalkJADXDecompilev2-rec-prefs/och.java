package p000;

public final class och extends nyx<och> {
    public String f32244a;
    public String f32245b;
    public String f32246c;
    public String f32247d;

    public /* synthetic */ nzf m37738a(nyt nyt) {
        return m37737b(nyt);
    }

    public och() {
        this.f32244a = null;
        this.f32245b = null;
        this.f32246c = null;
        this.f32247d = null;
        this.cachedSize = -1;
    }

    public void m37739a(nyu nyu) {
        if (this.f32244a != null) {
            nyu.m37170a(1, this.f32244a);
        }
        if (this.f32245b != null) {
            nyu.m37170a(2, this.f32245b);
        }
        if (this.f32246c != null) {
            nyu.m37170a(3, this.f32246c);
        }
        if (this.f32247d != null) {
            nyu.m37170a(4, this.f32247d);
        }
        super.a(nyu);
    }

    protected int m37740b() {
        int b = super.b();
        if (this.f32244a != null) {
            b += nyu.m37137b(1, this.f32244a);
        }
        if (this.f32245b != null) {
            b += nyu.m37137b(2, this.f32245b);
        }
        if (this.f32246c != null) {
            b += nyu.m37137b(3, this.f32246c);
        }
        if (this.f32247d != null) {
            return b + nyu.m37137b(4, this.f32247d);
        }
        return b;
    }

    private och m37737b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32244a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32245b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32246c = nyt.m37117j();
                    continue;
                case 34:
                    this.f32247d = nyt.m37117j();
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
