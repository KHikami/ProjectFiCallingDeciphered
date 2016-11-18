package p000;

public final class kqp extends nyx<kqp> {
    private static volatile kqp[] f22786k;
    public String f22787a;
    public String f22788b;
    public String f22789c;
    public Integer f22790d;
    public Integer f22791e;
    public String f22792f;
    public Boolean f22793g;
    public String f22794h;
    public Integer f22795i;
    public Integer f22796j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27085b(nyt);
    }

    public static kqp[] m27086d() {
        if (f22786k == null) {
            synchronized (nzc.c) {
                if (f22786k == null) {
                    f22786k = new kqp[0];
                }
            }
        }
        return f22786k;
    }

    public kqp() {
        m27087g();
    }

    private kqp m27087g() {
        this.f22787a = null;
        this.f22788b = null;
        this.f22789c = null;
        this.f22790d = null;
        this.f22791e = null;
        this.f22792f = null;
        this.f22793g = null;
        this.f22794h = null;
        this.f22795i = null;
        this.f22796j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22787a != null) {
            nyu.a(1, this.f22787a);
        }
        if (this.f22788b != null) {
            nyu.a(2, this.f22788b);
        }
        if (this.f22789c != null) {
            nyu.a(3, this.f22789c);
        }
        if (this.f22790d != null) {
            nyu.a(4, this.f22790d.intValue());
        }
        if (this.f22791e != null) {
            nyu.a(5, this.f22791e.intValue());
        }
        if (this.f22792f != null) {
            nyu.a(6, this.f22792f);
        }
        if (this.f22793g != null) {
            nyu.a(7, this.f22793g.booleanValue());
        }
        if (this.f22794h != null) {
            nyu.a(8, this.f22794h);
        }
        if (this.f22795i != null) {
            nyu.a(9, this.f22795i.intValue());
        }
        if (this.f22796j != null) {
            nyu.a(10, this.f22796j.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22787a != null) {
            b += nyu.b(1, this.f22787a);
        }
        if (this.f22788b != null) {
            b += nyu.b(2, this.f22788b);
        }
        if (this.f22789c != null) {
            b += nyu.b(3, this.f22789c);
        }
        if (this.f22790d != null) {
            b += nyu.f(4, this.f22790d.intValue());
        }
        if (this.f22791e != null) {
            b += nyu.f(5, this.f22791e.intValue());
        }
        if (this.f22792f != null) {
            b += nyu.b(6, this.f22792f);
        }
        if (this.f22793g != null) {
            this.f22793g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f22794h != null) {
            b += nyu.b(8, this.f22794h);
        }
        if (this.f22795i != null) {
            b += nyu.f(9, this.f22795i.intValue());
        }
        if (this.f22796j != null) {
            return b + nyu.f(10, this.f22796j.intValue());
        }
        return b;
    }

    private kqp m27085b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22787a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22788b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22789c = nyt.j();
                    continue;
                case 32:
                    this.f22790d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f22791e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f22792f = nyt.j();
                    continue;
                case 56:
                    this.f22793g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    this.f22794h = nyt.j();
                    continue;
                case 72:
                    this.f22795i = Integer.valueOf(nyt.f());
                    continue;
                case 80:
                    this.f22796j = Integer.valueOf(nyt.f());
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
