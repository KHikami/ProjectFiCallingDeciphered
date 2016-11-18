package p000;

public final class lpg extends nyx<lpg> {
    private static volatile lpg[] f25992e;
    public Integer f25993a;
    public Long f25994b;
    public Long f25995c;
    public String[] f25996d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29884b(nyt);
    }

    public static lpg[] m29885d() {
        if (f25992e == null) {
            synchronized (nzc.c) {
                if (f25992e == null) {
                    f25992e = new lpg[0];
                }
            }
        }
        return f25992e;
    }

    public lpg() {
        m29886g();
    }

    private lpg m29886g() {
        this.f25994b = null;
        this.f25995c = null;
        this.f25996d = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25994b != null) {
            nyu.a(1, this.f25994b.longValue());
        }
        if (this.f25995c != null) {
            nyu.a(2, this.f25995c.longValue());
        }
        if (this.f25993a != null) {
            nyu.a(3, this.f25993a.intValue());
        }
        if (this.f25996d != null && this.f25996d.length > 0) {
            for (String str : this.f25996d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25994b != null) {
            b += nyu.e(1, this.f25994b.longValue());
        }
        if (this.f25995c != null) {
            b += nyu.e(2, this.f25995c.longValue());
        }
        if (this.f25993a != null) {
            b += nyu.f(3, this.f25993a.intValue());
        }
        if (this.f25996d == null || this.f25996d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f25996d.length) {
            String str = this.f25996d[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lpg m29884b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25994b = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    this.f25995c = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25993a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    int b = nzl.b(nyt, 34);
                    a = this.f25996d == null ? 0 : this.f25996d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25996d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25996d = obj;
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
