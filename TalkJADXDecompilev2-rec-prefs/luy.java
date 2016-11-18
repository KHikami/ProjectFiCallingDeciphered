package p000;

public final class luy extends nyx<luy> {
    public lqm f26553a;
    public lqj[] f26554b;
    public loc[] f26555c;
    public lsh f26556d;
    public ltb f26557e;
    public lqn f26558f;
    public lsq f26559g;
    public lqt f26560h;
    public lwj f26561i;
    public lud f26562j;
    public byte[] f26563k;
    public Long f26564l;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30678b(nyt);
    }

    public luy() {
        m30679d();
    }

    private luy m30679d() {
        this.requestHeader = null;
        this.f26553a = null;
        this.f26554b = lqj.m30041d();
        this.f26555c = loc.m29712d();
        this.f26556d = null;
        this.f26557e = null;
        this.f26558f = null;
        this.f26559g = null;
        this.f26560h = null;
        this.f26561i = null;
        this.f26562j = null;
        this.f26563k = null;
        this.f26564l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26563k != null) {
            nyu.a(2, this.f26563k);
        }
        if (this.f26564l != null) {
            nyu.a(3, this.f26564l.longValue());
        }
        if (this.f26554b != null && this.f26554b.length > 0) {
            for (nzf nzf : this.f26554b) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f26557e != null) {
            nyu.b(6, this.f26557e);
        }
        if (this.f26558f != null) {
            nyu.b(7, this.f26558f);
        }
        if (this.f26553a != null) {
            nyu.b(8, this.f26553a);
        }
        if (this.f26556d != null) {
            nyu.b(9, this.f26556d);
        }
        if (this.f26559g != null) {
            nyu.b(10, this.f26559g);
        }
        if (this.f26560h != null) {
            nyu.b(11, this.f26560h);
        }
        if (this.f26555c != null && this.f26555c.length > 0) {
            while (i < this.f26555c.length) {
                nzf nzf2 = this.f26555c[i];
                if (nzf2 != null) {
                    nyu.b(12, nzf2);
                }
                i++;
            }
        }
        if (this.f26561i != null) {
            nyu.b(13, this.f26561i);
        }
        if (this.f26562j != null) {
            nyu.b(14, this.f26562j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26563k != null) {
            b += nyu.b(2, this.f26563k);
        }
        if (this.f26564l != null) {
            b += nyu.e(3, this.f26564l.longValue());
        }
        if (this.f26554b != null && this.f26554b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26554b) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f26557e != null) {
            b += nyu.d(6, this.f26557e);
        }
        if (this.f26558f != null) {
            b += nyu.d(7, this.f26558f);
        }
        if (this.f26553a != null) {
            b += nyu.d(8, this.f26553a);
        }
        if (this.f26556d != null) {
            b += nyu.d(9, this.f26556d);
        }
        if (this.f26559g != null) {
            b += nyu.d(10, this.f26559g);
        }
        if (this.f26560h != null) {
            b += nyu.d(11, this.f26560h);
        }
        if (this.f26555c != null && this.f26555c.length > 0) {
            while (i < this.f26555c.length) {
                nzf nzf2 = this.f26555c[i];
                if (nzf2 != null) {
                    b += nyu.d(12, nzf2);
                }
                i++;
            }
        }
        if (this.f26561i != null) {
            b += nyu.d(13, this.f26561i);
        }
        if (this.f26562j != null) {
            return b + nyu.d(14, this.f26562j);
        }
        return b;
    }

    private luy m30678b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    this.f26563k = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f26564l = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f26554b == null) {
                        a = 0;
                    } else {
                        a = this.f26554b.length;
                    }
                    obj = new lqj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26554b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqj();
                    nyt.a(obj[a]);
                    this.f26554b = obj;
                    continue;
                case 50:
                    if (this.f26557e == null) {
                        this.f26557e = new ltb();
                    }
                    nyt.a(this.f26557e);
                    continue;
                case 58:
                    if (this.f26558f == null) {
                        this.f26558f = new lqn();
                    }
                    nyt.a(this.f26558f);
                    continue;
                case 66:
                    if (this.f26553a == null) {
                        this.f26553a = new lqm();
                    }
                    nyt.a(this.f26553a);
                    continue;
                case 74:
                    if (this.f26556d == null) {
                        this.f26556d = new lsh();
                    }
                    nyt.a(this.f26556d);
                    continue;
                case 82:
                    if (this.f26559g == null) {
                        this.f26559g = new lsq();
                    }
                    nyt.a(this.f26559g);
                    continue;
                case 90:
                    if (this.f26560h == null) {
                        this.f26560h = new lqt();
                    }
                    nyt.a(this.f26560h);
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.f26555c == null) {
                        a = 0;
                    } else {
                        a = this.f26555c.length;
                    }
                    obj = new loc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26555c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loc();
                    nyt.a(obj[a]);
                    this.f26555c = obj;
                    continue;
                case 106:
                    if (this.f26561i == null) {
                        this.f26561i = new lwj();
                    }
                    nyt.a(this.f26561i);
                    continue;
                case 114:
                    if (this.f26562j == null) {
                        this.f26562j = new lud();
                    }
                    nyt.a(this.f26562j);
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
