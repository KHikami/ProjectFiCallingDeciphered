package p000;

public final class lxb extends nyx<lxb> {
    private static volatile lxb[] f26742d;
    public lxc f26743a;
    public String f26744b;
    public Integer f26745c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30959b(nyt);
    }

    public static lxb[] m30960d() {
        if (f26742d == null) {
            synchronized (nzc.c) {
                if (f26742d == null) {
                    f26742d = new lxb[0];
                }
            }
        }
        return f26742d;
    }

    public lxb() {
        m30961g();
    }

    private lxb m30961g() {
        this.f26743a = null;
        this.f26744b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26743a != null) {
            nyu.b(1, this.f26743a);
        }
        if (this.f26744b != null) {
            nyu.a(2, this.f26744b);
        }
        if (this.f26745c != null) {
            nyu.a(3, this.f26745c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26743a != null) {
            b += nyu.d(1, this.f26743a);
        }
        if (this.f26744b != null) {
            b += nyu.b(2, this.f26744b);
        }
        if (this.f26745c != null) {
            return b + nyu.f(3, this.f26745c.intValue());
        }
        return b;
    }

    private lxb m30959b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26743a == null) {
                        this.f26743a = new lxc();
                    }
                    nyt.a(this.f26743a);
                    continue;
                case wi.dH /*18*/:
                    this.f26744b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.f26745c = Integer.valueOf(a);
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
