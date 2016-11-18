package p000;

public final class knq extends nyx<knq> {
    private static volatile knq[] f22436d;
    public String f22437a;
    public String f22438b;
    public Integer f22439c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26701b(nyt);
    }

    public static knq[] m26702d() {
        if (f22436d == null) {
            synchronized (nzc.c) {
                if (f22436d == null) {
                    f22436d = new knq[0];
                }
            }
        }
        return f22436d;
    }

    public knq() {
        m26703g();
    }

    private knq m26703g() {
        this.f22437a = null;
        this.f22438b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22437a != null) {
            nyu.a(1, this.f22437a);
        }
        if (this.f22438b != null) {
            nyu.a(2, this.f22438b);
        }
        if (this.f22439c != null) {
            nyu.a(3, this.f22439c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22437a != null) {
            b += nyu.b(1, this.f22437a);
        }
        if (this.f22438b != null) {
            b += nyu.b(2, this.f22438b);
        }
        if (this.f22439c != null) {
            return b + nyu.f(3, this.f22439c.intValue());
        }
        return b;
    }

    private knq m26701b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22437a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22438b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            this.f22439c = Integer.valueOf(a);
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
