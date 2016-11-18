package p000;

public final class ltq extends nyx<ltq> {
    public Integer f26397a;
    public Integer f26398b;
    public Integer f26399c;
    public Integer f26400d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30486b(nyt);
    }

    public ltq() {
        m30487d();
    }

    private ltq m30487d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26397a != null) {
            nyu.a(1, this.f26397a.intValue());
        }
        if (this.f26398b != null) {
            nyu.a(2, this.f26398b.intValue());
        }
        if (this.f26399c != null) {
            nyu.a(3, this.f26399c.intValue());
        }
        if (this.f26400d != null) {
            nyu.a(4, this.f26400d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26397a != null) {
            b += nyu.f(1, this.f26397a.intValue());
        }
        if (this.f26398b != null) {
            b += nyu.f(2, this.f26398b.intValue());
        }
        if (this.f26399c != null) {
            b += nyu.f(3, this.f26399c.intValue());
        }
        if (this.f26400d != null) {
            return b + nyu.f(4, this.f26400d.intValue());
        }
        return b;
    }

    private ltq m30486b(nyt nyt) {
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
                            this.f26397a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26398b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26399c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26400d = Integer.valueOf(a);
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
