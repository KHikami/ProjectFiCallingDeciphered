public final class lxy extends nyx<lxy> {
    private static volatile lxy[] k;
    public String a;
    public Long b;
    public Integer c;
    public Long d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public lxz[] i;
    public String j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lxy[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new lxy[0];
                }
            }
        }
        return k;
    }

    public lxy() {
        g();
    }

    private lxy g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = lxz.d();
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(5, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(6, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(7, this.f.longValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.h != null) {
            nyu.a(9, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.j != null) {
            nyu.a(11, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(5, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.f(7, this.f.longValue());
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.h != null) {
            b += nyu.b(9, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            int i = b;
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.j != null) {
            return b + nyu.b(11, this.j);
        }
        return b;
    }

    private lxy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 74:
                    this.h = nyt.j();
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    Object obj = new lxz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxz();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 90:
                    this.j = nyt.j();
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
