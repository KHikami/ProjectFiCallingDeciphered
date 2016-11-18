package p000;

public final class lra extends nyx<lra> {
    public lor f26190a;
    public Integer f26191b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30130b(nyt);
    }

    public lra() {
        m30131d();
    }

    private lra m30131d() {
        this.f26190a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26190a != null) {
            nyu.b(1, this.f26190a);
        }
        if (this.f26191b != null) {
            nyu.a(2, this.f26191b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26190a != null) {
            b += nyu.d(1, this.f26190a);
        }
        if (this.f26191b != null) {
            return b + nyu.f(2, this.f26191b.intValue());
        }
        return b;
    }

    private lra m30130b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26190a == null) {
                        this.f26190a = new lor();
                    }
                    nyt.a(this.f26190a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26191b = Integer.valueOf(a);
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
