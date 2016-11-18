package p000;

public final class kig extends nyx<kig> {
    public Integer f21841a;
    public String f21842b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25955b(nyt);
    }

    public kig() {
        m25956d();
    }

    private kig m25956d() {
        this.f21842b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21842b != null) {
            nyu.a(1, this.f21842b);
        }
        if (this.f21841a != null) {
            nyu.a(2, this.f21841a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21842b != null) {
            b += nyu.b(1, this.f21842b);
        }
        if (this.f21841a != null) {
            return b + nyu.f(2, this.f21841a.intValue());
        }
        return b;
    }

    private kig m25955b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21842b = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21841a = Integer.valueOf(a);
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
