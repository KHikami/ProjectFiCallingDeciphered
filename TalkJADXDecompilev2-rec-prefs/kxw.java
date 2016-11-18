package p000;

public final class kxw extends nyx<kxw> {
    public Integer f23965a;
    public String f23966b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27988b(nyt);
    }

    public kxw() {
        m27989d();
    }

    private kxw m27989d() {
        this.f23966b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23965a != null) {
            nyu.a(1, this.f23965a.intValue());
        }
        if (this.f23966b != null) {
            nyu.a(2, this.f23966b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23965a != null) {
            b += nyu.f(1, this.f23965a.intValue());
        }
        if (this.f23966b != null) {
            return b + nyu.b(2, this.f23966b);
        }
        return b;
    }

    private kxw m27988b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 4:
                        case 11:
                            this.f23965a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f23966b = nyt.j();
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
