package p000;

public final class ldq extends nyx<ldq> {
    public static final nyy<ozo, ldq> f24711a = nyy.a(11, ldq.class, 158821898);
    private static final ldq[] f24712f = new ldq[0];
    public Integer f24713b;
    public String f24714c;
    public ldp f24715d;
    public Integer f24716e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28771b(nyt);
    }

    public ldq() {
        m28772d();
    }

    private ldq m28772d() {
        this.f24714c = null;
        this.f24715d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24713b != null) {
            nyu.a(1, this.f24713b.intValue());
        }
        if (this.f24714c != null) {
            nyu.a(2, this.f24714c);
        }
        if (this.f24715d != null) {
            nyu.b(3, this.f24715d);
        }
        if (this.f24716e != null) {
            nyu.a(4, this.f24716e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24713b != null) {
            b += nyu.f(1, this.f24713b.intValue());
        }
        if (this.f24714c != null) {
            b += nyu.b(2, this.f24714c);
        }
        if (this.f24715d != null) {
            b += nyu.d(3, this.f24715d);
        }
        if (this.f24716e != null) {
            return b + nyu.f(4, this.f24716e.intValue());
        }
        return b;
    }

    private ldq m28771b(nyt nyt) {
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
                            this.f24713b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24714c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24715d == null) {
                        this.f24715d = new ldp();
                    }
                    nyt.a(this.f24715d);
                    continue;
                case 32:
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
                            this.f24716e = Integer.valueOf(a);
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
