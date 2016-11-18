package p000;

public final class kvy extends nyx<kvy> {
    public String f23685a;
    public int f23686b;
    public kwi f23687c;
    public String f23688d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27752b(nyt);
    }

    public kvy() {
        this.f23685a = null;
        this.f23686b = nzf.UNSET_ENUM_VALUE;
        this.f23688d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23685a != null) {
            nyu.a(1, this.f23685a);
        }
        if (this.f23686b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23686b);
        }
        if (this.f23687c != null) {
            nyu.b(3, this.f23687c);
        }
        if (this.f23688d != null) {
            nyu.a(4, this.f23688d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23685a != null) {
            b += nyu.b(1, this.f23685a);
        }
        if (this.f23686b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f23686b);
        }
        if (this.f23687c != null) {
            b += nyu.d(3, this.f23687c);
        }
        if (this.f23688d != null) {
            return b + nyu.b(4, this.f23688d);
        }
        return b;
    }

    private kvy m27752b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23685a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f23686b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f23687c == null) {
                        this.f23687c = new kwi();
                    }
                    nyt.a(this.f23687c);
                    continue;
                case 34:
                    this.f23688d = nyt.j();
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
