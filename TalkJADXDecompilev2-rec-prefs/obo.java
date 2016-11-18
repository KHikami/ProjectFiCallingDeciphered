package p000;

public final class obo extends nyx<obo> {
    public static final nyy<nzs, obo> f32004a = nyy.m37203a(11, obo.class, 217977098);
    private static final obo[] f32005l = new obo[0];
    public String f32006b;
    public String f32007c;
    public String f32008d;
    public String f32009e;
    public String f32010f;
    public obs f32011g;
    public String f32012h;
    public String f32013i;
    public nzs f32014j;
    public obu f32015k;

    public /* synthetic */ nzf m37649a(nyt nyt) {
        return m37648b(nyt);
    }

    public obo() {
        this.f32006b = null;
        this.f32007c = null;
        this.f32008d = null;
        this.f32009e = null;
        this.f32010f = null;
        this.f32012h = null;
        this.f32013i = null;
        this.cachedSize = -1;
    }

    public void m37650a(nyu nyu) {
        if (this.f32006b != null) {
            nyu.m37170a(1, this.f32006b);
        }
        if (this.f32007c != null) {
            nyu.m37170a(2, this.f32007c);
        }
        if (this.f32008d != null) {
            nyu.m37170a(3, this.f32008d);
        }
        if (this.f32013i != null) {
            nyu.m37170a(4, this.f32013i);
        }
        if (this.f32010f != null) {
            nyu.m37170a(5, this.f32010f);
        }
        if (this.f32011g != null) {
            nyu.m37182b(6, this.f32011g);
        }
        if (this.f32009e != null) {
            nyu.m37170a(7, this.f32009e);
        }
        if (this.f32012h != null) {
            nyu.m37170a(11, this.f32012h);
        }
        if (this.f32014j != null) {
            nyu.m37182b(12, this.f32014j);
        }
        if (this.f32015k != null) {
            nyu.m37182b(13, this.f32015k);
        }
        super.a(nyu);
    }

    protected int m37651b() {
        int b = super.b();
        if (this.f32006b != null) {
            b += nyu.m37137b(1, this.f32006b);
        }
        if (this.f32007c != null) {
            b += nyu.m37137b(2, this.f32007c);
        }
        if (this.f32008d != null) {
            b += nyu.m37137b(3, this.f32008d);
        }
        if (this.f32013i != null) {
            b += nyu.m37137b(4, this.f32013i);
        }
        if (this.f32010f != null) {
            b += nyu.m37137b(5, this.f32010f);
        }
        if (this.f32011g != null) {
            b += nyu.m37145d(6, this.f32011g);
        }
        if (this.f32009e != null) {
            b += nyu.m37137b(7, this.f32009e);
        }
        if (this.f32012h != null) {
            b += nyu.m37137b(11, this.f32012h);
        }
        if (this.f32014j != null) {
            b += nyu.m37145d(12, this.f32014j);
        }
        if (this.f32015k != null) {
            return b + nyu.m37145d(13, this.f32015k);
        }
        return b;
    }

    private obo m37648b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32006b = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32007c = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32008d = nyt.m37117j();
                    continue;
                case 34:
                    this.f32013i = nyt.m37117j();
                    continue;
                case 42:
                    this.f32010f = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f32011g == null) {
                        this.f32011g = new obs();
                    }
                    nyt.m37101a(this.f32011g);
                    continue;
                case 58:
                    this.f32009e = nyt.m37117j();
                    continue;
                case 90:
                    this.f32012h = nyt.m37117j();
                    continue;
                case 98:
                    if (this.f32014j == null) {
                        this.f32014j = new nzs();
                    }
                    nyt.m37101a(this.f32014j);
                    continue;
                case 106:
                    if (this.f32015k == null) {
                        this.f32015k = new obu();
                    }
                    nyt.m37101a(this.f32015k);
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
