package p000;

public final class kww extends nyx<kww> {
    public String f23805a;
    public int f23806b;
    public int f23807c;
    public kvi f23808d;
    public kwb f23809e;
    public kxl f23810f;
    public kvx f23811g;
    public int f23812h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27863b(nyt);
    }

    public kww() {
        this.f23805a = null;
        this.f23806b = nzf.UNSET_ENUM_VALUE;
        this.f23807c = nzf.UNSET_ENUM_VALUE;
        this.f23812h = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23805a != null) {
            nyu.a(1, this.f23805a);
        }
        if (this.f23806b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23806b);
        }
        if (this.f23807c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f23807c);
        }
        if (this.f23808d != null) {
            nyu.b(4, this.f23808d);
        }
        if (this.f23809e != null) {
            nyu.b(5, this.f23809e);
        }
        if (this.f23810f != null) {
            nyu.b(6, this.f23810f);
        }
        if (this.f23811g != null) {
            nyu.b(7, this.f23811g);
        }
        if (this.f23812h != nzf.UNSET_ENUM_VALUE) {
            nyu.a(8, this.f23812h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23805a != null) {
            b += nyu.b(1, this.f23805a);
        }
        if (this.f23806b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f23806b);
        }
        if (this.f23807c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f23807c);
        }
        if (this.f23808d != null) {
            b += nyu.d(4, this.f23808d);
        }
        if (this.f23809e != null) {
            b += nyu.d(5, this.f23809e);
        }
        if (this.f23810f != null) {
            b += nyu.d(6, this.f23810f);
        }
        if (this.f23811g != null) {
            b += nyu.d(7, this.f23811g);
        }
        if (this.f23812h != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(8, this.f23812h);
        }
        return b;
    }

    private kww m27863b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23805a = nyt.j();
                    continue;
                case 16:
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
                            this.f23806b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23807c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23808d == null) {
                        this.f23808d = new kvi();
                    }
                    nyt.a(this.f23808d);
                    continue;
                case 42:
                    if (this.f23809e == null) {
                        this.f23809e = new kwb();
                    }
                    nyt.a(this.f23809e);
                    continue;
                case 50:
                    if (this.f23810f == null) {
                        this.f23810f = new kxl();
                    }
                    nyt.a(this.f23810f);
                    continue;
                case 58:
                    if (this.f23811g == null) {
                        this.f23811g = new kvx();
                    }
                    nyt.a(this.f23811g);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f23812h = a;
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
