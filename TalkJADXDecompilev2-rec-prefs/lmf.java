package p000;

public final class lmf extends nyx<lmf> {
    private static volatile lmf[] f25526d;
    public Integer f25527a;
    public Integer f25528b;
    public Integer f25529c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29466b(nyt);
    }

    public static lmf[] m29467d() {
        if (f25526d == null) {
            synchronized (nzc.c) {
                if (f25526d == null) {
                    f25526d = new lmf[0];
                }
            }
        }
        return f25526d;
    }

    public lmf() {
        m29468g();
    }

    private lmf m29468g() {
        this.f25527a = null;
        this.f25528b = null;
        this.f25529c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25527a.intValue());
        nyu.a(2, this.f25528b.intValue());
        nyu.a(3, this.f25529c.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return ((super.mo147b() + nyu.f(1, this.f25527a.intValue())) + nyu.f(2, this.f25528b.intValue())) + nyu.f(3, this.f25529c.intValue());
    }

    private lmf m29466b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25527a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25528b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25529c = Integer.valueOf(nyt.f());
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
