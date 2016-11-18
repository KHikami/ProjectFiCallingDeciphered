package p000;

public final class kvz extends nyx<kvz> {
    public Integer f23689a;
    public Integer f23690b;
    public Float f23691c;
    public Float f23692d;
    public String f23693e;
    public String f23694f;
    public String f23695g;
    public String f23696h;
    public kwa f23697i;
    public String f23698j;
    public String f23699k;
    public String f23700l;
    public String f23701m;
    public Boolean f23702n;
    public Double f23703o;
    public Boolean f23704p;
    public String f23705q;
    public kwj[] f23706r;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27756b(nyt);
    }

    public kvz() {
        this.f23689a = null;
        this.f23690b = null;
        this.f23691c = null;
        this.f23692d = null;
        this.f23693e = null;
        this.f23694f = null;
        this.f23695g = null;
        this.f23696h = null;
        this.f23698j = null;
        this.f23699k = null;
        this.f23700l = null;
        this.f23701m = null;
        this.f23702n = null;
        this.f23703o = null;
        this.f23704p = null;
        this.f23705q = null;
        this.f23706r = kwj.m27801d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23691c != null) {
            nyu.a(1, this.f23691c.floatValue());
        }
        if (this.f23692d != null) {
            nyu.a(2, this.f23692d.floatValue());
        }
        if (this.f23693e != null) {
            nyu.a(3, this.f23693e);
        }
        if (this.f23694f != null) {
            nyu.a(4, this.f23694f);
        }
        if (this.f23695g != null) {
            nyu.a(5, this.f23695g);
        }
        if (this.f23696h != null) {
            nyu.a(6, this.f23696h);
        }
        if (this.f23697i != null) {
            nyu.b(7, this.f23697i);
        }
        if (this.f23698j != null) {
            nyu.a(8, this.f23698j);
        }
        if (this.f23699k != null) {
            nyu.a(9, this.f23699k);
        }
        if (this.f23700l != null) {
            nyu.a(10, this.f23700l);
        }
        if (this.f23701m != null) {
            nyu.a(11, this.f23701m);
        }
        if (this.f23702n != null) {
            nyu.a(12, this.f23702n.booleanValue());
        }
        if (this.f23703o != null) {
            nyu.a(13, this.f23703o.doubleValue());
        }
        if (this.f23689a != null) {
            nyu.a(14, this.f23689a.intValue());
        }
        if (this.f23690b != null) {
            nyu.a(15, this.f23690b.intValue());
        }
        if (this.f23704p != null) {
            nyu.a(16, this.f23704p.booleanValue());
        }
        if (this.f23705q != null) {
            nyu.a(17, this.f23705q);
        }
        if (this.f23706r != null && this.f23706r.length > 0) {
            for (nzf nzf : this.f23706r) {
                if (nzf != null) {
                    nyu.b(18, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23691c != null) {
            this.f23691c.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f23692d != null) {
            this.f23692d.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f23693e != null) {
            b += nyu.b(3, this.f23693e);
        }
        if (this.f23694f != null) {
            b += nyu.b(4, this.f23694f);
        }
        if (this.f23695g != null) {
            b += nyu.b(5, this.f23695g);
        }
        if (this.f23696h != null) {
            b += nyu.b(6, this.f23696h);
        }
        if (this.f23697i != null) {
            b += nyu.d(7, this.f23697i);
        }
        if (this.f23698j != null) {
            b += nyu.b(8, this.f23698j);
        }
        if (this.f23699k != null) {
            b += nyu.b(9, this.f23699k);
        }
        if (this.f23700l != null) {
            b += nyu.b(10, this.f23700l);
        }
        if (this.f23701m != null) {
            b += nyu.b(11, this.f23701m);
        }
        if (this.f23702n != null) {
            this.f23702n.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f23703o != null) {
            this.f23703o.doubleValue();
            b += nyu.h(13) + 8;
        }
        if (this.f23689a != null) {
            b += nyu.f(14, this.f23689a.intValue());
        }
        if (this.f23690b != null) {
            b += nyu.f(15, this.f23690b.intValue());
        }
        if (this.f23704p != null) {
            this.f23704p.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.f23705q != null) {
            b += nyu.b(17, this.f23705q);
        }
        if (this.f23706r == null || this.f23706r.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23706r) {
            if (nzf != null) {
                i += nyu.d(18, nzf);
            }
        }
        return i;
    }

    private kvz m27756b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f23691c = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f23692d = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    this.f23693e = nyt.j();
                    continue;
                case 34:
                    this.f23694f = nyt.j();
                    continue;
                case 42:
                    this.f23695g = nyt.j();
                    continue;
                case 50:
                    this.f23696h = nyt.j();
                    continue;
                case 58:
                    if (this.f23697i == null) {
                        this.f23697i = new kwa();
                    }
                    nyt.a(this.f23697i);
                    continue;
                case 66:
                    this.f23698j = nyt.j();
                    continue;
                case 74:
                    this.f23699k = nyt.j();
                    continue;
                case 82:
                    this.f23700l = nyt.j();
                    continue;
                case 90:
                    this.f23701m = nyt.j();
                    continue;
                case 96:
                    this.f23702n = Boolean.valueOf(nyt.i());
                    continue;
                case 105:
                    this.f23703o = Double.valueOf(nyt.b());
                    continue;
                case 112:
                    this.f23689a = Integer.valueOf(nyt.f());
                    continue;
                case 120:
                    this.f23690b = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    this.f23704p = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    this.f23705q = nyt.j();
                    continue;
                case 146:
                    int b = nzl.b(nyt, 146);
                    if (this.f23706r == null) {
                        a = 0;
                    } else {
                        a = this.f23706r.length;
                    }
                    Object obj = new kwj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23706r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwj();
                    nyt.a(obj[a]);
                    this.f23706r = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
