package p000;

public final class kjq extends nyx<kjq> {
    private static volatile kjq[] f21966c;
    public klk f21967a;
    public String f21968b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26131b(nyt);
    }

    public static kjq[] m26132d() {
        if (f21966c == null) {
            synchronized (nzc.c) {
                if (f21966c == null) {
                    f21966c = new kjq[0];
                }
            }
        }
        return f21966c;
    }

    public kjq() {
        m26133g();
    }

    private kjq m26133g() {
        this.f21967a = null;
        this.f21968b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21967a != null) {
            nyu.b(1, this.f21967a);
        }
        if (this.f21968b != null) {
            nyu.a(2, this.f21968b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21967a != null) {
            b += nyu.d(1, this.f21967a);
        }
        if (this.f21968b != null) {
            return b + nyu.b(2, this.f21968b);
        }
        return b;
    }

    private kjq m26131b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21967a == null) {
                        this.f21967a = new klk();
                    }
                    nyt.a(this.f21967a);
                    continue;
                case wi.dH /*18*/:
                    this.f21968b = nyt.j();
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
