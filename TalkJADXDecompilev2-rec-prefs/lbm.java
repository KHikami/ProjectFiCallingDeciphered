package p000;

public final class lbm extends nyx<lbm> {
    public lbq f24488a;
    public lbw f24489b;
    public lbv f24490c;
    public lbt f24491d;
    public lbo f24492e;
    public lbn f24493f;
    public lbt f24494g;
    public lbs f24495h;
    public lbu f24496i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28491b(nyt);
    }

    public lbm() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24488a != null) {
            nyu.b(1, this.f24488a);
        }
        if (this.f24489b != null) {
            nyu.b(2, this.f24489b);
        }
        if (this.f24490c != null) {
            nyu.b(3, this.f24490c);
        }
        if (this.f24491d != null) {
            nyu.b(4, this.f24491d);
        }
        if (this.f24492e != null) {
            nyu.b(5, this.f24492e);
        }
        if (this.f24494g != null) {
            nyu.b(6, this.f24494g);
        }
        if (this.f24495h != null) {
            nyu.b(7, this.f24495h);
        }
        if (this.f24496i != null) {
            nyu.b(9, this.f24496i);
        }
        if (this.f24493f != null) {
            nyu.b(10, this.f24493f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24488a != null) {
            b += nyu.d(1, this.f24488a);
        }
        if (this.f24489b != null) {
            b += nyu.d(2, this.f24489b);
        }
        if (this.f24490c != null) {
            b += nyu.d(3, this.f24490c);
        }
        if (this.f24491d != null) {
            b += nyu.d(4, this.f24491d);
        }
        if (this.f24492e != null) {
            b += nyu.d(5, this.f24492e);
        }
        if (this.f24494g != null) {
            b += nyu.d(6, this.f24494g);
        }
        if (this.f24495h != null) {
            b += nyu.d(7, this.f24495h);
        }
        if (this.f24496i != null) {
            b += nyu.d(9, this.f24496i);
        }
        if (this.f24493f != null) {
            return b + nyu.d(10, this.f24493f);
        }
        return b;
    }

    private lbm m28491b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24488a == null) {
                        this.f24488a = new lbq();
                    }
                    nyt.a(this.f24488a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24489b == null) {
                        this.f24489b = new lbw();
                    }
                    nyt.a(this.f24489b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f24490c == null) {
                        this.f24490c = new lbv();
                    }
                    nyt.a(this.f24490c);
                    continue;
                case 34:
                    if (this.f24491d == null) {
                        this.f24491d = new lbt();
                    }
                    nyt.a(this.f24491d);
                    continue;
                case 42:
                    if (this.f24492e == null) {
                        this.f24492e = new lbo();
                    }
                    nyt.a(this.f24492e);
                    continue;
                case 50:
                    if (this.f24494g == null) {
                        this.f24494g = new lbt();
                    }
                    nyt.a(this.f24494g);
                    continue;
                case 58:
                    if (this.f24495h == null) {
                        this.f24495h = new lbs();
                    }
                    nyt.a(this.f24495h);
                    continue;
                case 74:
                    if (this.f24496i == null) {
                        this.f24496i = new lbu();
                    }
                    nyt.a(this.f24496i);
                    continue;
                case 82:
                    if (this.f24493f == null) {
                        this.f24493f = new lbn();
                    }
                    nyt.a(this.f24493f);
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
