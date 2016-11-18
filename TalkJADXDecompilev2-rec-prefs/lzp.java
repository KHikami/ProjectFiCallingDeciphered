package p000;

public final class lzp extends nyx<lzp> {
    public Integer f27021a;
    public Integer f27022b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31310b(nyt);
    }

    public lzp() {
        m31311d();
    }

    private lzp m31311d() {
        this.f27022b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27021a != null) {
            nyu.a(1, this.f27021a.intValue());
        }
        if (this.f27022b != null) {
            nyu.a(2, this.f27022b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27021a != null) {
            b += nyu.f(1, this.f27021a.intValue());
        }
        if (this.f27022b != null) {
            return b + nyu.f(2, this.f27022b.intValue());
        }
        return b;
    }

    private lzp m31310b(nyt nyt) {
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
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f27021a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f27022b = Integer.valueOf(nyt.f());
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
