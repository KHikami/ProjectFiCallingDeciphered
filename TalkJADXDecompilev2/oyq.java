package defpackage;

public final class oyq extends nyx<oyq> {
    private static volatile oyq[] f;
    public Boolean a;
    public oyp b;
    public Integer c;
    public String d;
    public oyr e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oyq[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new oyq[0];
                }
            }
        }
        return f;
    }

    public oyq() {
        g();
    }

    private oyq g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.e != null) {
            nyu.b(2, this.e);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.e != null) {
            b += nyu.d(2, this.e);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null) {
            return b + nyu.b(5, this.d);
        }
        return b;
    }

    private oyq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    if (this.e == null) {
                        this.e = new oyr();
                    }
                    nyt.a(this.e);
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new oyp();
                    }
                    nyt.a(this.b);
                    continue;
                case 32:
                    a = nyt.f();
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
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.d = nyt.j();
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
