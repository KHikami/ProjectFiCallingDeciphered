package p000;

public final class lum extends nyx<lum> {
    public lor f26499a;
    public Integer f26500b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30617b(nyt);
    }

    public lum() {
        m30618d();
    }

    private lum m30618d() {
        this.f26499a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26499a != null) {
            nyu.b(1, this.f26499a);
        }
        if (this.f26500b != null) {
            nyu.a(2, this.f26500b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26499a != null) {
            b += nyu.d(1, this.f26499a);
        }
        if (this.f26500b != null) {
            return b + nyu.f(2, this.f26500b.intValue());
        }
        return b;
    }

    private lum m30617b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26499a == null) {
                        this.f26499a = new lor();
                    }
                    nyt.a(this.f26499a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26500b = Integer.valueOf(a);
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
