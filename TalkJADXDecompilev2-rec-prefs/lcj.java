package p000;

public final class lcj extends nyx<lcj> {
    public int f24576a;
    public String f24577b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28603b(nyt);
    }

    public lcj() {
        this.f24576a = nzf.UNSET_ENUM_VALUE;
        this.f24577b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24576a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f24576a);
        }
        if (this.f24577b != null) {
            nyu.a(2, this.f24577b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24576a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f24576a);
        }
        if (this.f24577b != null) {
            return b + nyu.b(2, this.f24577b);
        }
        return b;
    }

    private lcj m28603b(nyt nyt) {
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
                            this.f24576a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24577b = nyt.j();
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
