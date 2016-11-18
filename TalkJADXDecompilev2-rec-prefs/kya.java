package p000;

public final class kya extends nyx<kya> {
    public Integer f23989a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28023b(nyt);
    }

    public kya() {
        m28024d();
    }

    private kya m28024d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23989a != null) {
            nyu.a(1, this.f23989a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23989a != null) {
            return b + nyu.f(1, this.f23989a.intValue());
        }
        return b;
    }

    private kya m28023b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23989a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
