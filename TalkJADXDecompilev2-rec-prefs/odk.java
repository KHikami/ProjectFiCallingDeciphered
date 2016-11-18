package p000;

public final class odk extends nyx<odk> {
    public odc f32420a;
    public nuj f32421b;
    public nac f32422c;
    public muy f32423d;
    public Integer f32424e;
    public int f32425f;
    public oen f32426g;
    public Float f32427h;
    public Boolean f32428i;

    public /* synthetic */ nzf m37862a(nyt nyt) {
        return m37861b(nyt);
    }

    public odk() {
        this.f32424e = null;
        this.f32425f = nzf.UNSET_ENUM_VALUE;
        this.f32427h = null;
        this.f32428i = null;
        this.cachedSize = -1;
    }

    public void m37863a(nyu nyu) {
        if (this.f32420a != null) {
            nyu.m37182b(1, this.f32420a);
        }
        if (this.f32421b != null) {
            nyu.m37182b(2, this.f32421b);
        }
        if (this.f32422c != null) {
            nyu.m37182b(3, this.f32422c);
        }
        if (this.f32423d != null) {
            nyu.m37182b(4, this.f32423d);
        }
        if (this.f32424e != null) {
            nyu.m37168a(5, this.f32424e.intValue());
        }
        if (this.f32425f != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(6, this.f32425f);
        }
        if (this.f32426g != null) {
            nyu.m37182b(7, this.f32426g);
        }
        if (this.f32427h != null) {
            nyu.m37167a(10, this.f32427h.floatValue());
        }
        if (this.f32428i != null) {
            nyu.m37172a(11, this.f32428i.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37864b() {
        int b = super.b();
        if (this.f32420a != null) {
            b += nyu.m37145d(1, this.f32420a);
        }
        if (this.f32421b != null) {
            b += nyu.m37145d(2, this.f32421b);
        }
        if (this.f32422c != null) {
            b += nyu.m37145d(3, this.f32422c);
        }
        if (this.f32423d != null) {
            b += nyu.m37145d(4, this.f32423d);
        }
        if (this.f32424e != null) {
            b += nyu.m37147f(5, this.f32424e.intValue());
        }
        if (this.f32425f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(6, this.f32425f);
        }
        if (this.f32426g != null) {
            b += nyu.m37145d(7, this.f32426g);
        }
        if (this.f32427h != null) {
            this.f32427h.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f32428i == null) {
            return b;
        }
        this.f32428i.booleanValue();
        return b + (nyu.m37154h(11) + 1);
    }

    private odk m37861b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32420a == null) {
                        this.f32420a = new odc();
                    }
                    nyt.m37101a(this.f32420a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32421b == null) {
                        this.f32421b = new nuj();
                    }
                    nyt.m37101a(this.f32421b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32422c == null) {
                        this.f32422c = new nac();
                    }
                    nyt.m37101a(this.f32422c);
                    continue;
                case 34:
                    if (this.f32423d == null) {
                        this.f32423d = new muy();
                    }
                    nyt.m37101a(this.f32423d);
                    continue;
                case 40:
                    this.f32424e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32425f = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.f32426g == null) {
                        this.f32426g = new oen();
                    }
                    nyt.m37101a(this.f32426g);
                    continue;
                case 85:
                    this.f32427h = Float.valueOf(nyt.m37106c());
                    continue;
                case 88:
                    this.f32428i = Boolean.valueOf(nyt.m37116i());
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
