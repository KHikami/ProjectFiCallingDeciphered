package p000;

public final class noh extends nyx<noh> {
    public String f30354a;
    public niq f30355b;
    public Integer f30356c;
    public noj f30357d;
    public String f30358e;
    public noi f30359f;
    public oyl f30360g;

    public /* synthetic */ nzf m35894a(nyt nyt) {
        return m35892b(nyt);
    }

    public noh() {
        m35893d();
    }

    private noh m35893d() {
        this.f30354a = null;
        this.f30355b = null;
        this.f30357d = null;
        this.f30358e = null;
        this.f30359f = null;
        this.f30360g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35895a(nyu nyu) {
        if (this.f30354a != null) {
            nyu.m37170a(1, this.f30354a);
        }
        if (this.f30355b != null) {
            nyu.m37182b(2, this.f30355b);
        }
        if (this.f30356c != null) {
            nyu.m37168a(3, this.f30356c.intValue());
        }
        if (this.f30357d != null) {
            nyu.m37182b(4, this.f30357d);
        }
        if (this.f30358e != null) {
            nyu.m37170a(5, this.f30358e);
        }
        if (this.f30359f != null) {
            nyu.m37182b(6, this.f30359f);
        }
        if (this.f30360g != null) {
            nyu.m37182b(7, this.f30360g);
        }
        super.a(nyu);
    }

    protected int m35896b() {
        int b = super.b();
        if (this.f30354a != null) {
            b += nyu.m37137b(1, this.f30354a);
        }
        if (this.f30355b != null) {
            b += nyu.m37145d(2, this.f30355b);
        }
        if (this.f30356c != null) {
            b += nyu.m37147f(3, this.f30356c.intValue());
        }
        if (this.f30357d != null) {
            b += nyu.m37145d(4, this.f30357d);
        }
        if (this.f30358e != null) {
            b += nyu.m37137b(5, this.f30358e);
        }
        if (this.f30359f != null) {
            b += nyu.m37145d(6, this.f30359f);
        }
        if (this.f30360g != null) {
            return b + nyu.m37145d(7, this.f30360g);
        }
        return b;
    }

    private noh m35892b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30354a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30355b == null) {
                        this.f30355b = new niq();
                    }
                    nyt.m37101a(this.f30355b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f30356c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f30357d == null) {
                        this.f30357d = new noj();
                    }
                    nyt.m37101a(this.f30357d);
                    continue;
                case 42:
                    this.f30358e = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f30359f == null) {
                        this.f30359f = new noi();
                    }
                    nyt.m37101a(this.f30359f);
                    continue;
                case 58:
                    if (this.f30360g == null) {
                        this.f30360g = new oyl();
                    }
                    nyt.m37101a(this.f30360g);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
