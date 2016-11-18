package p000;

public final class kqv extends nyx<kqv> {
    public String f22813a;
    public Integer f22814b;
    public kpe f22815c;
    public kpf f22816d;
    public krf f22817e;
    public kqj f22818f;
    public String f22819g;
    public kqu f22820h;
    public String f22821i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27116b(nyt);
    }

    public kqv() {
        m27117d();
    }

    private kqv m27117d() {
        this.f22813a = null;
        this.f22815c = null;
        this.f22816d = null;
        this.f22817e = null;
        this.f22818f = null;
        this.f22819g = null;
        this.f22820h = null;
        this.f22821i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22813a != null) {
            nyu.a(1, this.f22813a);
        }
        if (this.f22814b != null) {
            nyu.a(2, this.f22814b.intValue());
        }
        if (this.f22815c != null) {
            nyu.b(3, this.f22815c);
        }
        if (this.f22816d != null) {
            nyu.b(4, this.f22816d);
        }
        if (this.f22817e != null) {
            nyu.b(5, this.f22817e);
        }
        if (this.f22818f != null) {
            nyu.b(6, this.f22818f);
        }
        if (this.f22819g != null) {
            nyu.a(7, this.f22819g);
        }
        if (this.f22820h != null) {
            nyu.b(8, this.f22820h);
        }
        if (this.f22821i != null) {
            nyu.a(9, this.f22821i);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22813a != null) {
            b += nyu.b(1, this.f22813a);
        }
        if (this.f22814b != null) {
            b += nyu.f(2, this.f22814b.intValue());
        }
        if (this.f22815c != null) {
            b += nyu.d(3, this.f22815c);
        }
        if (this.f22816d != null) {
            b += nyu.d(4, this.f22816d);
        }
        if (this.f22817e != null) {
            b += nyu.d(5, this.f22817e);
        }
        if (this.f22818f != null) {
            b += nyu.d(6, this.f22818f);
        }
        if (this.f22819g != null) {
            b += nyu.b(7, this.f22819g);
        }
        if (this.f22820h != null) {
            b += nyu.d(8, this.f22820h);
        }
        if (this.f22821i != null) {
            return b + nyu.b(9, this.f22821i);
        }
        return b;
    }

    private kqv m27116b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22813a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22814b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f22815c == null) {
                        this.f22815c = new kpe();
                    }
                    nyt.a(this.f22815c);
                    continue;
                case 34:
                    if (this.f22816d == null) {
                        this.f22816d = new kpf();
                    }
                    nyt.a(this.f22816d);
                    continue;
                case 42:
                    if (this.f22817e == null) {
                        this.f22817e = new krf();
                    }
                    nyt.a(this.f22817e);
                    continue;
                case 50:
                    if (this.f22818f == null) {
                        this.f22818f = new kqj();
                    }
                    nyt.a(this.f22818f);
                    continue;
                case 58:
                    this.f22819g = nyt.j();
                    continue;
                case 66:
                    if (this.f22820h == null) {
                        this.f22820h = new kqu();
                    }
                    nyt.a(this.f22820h);
                    continue;
                case 74:
                    this.f22821i = nyt.j();
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
