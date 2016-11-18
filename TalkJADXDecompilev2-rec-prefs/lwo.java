package p000;

public final class lwo extends nyx<lwo> {
    public Boolean f26702a;
    public Long f26703b;
    public lox[] f26704c;
    public Boolean f26705d;
    public lsb f26706e;
    public lqc[] f26707f;
    public lnw f26708g;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30893b(nyt);
    }

    public lwo() {
        m30894d();
    }

    private lwo m30894d() {
        this.responseHeader = null;
        this.f26702a = null;
        this.f26703b = null;
        this.f26704c = lox.m29824d();
        this.f26705d = null;
        this.f26706e = null;
        this.f26707f = lqc.m30002d();
        this.f26708g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26703b != null) {
            nyu.a(2, this.f26703b.longValue());
        }
        if (this.f26704c != null && this.f26704c.length > 0) {
            for (nzf nzf : this.f26704c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26705d != null) {
            nyu.a(4, this.f26705d.booleanValue());
        }
        if (this.f26706e != null) {
            nyu.b(5, this.f26706e);
        }
        if (this.f26702a != null) {
            nyu.a(6, this.f26702a.booleanValue());
        }
        if (this.f26707f != null && this.f26707f.length > 0) {
            while (i < this.f26707f.length) {
                nzf nzf2 = this.f26707f[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.f26708g != null) {
            nyu.b(8, this.f26708g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26703b != null) {
            b += nyu.e(2, this.f26703b.longValue());
        }
        if (this.f26704c != null && this.f26704c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26704c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f26705d != null) {
            this.f26705d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26706e != null) {
            b += nyu.d(5, this.f26706e);
        }
        if (this.f26702a != null) {
            this.f26702a.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26707f != null && this.f26707f.length > 0) {
            while (i < this.f26707f.length) {
                nzf nzf2 = this.f26707f[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.f26708g != null) {
            return b + nyu.d(8, this.f26708g);
        }
        return b;
    }

    private lwo m30893b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    this.f26703b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26704c == null) {
                        a = 0;
                    } else {
                        a = this.f26704c.length;
                    }
                    obj = new lox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26704c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lox();
                    nyt.a(obj[a]);
                    this.f26704c = obj;
                    continue;
                case 32:
                    this.f26705d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.f26706e == null) {
                        this.f26706e = new lsb();
                    }
                    nyt.a(this.f26706e);
                    continue;
                case 48:
                    this.f26702a = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f26707f == null) {
                        a = 0;
                    } else {
                        a = this.f26707f.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26707f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26707f = obj;
                    continue;
                case 66:
                    if (this.f26708g == null) {
                        this.f26708g = new lnw();
                    }
                    nyt.a(this.f26708g);
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
