package p000;

public final class mcj extends nyx<mcj> {
    private static volatile mcj[] f27326d;
    public Integer f27327a;
    public Integer f27328b;
    public Boolean f27329c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31711b(nyt);
    }

    public static mcj[] m31712d() {
        if (f27326d == null) {
            synchronized (nzc.c) {
                if (f27326d == null) {
                    f27326d = new mcj[0];
                }
            }
        }
        return f27326d;
    }

    public mcj() {
        m31713g();
    }

    private mcj m31713g() {
        this.f27327a = null;
        this.f27328b = null;
        this.f27329c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27327a != null) {
            nyu.a(1, this.f27327a.intValue());
        }
        if (this.f27328b != null) {
            nyu.a(2, this.f27328b.intValue());
        }
        if (this.f27329c != null) {
            nyu.a(3, this.f27329c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27327a != null) {
            b += nyu.f(1, this.f27327a.intValue());
        }
        if (this.f27328b != null) {
            b += nyu.f(2, this.f27328b.intValue());
        }
        if (this.f27329c == null) {
            return b;
        }
        this.f27329c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private mcj m31711b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27327a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27328b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27329c = Boolean.valueOf(nyt.i());
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
