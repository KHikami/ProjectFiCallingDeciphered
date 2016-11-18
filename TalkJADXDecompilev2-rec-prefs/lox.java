package p000;

public final class lox extends nyx<lox> {
    private static volatile lox[] f25951i;
    public lor f25952a;
    public Long f25953b;
    public lom f25954c;
    public lqg[] f25955d;
    public lqk f25956e;
    public lqk f25957f;
    public Boolean f25958g;
    public lpg[] f25959h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29823b(nyt);
    }

    public static lox[] m29824d() {
        if (f25951i == null) {
            synchronized (nzc.c) {
                if (f25951i == null) {
                    f25951i = new lox[0];
                }
            }
        }
        return f25951i;
    }

    public lox() {
        m29825g();
    }

    private lox m29825g() {
        this.f25952a = null;
        this.f25953b = null;
        this.f25954c = null;
        this.f25955d = lqg.m30025d();
        this.f25956e = null;
        this.f25957f = null;
        this.f25958g = null;
        this.f25959h = lpg.m29885d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25952a != null) {
            nyu.b(1, this.f25952a);
        }
        if (this.f25954c != null) {
            nyu.b(2, this.f25954c);
        }
        if (this.f25955d != null && this.f25955d.length > 0) {
            for (nzf nzf : this.f25955d) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f25958g != null) {
            nyu.a(4, this.f25958g.booleanValue());
        }
        if (this.f25956e != null) {
            nyu.b(5, this.f25956e);
        }
        if (this.f25953b != null) {
            nyu.a(6, this.f25953b.longValue());
        }
        if (this.f25959h != null && this.f25959h.length > 0) {
            while (i < this.f25959h.length) {
                nzf nzf2 = this.f25959h[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.f25957f != null) {
            nyu.b(8, this.f25957f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25952a != null) {
            b += nyu.d(1, this.f25952a);
        }
        if (this.f25954c != null) {
            b += nyu.d(2, this.f25954c);
        }
        if (this.f25955d != null && this.f25955d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f25955d) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f25958g != null) {
            this.f25958g.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f25956e != null) {
            b += nyu.d(5, this.f25956e);
        }
        if (this.f25953b != null) {
            b += nyu.e(6, this.f25953b.longValue());
        }
        if (this.f25959h != null && this.f25959h.length > 0) {
            while (i < this.f25959h.length) {
                nzf nzf2 = this.f25959h[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.f25957f != null) {
            return b + nyu.d(8, this.f25957f);
        }
        return b;
    }

    private lox m29823b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25952a == null) {
                        this.f25952a = new lor();
                    }
                    nyt.a(this.f25952a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25954c == null) {
                        this.f25954c = new lom();
                    }
                    nyt.a(this.f25954c);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f25955d == null) {
                        a = 0;
                    } else {
                        a = this.f25955d.length;
                    }
                    obj = new lqg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25955d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqg();
                    nyt.a(obj[a]);
                    this.f25955d = obj;
                    continue;
                case 32:
                    this.f25958g = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.f25956e == null) {
                        this.f25956e = new lqk();
                    }
                    nyt.a(this.f25956e);
                    continue;
                case 48:
                    this.f25953b = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f25959h == null) {
                        a = 0;
                    } else {
                        a = this.f25959h.length;
                    }
                    obj = new lpg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25959h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lpg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lpg();
                    nyt.a(obj[a]);
                    this.f25959h = obj;
                    continue;
                case 66:
                    if (this.f25957f == null) {
                        this.f25957f = new lqk();
                    }
                    nyt.a(this.f25957f);
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
