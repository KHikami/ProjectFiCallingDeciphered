package p000;

public final class ocf extends nyx<ocf> {
    public Long f32229a;
    public String f32230b;
    public int f32231c;
    public String f32232d;
    public Boolean f32233e;
    public String f32234f;
    public String f32235g;
    public Boolean f32236h;
    public Boolean f32237i;
    public Boolean f32238j;

    public /* synthetic */ nzf m37729a(nyt nyt) {
        return m37728b(nyt);
    }

    public ocf() {
        this.f32229a = null;
        this.f32230b = null;
        this.f32231c = nzf.UNSET_ENUM_VALUE;
        this.f32232d = null;
        this.f32233e = null;
        this.f32234f = null;
        this.f32235g = null;
        this.f32236h = null;
        this.f32237i = null;
        this.f32238j = null;
        this.cachedSize = -1;
    }

    public void m37730a(nyu nyu) {
        nyu.m37181b(1, this.f32229a.longValue());
        nyu.m37170a(2, this.f32230b);
        if (this.f32231c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f32231c);
        }
        if (this.f32232d != null) {
            nyu.m37170a(4, this.f32232d);
        }
        if (this.f32233e != null) {
            nyu.m37172a(5, this.f32233e.booleanValue());
        }
        if (this.f32234f != null) {
            nyu.m37170a(6, this.f32234f);
        }
        if (this.f32235g != null) {
            nyu.m37170a(7, this.f32235g);
        }
        if (this.f32236h != null) {
            nyu.m37172a(8, this.f32236h.booleanValue());
        }
        if (this.f32237i != null) {
            nyu.m37172a(9, this.f32237i.booleanValue());
        }
        if (this.f32238j != null) {
            nyu.m37172a(10, this.f32238j.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37731b() {
        int b = (super.b() + nyu.m37148f(1, this.f32229a.longValue())) + nyu.m37137b(2, this.f32230b);
        if (this.f32231c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f32231c);
        }
        if (this.f32232d != null) {
            b += nyu.m37137b(4, this.f32232d);
        }
        if (this.f32233e != null) {
            this.f32233e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f32234f != null) {
            b += nyu.m37137b(6, this.f32234f);
        }
        if (this.f32235g != null) {
            b += nyu.m37137b(7, this.f32235g);
        }
        if (this.f32236h != null) {
            this.f32236h.booleanValue();
            b += nyu.m37154h(8) + 1;
        }
        if (this.f32237i != null) {
            this.f32237i.booleanValue();
            b += nyu.m37154h(9) + 1;
        }
        if (this.f32238j == null) {
            return b;
        }
        this.f32238j.booleanValue();
        return b + (nyu.m37154h(10) + 1);
    }

    private ocf m37728b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32229a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    this.f32230b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32231c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f32232d = nyt.m37117j();
                    continue;
                case 40:
                    this.f32233e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 50:
                    this.f32234f = nyt.m37117j();
                    continue;
                case 58:
                    this.f32235g = nyt.m37117j();
                    continue;
                case 64:
                    this.f32236h = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 72:
                    this.f32237i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 80:
                    this.f32238j = Boolean.valueOf(nyt.m37116i());
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
