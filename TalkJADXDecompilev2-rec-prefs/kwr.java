package p000;

public final class kwr extends nyx<kwr> {
    public String f23788a;
    public Integer f23789b;
    public Integer f23790c;
    public kwn f23791d;
    public kwp f23792e;
    public kwu f23793f;
    public kwo f23794g;
    public Integer f23795h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27837b(nyt);
    }

    public kwr() {
        m27838d();
    }

    private kwr m27838d() {
        this.f23788a = null;
        this.f23791d = null;
        this.f23792e = null;
        this.f23793f = null;
        this.f23794g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23788a != null) {
            nyu.a(1, this.f23788a);
        }
        if (this.f23789b != null) {
            nyu.a(2, this.f23789b.intValue());
        }
        if (this.f23790c != null) {
            nyu.a(3, this.f23790c.intValue());
        }
        if (this.f23791d != null) {
            nyu.b(4, this.f23791d);
        }
        if (this.f23792e != null) {
            nyu.b(5, this.f23792e);
        }
        if (this.f23793f != null) {
            nyu.b(6, this.f23793f);
        }
        if (this.f23794g != null) {
            nyu.b(7, this.f23794g);
        }
        if (this.f23795h != null) {
            nyu.a(8, this.f23795h.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23788a != null) {
            b += nyu.b(1, this.f23788a);
        }
        if (this.f23789b != null) {
            b += nyu.f(2, this.f23789b.intValue());
        }
        if (this.f23790c != null) {
            b += nyu.f(3, this.f23790c.intValue());
        }
        if (this.f23791d != null) {
            b += nyu.d(4, this.f23791d);
        }
        if (this.f23792e != null) {
            b += nyu.d(5, this.f23792e);
        }
        if (this.f23793f != null) {
            b += nyu.d(6, this.f23793f);
        }
        if (this.f23794g != null) {
            b += nyu.d(7, this.f23794g);
        }
        if (this.f23795h != null) {
            return b + nyu.f(8, this.f23795h.intValue());
        }
        return b;
    }

    private kwr m27837b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23788a = nyt.j();
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
                            this.f23789b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23790c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23791d == null) {
                        this.f23791d = new kwn();
                    }
                    nyt.a(this.f23791d);
                    continue;
                case 42:
                    if (this.f23792e == null) {
                        this.f23792e = new kwp();
                    }
                    nyt.a(this.f23792e);
                    continue;
                case 50:
                    if (this.f23793f == null) {
                        this.f23793f = new kwu();
                    }
                    nyt.a(this.f23793f);
                    continue;
                case 58:
                    if (this.f23794g == null) {
                        this.f23794g = new kwo();
                    }
                    nyt.a(this.f23794g);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f23795h = Integer.valueOf(a);
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
