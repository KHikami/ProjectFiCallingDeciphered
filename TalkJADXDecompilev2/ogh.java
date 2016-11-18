package defpackage;

public final class ogh extends nyx<ogh> {
    public static final nyy<ozo, ogh> a = nyy.a(11, ogh.class, 332342562);
    private static final ogh[] g = new ogh[0];
    public String b;
    public Integer c;
    public ogi d;
    public Boolean e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ogh() {
        d();
    }

    private ogh d() {
        this.b = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(1, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f.intValue());
        }
        if (this.b != null) {
            nyu.a(6, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.f(1, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.d(2, this.d);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.intValue());
        }
        if (this.b != null) {
            return b + nyu.b(6, this.b);
        }
        return b;
    }

    private ogh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 8:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
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
                        case 153:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 160:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                        case 167:
                        case 168:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.d == null) {
                        this.d = new ogi();
                    }
                    nyt.a(this.d);
                    continue;
                case wi.dA /*24*/:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    this.b = nyt.j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
