package p000;

public final class mdp extends nyx<mdp> {
    private static volatile mdp[] f27490d;
    public String f27491a;
    public Integer f27492b;
    public Integer f27493c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31878b(nyt);
    }

    public static mdp[] m31879d() {
        if (f27490d == null) {
            synchronized (nzc.c) {
                if (f27490d == null) {
                    f27490d = new mdp[0];
                }
            }
        }
        return f27490d;
    }

    public mdp() {
        m31880g();
    }

    private mdp m31880g() {
        this.f27491a = null;
        this.f27492b = null;
        this.f27493c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27491a != null) {
            nyu.a(1, this.f27491a);
        }
        if (this.f27492b != null) {
            nyu.a(2, this.f27492b.intValue());
        }
        if (this.f27493c != null) {
            nyu.a(3, this.f27493c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27491a != null) {
            b += nyu.b(1, this.f27491a);
        }
        if (this.f27492b != null) {
            b += nyu.f(2, this.f27492b.intValue());
        }
        if (this.f27493c != null) {
            return b + nyu.f(3, this.f27493c.intValue());
        }
        return b;
    }

    private mdp m31878b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27491a = nyt.j();
                    continue;
                case 16:
                    this.f27492b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27493c = Integer.valueOf(nyt.f());
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
