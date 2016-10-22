public final class lpa extends nyx<lpa> {
    public Integer a;
    public lom b;
    public lsg[] c;
    public Boolean d;
    public Long e;
    public String f;
    public byte[][] g;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lpa() {
        d();
    }

    private lpa d() {
        this.responseHeader = null;
        this.b = null;
        this.c = lsg.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(4, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                byte[] bArr = this.g[i];
                if (bArr != null) {
                    nyu.a(6, bArr);
                }
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(7, this.d.booleanValue());
        }
        if (this.a != null) {
            nyu.a(8, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.e != null) {
            b += nyu.e(4, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.g.length) {
                byte[] bArr = this.g[i2];
                if (bArr != null) {
                    i3++;
                    i += nyu.b(bArr);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.a != null) {
            return b + nyu.f(8, this.a.intValue());
        }
        return b;
    }

    private lpa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lom();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsg();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 32:
                    this.e = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.g == null ? 0 : this.g.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.g = obj;
                    continue;
                case 56:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
