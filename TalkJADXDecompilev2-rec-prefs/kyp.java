package p000;

public final class kyp extends nyx<kyp> {
    public Integer f24097a;
    public String f24098b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28103b(nyt);
    }

    public kyp() {
        m28104d();
    }

    private kyp m28104d() {
        this.f24098b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24097a.intValue());
        nyu.a(2, this.f24098b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f24097a.intValue())) + nyu.b(2, this.f24098b);
    }

    private kyp m28103b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.f24097a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24098b = nyt.j();
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
