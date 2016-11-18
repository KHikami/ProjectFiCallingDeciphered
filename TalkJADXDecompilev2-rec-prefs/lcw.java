package p000;

public final class lcw extends nyx<lcw> {
    public Integer f24624a;
    public String f24625b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28670b(nyt);
    }

    public lcw() {
        m28671d();
    }

    private lcw m28671d() {
        this.f24625b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24624a != null) {
            nyu.a(1, this.f24624a.intValue());
        }
        if (this.f24625b != null) {
            nyu.a(2, this.f24625b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24624a != null) {
            b += nyu.f(1, this.f24624a.intValue());
        }
        if (this.f24625b != null) {
            return b + nyu.b(2, this.f24625b);
        }
        return b;
    }

    private lcw m28670b(nyt nyt) {
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
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            this.f24624a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24625b = nyt.j();
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
