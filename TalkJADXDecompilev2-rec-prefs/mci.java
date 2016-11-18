package p000;

public final class mci extends nyx<mci> {
    public String f27323a;
    public String f27324b;
    public Integer f27325c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31706b(nyt);
    }

    public mci() {
        m31707d();
    }

    private mci m31707d() {
        this.f27323a = null;
        this.f27324b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27323a != null) {
            nyu.a(1, this.f27323a);
        }
        if (this.f27324b != null) {
            nyu.a(2, this.f27324b);
        }
        if (this.f27325c != null) {
            nyu.a(3, this.f27325c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27323a != null) {
            b += nyu.b(1, this.f27323a);
        }
        if (this.f27324b != null) {
            b += nyu.b(2, this.f27324b);
        }
        if (this.f27325c != null) {
            return b + nyu.f(3, this.f27325c.intValue());
        }
        return b;
    }

    private mci m31706b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27323a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27324b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
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
                            this.f27325c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
