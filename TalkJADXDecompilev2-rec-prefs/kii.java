package p000;

public final class kii extends nyx<kii> {
    public Integer f21845a;
    public kij f21846b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25965b(nyt);
    }

    public kii() {
        m25966d();
    }

    private kii m25966d() {
        this.f21846b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21845a != null) {
            nyu.a(1, this.f21845a.intValue());
        }
        if (this.f21846b != null) {
            nyu.b(2, this.f21846b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21845a != null) {
            b += nyu.f(1, this.f21845a.intValue());
        }
        if (this.f21846b != null) {
            return b + nyu.d(2, this.f21846b);
        }
        return b;
    }

    private kii m25965b(nyt nyt) {
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
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 20:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 41:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 60:
                        case 70:
                        case 71:
                        case 80:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 100:
                        case 101:
                        case 110:
                        case 120:
                        case 121:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                        case 145:
                        case 146:
                        case 147:
                        case 148:
                        case 149:
                        case 150:
                        case 151:
                        case 152:
                            this.f21845a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f21846b == null) {
                        this.f21846b = new kij();
                    }
                    nyt.a(this.f21846b);
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
