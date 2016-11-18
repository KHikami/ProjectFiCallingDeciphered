package p000;

public final class ocb extends nyx<ocb> {
    public static final nyy<nzr, ocb> f32167a = nyy.m37203a(11, ocb.class, 218917042);
    private static final ocb[] f32168k = new ocb[0];
    public String f32169b;
    public String f32170c;
    public String f32171d;
    public String f32172e;
    public String f32173f;
    public String f32174g;
    public String f32175h;
    public String f32176i;
    public nzr f32177j;

    public /* synthetic */ nzf m37712a(nyt nyt) {
        return m37710b(nyt);
    }

    public ocb() {
        m37711d();
    }

    private ocb m37711d() {
        this.f32169b = null;
        this.f32170c = null;
        this.f32171d = null;
        this.f32172e = null;
        this.f32173f = null;
        this.f32174g = null;
        this.f32175h = null;
        this.f32176i = null;
        this.f32177j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37713a(nyu nyu) {
        if (this.f32169b != null) {
            nyu.m37170a(1, this.f32169b);
        }
        if (this.f32170c != null) {
            nyu.m37170a(2, this.f32170c);
        }
        if (this.f32171d != null) {
            nyu.m37170a(3, this.f32171d);
        }
        if (this.f32172e != null) {
            nyu.m37170a(4, this.f32172e);
        }
        if (this.f32173f != null) {
            nyu.m37170a(5, this.f32173f);
        }
        if (this.f32174g != null) {
            nyu.m37170a(6, this.f32174g);
        }
        if (this.f32175h != null) {
            nyu.m37170a(7, this.f32175h);
        }
        if (this.f32176i != null) {
            nyu.m37170a(8, this.f32176i);
        }
        if (this.f32177j != null) {
            nyu.m37182b(9, this.f32177j);
        }
        super.a(nyu);
    }

    protected int m37714b() {
        int b = super.b();
        if (this.f32169b != null) {
            b += nyu.m37137b(1, this.f32169b);
        }
        if (this.f32170c != null) {
            b += nyu.m37137b(2, this.f32170c);
        }
        if (this.f32171d != null) {
            b += nyu.m37137b(3, this.f32171d);
        }
        if (this.f32172e != null) {
            b += nyu.m37137b(4, this.f32172e);
        }
        if (this.f32173f != null) {
            b += nyu.m37137b(5, this.f32173f);
        }
        if (this.f32174g != null) {
            b += nyu.m37137b(6, this.f32174g);
        }
        if (this.f32175h != null) {
            b += nyu.m37137b(7, this.f32175h);
        }
        if (this.f32176i != null) {
            b += nyu.m37137b(8, this.f32176i);
        }
        if (this.f32177j != null) {
            return b + nyu.m37145d(9, this.f32177j);
        }
        return b;
    }

    private ocb m37710b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32169b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32170c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32171d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32172e = nyt.m37117j();
                    continue;
                case 42:
                    this.f32173f = nyt.m37117j();
                    continue;
                case 50:
                    this.f32174g = nyt.m37117j();
                    continue;
                case 58:
                    this.f32175h = nyt.m37117j();
                    continue;
                case 66:
                    this.f32176i = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f32177j == null) {
                        this.f32177j = new nzr();
                    }
                    nyt.m37101a(this.f32177j);
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
