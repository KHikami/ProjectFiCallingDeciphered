package defpackage;

public final class lwo extends nyx<lwo> {
    public Boolean a;
    public Long b;
    public lox[] c;
    public Boolean d;
    public lsb e;
    public lqc[] f;
    public lnw g;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwo() {
        d();
    }

    private lwo d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = lox.d();
        this.d = null;
        this.e = null;
        this.f = lqc.d();
        this.g = null;
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
            nyu.a(2, this.b.longValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.a != null) {
            nyu.a(6, this.a.booleanValue());
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.b(8, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.b != null) {
            b += nyu.e(2, this.b.longValue());
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            return b + nyu.d(8, this.g);
        }
        return b;
    }

    private lwo b(nyt nyt) {
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
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lox();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new lsb();
                    }
                    nyt.a(this.e);
                    continue;
                case 48:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new lnw();
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
