package p000;

public final class ofl extends nyx<ofl> {
    public nzs f32643a;
    public String f32644b;

    public /* synthetic */ nzf m38073a(nyt nyt) {
        return m38072b(nyt);
    }

    public ofl() {
        this.f32644b = null;
        this.cachedSize = -1;
    }

    public void m38074a(nyu nyu) {
        if (this.f32643a != null) {
            nyu.m37182b(1, this.f32643a);
        }
        if (this.f32644b != null) {
            nyu.m37170a(3, this.f32644b);
        }
        super.a(nyu);
    }

    protected int m38075b() {
        int b = super.b();
        if (this.f32643a != null) {
            b += nyu.m37145d(1, this.f32643a);
        }
        if (this.f32644b != null) {
            return b + nyu.m37137b(3, this.f32644b);
        }
        return b;
    }

    private ofl m38072b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32643a == null) {
                        this.f32643a = new nzs();
                    }
                    nyt.m37101a(this.f32643a);
                    continue;
                case wi.dx /*26*/:
                    this.f32644b = nyt.m37117j();
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
