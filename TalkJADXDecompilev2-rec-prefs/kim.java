package p000;

public final class kim extends nyx<kim> {
    public String f21865a;
    public int f21866b;
    public kin f21867c;
    public String f21868d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25983b(nyt);
    }

    public kim() {
        this.f21865a = null;
        this.f21866b = nzf.UNSET_ENUM_VALUE;
        this.f21868d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21865a != null) {
            nyu.a(1, this.f21865a);
        }
        if (this.f21866b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f21866b);
        }
        if (this.f21867c != null) {
            nyu.b(3, this.f21867c);
        }
        if (this.f21868d != null) {
            nyu.a(4, this.f21868d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21865a != null) {
            b += nyu.b(1, this.f21865a);
        }
        if (this.f21866b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f21866b);
        }
        if (this.f21867c != null) {
            b += nyu.d(3, this.f21867c);
        }
        if (this.f21868d != null) {
            return b + nyu.b(4, this.f21868d);
        }
        return b;
    }

    private kim m25983b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21865a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21866b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f21867c == null) {
                        this.f21867c = new kin();
                    }
                    nyt.a(this.f21867c);
                    continue;
                case 34:
                    this.f21868d = nyt.j();
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
