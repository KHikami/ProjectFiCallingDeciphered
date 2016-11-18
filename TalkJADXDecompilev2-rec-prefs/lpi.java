package p000;

public final class lpi extends nyx<lpi> {
    public Integer f25999a;
    public lor f26000b;
    public Long f26001c;
    public String[] f26002d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29895b(nyt);
    }

    public lpi() {
        m29896d();
    }

    private lpi m29896d() {
        this.requestHeader = null;
        this.f26000b = null;
        this.f26001c = null;
        this.f26002d = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26000b != null) {
            nyu.b(2, this.f26000b);
        }
        if (this.f26001c != null) {
            nyu.a(3, this.f26001c.longValue());
        }
        if (this.f25999a != null) {
            nyu.a(4, this.f25999a.intValue());
        }
        if (this.f26002d != null && this.f26002d.length > 0) {
            for (String str : this.f26002d) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26000b != null) {
            b += nyu.d(2, this.f26000b);
        }
        if (this.f26001c != null) {
            b += nyu.e(3, this.f26001c.longValue());
        }
        if (this.f25999a != null) {
            b += nyu.f(4, this.f25999a.intValue());
        }
        if (this.f26002d == null || this.f26002d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26002d.length) {
            String str = this.f26002d[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lpi m29895b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26000b == null) {
                        this.f26000b = new lor();
                    }
                    nyt.a(this.f26000b);
                    continue;
                case wi.dA /*24*/:
                    this.f26001c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25999a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f26002d == null ? 0 : this.f26002d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26002d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26002d = obj;
                    continue;
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
