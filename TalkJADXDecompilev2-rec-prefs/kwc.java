package p000;

public final class kwc extends nyx<kwc> {
    public Integer f23712a;
    public Integer f23713b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27769b(nyt);
    }

    public kwc() {
        this.f23712a = null;
        this.f23713b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23712a.intValue());
        nyu.a(2, this.f23713b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f23712a.intValue())) + nyu.f(2, this.f23713b.intValue());
    }

    private kwc m27769b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23712a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f23713b = Integer.valueOf(nyt.f());
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
