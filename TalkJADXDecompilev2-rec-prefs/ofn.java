package p000;

public final class ofn extends nyx<ofn> {
    public Boolean f32648a;
    public Boolean f32649b;
    public Boolean f32650c;
    public Boolean f32651d;
    public int f32652e;

    public /* synthetic */ nzf m38083a(nyt nyt) {
        return m38082b(nyt);
    }

    public ofn() {
        this.f32648a = null;
        this.f32649b = null;
        this.f32650c = null;
        this.f32651d = null;
        this.f32652e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38084a(nyu nyu) {
        if (this.f32648a != null) {
            nyu.m37172a(1, this.f32648a.booleanValue());
        }
        if (this.f32649b != null) {
            nyu.m37172a(2, this.f32649b.booleanValue());
        }
        if (this.f32650c != null) {
            nyu.m37172a(3, this.f32650c.booleanValue());
        }
        if (this.f32651d != null) {
            nyu.m37172a(4, this.f32651d.booleanValue());
        }
        if (this.f32652e != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(5, this.f32652e);
        }
        super.a(nyu);
    }

    protected int m38085b() {
        int b = super.b();
        if (this.f32648a != null) {
            this.f32648a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32649b != null) {
            this.f32649b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f32650c != null) {
            this.f32650c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f32651d != null) {
            this.f32651d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f32652e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(5, this.f32652e);
        }
        return b;
    }

    private ofn m38082b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32648a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f32649b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f32650c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f32651d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f32652e = a;
                            break;
                        default:
                            continue;
                    }
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
