package p000;

public final class oxz extends nyx<oxz> {
    public Integer f34565a;
    public Integer f34566b;
    public Integer f34567c;
    public Integer f34568d;

    public /* synthetic */ nzf m39857a(nyt nyt) {
        return m39856b(nyt);
    }

    public oxz() {
        this.f34565a = null;
        this.f34566b = null;
        this.f34567c = null;
        this.f34568d = null;
        this.cachedSize = -1;
    }

    public void m39858a(nyu nyu) {
        if (this.f34565a != null) {
            nyu.m37168a(1, this.f34565a.intValue());
        }
        if (this.f34566b != null) {
            nyu.m37168a(2, this.f34566b.intValue());
        }
        if (this.f34567c != null) {
            nyu.m37168a(3, this.f34567c.intValue());
        }
        if (this.f34568d != null) {
            nyu.m37168a(4, this.f34568d.intValue());
        }
        super.a(nyu);
    }

    protected int m39859b() {
        int b = super.b();
        if (this.f34565a != null) {
            b += nyu.m37147f(1, this.f34565a.intValue());
        }
        if (this.f34566b != null) {
            b += nyu.m37147f(2, this.f34566b.intValue());
        }
        if (this.f34567c != null) {
            b += nyu.m37147f(3, this.f34567c.intValue());
        }
        if (this.f34568d != null) {
            return b + nyu.m37147f(4, this.f34568d.intValue());
        }
        return b;
    }

    private oxz m39856b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34565a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34566b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34567c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34568d = Integer.valueOf(nyt.m37112f());
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
