package p000;

public final class ogh extends nyx<ogh> {
    public static final nyy<ozo, ogh> f32714a = nyy.m37203a(11, ogh.class, 332342562);
    private static final ogh[] f32715g = new ogh[0];
    public String f32716b;
    public Integer f32717c;
    public ogi f32718d;
    public Boolean f32719e;
    public Integer f32720f;

    public /* synthetic */ nzf m38183a(nyt nyt) {
        return m38181b(nyt);
    }

    public ogh() {
        m38182d();
    }

    private ogh m38182d() {
        this.f32716b = null;
        this.f32718d = null;
        this.f32719e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38184a(nyu nyu) {
        if (this.f32717c != null) {
            nyu.m37168a(1, this.f32717c.intValue());
        }
        if (this.f32718d != null) {
            nyu.m37182b(2, this.f32718d);
        }
        if (this.f32719e != null) {
            nyu.m37172a(3, this.f32719e.booleanValue());
        }
        if (this.f32720f != null) {
            nyu.m37168a(5, this.f32720f.intValue());
        }
        if (this.f32716b != null) {
            nyu.m37170a(6, this.f32716b);
        }
        super.a(nyu);
    }

    protected int m38185b() {
        int b = super.b();
        if (this.f32717c != null) {
            b += nyu.m37147f(1, this.f32717c.intValue());
        }
        if (this.f32718d != null) {
            b += nyu.m37145d(2, this.f32718d);
        }
        if (this.f32719e != null) {
            this.f32719e.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f32720f != null) {
            b += nyu.m37147f(5, this.f32720f.intValue());
        }
        if (this.f32716b != null) {
            return b + nyu.m37137b(6, this.f32716b);
        }
        return b;
    }

    private ogh m38181b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
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
                            this.f32717c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f32718d == null) {
                        this.f32718d = new ogi();
                    }
                    nyt.m37101a(this.f32718d);
                    continue;
                case wi.dA /*24*/:
                    this.f32719e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f32720f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    this.f32716b = nyt.m37117j();
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
