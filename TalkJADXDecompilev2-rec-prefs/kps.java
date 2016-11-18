package p000;

public final class kps extends nyx<kps> {
    public kqd f22691a;
    public Integer f22692b;
    public String f22693c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26963b(nyt);
    }

    public kps() {
        m26964d();
    }

    private kps m26964d() {
        this.f22691a = null;
        this.f22693c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22691a != null) {
            nyu.b(1, this.f22691a);
        }
        if (this.f22692b != null) {
            nyu.a(2, this.f22692b.intValue());
        }
        if (this.f22693c != null) {
            nyu.a(3, this.f22693c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22691a != null) {
            b += nyu.d(1, this.f22691a);
        }
        if (this.f22692b != null) {
            b += nyu.f(2, this.f22692b.intValue());
        }
        if (this.f22693c != null) {
            return b + nyu.b(3, this.f22693c);
        }
        return b;
    }

    private kps m26963b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22691a == null) {
                        this.f22691a = new kqd();
                    }
                    nyt.a(this.f22691a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22692b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f22693c = nyt.j();
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
