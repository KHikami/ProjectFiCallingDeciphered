package p000;

public final class llt extends nyx<llt> {
    public Integer f25404a;
    public Integer f25405b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29400b(nyt);
    }

    public llt() {
        m29401d();
    }

    private llt m29401d() {
        this.f25404a = null;
        this.f25405b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25404a.intValue());
        nyu.a(2, this.f25405b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f25404a.intValue())) + nyu.f(2, this.f25405b.intValue());
    }

    private llt m29400b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25404a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25405b = Integer.valueOf(nyt.f());
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
