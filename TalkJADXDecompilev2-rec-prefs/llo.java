package p000;

public final class llo extends nyx<llo> {
    public Integer f25389a;
    public Integer f25390b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29377b(nyt);
    }

    public llo() {
        this.f25389a = null;
        this.f25390b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25389a.intValue());
        nyu.a(2, this.f25390b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.f(1, this.f25389a.intValue())) + nyu.f(2, this.f25390b.intValue());
    }

    private llo m29377b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25389a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25390b = Integer.valueOf(nyt.f());
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
