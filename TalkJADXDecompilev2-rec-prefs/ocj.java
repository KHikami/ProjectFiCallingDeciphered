package p000;

public final class ocj extends nyx<ocj> {
    public String f32252a;
    public String f32253b;
    public byte[] f32254c;
    public byte[] f32255d;

    public /* synthetic */ nzf m37746a(nyt nyt) {
        return m37745b(nyt);
    }

    public ocj() {
        this.f32252a = null;
        this.f32253b = null;
        this.f32254c = null;
        this.f32255d = null;
        this.cachedSize = -1;
    }

    public void m37747a(nyu nyu) {
        nyu.m37170a(1, this.f32252a);
        if (this.f32253b != null) {
            nyu.m37170a(2, this.f32253b);
        }
        if (this.f32254c != null) {
            nyu.m37173a(3, this.f32254c);
        }
        if (this.f32255d != null) {
            nyu.m37173a(4, this.f32255d);
        }
        super.a(nyu);
    }

    protected int m37748b() {
        int b = super.b() + nyu.m37137b(1, this.f32252a);
        if (this.f32253b != null) {
            b += nyu.m37137b(2, this.f32253b);
        }
        if (this.f32254c != null) {
            b += nyu.m37139b(3, this.f32254c);
        }
        if (this.f32255d != null) {
            return b + nyu.m37139b(4, this.f32255d);
        }
        return b;
    }

    private ocj m37745b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32252a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32253b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32254c = nyt.m37118k();
                    continue;
                case 34:
                    this.f32255d = nyt.m37118k();
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
