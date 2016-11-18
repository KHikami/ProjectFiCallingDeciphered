package p000;

public final class kwe extends nyx<kwe> {
    private static volatile kwe[] f23741j;
    public int f23742a;
    public String f23743b;
    public String f23744c;
    public String f23745d;
    public String f23746e;
    public String f23747f;
    public String f23748g;
    public Integer f23749h;
    public kwd[] f23750i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27778b(nyt);
    }

    public static kwe[] m27779d() {
        if (f23741j == null) {
            synchronized (nzc.c) {
                if (f23741j == null) {
                    f23741j = new kwe[0];
                }
            }
        }
        return f23741j;
    }

    public kwe() {
        this.f23742a = nzf.UNSET_ENUM_VALUE;
        this.f23743b = null;
        this.f23744c = null;
        this.f23745d = null;
        this.f23746e = null;
        this.f23747f = null;
        this.f23748g = null;
        this.f23749h = null;
        this.f23750i = kwd.m27774d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23742a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23742a);
        }
        if (this.f23743b != null) {
            nyu.a(2, this.f23743b);
        }
        if (this.f23744c != null) {
            nyu.a(3, this.f23744c);
        }
        if (this.f23745d != null) {
            nyu.a(4, this.f23745d);
        }
        if (this.f23746e != null) {
            nyu.a(5, this.f23746e);
        }
        if (this.f23747f != null) {
            nyu.a(6, this.f23747f);
        }
        if (this.f23750i != null && this.f23750i.length > 0) {
            for (nzf nzf : this.f23750i) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.f23748g != null) {
            nyu.a(8, this.f23748g);
        }
        if (this.f23749h != null) {
            nyu.a(9, this.f23749h.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23742a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23742a);
        }
        if (this.f23743b != null) {
            b += nyu.b(2, this.f23743b);
        }
        if (this.f23744c != null) {
            b += nyu.b(3, this.f23744c);
        }
        if (this.f23745d != null) {
            b += nyu.b(4, this.f23745d);
        }
        if (this.f23746e != null) {
            b += nyu.b(5, this.f23746e);
        }
        if (this.f23747f != null) {
            b += nyu.b(6, this.f23747f);
        }
        if (this.f23750i != null && this.f23750i.length > 0) {
            int i = b;
            for (nzf nzf : this.f23750i) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.f23748g != null) {
            b += nyu.b(8, this.f23748g);
        }
        if (this.f23749h != null) {
            return b + nyu.f(9, this.f23749h.intValue());
        }
        return b;
    }

    private kwe m27778b(nyt nyt) {
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
                            this.f23742a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f23743b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23744c = nyt.j();
                    continue;
                case 34:
                    this.f23745d = nyt.j();
                    continue;
                case 42:
                    this.f23746e = nyt.j();
                    continue;
                case 50:
                    this.f23747f = nyt.j();
                    continue;
                case 58:
                    int b = nzl.b(nyt, 58);
                    if (this.f23750i == null) {
                        a = 0;
                    } else {
                        a = this.f23750i.length;
                    }
                    Object obj = new kwd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23750i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwd();
                    nyt.a(obj[a]);
                    this.f23750i = obj;
                    continue;
                case 66:
                    this.f23748g = nyt.j();
                    continue;
                case 72:
                    this.f23749h = Integer.valueOf(nyt.f());
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
