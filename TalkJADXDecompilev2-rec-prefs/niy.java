package p000;

public final class niy extends nyx<niy> {
    public String f29942a;
    public String f29943b;
    public String f29944c;
    public Float f29945d;
    public Float f29946e;
    public Integer f29947f;
    public Float f29948g;

    public /* synthetic */ nzf m35173a(nyt nyt) {
        return m35171b(nyt);
    }

    public niy() {
        m35172d();
    }

    private niy m35172d() {
        this.f29942a = null;
        this.f29943b = null;
        this.f29944c = null;
        this.f29945d = null;
        this.f29946e = null;
        this.f29947f = null;
        this.f29948g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35174a(nyu nyu) {
        if (this.f29942a != null) {
            nyu.m37170a(1, this.f29942a);
        }
        if (this.f29943b != null) {
            nyu.m37170a(2, this.f29943b);
        }
        if (this.f29944c != null) {
            nyu.m37170a(3, this.f29944c);
        }
        if (this.f29945d != null) {
            nyu.m37167a(4, this.f29945d.floatValue());
        }
        if (this.f29946e != null) {
            nyu.m37167a(5, this.f29946e.floatValue());
        }
        if (this.f29947f != null) {
            nyu.m37168a(6, this.f29947f.intValue());
        }
        if (this.f29948g != null) {
            nyu.m37167a(7, this.f29948g.floatValue());
        }
        super.a(nyu);
    }

    protected int m35175b() {
        int b = super.b();
        if (this.f29942a != null) {
            b += nyu.m37137b(1, this.f29942a);
        }
        if (this.f29943b != null) {
            b += nyu.m37137b(2, this.f29943b);
        }
        if (this.f29944c != null) {
            b += nyu.m37137b(3, this.f29944c);
        }
        if (this.f29945d != null) {
            this.f29945d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f29946e != null) {
            this.f29946e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f29947f != null) {
            b += nyu.m37147f(6, this.f29947f.intValue());
        }
        if (this.f29948g == null) {
            return b;
        }
        this.f29948g.floatValue();
        return b + (nyu.m37154h(7) + 4);
    }

    private niy m35171b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29942a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29943b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f29944c = nyt.m37117j();
                    continue;
                case 37:
                    this.f29945d = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f29946e = Float.valueOf(nyt.m37106c());
                    continue;
                case 48:
                    this.f29947f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 61:
                    this.f29948g = Float.valueOf(nyt.m37106c());
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
