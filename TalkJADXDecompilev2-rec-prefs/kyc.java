package p000;

public final class kyc extends nyx<kyc> {
    public Integer f24000a;
    public String f24001b;
    public String f24002c;
    public String f24003d;
    public String f24004e;
    public String f24005f;
    public String f24006g;
    public String f24007h;
    public String f24008i;
    public String f24009j;
    public String f24010k;
    public String f24011l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28033b(nyt);
    }

    public kyc() {
        m28034d();
    }

    private kyc m28034d() {
        this.f24001b = null;
        this.f24002c = null;
        this.f24003d = null;
        this.f24004e = null;
        this.f24005f = null;
        this.f24006g = null;
        this.f24007h = null;
        this.f24008i = null;
        this.f24009j = null;
        this.f24010k = null;
        this.f24011l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24000a.intValue());
        if (this.f24001b != null) {
            nyu.a(2, this.f24001b);
        }
        if (this.f24002c != null) {
            nyu.a(3, this.f24002c);
        }
        if (this.f24003d != null) {
            nyu.a(4, this.f24003d);
        }
        if (this.f24004e != null) {
            nyu.a(5, this.f24004e);
        }
        if (this.f24005f != null) {
            nyu.a(6, this.f24005f);
        }
        if (this.f24006g != null) {
            nyu.a(7, this.f24006g);
        }
        if (this.f24007h != null) {
            nyu.a(8, this.f24007h);
        }
        if (this.f24008i != null) {
            nyu.a(9, this.f24008i);
        }
        if (this.f24009j != null) {
            nyu.a(10, this.f24009j);
        }
        if (this.f24010k != null) {
            nyu.a(11, this.f24010k);
        }
        if (this.f24011l != null) {
            nyu.a(12, this.f24011l);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.f(1, this.f24000a.intValue());
        if (this.f24001b != null) {
            b += nyu.b(2, this.f24001b);
        }
        if (this.f24002c != null) {
            b += nyu.b(3, this.f24002c);
        }
        if (this.f24003d != null) {
            b += nyu.b(4, this.f24003d);
        }
        if (this.f24004e != null) {
            b += nyu.b(5, this.f24004e);
        }
        if (this.f24005f != null) {
            b += nyu.b(6, this.f24005f);
        }
        if (this.f24006g != null) {
            b += nyu.b(7, this.f24006g);
        }
        if (this.f24007h != null) {
            b += nyu.b(8, this.f24007h);
        }
        if (this.f24008i != null) {
            b += nyu.b(9, this.f24008i);
        }
        if (this.f24009j != null) {
            b += nyu.b(10, this.f24009j);
        }
        if (this.f24010k != null) {
            b += nyu.b(11, this.f24010k);
        }
        if (this.f24011l != null) {
            return b + nyu.b(12, this.f24011l);
        }
        return b;
    }

    private kyc m28033b(nyt nyt) {
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
                            this.f24000a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24001b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24002c = nyt.j();
                    continue;
                case 34:
                    this.f24003d = nyt.j();
                    continue;
                case 42:
                    this.f24004e = nyt.j();
                    continue;
                case 50:
                    this.f24005f = nyt.j();
                    continue;
                case 58:
                    this.f24006g = nyt.j();
                    continue;
                case 66:
                    this.f24007h = nyt.j();
                    continue;
                case 74:
                    this.f24008i = nyt.j();
                    continue;
                case 82:
                    this.f24009j = nyt.j();
                    continue;
                case 90:
                    this.f24010k = nyt.j();
                    continue;
                case 98:
                    this.f24011l = nyt.j();
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
