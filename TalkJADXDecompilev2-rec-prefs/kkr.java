package p000;

public final class kkr extends nyx<kkr> {
    public Integer f22086a;
    public String f22087b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26286b(nyt);
    }

    public kkr() {
        m26287d();
    }

    private kkr m26287d() {
        this.f22087b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22086a != null) {
            nyu.a(1, this.f22086a.intValue());
        }
        if (this.f22087b != null) {
            nyu.a(2, this.f22087b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22086a != null) {
            b += nyu.f(1, this.f22086a.intValue());
        }
        if (this.f22087b != null) {
            return b + nyu.b(2, this.f22087b);
        }
        return b;
    }

    private kkr m26286b(nyt nyt) {
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
                            this.f22086a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22087b = nyt.j();
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
