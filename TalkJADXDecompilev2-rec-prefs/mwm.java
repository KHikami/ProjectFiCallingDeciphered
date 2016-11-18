package p000;

public final class mwm extends nyx<mwm> {
    private static volatile mwm[] f28600d;
    public Long f28601a;
    public Long f28602b;
    public Boolean f28603c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33222b(nyt);
    }

    public static mwm[] m33223d() {
        if (f28600d == null) {
            synchronized (nzc.c) {
                if (f28600d == null) {
                    f28600d = new mwm[0];
                }
            }
        }
        return f28600d;
    }

    public mwm() {
        this.f28601a = null;
        this.f28602b = null;
        this.f28603c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28601a != null) {
            nyu.b(1, this.f28601a.longValue());
        }
        if (this.f28602b != null) {
            nyu.b(2, this.f28602b.longValue());
        }
        if (this.f28603c != null) {
            nyu.a(3, this.f28603c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28601a != null) {
            b += nyu.f(1, this.f28601a.longValue());
        }
        if (this.f28602b != null) {
            b += nyu.f(2, this.f28602b.longValue());
        }
        if (this.f28603c == null) {
            return b;
        }
        this.f28603c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private mwm m33222b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28601a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f28602b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f28603c = Boolean.valueOf(nyt.i());
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
