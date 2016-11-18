package p000;

public final class lxi extends nyx<lxi> {
    public Integer f26772a;
    public String f26773b;
    public String f26774c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30998b(nyt);
    }

    public lxi() {
        m30999d();
    }

    private lxi m30999d() {
        this.f26773b = null;
        this.f26774c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26772a != null) {
            nyu.a(1, this.f26772a.intValue());
        }
        if (this.f26773b != null) {
            nyu.a(2, this.f26773b);
        }
        if (this.f26774c != null) {
            nyu.a(3, this.f26774c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26772a != null) {
            b += nyu.f(1, this.f26772a.intValue());
        }
        if (this.f26773b != null) {
            b += nyu.b(2, this.f26773b);
        }
        if (this.f26774c != null) {
            return b + nyu.b(3, this.f26774c);
        }
        return b;
    }

    private lxi m30998b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26772a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26773b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26774c = nyt.j();
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
