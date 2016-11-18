package p000;

public final class lpn extends nyx<lpn> {
    public Integer f26009a;
    public Integer f26010b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29920b(nyt);
    }

    public lpn() {
        m29921d();
    }

    private lpn m29921d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26009a != null) {
            nyu.a(1, this.f26009a.intValue());
        }
        if (this.f26010b != null) {
            nyu.a(2, this.f26010b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26009a != null) {
            b += nyu.f(1, this.f26009a.intValue());
        }
        if (this.f26010b != null) {
            return b + nyu.f(2, this.f26010b.intValue());
        }
        return b;
    }

    private lpn m29920b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26009a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26010b = Integer.valueOf(a);
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
