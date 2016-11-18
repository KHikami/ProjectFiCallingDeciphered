package p000;

public final class oyq extends nyx<oyq> {
    private static volatile oyq[] f34663f;
    public Boolean f34664a;
    public oyp f34665b;
    public Integer f34666c;
    public String f34667d;
    public oyr f34668e;

    public /* synthetic */ nzf m39948a(nyt nyt) {
        return m39945b(nyt);
    }

    public static oyq[] m39946d() {
        if (f34663f == null) {
            synchronized (nzc.f31309c) {
                if (f34663f == null) {
                    f34663f = new oyq[0];
                }
            }
        }
        return f34663f;
    }

    public oyq() {
        m39947g();
    }

    private oyq m39947g() {
        this.f34664a = null;
        this.f34665b = null;
        this.f34667d = null;
        this.f34668e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39949a(nyu nyu) {
        if (this.f34664a != null) {
            nyu.m37172a(1, this.f34664a.booleanValue());
        }
        if (this.f34668e != null) {
            nyu.m37182b(2, this.f34668e);
        }
        if (this.f34665b != null) {
            nyu.m37182b(3, this.f34665b);
        }
        if (this.f34666c != null) {
            nyu.m37168a(4, this.f34666c.intValue());
        }
        if (this.f34667d != null) {
            nyu.m37170a(5, this.f34667d);
        }
        super.a(nyu);
    }

    protected int m39950b() {
        int b = super.b();
        if (this.f34664a != null) {
            this.f34664a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f34668e != null) {
            b += nyu.m37145d(2, this.f34668e);
        }
        if (this.f34665b != null) {
            b += nyu.m37145d(3, this.f34665b);
        }
        if (this.f34666c != null) {
            b += nyu.m37147f(4, this.f34666c.intValue());
        }
        if (this.f34667d != null) {
            return b + nyu.m37137b(5, this.f34667d);
        }
        return b;
    }

    private oyq m39945b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34664a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f34668e == null) {
                        this.f34668e = new oyr();
                    }
                    nyt.m37101a(this.f34668e);
                    continue;
                case wi.dx /*26*/:
                    if (this.f34665b == null) {
                        this.f34665b = new oyp();
                    }
                    nyt.m37101a(this.f34665b);
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
                            this.f34666c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f34667d = nyt.m37117j();
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
