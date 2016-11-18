package p000;

public final class krj extends nyx<krj> {
    public Integer f22896a;
    public Integer f22897b;
    public Integer f22898c;
    public String f22899d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27194b(nyt);
    }

    public krj() {
        m27195d();
    }

    private krj m27195d() {
        this.f22899d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22896a != null) {
            nyu.a(1, this.f22896a.intValue());
        }
        if (this.f22897b != null) {
            nyu.a(2, this.f22897b.intValue());
        }
        if (this.f22898c != null) {
            nyu.a(3, this.f22898c.intValue());
        }
        if (this.f22899d != null) {
            nyu.a(4, this.f22899d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22896a != null) {
            b += nyu.f(1, this.f22896a.intValue());
        }
        if (this.f22897b != null) {
            b += nyu.f(2, this.f22897b.intValue());
        }
        if (this.f22898c != null) {
            b += nyu.f(3, this.f22898c.intValue());
        }
        if (this.f22899d != null) {
            return b + nyu.b(4, this.f22899d);
        }
        return b;
    }

    private krj m27194b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f22896a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
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
                            this.f22897b = Integer.valueOf(a);
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f22898c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f22899d = nyt.j();
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
