public final class lyt extends nyx<lyt> {
    public String a;
    public String b;
    public Integer c;
    public lzj d;
    public String[] e;
    public lzh[] f;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lyt() {
        d();
    }

    private lyt d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = nzl.f;
        this.f = lzh.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.c != null) {
            nyu.a(5, this.c.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf = this.f[i];
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.c != null) {
            b += nyu.f(5, this.c.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.e) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf = this.f[i];
                if (nzf != null) {
                    b += nyu.d(7, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private lyt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new lzj();
                    }
                    nyt.a(this.d);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
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
                        case wi.dH /*18*/:
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
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 102:
                        case 103:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new lzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzh();
                    nyt.a(obj[a]);
                    this.f = obj;
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
