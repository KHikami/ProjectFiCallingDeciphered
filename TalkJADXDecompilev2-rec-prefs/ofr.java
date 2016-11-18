package p000;

public final class ofr extends nyx<ofr> {
    public Boolean f32666a;
    public Boolean f32667b;
    public Boolean f32668c;
    public Boolean f32669d;
    public Integer f32670e;

    public /* synthetic */ nzf m38101a(nyt nyt) {
        return m38099b(nyt);
    }

    public ofr() {
        m38100d();
    }

    private ofr m38100d() {
        this.f32666a = null;
        this.f32667b = null;
        this.f32668c = null;
        this.f32669d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38102a(nyu nyu) {
        if (this.f32666a != null) {
            nyu.m37172a(1, this.f32666a.booleanValue());
        }
        if (this.f32667b != null) {
            nyu.m37172a(2, this.f32667b.booleanValue());
        }
        if (this.f32668c != null) {
            nyu.m37172a(3, this.f32668c.booleanValue());
        }
        if (this.f32669d != null) {
            nyu.m37172a(4, this.f32669d.booleanValue());
        }
        if (this.f32670e != null) {
            nyu.m37168a(5, this.f32670e.intValue());
        }
        super.a(nyu);
    }

    protected int m38103b() {
        int b = super.b();
        if (this.f32666a != null) {
            this.f32666a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32667b != null) {
            this.f32667b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f32668c != null) {
            this.f32668c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f32669d != null) {
            this.f32669d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f32670e != null) {
            return b + nyu.m37147f(5, this.f32670e.intValue());
        }
        return b;
    }

    private ofr m38099b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32666a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f32667b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f32668c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f32669d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f32670e = Integer.valueOf(a);
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
