package p000;

public final class lzv extends nyx<lzv> {
    private static volatile lzv[] f27051j;
    public Integer f27052a;
    public Integer f27053b;
    public String f27054c;
    public Integer f27055d;
    public Integer f27056e;
    public Integer f27057f;
    public String f27058g;
    public Integer f27059h;
    public Integer f27060i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31344b(nyt);
    }

    public static lzv[] m31345d() {
        if (f27051j == null) {
            synchronized (nzc.c) {
                if (f27051j == null) {
                    f27051j = new lzv[0];
                }
            }
        }
        return f27051j;
    }

    public lzv() {
        m31346g();
    }

    private lzv m31346g() {
        this.f27054c = null;
        this.f27055d = null;
        this.f27057f = null;
        this.f27058g = null;
        this.f27059h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27052a != null) {
            nyu.a(1, this.f27052a.intValue());
        }
        if (this.f27053b != null) {
            nyu.a(2, this.f27053b.intValue());
        }
        if (this.f27054c != null) {
            nyu.a(3, this.f27054c);
        }
        if (this.f27055d != null) {
            nyu.a(4, this.f27055d.intValue());
        }
        if (this.f27056e != null) {
            nyu.a(5, this.f27056e.intValue());
        }
        if (this.f27057f != null) {
            nyu.a(6, this.f27057f.intValue());
        }
        if (this.f27058g != null) {
            nyu.a(7, this.f27058g);
        }
        if (this.f27059h != null) {
            nyu.a(8, this.f27059h.intValue());
        }
        if (this.f27060i != null) {
            nyu.a(9, this.f27060i.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27052a != null) {
            b += nyu.f(1, this.f27052a.intValue());
        }
        if (this.f27053b != null) {
            b += nyu.f(2, this.f27053b.intValue());
        }
        if (this.f27054c != null) {
            b += nyu.b(3, this.f27054c);
        }
        if (this.f27055d != null) {
            b += nyu.f(4, this.f27055d.intValue());
        }
        if (this.f27056e != null) {
            b += nyu.f(5, this.f27056e.intValue());
        }
        if (this.f27057f != null) {
            b += nyu.f(6, this.f27057f.intValue());
        }
        if (this.f27058g != null) {
            b += nyu.b(7, this.f27058g);
        }
        if (this.f27059h != null) {
            b += nyu.f(8, this.f27059h.intValue());
        }
        if (this.f27060i != null) {
            return b + nyu.f(9, this.f27060i.intValue());
        }
        return b;
    }

    private lzv m31344b(nyt nyt) {
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
                            this.f27052a = Integer.valueOf(a);
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
                            this.f27053b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f27054c = nyt.j();
                    continue;
                case 32:
                    this.f27055d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27056e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.f27057f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.f27058g = nyt.j();
                    continue;
                case 64:
                    this.f27059h = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27060i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
