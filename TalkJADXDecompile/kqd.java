public final class kqd extends nyx<kqd> {
    public String a;
    public lcx b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public String[] f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kqd() {
        d();
    }

    private kqd d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e.booleanValue());
        }
        if (this.f != null && this.f.length > 0) {
            for (String str : this.f) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.b != null) {
            nyu.b(7, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f != null && this.f.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f.length) {
                String str = this.f[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.b != null) {
            return b + nyu.d(7, this.b);
        }
        return b;
    }

    private kqd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f == null ? 0 : this.f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.b == null) {
                        this.b = new lcx();
                    }
                    nyt.a(this.b);
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
