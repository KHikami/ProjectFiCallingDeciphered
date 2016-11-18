package p000;

public final class khc extends nyx<khc> {
    public Long f21682a;
    public khd f21683b;
    public Integer f21684c;
    public Integer f21685d;
    public Integer f21686e;
    public Integer f21687f;
    public Integer f21688g;
    public String f21689h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25806b(nyt);
    }

    public khc() {
        m25807d();
    }

    private khc m25807d() {
        this.f21682a = null;
        this.f21683b = null;
        this.f21689h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21683b != null) {
            nyu.b(1, this.f21683b);
        }
        if (this.f21684c != null) {
            nyu.a(2, this.f21684c.intValue());
        }
        if (this.f21685d != null) {
            nyu.a(3, this.f21685d.intValue());
        }
        if (this.f21686e != null) {
            nyu.a(5, this.f21686e.intValue());
        }
        if (this.f21687f != null) {
            nyu.a(6, this.f21687f.intValue());
        }
        if (this.f21688g != null) {
            nyu.a(7, this.f21688g.intValue());
        }
        if (this.f21689h != null) {
            nyu.a(8, this.f21689h);
        }
        if (this.f21682a != null) {
            nyu.b(9, this.f21682a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21683b != null) {
            b += nyu.d(1, this.f21683b);
        }
        if (this.f21684c != null) {
            b += nyu.f(2, this.f21684c.intValue());
        }
        if (this.f21685d != null) {
            b += nyu.f(3, this.f21685d.intValue());
        }
        if (this.f21686e != null) {
            b += nyu.f(5, this.f21686e.intValue());
        }
        if (this.f21687f != null) {
            b += nyu.f(6, this.f21687f.intValue());
        }
        if (this.f21688g != null) {
            b += nyu.f(7, this.f21688g.intValue());
        }
        if (this.f21689h != null) {
            b += nyu.b(8, this.f21689h);
        }
        if (this.f21682a != null) {
            return b + nyu.f(9, this.f21682a.longValue());
        }
        return b;
    }

    private khc m25806b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21683b == null) {
                        this.f21683b = new khd();
                    }
                    nyt.a(this.f21683b);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21684c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21685d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21686e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21687f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f21688g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.f21689h = nyt.j();
                    continue;
                case 72:
                    this.f21682a = Long.valueOf(nyt.e());
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
