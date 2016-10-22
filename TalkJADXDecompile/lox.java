public final class lox extends nyx<lox> {
    private static volatile lox[] i;
    public lor a;
    public Long b;
    public lom c;
    public lqg[] d;
    public lqk e;
    public lqk f;
    public Boolean g;
    public lpg[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lox[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new lox[0];
                }
            }
        }
        return i;
    }

    public lox() {
        g();
    }

    private lox g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = lqg.d();
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = lpg.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.a(4, this.g.booleanValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.b != null) {
            nyu.a(6, this.b.longValue());
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf2 = this.h[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.b(8, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.b != null) {
            b += nyu.e(6, this.b.longValue());
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf2 = this.h[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            return b + nyu.d(8, this.f);
        }
        return b;
    }

    private lox b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lor();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new lom();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new lqg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqg();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 32:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new lqk();
                    }
                    nyt.a(this.e);
                    continue;
                case 48:
                    this.b = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new lpg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lpg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lpg();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 66:
                    if (this.f == null) {
                        this.f = new lqk();
                    }
                    nyt.a(this.f);
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
