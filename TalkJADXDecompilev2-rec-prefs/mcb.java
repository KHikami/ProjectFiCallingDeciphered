package p000;

public final class mcb extends nyx<mcb> {
    public Integer f27291a;
    public String f27292b;
    public Long f27293c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31671b(nyt);
    }

    public mcb() {
        m31672d();
    }

    private mcb m31672d() {
        this.f27292b = null;
        this.f27293c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27291a != null) {
            nyu.a(1, this.f27291a.intValue());
        }
        if (this.f27292b != null) {
            nyu.a(2, this.f27292b);
        }
        if (this.f27293c != null) {
            nyu.a(3, this.f27293c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27291a != null) {
            b += nyu.f(1, this.f27291a.intValue());
        }
        if (this.f27292b != null) {
            b += nyu.b(2, this.f27292b);
        }
        if (this.f27293c != null) {
            return b + nyu.e(3, this.f27293c.longValue());
        }
        return b;
    }

    private mcb m31671b(nyt nyt) {
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
                            this.f27291a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f27292b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f27293c = Long.valueOf(nyt.d());
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
