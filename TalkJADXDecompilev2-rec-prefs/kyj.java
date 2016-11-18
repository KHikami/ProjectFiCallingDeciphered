package p000;

public final class kyj extends nyx<kyj> {
    private static volatile kyj[] f24065j;
    public Integer f24066a;
    public String f24067b;
    public String f24068c;
    public String f24069d;
    public String f24070e;
    public String f24071f;
    public String f24072g;
    public Integer f24073h;
    public kyi[] f24074i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28070b(nyt);
    }

    public static kyj[] m28071d() {
        if (f24065j == null) {
            synchronized (nzc.c) {
                if (f24065j == null) {
                    f24065j = new kyj[0];
                }
            }
        }
        return f24065j;
    }

    public kyj() {
        m28072g();
    }

    private kyj m28072g() {
        this.f24067b = null;
        this.f24068c = null;
        this.f24069d = null;
        this.f24070e = null;
        this.f24071f = null;
        this.f24072g = null;
        this.f24073h = null;
        this.f24074i = kyi.m28065d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24066a != null) {
            nyu.a(1, this.f24066a.intValue());
        }
        if (this.f24067b != null) {
            nyu.a(2, this.f24067b);
        }
        if (this.f24068c != null) {
            nyu.a(3, this.f24068c);
        }
        if (this.f24069d != null) {
            nyu.a(4, this.f24069d);
        }
        if (this.f24070e != null) {
            nyu.a(5, this.f24070e);
        }
        if (this.f24071f != null) {
            nyu.a(6, this.f24071f);
        }
        if (this.f24074i != null && this.f24074i.length > 0) {
            for (nzf nzf : this.f24074i) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.f24072g != null) {
            nyu.a(8, this.f24072g);
        }
        if (this.f24073h != null) {
            nyu.a(9, this.f24073h.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24066a != null) {
            b += nyu.f(1, this.f24066a.intValue());
        }
        if (this.f24067b != null) {
            b += nyu.b(2, this.f24067b);
        }
        if (this.f24068c != null) {
            b += nyu.b(3, this.f24068c);
        }
        if (this.f24069d != null) {
            b += nyu.b(4, this.f24069d);
        }
        if (this.f24070e != null) {
            b += nyu.b(5, this.f24070e);
        }
        if (this.f24071f != null) {
            b += nyu.b(6, this.f24071f);
        }
        if (this.f24074i != null && this.f24074i.length > 0) {
            int i = b;
            for (nzf nzf : this.f24074i) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.f24072g != null) {
            b += nyu.b(8, this.f24072g);
        }
        if (this.f24073h != null) {
            return b + nyu.f(9, this.f24073h.intValue());
        }
        return b;
    }

    private kyj m28070b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f24066a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24067b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24068c = nyt.j();
                    continue;
                case 34:
                    this.f24069d = nyt.j();
                    continue;
                case 42:
                    this.f24070e = nyt.j();
                    continue;
                case 50:
                    this.f24071f = nyt.j();
                    continue;
                case 58:
                    int b = nzl.b(nyt, 58);
                    if (this.f24074i == null) {
                        a = 0;
                    } else {
                        a = this.f24074i.length;
                    }
                    Object obj = new kyi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24074i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyi();
                    nyt.a(obj[a]);
                    this.f24074i = obj;
                    continue;
                case 66:
                    this.f24072g = nyt.j();
                    continue;
                case 72:
                    this.f24073h = Integer.valueOf(nyt.f());
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
