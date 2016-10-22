public final class lzb extends nyx<lzb> {
    public lyg a;
    public lsh[] b;
    public lzd c;
    public Boolean d;
    public Integer e;
    public String f;
    public lzj g;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lzb() {
        d();
    }

    private lzb d() {
        this.requestHeader = null;
        this.a = null;
        this.b = lsh.d();
        this.c = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(6, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f);
        }
        if (this.g != null) {
            nyu.b(8, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.d(4, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.b(7, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(8, this.g);
        }
        return b;
    }

    private lzb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
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
                    if (this.a == null) {
                        this.a = new lyg();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new lzd();
                    }
                    nyt.a(this.c);
                    continue;
                case 40:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.f = nyt.j();
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new lzj();
                    }
                    nyt.a(this.g);
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
