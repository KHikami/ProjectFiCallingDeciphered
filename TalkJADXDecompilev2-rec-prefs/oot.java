package p000;

public final class oot extends nyx<oot> {
    private static volatile oot[] f33482k;
    public String f33483a;
    public String f33484b;
    public oou f33485c;
    public String f33486d;
    public String f33487e;
    public String f33488f;
    public oqu f33489g;
    public String f33490h;
    public String f33491i;
    public String f33492j;

    public /* synthetic */ nzf m38960a(nyt nyt) {
        return m38957b(nyt);
    }

    public static oot[] m38958d() {
        if (f33482k == null) {
            synchronized (nzc.f31309c) {
                if (f33482k == null) {
                    f33482k = new oot[0];
                }
            }
        }
        return f33482k;
    }

    public oot() {
        m38959g();
    }

    private oot m38959g() {
        this.f33483a = null;
        this.f33484b = null;
        this.f33485c = null;
        this.f33486d = null;
        this.f33487e = null;
        this.f33488f = null;
        this.f33489g = null;
        this.f33490h = null;
        this.f33491i = null;
        this.f33492j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38961a(nyu nyu) {
        if (this.f33483a != null) {
            nyu.m37170a(1, this.f33483a);
        }
        if (this.f33484b != null) {
            nyu.m37170a(2, this.f33484b);
        }
        if (this.f33485c != null) {
            nyu.m37182b(3, this.f33485c);
        }
        if (this.f33486d != null) {
            nyu.m37170a(4, this.f33486d);
        }
        if (this.f33487e != null) {
            nyu.m37170a(5, this.f33487e);
        }
        if (this.f33489g != null) {
            nyu.m37182b(6, this.f33489g);
        }
        if (this.f33490h != null) {
            nyu.m37170a(7, this.f33490h);
        }
        if (this.f33491i != null) {
            nyu.m37170a(8, this.f33491i);
        }
        if (this.f33488f != null) {
            nyu.m37170a(9, this.f33488f);
        }
        if (this.f33492j != null) {
            nyu.m37170a(10, this.f33492j);
        }
        super.a(nyu);
    }

    protected int m38962b() {
        int b = super.b();
        if (this.f33483a != null) {
            b += nyu.m37137b(1, this.f33483a);
        }
        if (this.f33484b != null) {
            b += nyu.m37137b(2, this.f33484b);
        }
        if (this.f33485c != null) {
            b += nyu.m37145d(3, this.f33485c);
        }
        if (this.f33486d != null) {
            b += nyu.m37137b(4, this.f33486d);
        }
        if (this.f33487e != null) {
            b += nyu.m37137b(5, this.f33487e);
        }
        if (this.f33489g != null) {
            b += nyu.m37145d(6, this.f33489g);
        }
        if (this.f33490h != null) {
            b += nyu.m37137b(7, this.f33490h);
        }
        if (this.f33491i != null) {
            b += nyu.m37137b(8, this.f33491i);
        }
        if (this.f33488f != null) {
            b += nyu.m37137b(9, this.f33488f);
        }
        if (this.f33492j != null) {
            return b + nyu.m37137b(10, this.f33492j);
        }
        return b;
    }

    private oot m38957b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33483a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33484b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f33485c == null) {
                        this.f33485c = new oou();
                    }
                    nyt.m37101a(this.f33485c);
                    continue;
                case 34:
                    this.f33486d = nyt.m37117j();
                    continue;
                case 42:
                    this.f33487e = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f33489g == null) {
                        this.f33489g = new oqu();
                    }
                    nyt.m37101a(this.f33489g);
                    continue;
                case 58:
                    this.f33490h = nyt.m37117j();
                    continue;
                case 66:
                    this.f33491i = nyt.m37117j();
                    continue;
                case 74:
                    this.f33488f = nyt.m37117j();
                    continue;
                case 82:
                    this.f33492j = nyt.m37117j();
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
