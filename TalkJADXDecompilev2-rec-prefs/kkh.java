package p000;

public final class kkh extends nyx<kkh> {
    public String f22045a;
    public Integer f22046b;
    public String f22047c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26230b(nyt);
    }

    public kkh() {
        m26231d();
    }

    private kkh m26231d() {
        this.f22045a = null;
        this.f22047c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22045a != null) {
            nyu.a(1, this.f22045a);
        }
        if (this.f22046b != null) {
            nyu.a(2, this.f22046b.intValue());
        }
        if (this.f22047c != null) {
            nyu.a(3, this.f22047c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22045a != null) {
            b += nyu.b(1, this.f22045a);
        }
        if (this.f22046b != null) {
            b += nyu.f(2, this.f22046b.intValue());
        }
        if (this.f22047c != null) {
            return b + nyu.b(3, this.f22047c);
        }
        return b;
    }

    private kkh m26230b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22045a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22046b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f22047c = nyt.j();
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
