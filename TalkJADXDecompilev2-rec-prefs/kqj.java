package p000;

public final class kqj extends nyx<kqj> {
    public Integer f22764a;
    public Boolean f22765b;
    public kpc f22766c;
    public Integer f22767d;
    public kqa f22768e;
    public kva f22769f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27054b(nyt);
    }

    public kqj() {
        m27055d();
    }

    private kqj m27055d() {
        this.f22765b = null;
        this.f22766c = null;
        this.f22768e = null;
        this.f22769f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22764a != null) {
            nyu.a(1, this.f22764a.intValue());
        }
        if (this.f22765b != null) {
            nyu.a(2, this.f22765b.booleanValue());
        }
        if (this.f22766c != null) {
            nyu.b(3, this.f22766c);
        }
        if (this.f22767d != null) {
            nyu.a(4, this.f22767d.intValue());
        }
        if (this.f22768e != null) {
            nyu.b(5, this.f22768e);
        }
        if (this.f22769f != null) {
            nyu.b(6, this.f22769f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22764a != null) {
            b += nyu.f(1, this.f22764a.intValue());
        }
        if (this.f22765b != null) {
            this.f22765b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22766c != null) {
            b += nyu.d(3, this.f22766c);
        }
        if (this.f22767d != null) {
            b += nyu.f(4, this.f22767d.intValue());
        }
        if (this.f22768e != null) {
            b += nyu.d(5, this.f22768e);
        }
        if (this.f22769f != null) {
            return b + nyu.d(6, this.f22769f);
        }
        return b;
    }

    private kqj m27054b(nyt nyt) {
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
                            this.f22764a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f22765b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f22766c == null) {
                        this.f22766c = new kpc();
                    }
                    nyt.a(this.f22766c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f22767d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f22768e == null) {
                        this.f22768e = new kqa();
                    }
                    nyt.a(this.f22768e);
                    continue;
                case 50:
                    if (this.f22769f == null) {
                        this.f22769f = new kva();
                    }
                    nyt.a(this.f22769f);
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
