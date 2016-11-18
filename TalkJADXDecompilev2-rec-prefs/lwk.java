package p000;

public final class lwk extends nyx<lwk> {
    private static volatile lwk[] f26684h;
    public String f26685a;
    public Long f26686b;
    public Integer f26687c;
    public ofm f26688d;
    public lqb f26689e;
    public String f26690f;
    public String f26691g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30872b(nyt);
    }

    public static lwk[] m30873d() {
        if (f26684h == null) {
            synchronized (nzc.c) {
                if (f26684h == null) {
                    f26684h = new lwk[0];
                }
            }
        }
        return f26684h;
    }

    public lwk() {
        m30874g();
    }

    private lwk m30874g() {
        this.f26685a = null;
        this.f26686b = null;
        this.f26688d = null;
        this.f26689e = null;
        this.f26690f = null;
        this.f26691g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26685a != null) {
            nyu.a(1, this.f26685a);
        }
        if (this.f26686b != null) {
            nyu.a(2, this.f26686b.longValue());
        }
        if (this.f26687c != null) {
            nyu.a(3, this.f26687c.intValue());
        }
        if (this.f26688d != null) {
            nyu.b(6, this.f26688d);
        }
        if (this.f26689e != null) {
            nyu.b(7, this.f26689e);
        }
        if (this.f26690f != null) {
            nyu.a(8, this.f26690f);
        }
        if (this.f26691g != null) {
            nyu.a(9, this.f26691g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26685a != null) {
            b += nyu.b(1, this.f26685a);
        }
        if (this.f26686b != null) {
            b += nyu.e(2, this.f26686b.longValue());
        }
        if (this.f26687c != null) {
            b += nyu.f(3, this.f26687c.intValue());
        }
        if (this.f26688d != null) {
            b += nyu.d(6, this.f26688d);
        }
        if (this.f26689e != null) {
            b += nyu.d(7, this.f26689e);
        }
        if (this.f26690f != null) {
            b += nyu.b(8, this.f26690f);
        }
        if (this.f26691g != null) {
            return b + nyu.b(9, this.f26691g);
        }
        return b;
    }

    private lwk m30872b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26685a = nyt.j();
                    continue;
                case 16:
                    this.f26686b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
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
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                            this.f26687c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f26688d == null) {
                        this.f26688d = new ofm();
                    }
                    nyt.a(this.f26688d);
                    continue;
                case 58:
                    if (this.f26689e == null) {
                        this.f26689e = new lqb();
                    }
                    nyt.a(this.f26689e);
                    continue;
                case 66:
                    this.f26690f = nyt.j();
                    continue;
                case 74:
                    this.f26691g = nyt.j();
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
