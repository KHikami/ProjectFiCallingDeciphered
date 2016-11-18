package p000;

public final class ltl extends nyx<ltl> {
    private static volatile ltl[] f26385d;
    public String f26386a;
    public Long f26387b;
    public Integer f26388c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30460b(nyt);
    }

    public static ltl[] m30461d() {
        if (f26385d == null) {
            synchronized (nzc.c) {
                if (f26385d == null) {
                    f26385d = new ltl[0];
                }
            }
        }
        return f26385d;
    }

    public ltl() {
        m30462g();
    }

    private ltl m30462g() {
        this.f26386a = null;
        this.f26387b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26386a != null) {
            nyu.a(1, this.f26386a);
        }
        if (this.f26387b != null) {
            nyu.a(2, this.f26387b.longValue());
        }
        if (this.f26388c != null) {
            nyu.a(3, this.f26388c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26386a != null) {
            b += nyu.b(1, this.f26386a);
        }
        if (this.f26387b != null) {
            b += nyu.e(2, this.f26387b.longValue());
        }
        if (this.f26388c != null) {
            return b + nyu.f(3, this.f26388c.intValue());
        }
        return b;
    }

    private ltl m30460b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26386a = nyt.j();
                    continue;
                case 16:
                    this.f26387b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26388c = Integer.valueOf(a);
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
