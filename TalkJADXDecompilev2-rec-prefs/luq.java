package p000;

public final class luq extends nyx<luq> {
    public Integer f26515a;
    public String f26516b;
    public String f26517c;
    public Long f26518d;
    public String f26519e;
    public Integer f26520f;
    public Long f26521g;
    public Long f26522h;
    public String f26523i;
    public String f26524j;
    public lwp f26525k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30637b(nyt);
    }

    public luq() {
        m30638d();
    }

    private luq m30638d() {
        this.f26516b = null;
        this.f26517c = null;
        this.f26518d = null;
        this.f26519e = null;
        this.f26520f = null;
        this.f26521g = null;
        this.f26522h = null;
        this.f26523i = null;
        this.f26524j = null;
        this.f26525k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26515a != null) {
            nyu.a(1, this.f26515a.intValue());
        }
        if (this.f26516b != null) {
            nyu.a(2, this.f26516b);
        }
        if (this.f26517c != null) {
            nyu.a(3, this.f26517c);
        }
        if (this.f26518d != null) {
            nyu.a(4, this.f26518d.longValue());
        }
        if (this.f26521g != null) {
            nyu.a(5, this.f26521g.longValue());
        }
        if (this.f26522h != null) {
            nyu.a(6, this.f26522h.longValue());
        }
        if (this.f26523i != null) {
            nyu.a(7, this.f26523i);
        }
        if (this.f26524j != null) {
            nyu.a(8, this.f26524j);
        }
        if (this.f26525k != null) {
            nyu.b(9, this.f26525k);
        }
        if (this.f26519e != null) {
            nyu.a(10, this.f26519e);
        }
        if (this.f26520f != null) {
            nyu.a(11, this.f26520f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26515a != null) {
            b += nyu.f(1, this.f26515a.intValue());
        }
        if (this.f26516b != null) {
            b += nyu.b(2, this.f26516b);
        }
        if (this.f26517c != null) {
            b += nyu.b(3, this.f26517c);
        }
        if (this.f26518d != null) {
            b += nyu.e(4, this.f26518d.longValue());
        }
        if (this.f26521g != null) {
            b += nyu.e(5, this.f26521g.longValue());
        }
        if (this.f26522h != null) {
            b += nyu.e(6, this.f26522h.longValue());
        }
        if (this.f26523i != null) {
            b += nyu.b(7, this.f26523i);
        }
        if (this.f26524j != null) {
            b += nyu.b(8, this.f26524j);
        }
        if (this.f26525k != null) {
            b += nyu.d(9, this.f26525k);
        }
        if (this.f26519e != null) {
            b += nyu.b(10, this.f26519e);
        }
        if (this.f26520f != null) {
            return b + nyu.f(11, this.f26520f.intValue());
        }
        return b;
    }

    private luq m30637b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
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
                            this.f26515a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26516b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26517c = nyt.j();
                    continue;
                case 32:
                    this.f26518d = Long.valueOf(nyt.d());
                    continue;
                case 40:
                    this.f26521g = Long.valueOf(nyt.d());
                    continue;
                case 48:
                    this.f26522h = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    this.f26523i = nyt.j();
                    continue;
                case 66:
                    this.f26524j = nyt.j();
                    continue;
                case 74:
                    if (this.f26525k == null) {
                        this.f26525k = new lwp();
                    }
                    nyt.a(this.f26525k);
                    continue;
                case 82:
                    this.f26519e = nyt.j();
                    continue;
                case 88:
                    this.f26520f = Integer.valueOf(nyt.f());
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
