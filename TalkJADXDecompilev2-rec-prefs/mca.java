package p000;

public final class mca extends nyx<mca> {
    public Integer f27287a;
    public Integer f27288b;
    public mci f27289c;
    public mcb f27290d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31666b(nyt);
    }

    public mca() {
        m31667d();
    }

    private mca m31667d() {
        this.f27289c = null;
        this.f27290d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f27287a.intValue());
        if (this.f27288b != null) {
            nyu.a(2, this.f27288b.intValue());
        }
        if (this.f27289c != null) {
            nyu.b(3, this.f27289c);
        }
        if (this.f27290d != null) {
            nyu.b(4, this.f27290d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.f(1, this.f27287a.intValue());
        if (this.f27288b != null) {
            b += nyu.f(2, this.f27288b.intValue());
        }
        if (this.f27289c != null) {
            b += nyu.d(3, this.f27289c);
        }
        if (this.f27290d != null) {
            return b + nyu.d(4, this.f27290d);
        }
        return b;
    }

    private mca m31666b(nyt nyt) {
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
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                            this.f27287a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f27288b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f27289c == null) {
                        this.f27289c = new mci();
                    }
                    nyt.a(this.f27289c);
                    continue;
                case 34:
                    if (this.f27290d == null) {
                        this.f27290d = new mcb();
                    }
                    nyt.a(this.f27290d);
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
