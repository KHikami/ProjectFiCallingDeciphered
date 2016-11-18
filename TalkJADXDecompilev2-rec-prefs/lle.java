package p000;

public final class lle extends nyx<lle> {
    public Integer f25324a;
    public Integer f25325b;
    public Integer f25326c;
    public Integer f25327d;
    public Integer f25328e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29326b(nyt);
    }

    public lle() {
        m29327d();
    }

    private lle m29327d() {
        this.f25324a = null;
        this.f25325b = null;
        this.f25326c = null;
        this.f25327d = null;
        this.f25328e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25324a != null) {
            nyu.a(1, this.f25324a.intValue());
        }
        if (this.f25325b != null) {
            nyu.a(2, this.f25325b.intValue());
        }
        if (this.f25326c != null) {
            nyu.a(3, this.f25326c.intValue());
        }
        if (this.f25327d != null) {
            nyu.a(4, this.f25327d.intValue());
        }
        if (this.f25328e != null) {
            nyu.a(5, this.f25328e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25324a != null) {
            b += nyu.f(1, this.f25324a.intValue());
        }
        if (this.f25325b != null) {
            b += nyu.f(2, this.f25325b.intValue());
        }
        if (this.f25326c != null) {
            b += nyu.f(3, this.f25326c.intValue());
        }
        if (this.f25327d != null) {
            b += nyu.f(4, this.f25327d.intValue());
        }
        if (this.f25328e != null) {
            return b + nyu.f(5, this.f25328e.intValue());
        }
        return b;
    }

    private lle m29326b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25324a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25325b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25326c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f25327d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f25328e = Integer.valueOf(nyt.f());
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
