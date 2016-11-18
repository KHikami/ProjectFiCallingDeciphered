package p000;

public final class lkl extends nyx<lkl> {
    public Integer f25152a;
    public Integer f25153b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29223b(nyt);
    }

    public lkl() {
        m29224d();
    }

    private lkl m29224d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25152a != null) {
            nyu.a(1, this.f25152a.intValue());
        }
        if (this.f25153b != null) {
            nyu.a(2, this.f25153b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25152a != null) {
            b += nyu.f(1, this.f25152a.intValue());
        }
        if (this.f25153b != null) {
            return b + nyu.f(2, this.f25153b.intValue());
        }
        return b;
    }

    private lkl m29223b(nyt nyt) {
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
                            this.f25152a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f25153b = Integer.valueOf(a);
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
