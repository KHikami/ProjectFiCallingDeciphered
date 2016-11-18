package p000;

public final class llp extends nyx<llp> {
    public Integer f25391a;
    public Integer f25392b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29381b(nyt);
    }

    public llp() {
        this.f25391a = null;
        this.f25392b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25391a.intValue());
        nyu.a(2, this.f25392b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f25391a.intValue())) + nyu.f(2, this.f25392b.intValue());
    }

    private llp m29381b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25391a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25392b = Integer.valueOf(nyt.f());
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
