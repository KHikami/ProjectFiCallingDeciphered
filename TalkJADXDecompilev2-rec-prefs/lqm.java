package p000;

public final class lqm extends nyx<lqm> {
    public lor f26144a;
    public Long f26145b;
    public Integer f26146c;
    public lpk f26147d;
    public Integer f26148e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30056b(nyt);
    }

    public lqm() {
        m30057d();
    }

    private lqm m30057d() {
        this.f26144a = null;
        this.f26145b = null;
        this.f26147d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26144a != null) {
            nyu.b(1, this.f26144a);
        }
        if (this.f26145b != null) {
            nyu.a(2, this.f26145b.longValue());
        }
        if (this.f26146c != null) {
            nyu.a(3, this.f26146c.intValue());
        }
        if (this.f26147d != null) {
            nyu.b(4, this.f26147d);
        }
        if (this.f26148e != null) {
            nyu.a(5, this.f26148e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26144a != null) {
            b += nyu.d(1, this.f26144a);
        }
        if (this.f26145b != null) {
            b += nyu.e(2, this.f26145b.longValue());
        }
        if (this.f26146c != null) {
            b += nyu.f(3, this.f26146c.intValue());
        }
        if (this.f26147d != null) {
            b += nyu.d(4, this.f26147d);
        }
        if (this.f26148e != null) {
            return b + nyu.f(5, this.f26148e.intValue());
        }
        return b;
    }

    private lqm m30056b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26144a == null) {
                        this.f26144a = new lor();
                    }
                    nyt.a(this.f26144a);
                    continue;
                case 16:
                    this.f26145b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26146c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f26147d == null) {
                        this.f26147d = new lpk();
                    }
                    nyt.a(this.f26147d);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            this.f26148e = Integer.valueOf(a);
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
