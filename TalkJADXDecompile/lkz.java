public final class lkz extends nyx<lkz> {
    public lla[] a;
    public Integer b;
    public Integer c;
    public Integer d;
    public lks e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lkz() {
        d();
    }

    private lkz d() {
        this.a = lla.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.a(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.a(15, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(16, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(17, this.d.intValue());
        }
        if (this.e != null) {
            nyu.b(18, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    b += nyu.c(1, nzf);
                }
            }
        }
        if (this.b != null) {
            b += nyu.f(15, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(16, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(17, this.d.intValue());
        }
        if (this.e != null) {
            return b + nyu.d(18, this.e);
        }
        return b;
    }

    private lkz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dB /*11*/:
                    int b = nzl.b(nyt, 11);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new lla[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lla();
                        nyt.a(obj[a], 1);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lla();
                    nyt.a(obj[a], 1);
                    this.a = obj;
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 136:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    if (this.e == null) {
                        this.e = new lks();
                    }
                    nyt.a(this.e);
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
