public final class ksg extends nyx<ksg> {
    private static volatile ksg[] o;
    public String a;
    public String b;
    public String c;
    public kxh d;
    public kxa e;
    public ofv f;
    public String g;
    public Long h;
    public Long i;
    public ksu j;
    public Integer k;
    public Integer l;
    public String m;
    public kva n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ksg[] d() {
        if (o == null) {
            synchronized (nzc.c) {
                if (o == null) {
                    o = new ksg[0];
                }
            }
        }
        return o;
    }

    public ksg() {
        g();
    }

    private ksg g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        nyu.a(3, this.g);
        if (this.j != null) {
            nyu.b(4, this.j);
        }
        if (this.k != null) {
            nyu.a(5, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(6, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(7, this.m);
        }
        if (this.n != null) {
            nyu.b(8, this.n);
        }
        if (this.c != null) {
            nyu.a(9, this.c);
        }
        if (this.h != null) {
            nyu.b(10, this.h.longValue());
        }
        if (this.i != null) {
            nyu.b(11, this.i.longValue());
        }
        if (this.d != null) {
            nyu.b(12, this.d);
        }
        if (this.e != null) {
            nyu.b(13, this.e);
        }
        if (this.f != null) {
            nyu.b(14, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b)) + nyu.b(3, this.g);
        if (this.j != null) {
            b += nyu.d(4, this.j);
        }
        if (this.k != null) {
            b += nyu.f(5, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(6, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.b(7, this.m);
        }
        if (this.n != null) {
            b += nyu.d(8, this.n);
        }
        if (this.c != null) {
            b += nyu.b(9, this.c);
        }
        if (this.h != null) {
            b += nyu.f(10, this.h.longValue());
        }
        if (this.i != null) {
            b += nyu.f(11, this.i.longValue());
        }
        if (this.d != null) {
            b += nyu.d(12, this.d);
        }
        if (this.e != null) {
            b += nyu.d(13, this.e);
        }
        if (this.f != null) {
            return b + nyu.d(14, this.f);
        }
        return b;
    }

    private ksg b(nyt nyt) {
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
                    this.g = nyt.j();
                    continue;
                case 34:
                    if (this.j == null) {
                        this.j = new ksu();
                    }
                    nyt.a(this.j);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.m = nyt.j();
                    continue;
                case 66:
                    if (this.n == null) {
                        this.n = new kva();
                    }
                    nyt.a(this.n);
                    continue;
                case 74:
                    this.c = nyt.j();
                    continue;
                case 80:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.d == null) {
                        this.d = new kxh();
                    }
                    nyt.a(this.d);
                    continue;
                case 106:
                    if (this.e == null) {
                        this.e = new kxa();
                    }
                    nyt.a(this.e);
                    continue;
                case 114:
                    if (this.f == null) {
                        this.f = new ofv();
                    }
                    nyt.a(this.f);
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
