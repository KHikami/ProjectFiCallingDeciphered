package p000;

public final class nuu extends nyx<nuu> {
    public Integer f31028a;
    public Integer f31029b;
    public Integer f31030c;
    public Integer f31031d;

    public /* synthetic */ nzf m36648a(nyt nyt) {
        return m36647b(nyt);
    }

    public nuu() {
        this.f31028a = null;
        this.f31029b = null;
        this.f31030c = null;
        this.f31031d = null;
        this.cachedSize = -1;
    }

    public void m36649a(nyu nyu) {
        nyu.m37168a(1, this.f31028a.intValue());
        nyu.m37168a(2, this.f31029b.intValue());
        nyu.m37168a(3, this.f31030c.intValue());
        nyu.m37168a(4, this.f31031d.intValue());
        super.a(nyu);
    }

    protected int m36650b() {
        return (((super.b() + nyu.m37147f(1, this.f31028a.intValue())) + nyu.m37147f(2, this.f31029b.intValue())) + nyu.m37147f(3, this.f31030c.intValue())) + nyu.m37147f(4, this.f31031d.intValue());
    }

    private nuu m36647b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31028a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31029b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f31030c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f31031d = Integer.valueOf(nyt.m37112f());
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
