package p000;

public final class let extends nyx<let> {
    public Integer f24867a;
    public Integer f24868b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28925b(nyt);
    }

    public let() {
        m28926d();
    }

    private let m28926d() {
        this.f24867a = null;
        this.f24868b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24867a != null) {
            nyu.a(1, this.f24867a.intValue());
        }
        if (this.f24868b != null) {
            nyu.a(2, this.f24868b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24867a != null) {
            b += nyu.f(1, this.f24867a.intValue());
        }
        if (this.f24868b != null) {
            return b + nyu.f(2, this.f24868b.intValue());
        }
        return b;
    }

    private let m28925b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24867a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f24868b = Integer.valueOf(nyt.f());
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
