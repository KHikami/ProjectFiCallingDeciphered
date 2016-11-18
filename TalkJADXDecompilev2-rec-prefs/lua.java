package p000;

public final class lua extends nyx<lua> {
    public Integer f26435a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30557b(nyt);
    }

    public lua() {
        m30558d();
    }

    private lua m30558d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26435a != null) {
            nyu.a(1, this.f26435a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26435a != null) {
            return b + nyu.f(1, this.f26435a.intValue());
        }
        return b;
    }

    private lua m30557b(nyt nyt) {
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
                            this.f26435a = Integer.valueOf(a);
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
