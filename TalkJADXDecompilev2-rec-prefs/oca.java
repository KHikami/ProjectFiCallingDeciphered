package p000;

public final class oca extends nyx<oca> {
    public static final nyy<nzs, oca> f32156a = nyy.m37203a(11, oca.class, 218917042);
    private static final oca[] f32157k = new oca[0];
    public String f32158b;
    public String f32159c;
    public String f32160d;
    public String f32161e;
    public String f32162f;
    public String f32163g;
    public String f32164h;
    public String f32165i;
    public nzs f32166j;

    public /* synthetic */ nzf m37707a(nyt nyt) {
        return m37706b(nyt);
    }

    public oca() {
        this.f32158b = null;
        this.f32159c = null;
        this.f32160d = null;
        this.f32161e = null;
        this.f32162f = null;
        this.f32163g = null;
        this.f32164h = null;
        this.f32165i = null;
        this.cachedSize = -1;
    }

    public void m37708a(nyu nyu) {
        if (this.f32158b != null) {
            nyu.m37170a(1, this.f32158b);
        }
        if (this.f32159c != null) {
            nyu.m37170a(2, this.f32159c);
        }
        if (this.f32160d != null) {
            nyu.m37170a(3, this.f32160d);
        }
        if (this.f32161e != null) {
            nyu.m37170a(4, this.f32161e);
        }
        if (this.f32162f != null) {
            nyu.m37170a(5, this.f32162f);
        }
        if (this.f32163g != null) {
            nyu.m37170a(6, this.f32163g);
        }
        if (this.f32164h != null) {
            nyu.m37170a(7, this.f32164h);
        }
        if (this.f32165i != null) {
            nyu.m37170a(8, this.f32165i);
        }
        if (this.f32166j != null) {
            nyu.m37182b(9, this.f32166j);
        }
        super.a(nyu);
    }

    protected int m37709b() {
        int b = super.b();
        if (this.f32158b != null) {
            b += nyu.m37137b(1, this.f32158b);
        }
        if (this.f32159c != null) {
            b += nyu.m37137b(2, this.f32159c);
        }
        if (this.f32160d != null) {
            b += nyu.m37137b(3, this.f32160d);
        }
        if (this.f32161e != null) {
            b += nyu.m37137b(4, this.f32161e);
        }
        if (this.f32162f != null) {
            b += nyu.m37137b(5, this.f32162f);
        }
        if (this.f32163g != null) {
            b += nyu.m37137b(6, this.f32163g);
        }
        if (this.f32164h != null) {
            b += nyu.m37137b(7, this.f32164h);
        }
        if (this.f32165i != null) {
            b += nyu.m37137b(8, this.f32165i);
        }
        if (this.f32166j != null) {
            return b + nyu.m37145d(9, this.f32166j);
        }
        return b;
    }

    private oca m37706b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32158b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32159c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32160d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32161e = nyt.m37117j();
                    continue;
                case 42:
                    this.f32162f = nyt.m37117j();
                    continue;
                case 50:
                    this.f32163g = nyt.m37117j();
                    continue;
                case 58:
                    this.f32164h = nyt.m37117j();
                    continue;
                case 66:
                    this.f32165i = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f32166j == null) {
                        this.f32166j = new nzs();
                    }
                    nyt.m37101a(this.f32166j);
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
