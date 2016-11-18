package p000;

public final class osi extends nyx<osi> {
    public String f34134a;
    public Integer f34135b;
    public Integer f34136c;
    public String f34137d;
    public String f34138e;
    public String f34139f;
    public String f34140g;
    public String f34141h;
    public String f34142i;
    public String f34143j;
    public Boolean f34144k;
    public Integer f34145l;
    public osj f34146m;
    public String f34147n;

    public /* synthetic */ nzf m39564a(nyt nyt) {
        return m39562b(nyt);
    }

    public osi() {
        m39563d();
    }

    private osi m39563d() {
        this.f34134a = null;
        this.f34135b = null;
        this.f34136c = null;
        this.f34137d = null;
        this.f34138e = null;
        this.f34139f = null;
        this.f34140g = null;
        this.f34141h = null;
        this.f34142i = null;
        this.f34143j = null;
        this.f34144k = null;
        this.f34145l = null;
        this.f34146m = null;
        this.f34147n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39565a(nyu nyu) {
        if (this.f34134a != null) {
            nyu.m37170a(1, this.f34134a);
        }
        if (this.f34135b != null) {
            nyu.m37168a(2, this.f34135b.intValue());
        }
        if (this.f34136c != null) {
            nyu.m37168a(3, this.f34136c.intValue());
        }
        if (this.f34137d != null) {
            nyu.m37170a(4, this.f34137d);
        }
        if (this.f34138e != null) {
            nyu.m37170a(5, this.f34138e);
        }
        if (this.f34139f != null) {
            nyu.m37170a(6, this.f34139f);
        }
        if (this.f34140g != null) {
            nyu.m37170a(7, this.f34140g);
        }
        if (this.f34141h != null) {
            nyu.m37170a(8, this.f34141h);
        }
        if (this.f34142i != null) {
            nyu.m37170a(9, this.f34142i);
        }
        if (this.f34143j != null) {
            nyu.m37170a(10, this.f34143j);
        }
        if (this.f34144k != null) {
            nyu.m37172a(11, this.f34144k.booleanValue());
        }
        if (this.f34145l != null) {
            nyu.m37168a(12, this.f34145l.intValue());
        }
        if (this.f34146m != null) {
            nyu.m37182b(13, this.f34146m);
        }
        if (this.f34147n != null) {
            nyu.m37170a(14, this.f34147n);
        }
        super.a(nyu);
    }

    protected int m39566b() {
        int b = super.b();
        if (this.f34134a != null) {
            b += nyu.m37137b(1, this.f34134a);
        }
        if (this.f34135b != null) {
            b += nyu.m37147f(2, this.f34135b.intValue());
        }
        if (this.f34136c != null) {
            b += nyu.m37147f(3, this.f34136c.intValue());
        }
        if (this.f34137d != null) {
            b += nyu.m37137b(4, this.f34137d);
        }
        if (this.f34138e != null) {
            b += nyu.m37137b(5, this.f34138e);
        }
        if (this.f34139f != null) {
            b += nyu.m37137b(6, this.f34139f);
        }
        if (this.f34140g != null) {
            b += nyu.m37137b(7, this.f34140g);
        }
        if (this.f34141h != null) {
            b += nyu.m37137b(8, this.f34141h);
        }
        if (this.f34142i != null) {
            b += nyu.m37137b(9, this.f34142i);
        }
        if (this.f34143j != null) {
            b += nyu.m37137b(10, this.f34143j);
        }
        if (this.f34144k != null) {
            this.f34144k.booleanValue();
            b += nyu.m37154h(11) + 1;
        }
        if (this.f34145l != null) {
            b += nyu.m37147f(12, this.f34145l.intValue());
        }
        if (this.f34146m != null) {
            b += nyu.m37145d(13, this.f34146m);
        }
        if (this.f34147n != null) {
            return b + nyu.m37137b(14, this.f34147n);
        }
        return b;
    }

    private osi m39562b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34134a = nyt.m37117j();
                    continue;
                case 16:
                    this.f34135b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34136c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    this.f34137d = nyt.m37117j();
                    continue;
                case 42:
                    this.f34138e = nyt.m37117j();
                    continue;
                case 50:
                    this.f34139f = nyt.m37117j();
                    continue;
                case 58:
                    this.f34140g = nyt.m37117j();
                    continue;
                case 66:
                    this.f34141h = nyt.m37117j();
                    continue;
                case 74:
                    this.f34142i = nyt.m37117j();
                    continue;
                case 82:
                    this.f34143j = nyt.m37117j();
                    continue;
                case 88:
                    this.f34144k = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 96:
                    this.f34145l = Integer.valueOf(nyt.m37112f());
                    continue;
                case 106:
                    if (this.f34146m == null) {
                        this.f34146m = new osj();
                    }
                    nyt.m37101a(this.f34146m);
                    continue;
                case 114:
                    this.f34147n = nyt.m37117j();
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
