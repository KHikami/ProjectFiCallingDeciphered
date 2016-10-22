public final class lxh extends nyx<lxh> {
    private static volatile lxh[] o;
    public String a;
    public String b;
    public String c;
    public Integer d;
    public String e;
    public String f;
    public lxq g;
    public Integer h;
    public lxm i;
    public lxk j;
    public lxl k;
    public lxn l;
    public Integer m;
    public String[] n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lxh[] d() {
        if (o == null) {
            synchronized (nzc.c) {
                if (o == null) {
                    o = new lxh[0];
                }
            }
        }
        return o;
    }

    public lxh() {
        g();
    }

    private lxh g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h.intValue());
        }
        if (this.i != null) {
            nyu.b(8, this.i);
        }
        if (this.j != null) {
            nyu.b(9, this.j);
        }
        if (this.e != null) {
            nyu.a(10, this.e);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.m != null) {
            nyu.a(13, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            for (String str : this.n) {
                if (str != null) {
                    nyu.a(14, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.f(7, this.h.intValue());
        }
        if (this.i != null) {
            b += nyu.d(8, this.i);
        }
        if (this.j != null) {
            b += nyu.d(9, this.j);
        }
        if (this.e != null) {
            b += nyu.b(10, this.e);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.m != null) {
            b += nyu.f(13, this.m.intValue());
        }
        if (this.n == null || this.n.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.n.length) {
            String str = this.n[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lxh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new lxq();
                    }
                    nyt.a(this.g);
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    if (this.i == null) {
                        this.i = new lxm();
                    }
                    nyt.a(this.i);
                    continue;
                case 74:
                    if (this.j == null) {
                        this.j = new lxk();
                    }
                    nyt.a(this.j);
                    continue;
                case 82:
                    this.e = nyt.j();
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new lxl();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new lxn();
                    }
                    nyt.a(this.l);
                    continue;
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.m /*8*/:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 114:
                    int b = nzl.b(nyt, 114);
                    a = this.n == null ? 0 : this.n.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.n = obj;
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
