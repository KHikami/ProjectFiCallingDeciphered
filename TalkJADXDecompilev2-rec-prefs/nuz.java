package p000;

public final class nuz extends nyx<nuz> {
    public Integer f31089a;
    public Integer f31090b;
    public Integer f31091c;
    public Integer f31092d;

    public /* synthetic */ nzf m36673a(nyt nyt) {
        return m36671b(nyt);
    }

    public nuz() {
        m36672d();
    }

    private nuz m36672d() {
        this.f31089a = null;
        this.f31090b = null;
        this.f31091c = null;
        this.f31092d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36674a(nyu nyu) {
        nyu.m37168a(1, this.f31089a.intValue());
        nyu.m37168a(2, this.f31090b.intValue());
        nyu.m37168a(3, this.f31091c.intValue());
        nyu.m37168a(4, this.f31092d.intValue());
        super.a(nyu);
    }

    protected int m36675b() {
        return (((super.b() + nyu.m37147f(1, this.f31089a.intValue())) + nyu.m37147f(2, this.f31090b.intValue())) + nyu.m37147f(3, this.f31091c.intValue())) + nyu.m37147f(4, this.f31092d.intValue());
    }

    private nuz m36671b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31089a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31090b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f31091c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f31092d = Integer.valueOf(nyt.m37112f());
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
