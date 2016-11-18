package p000;

public final class man extends nyx<man> {
    private static volatile man[] f27122j;
    public Integer f27123a;
    public Integer f27124b;
    public String f27125c;
    public String f27126d;
    public String f27127e;
    public String f27128f;
    public String f27129g;
    public mao f27130h;
    public mat f27131i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31449b(nyt);
    }

    public static man[] m31450d() {
        if (f27122j == null) {
            synchronized (nzc.c) {
                if (f27122j == null) {
                    f27122j = new man[0];
                }
            }
        }
        return f27122j;
    }

    public man() {
        m31451g();
    }

    private man m31451g() {
        this.f27125c = null;
        this.f27126d = null;
        this.f27127e = null;
        this.f27128f = null;
        this.f27129g = null;
        this.f27130h = null;
        this.f27131i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27123a != null) {
            nyu.a(1, this.f27123a.intValue());
        }
        if (this.f27124b != null) {
            nyu.a(2, this.f27124b.intValue());
        }
        if (this.f27125c != null) {
            nyu.a(3, this.f27125c);
        }
        if (this.f27126d != null) {
            nyu.a(4, this.f27126d);
        }
        if (this.f27127e != null) {
            nyu.a(5, this.f27127e);
        }
        if (this.f27128f != null) {
            nyu.a(6, this.f27128f);
        }
        if (this.f27129g != null) {
            nyu.a(7, this.f27129g);
        }
        if (this.f27130h != null) {
            nyu.b(8, this.f27130h);
        }
        if (this.f27131i != null) {
            nyu.b(9, this.f27131i);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27123a != null) {
            b += nyu.f(1, this.f27123a.intValue());
        }
        if (this.f27124b != null) {
            b += nyu.f(2, this.f27124b.intValue());
        }
        if (this.f27125c != null) {
            b += nyu.b(3, this.f27125c);
        }
        if (this.f27126d != null) {
            b += nyu.b(4, this.f27126d);
        }
        if (this.f27127e != null) {
            b += nyu.b(5, this.f27127e);
        }
        if (this.f27128f != null) {
            b += nyu.b(6, this.f27128f);
        }
        if (this.f27129g != null) {
            b += nyu.b(7, this.f27129g);
        }
        if (this.f27130h != null) {
            b += nyu.d(8, this.f27130h);
        }
        if (this.f27131i != null) {
            return b + nyu.d(9, this.f27131i);
        }
        return b;
    }

    private man m31449b(nyt nyt) {
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
                            this.f27123a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27124b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f27125c = nyt.j();
                    continue;
                case 34:
                    this.f27126d = nyt.j();
                    continue;
                case 42:
                    this.f27127e = nyt.j();
                    continue;
                case 50:
                    this.f27128f = nyt.j();
                    continue;
                case 58:
                    this.f27129g = nyt.j();
                    continue;
                case 66:
                    if (this.f27130h == null) {
                        this.f27130h = new mao();
                    }
                    nyt.a(this.f27130h);
                    continue;
                case 74:
                    if (this.f27131i == null) {
                        this.f27131i = new mat();
                    }
                    nyt.a(this.f27131i);
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
