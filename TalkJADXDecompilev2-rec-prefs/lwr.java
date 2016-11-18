package p000;

public final class lwr extends nyx<lwr> {
    public Long f26718a;
    public lox[] f26719b;
    public Long f26720c;
    public lsb f26721d;
    public lqc[] f26722e;
    public lnw f26723f;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30908b(nyt);
    }

    public lwr() {
        m30909d();
    }

    private lwr m30909d() {
        this.responseHeader = null;
        this.f26718a = null;
        this.f26719b = lox.m29824d();
        this.f26720c = null;
        this.f26721d = null;
        this.f26722e = lqc.m30002d();
        this.f26723f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26718a != null) {
            nyu.a(2, this.f26718a.longValue());
        }
        if (this.f26719b != null && this.f26719b.length > 0) {
            for (nzf nzf : this.f26719b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26720c != null) {
            nyu.a(4, this.f26720c.longValue());
        }
        if (this.f26721d != null) {
            nyu.b(5, this.f26721d);
        }
        if (this.f26722e != null && this.f26722e.length > 0) {
            while (i < this.f26722e.length) {
                nzf nzf2 = this.f26722e[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        if (this.f26723f != null) {
            nyu.b(7, this.f26723f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26718a != null) {
            b += nyu.e(2, this.f26718a.longValue());
        }
        if (this.f26719b != null && this.f26719b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26719b) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f26720c != null) {
            b += nyu.e(4, this.f26720c.longValue());
        }
        if (this.f26721d != null) {
            b += nyu.d(5, this.f26721d);
        }
        if (this.f26722e != null && this.f26722e.length > 0) {
            while (i < this.f26722e.length) {
                nzf nzf2 = this.f26722e[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        if (this.f26723f != null) {
            return b + nyu.d(7, this.f26723f);
        }
        return b;
    }

    private lwr m30908b(nyt nyt) {
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
                    this.f26718a = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26719b == null) {
                        a = 0;
                    } else {
                        a = this.f26719b.length;
                    }
                    obj = new lox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26719b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lox();
                    nyt.a(obj[a]);
                    this.f26719b = obj;
                    continue;
                case 32:
                    this.f26720c = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.f26721d == null) {
                        this.f26721d = new lsb();
                    }
                    nyt.a(this.f26721d);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f26722e == null) {
                        a = 0;
                    } else {
                        a = this.f26722e.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26722e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26722e = obj;
                    continue;
                case 58:
                    if (this.f26723f == null) {
                        this.f26723f = new lnw();
                    }
                    nyt.a(this.f26723f);
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
