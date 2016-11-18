package p000;

public final class obp extends nyx<obp> {
    public static final nyy<nzr, obp> f32016a = nyy.m37203a(11, obp.class, 217977098);
    private static final obp[] f32017l = new obp[0];
    public String f32018b;
    public String f32019c;
    public String f32020d;
    public String f32021e;
    public String f32022f;
    public oaa f32023g;
    public String f32024h;
    public String f32025i;
    public nzr f32026j;
    public oac f32027k;

    public /* synthetic */ nzf m37654a(nyt nyt) {
        return m37652b(nyt);
    }

    public obp() {
        m37653d();
    }

    private obp m37653d() {
        this.f32018b = null;
        this.f32019c = null;
        this.f32020d = null;
        this.f32021e = null;
        this.f32022f = null;
        this.f32023g = null;
        this.f32024h = null;
        this.f32025i = null;
        this.f32026j = null;
        this.f32027k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37655a(nyu nyu) {
        if (this.f32018b != null) {
            nyu.m37170a(1, this.f32018b);
        }
        if (this.f32019c != null) {
            nyu.m37170a(2, this.f32019c);
        }
        if (this.f32020d != null) {
            nyu.m37170a(3, this.f32020d);
        }
        if (this.f32025i != null) {
            nyu.m37170a(4, this.f32025i);
        }
        if (this.f32022f != null) {
            nyu.m37170a(5, this.f32022f);
        }
        if (this.f32023g != null) {
            nyu.m37182b(6, this.f32023g);
        }
        if (this.f32021e != null) {
            nyu.m37170a(7, this.f32021e);
        }
        if (this.f32024h != null) {
            nyu.m37170a(11, this.f32024h);
        }
        if (this.f32026j != null) {
            nyu.m37182b(12, this.f32026j);
        }
        if (this.f32027k != null) {
            nyu.m37182b(13, this.f32027k);
        }
        super.a(nyu);
    }

    protected int m37656b() {
        int b = super.b();
        if (this.f32018b != null) {
            b += nyu.m37137b(1, this.f32018b);
        }
        if (this.f32019c != null) {
            b += nyu.m37137b(2, this.f32019c);
        }
        if (this.f32020d != null) {
            b += nyu.m37137b(3, this.f32020d);
        }
        if (this.f32025i != null) {
            b += nyu.m37137b(4, this.f32025i);
        }
        if (this.f32022f != null) {
            b += nyu.m37137b(5, this.f32022f);
        }
        if (this.f32023g != null) {
            b += nyu.m37145d(6, this.f32023g);
        }
        if (this.f32021e != null) {
            b += nyu.m37137b(7, this.f32021e);
        }
        if (this.f32024h != null) {
            b += nyu.m37137b(11, this.f32024h);
        }
        if (this.f32026j != null) {
            b += nyu.m37145d(12, this.f32026j);
        }
        if (this.f32027k != null) {
            return b + nyu.m37145d(13, this.f32027k);
        }
        return b;
    }

    private obp m37652b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32018b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32019c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32020d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32025i = nyt.m37117j();
                    continue;
                case 42:
                    this.f32022f = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f32023g == null) {
                        this.f32023g = new oaa();
                    }
                    nyt.m37101a(this.f32023g);
                    continue;
                case 58:
                    this.f32021e = nyt.m37117j();
                    continue;
                case 90:
                    this.f32024h = nyt.m37117j();
                    continue;
                case 98:
                    if (this.f32026j == null) {
                        this.f32026j = new nzr();
                    }
                    nyt.m37101a(this.f32026j);
                    continue;
                case 106:
                    if (this.f32027k == null) {
                        this.f32027k = new oac();
                    }
                    nyt.m37101a(this.f32027k);
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
