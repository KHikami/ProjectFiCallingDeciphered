package p000;

public final class kwq extends nyx<kwq> {
    public Integer f23786a;
    public Integer f23787b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27832b(nyt);
    }

    public kwq() {
        m27833d();
    }

    private kwq m27833d() {
        this.f23786a = null;
        this.f23787b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23786a.intValue());
        nyu.a(2, this.f23787b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f23786a.intValue())) + nyu.f(2, this.f23787b.intValue());
    }

    private kwq m27832b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23786a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f23787b = Integer.valueOf(nyt.f());
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
