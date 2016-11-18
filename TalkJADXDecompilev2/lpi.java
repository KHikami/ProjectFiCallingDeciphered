package defpackage;

public final class lpi extends nyx<lpi> {
    public Integer a;
    public lor b;
    public Long c;
    public String[] d;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lpi() {
        d();
    }

    private lpi d() {
        this.requestHeader = null;
        this.b = null;
        this.c = null;
        this.d = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        if (this.a != null) {
            nyu.a(4, this.a.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    nyu.a(5, str);
                }
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
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.e(3, this.c.longValue());
        }
        if (this.a != null) {
            b += nyu.f(4, this.a.intValue());
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.d.length) {
            String str = this.d[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lpi b(nyt nyt) {
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
                    if (this.b == null) {
                        this.b = new lor();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.d == null ? 0 : this.d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.d = obj;
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
