package p000;

public final class odr extends nyx<odr> {
    private static volatile odr[] f32447f;
    public Boolean f32448a;
    public odq f32449b;
    public int f32450c;
    public String f32451d;
    public ods f32452e;

    public /* synthetic */ nzf m37891a(nyt nyt) {
        return m37889b(nyt);
    }

    public static odr[] m37890d() {
        if (f32447f == null) {
            synchronized (nzc.f31309c) {
                if (f32447f == null) {
                    f32447f = new odr[0];
                }
            }
        }
        return f32447f;
    }

    public odr() {
        this.f32448a = null;
        this.f32450c = nzf.UNSET_ENUM_VALUE;
        this.f32451d = null;
        this.cachedSize = -1;
    }

    public void m37892a(nyu nyu) {
        if (this.f32448a != null) {
            nyu.m37172a(1, this.f32448a.booleanValue());
        }
        if (this.f32452e != null) {
            nyu.m37182b(2, this.f32452e);
        }
        if (this.f32449b != null) {
            nyu.m37182b(3, this.f32449b);
        }
        if (this.f32450c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f32450c);
        }
        if (this.f32451d != null) {
            nyu.m37170a(5, this.f32451d);
        }
        super.a(nyu);
    }

    protected int m37893b() {
        int b = super.b();
        if (this.f32448a != null) {
            this.f32448a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32452e != null) {
            b += nyu.m37145d(2, this.f32452e);
        }
        if (this.f32449b != null) {
            b += nyu.m37145d(3, this.f32449b);
        }
        if (this.f32450c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f32450c);
        }
        if (this.f32451d != null) {
            return b + nyu.m37137b(5, this.f32451d);
        }
        return b;
    }

    private odr m37889b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32448a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f32452e == null) {
                        this.f32452e = new ods();
                    }
                    nyt.m37101a(this.f32452e);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32449b == null) {
                        this.f32449b = new odq();
                    }
                    nyt.m37101a(this.f32449b);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 19997403:
                        case 39752029:
                        case 39997403:
                        case 40687070:
                        case 40742409:
                        case 40748352:
                        case 41004086:
                        case 42121930:
                        case 42283483:
                        case 42922426:
                        case 42927174:
                        case 42973762:
                        case 42976986:
                        case 43123456:
                        case 43962470:
                        case 44411671:
                        case 44458334:
                        case 45091485:
                        case 45305931:
                        case 45916904:
                        case 48591739:
                        case 48591830:
                        case 48591920:
                        case 48592003:
                        case 48592164:
                        case 48592239:
                        case 48592306:
                        case 49150953:
                        case 51241253:
                        case 53263312:
                        case 57257173:
                        case 58792500:
                        case 59711768:
                        case 60936852:
                        case 62857615:
                        case 62959766:
                        case 65886225:
                        case 70516243:
                        case 72751461:
                        case 73031374:
                        case 73053971:
                        case 75002836:
                        case 75005721:
                        case 77306139:
                        case 77307489:
                        case 77307817:
                        case 84878627:
                            this.f32450c = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f32451d = nyt.m37117j();
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
