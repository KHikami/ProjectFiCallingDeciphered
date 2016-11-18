package defpackage;

public final class lpg extends nyx<lpg> {
    private static volatile lpg[] e;
    public Integer a;
    public Long b;
    public Long c;
    public String[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lpg[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new lpg[0];
                }
            }
        }
        return e;
    }

    public lpg() {
        g();
    }

    private lpg g() {
        this.b = null;
        this.c = null;
        this.d = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.longValue());
        }
        if (this.a != null) {
            nyu.a(3, this.a.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.b != null) {
            b += nyu.e(1, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.e(2, this.c.longValue());
        }
        if (this.a != null) {
            b += nyu.f(3, this.a.intValue());
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

    private lpg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
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
                case 34:
                    int b = nzl.b(nyt, 34);
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
