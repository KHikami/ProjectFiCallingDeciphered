package p000;

public final class mrs extends nyx<mrs> {
    private static volatile mrs[] f28222g;
    public Integer f28223a;
    public Integer f28224b;
    public Integer f28225c;
    public Integer f28226d;
    public Integer f28227e;
    public String f28228f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32797b(nyt);
    }

    public static mrs[] m32798d() {
        if (f28222g == null) {
            synchronized (nzc.c) {
                if (f28222g == null) {
                    f28222g = new mrs[0];
                }
            }
        }
        return f28222g;
    }

    public mrs() {
        m32799g();
    }

    private mrs m32799g() {
        this.f28223a = null;
        this.f28224b = null;
        this.f28225c = null;
        this.f28226d = null;
        this.f28227e = null;
        this.f28228f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28223a != null) {
            nyu.a(1, this.f28223a.intValue());
        }
        if (this.f28224b != null) {
            nyu.a(2, this.f28224b.intValue());
        }
        if (this.f28225c != null) {
            nyu.a(3, this.f28225c.intValue());
        }
        if (this.f28226d != null) {
            nyu.a(4, this.f28226d.intValue());
        }
        if (this.f28227e != null) {
            nyu.a(5, this.f28227e.intValue());
        }
        if (this.f28228f != null) {
            nyu.a(6, this.f28228f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28223a != null) {
            b += nyu.f(1, this.f28223a.intValue());
        }
        if (this.f28224b != null) {
            b += nyu.f(2, this.f28224b.intValue());
        }
        if (this.f28225c != null) {
            b += nyu.f(3, this.f28225c.intValue());
        }
        if (this.f28226d != null) {
            b += nyu.f(4, this.f28226d.intValue());
        }
        if (this.f28227e != null) {
            b += nyu.f(5, this.f28227e.intValue());
        }
        if (this.f28228f != null) {
            return b + nyu.b(6, this.f28228f);
        }
        return b;
    }

    private mrs m32797b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28223a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f28224b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f28225c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f28226d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f28227e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f28228f = nyt.j();
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
