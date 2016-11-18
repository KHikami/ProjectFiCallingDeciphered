package p000;

public final class lzr extends nyx<lzr> {
    private static volatile lzr[] f27026i;
    public Integer f27027a;
    public String f27028b;
    public Integer f27029c;
    public Integer f27030d;
    public Integer f27031e;
    public Integer f27032f;
    public Integer f27033g;
    public lzs[] f27034h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31320b(nyt);
    }

    public static lzr[] m31321d() {
        if (f27026i == null) {
            synchronized (nzc.c) {
                if (f27026i == null) {
                    f27026i = new lzr[0];
                }
            }
        }
        return f27026i;
    }

    public lzr() {
        m31322g();
    }

    private lzr m31322g() {
        this.f27027a = null;
        this.f27028b = null;
        this.f27030d = null;
        this.f27031e = null;
        this.f27032f = null;
        this.f27033g = null;
        this.f27034h = lzs.m31327d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27027a != null) {
            nyu.a(1, this.f27027a.intValue());
        }
        if (this.f27028b != null) {
            nyu.a(2, this.f27028b);
        }
        if (this.f27029c != null) {
            nyu.a(3, this.f27029c.intValue());
        }
        if (this.f27030d != null) {
            nyu.a(4, this.f27030d.intValue());
        }
        if (this.f27031e != null) {
            nyu.a(5, this.f27031e.intValue());
        }
        if (this.f27032f != null) {
            nyu.a(6, this.f27032f.intValue());
        }
        if (this.f27033g != null) {
            nyu.a(7, this.f27033g.intValue());
        }
        if (this.f27034h != null && this.f27034h.length > 0) {
            for (nzf nzf : this.f27034h) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27027a != null) {
            b += nyu.f(1, this.f27027a.intValue());
        }
        if (this.f27028b != null) {
            b += nyu.b(2, this.f27028b);
        }
        if (this.f27029c != null) {
            b += nyu.f(3, this.f27029c.intValue());
        }
        if (this.f27030d != null) {
            b += nyu.f(4, this.f27030d.intValue());
        }
        if (this.f27031e != null) {
            b += nyu.f(5, this.f27031e.intValue());
        }
        if (this.f27032f != null) {
            b += nyu.f(6, this.f27032f.intValue());
        }
        if (this.f27033g != null) {
            b += nyu.f(7, this.f27033g.intValue());
        }
        if (this.f27034h == null || this.f27034h.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27034h) {
            if (nzf != null) {
                i += nyu.d(8, nzf);
            }
        }
        return i;
    }

    private lzr m31320b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27027a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f27028b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27029c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f27030d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f27031e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f27032f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f27033g = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    int b = nzl.b(nyt, 66);
                    if (this.f27034h == null) {
                        a = 0;
                    } else {
                        a = this.f27034h.length;
                    }
                    Object obj = new lzs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27034h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzs();
                    nyt.a(obj[a]);
                    this.f27034h = obj;
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
