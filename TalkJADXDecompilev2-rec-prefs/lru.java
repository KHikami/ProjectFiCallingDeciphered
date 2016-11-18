package p000;

public final class lru extends nyx<lru> {
    public Integer f26276a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30232b(nyt);
    }

    public lru() {
        m30233d();
    }

    private lru m30233d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26276a != null) {
            nyu.a(1, this.f26276a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26276a != null) {
            return b + nyu.f(1, this.f26276a.intValue());
        }
        return b;
    }

    private lru m30232b(nyt nyt) {
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
                            this.f26276a = Integer.valueOf(a);
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
