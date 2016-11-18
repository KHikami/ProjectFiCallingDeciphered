package p000;

public final class lxm extends nyx<lxm> {
    public Long f26787a;
    public lxp f26788b;
    public String f26789c;
    public lxo f26790d;
    public lxj f26791e;
    public lxi f26792f;
    public lxx f26793g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31018b(nyt);
    }

    public lxm() {
        m31019d();
    }

    private lxm m31019d() {
        this.f26787a = null;
        this.f26788b = null;
        this.f26789c = null;
        this.f26790d = null;
        this.f26791e = null;
        this.f26792f = null;
        this.f26793g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26787a != null) {
            nyu.b(1, this.f26787a.longValue());
        }
        if (this.f26788b != null) {
            nyu.b(2, this.f26788b);
        }
        if (this.f26789c != null) {
            nyu.a(3, this.f26789c);
        }
        if (this.f26790d != null) {
            nyu.b(4, this.f26790d);
        }
        if (this.f26791e != null) {
            nyu.b(5, this.f26791e);
        }
        if (this.f26792f != null) {
            nyu.b(6, this.f26792f);
        }
        if (this.f26793g != null) {
            nyu.b(7, this.f26793g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26787a != null) {
            b += nyu.f(1, this.f26787a.longValue());
        }
        if (this.f26788b != null) {
            b += nyu.d(2, this.f26788b);
        }
        if (this.f26789c != null) {
            b += nyu.b(3, this.f26789c);
        }
        if (this.f26790d != null) {
            b += nyu.d(4, this.f26790d);
        }
        if (this.f26791e != null) {
            b += nyu.d(5, this.f26791e);
        }
        if (this.f26792f != null) {
            b += nyu.d(6, this.f26792f);
        }
        if (this.f26793g != null) {
            return b + nyu.d(7, this.f26793g);
        }
        return b;
    }

    private lxm m31018b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26787a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    if (this.f26788b == null) {
                        this.f26788b = new lxp();
                    }
                    nyt.a(this.f26788b);
                    continue;
                case wi.dx /*26*/:
                    this.f26789c = nyt.j();
                    continue;
                case 34:
                    if (this.f26790d == null) {
                        this.f26790d = new lxo();
                    }
                    nyt.a(this.f26790d);
                    continue;
                case 42:
                    if (this.f26791e == null) {
                        this.f26791e = new lxj();
                    }
                    nyt.a(this.f26791e);
                    continue;
                case 50:
                    if (this.f26792f == null) {
                        this.f26792f = new lxi();
                    }
                    nyt.a(this.f26792f);
                    continue;
                case 58:
                    if (this.f26793g == null) {
                        this.f26793g = new lxx();
                    }
                    nyt.a(this.f26793g);
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
