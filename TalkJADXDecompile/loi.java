public final class loi extends nyx<loi> {
    private static volatile loi[] c;
    public Integer a;
    public Boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static loi[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new loi[0];
                }
            }
        }
        return c;
    }

    public loi() {
        g();
    }

    private loi g() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private loi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                        case wi.dL /*19*/:
                        case wi.k /*20*/:
                        case wi.f /*21*/:
                        case wi.e /*22*/:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case wi.i /*27*/:
                        case wi.o /*28*/:
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dI /*16*/:
                    this.b = Boolean.valueOf(nyt.i());
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
