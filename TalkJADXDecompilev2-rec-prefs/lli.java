package p000;

public final class lli extends nyx<lli> {
    public String f25339a;
    public String f25340b;
    public Boolean f25341c;
    public String f25342d;
    public String f25343e;
    public String f25344f;
    public Integer f25345g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29346b(nyt);
    }

    public lli() {
        m29347d();
    }

    private lli m29347d() {
        this.f25339a = null;
        this.f25340b = null;
        this.f25341c = null;
        this.f25342d = null;
        this.f25343e = null;
        this.f25344f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25339a != null) {
            nyu.a(1, this.f25339a);
        }
        if (this.f25340b != null) {
            nyu.a(2, this.f25340b);
        }
        if (this.f25341c != null) {
            nyu.a(3, this.f25341c.booleanValue());
        }
        if (this.f25342d != null) {
            nyu.a(4, this.f25342d);
        }
        if (this.f25343e != null) {
            nyu.a(5, this.f25343e);
        }
        if (this.f25344f != null) {
            nyu.a(6, this.f25344f);
        }
        if (this.f25345g != null) {
            nyu.a(7, this.f25345g.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25339a != null) {
            b += nyu.b(1, this.f25339a);
        }
        if (this.f25340b != null) {
            b += nyu.b(2, this.f25340b);
        }
        if (this.f25341c != null) {
            this.f25341c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f25342d != null) {
            b += nyu.b(4, this.f25342d);
        }
        if (this.f25343e != null) {
            b += nyu.b(5, this.f25343e);
        }
        if (this.f25344f != null) {
            b += nyu.b(6, this.f25344f);
        }
        if (this.f25345g != null) {
            return b + nyu.f(7, this.f25345g.intValue());
        }
        return b;
    }

    private lli m29346b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25339a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25340b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25341c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f25342d = nyt.j();
                    continue;
                case 42:
                    this.f25343e = nyt.j();
                    continue;
                case 50:
                    this.f25344f = nyt.j();
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25345g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
