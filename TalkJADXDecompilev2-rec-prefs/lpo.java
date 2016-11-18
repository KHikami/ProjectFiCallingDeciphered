package p000;

public final class lpo extends nyx<lpo> {
    public Integer f26011a;
    public Integer f26012b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29925b(nyt);
    }

    public lpo() {
        m29926d();
    }

    private lpo m29926d() {
        this.f26012b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26011a != null) {
            nyu.a(1, this.f26011a.intValue());
        }
        if (this.f26012b != null) {
            nyu.a(2, this.f26012b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26011a != null) {
            b += nyu.f(1, this.f26011a.intValue());
        }
        if (this.f26012b != null) {
            return b + nyu.f(2, this.f26012b.intValue());
        }
        return b;
    }

    private lpo m29925b(nyt nyt) {
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
                            this.f26011a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26012b = Integer.valueOf(nyt.f());
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
