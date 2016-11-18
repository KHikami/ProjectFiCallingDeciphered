package p000;

public final class oxx extends nyx<oxx> {
    public Integer f34560a;
    public Integer f34561b;
    public Integer f34562c;
    public Integer f34563d;

    public /* synthetic */ nzf m39849a(nyt nyt) {
        return m39847b(nyt);
    }

    public oxx() {
        m39848d();
    }

    private oxx m39848d() {
        this.f34560a = null;
        this.f34561b = null;
        this.f34562c = null;
        this.f34563d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39850a(nyu nyu) {
        if (this.f34560a != null) {
            nyu.m37168a(1, this.f34560a.intValue());
        }
        if (this.f34561b != null) {
            nyu.m37168a(2, this.f34561b.intValue());
        }
        if (this.f34562c != null) {
            nyu.m37168a(3, this.f34562c.intValue());
        }
        if (this.f34563d != null) {
            nyu.m37168a(4, this.f34563d.intValue());
        }
        super.a(nyu);
    }

    protected int m39851b() {
        int b = super.b();
        if (this.f34560a != null) {
            b += nyu.m37147f(1, this.f34560a.intValue());
        }
        if (this.f34561b != null) {
            b += nyu.m37147f(2, this.f34561b.intValue());
        }
        if (this.f34562c != null) {
            b += nyu.m37147f(3, this.f34562c.intValue());
        }
        if (this.f34563d != null) {
            return b + nyu.m37147f(4, this.f34563d.intValue());
        }
        return b;
    }

    private oxx m39847b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34560a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34561b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34562c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34563d = Integer.valueOf(nyt.m37112f());
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
