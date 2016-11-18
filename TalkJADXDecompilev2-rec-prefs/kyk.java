package p000;

public final class kyk extends nyx<kyk> {
    public Integer f24075a;
    public String f24076b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28076b(nyt);
    }

    public kyk() {
        m28077d();
    }

    private kyk m28077d() {
        this.f24076b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24075a != null) {
            nyu.a(1, this.f24075a.intValue());
        }
        if (this.f24076b != null) {
            nyu.a(2, this.f24076b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24075a != null) {
            b += nyu.f(1, this.f24075a.intValue());
        }
        if (this.f24076b != null) {
            return b + nyu.b(2, this.f24076b);
        }
        return b;
    }

    private kyk m28076b(nyt nyt) {
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
                        case 3:
                        case 4:
                            this.f24075a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24076b = nyt.j();
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
