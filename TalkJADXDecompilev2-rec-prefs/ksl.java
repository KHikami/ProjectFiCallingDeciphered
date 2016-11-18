package p000;

public final class ksl extends nyx<ksl> {
    private static volatile ksl[] f23063e;
    public String f23064a;
    public Integer f23065b;
    public Integer f23066c;
    public Integer f23067d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27324b(nyt);
    }

    public static ksl[] m27325d() {
        if (f23063e == null) {
            synchronized (nzc.c) {
                if (f23063e == null) {
                    f23063e = new ksl[0];
                }
            }
        }
        return f23063e;
    }

    public ksl() {
        m27326g();
    }

    private ksl m27326g() {
        this.f23064a = null;
        this.f23065b = null;
        this.f23066c = null;
        this.f23067d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23064a);
        if (this.f23065b != null) {
            nyu.a(2, this.f23065b.intValue());
        }
        if (this.f23066c != null) {
            nyu.a(3, this.f23066c.intValue());
        }
        if (this.f23067d != null) {
            nyu.a(4, this.f23067d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23064a);
        if (this.f23065b != null) {
            b += nyu.f(2, this.f23065b.intValue());
        }
        if (this.f23066c != null) {
            b += nyu.f(3, this.f23066c.intValue());
        }
        if (this.f23067d != null) {
            return b + nyu.f(4, this.f23067d.intValue());
        }
        return b;
    }

    private ksl m27324b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23064a = nyt.j();
                    continue;
                case 16:
                    this.f23065b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f23066c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f23067d = Integer.valueOf(nyt.f());
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
