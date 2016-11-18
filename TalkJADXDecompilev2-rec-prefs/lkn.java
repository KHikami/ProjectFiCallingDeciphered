package p000;

public final class lkn extends nyx<lkn> {
    public String f25154a;
    public Integer f25155b;
    public Integer f25156c;
    public Integer f25157d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29233b(nyt);
    }

    public lkn() {
        m29234d();
    }

    private lkn m29234d() {
        this.f25154a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25154a != null) {
            nyu.a(1, this.f25154a);
        }
        nyu.a(2, this.f25155b.intValue());
        nyu.a(3, this.f25156c.intValue());
        nyu.a(4, this.f25157d.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25154a != null) {
            b += nyu.b(1, this.f25154a);
        }
        return ((b + nyu.f(2, this.f25155b.intValue())) + nyu.f(3, this.f25156c.intValue())) + nyu.f(4, this.f25157d.intValue());
    }

    private lkn m29233b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25154a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25155b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25156c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25157d = Integer.valueOf(a);
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
