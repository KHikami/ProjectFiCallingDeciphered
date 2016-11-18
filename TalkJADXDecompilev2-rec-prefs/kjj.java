package p000;

public final class kjj extends nyx<kjj> {
    private static volatile kjj[] f21928e;
    public klk f21929a;
    public Integer f21930b;
    public String f21931c;
    public mqp f21932d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26091b(nyt);
    }

    public static kjj[] m26092d() {
        if (f21928e == null) {
            synchronized (nzc.c) {
                if (f21928e == null) {
                    f21928e = new kjj[0];
                }
            }
        }
        return f21928e;
    }

    public kjj() {
        m26093g();
    }

    private kjj m26093g() {
        this.f21929a = null;
        this.f21931c = null;
        this.f21932d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21929a != null) {
            nyu.b(1, this.f21929a);
        }
        if (this.f21931c != null) {
            nyu.a(2, this.f21931c);
        }
        if (this.f21930b != null) {
            nyu.a(3, this.f21930b.intValue());
        }
        if (this.f21932d != null) {
            nyu.b(4, this.f21932d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21929a != null) {
            b += nyu.d(1, this.f21929a);
        }
        if (this.f21931c != null) {
            b += nyu.b(2, this.f21931c);
        }
        if (this.f21930b != null) {
            b += nyu.f(3, this.f21930b.intValue());
        }
        if (this.f21932d != null) {
            return b + nyu.d(4, this.f21932d);
        }
        return b;
    }

    private kjj m26091b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21929a == null) {
                        this.f21929a = new klk();
                    }
                    nyt.a(this.f21929a);
                    continue;
                case wi.dH /*18*/:
                    this.f21931c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f21930b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f21932d == null) {
                        this.f21932d = new mqp();
                    }
                    nyt.a(this.f21932d);
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
