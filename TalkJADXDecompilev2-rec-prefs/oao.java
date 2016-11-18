package p000;

public final class oao extends nyx<oao> {
    public static final nyy<nzs, oao> f31662a = nyy.m37203a(11, oao.class, 217756658);
    public static final oao[] f31663b = new oao[0];
    public String f31664c;
    public String f31665d;
    public String f31666e;
    public String f31667f;
    public String f31668g;
    public String f31669h;
    public nzs f31670i;

    public /* synthetic */ nzf m37441a(nyt nyt) {
        return m37440b(nyt);
    }

    public oao() {
        this.f31664c = null;
        this.f31665d = null;
        this.f31666e = null;
        this.f31667f = null;
        this.f31668g = null;
        this.f31669h = null;
        this.cachedSize = -1;
    }

    public void m37442a(nyu nyu) {
        if (this.f31664c != null) {
            nyu.m37170a(1, this.f31664c);
        }
        if (this.f31665d != null) {
            nyu.m37170a(2, this.f31665d);
        }
        if (this.f31666e != null) {
            nyu.m37170a(3, this.f31666e);
        }
        if (this.f31667f != null) {
            nyu.m37170a(4, this.f31667f);
        }
        if (this.f31668g != null) {
            nyu.m37170a(5, this.f31668g);
        }
        if (this.f31669h != null) {
            nyu.m37170a(6, this.f31669h);
        }
        if (this.f31670i != null) {
            nyu.m37182b(7, this.f31670i);
        }
        super.a(nyu);
    }

    protected int m37443b() {
        int b = super.b();
        if (this.f31664c != null) {
            b += nyu.m37137b(1, this.f31664c);
        }
        if (this.f31665d != null) {
            b += nyu.m37137b(2, this.f31665d);
        }
        if (this.f31666e != null) {
            b += nyu.m37137b(3, this.f31666e);
        }
        if (this.f31667f != null) {
            b += nyu.m37137b(4, this.f31667f);
        }
        if (this.f31668g != null) {
            b += nyu.m37137b(5, this.f31668g);
        }
        if (this.f31669h != null) {
            b += nyu.m37137b(6, this.f31669h);
        }
        if (this.f31670i != null) {
            return b + nyu.m37145d(7, this.f31670i);
        }
        return b;
    }

    private oao m37440b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31664c = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f31665d = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31666e = nyt.m37117j();
                    continue;
                case 34:
                    this.f31667f = nyt.m37117j();
                    continue;
                case 42:
                    this.f31668g = nyt.m37117j();
                    continue;
                case 50:
                    this.f31669h = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f31670i == null) {
                        this.f31670i = new nzs();
                    }
                    nyt.m37101a(this.f31670i);
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
