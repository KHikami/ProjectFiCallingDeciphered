package p000;

public final class kqo extends nyx<kqo> {
    public kqd f22779a;
    public kqp[] f22780b;
    public String f22781c;
    public String f22782d;
    public kqp f22783e;
    public String f22784f;
    public String f22785g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27080b(nyt);
    }

    public kqo() {
        m27081d();
    }

    private kqo m27081d() {
        this.f22779a = null;
        this.f22780b = kqp.m27086d();
        this.f22781c = null;
        this.f22782d = null;
        this.f22783e = null;
        this.f22784f = null;
        this.f22785g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22779a != null) {
            nyu.b(1, this.f22779a);
        }
        if (this.f22780b != null && this.f22780b.length > 0) {
            for (nzf nzf : this.f22780b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f22781c != null) {
            nyu.a(3, this.f22781c);
        }
        if (this.f22782d != null) {
            nyu.a(4, this.f22782d);
        }
        if (this.f22783e != null) {
            nyu.b(5, this.f22783e);
        }
        if (this.f22784f != null) {
            nyu.a(6, this.f22784f);
        }
        if (this.f22785g != null) {
            nyu.a(7, this.f22785g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22779a != null) {
            b += nyu.d(1, this.f22779a);
        }
        if (this.f22780b != null && this.f22780b.length > 0) {
            int i = b;
            for (nzf nzf : this.f22780b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f22781c != null) {
            b += nyu.b(3, this.f22781c);
        }
        if (this.f22782d != null) {
            b += nyu.b(4, this.f22782d);
        }
        if (this.f22783e != null) {
            b += nyu.d(5, this.f22783e);
        }
        if (this.f22784f != null) {
            b += nyu.b(6, this.f22784f);
        }
        if (this.f22785g != null) {
            return b + nyu.b(7, this.f22785g);
        }
        return b;
    }

    private kqo m27080b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22779a == null) {
                        this.f22779a = new kqd();
                    }
                    nyt.a(this.f22779a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22780b == null) {
                        a = 0;
                    } else {
                        a = this.f22780b.length;
                    }
                    Object obj = new kqp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22780b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kqp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kqp();
                    nyt.a(obj[a]);
                    this.f22780b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f22781c = nyt.j();
                    continue;
                case 34:
                    this.f22782d = nyt.j();
                    continue;
                case 42:
                    if (this.f22783e == null) {
                        this.f22783e = new kqp();
                    }
                    nyt.a(this.f22783e);
                    continue;
                case 50:
                    this.f22784f = nyt.j();
                    continue;
                case 58:
                    this.f22785g = nyt.j();
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
