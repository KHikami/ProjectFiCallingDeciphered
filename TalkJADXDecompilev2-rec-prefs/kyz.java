package p000;

public final class kyz extends nyx<kyz> {
    public Integer f24136a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28154b(nyt);
    }

    public kyz() {
        m28155d();
    }

    private kyz m28155d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24136a != null) {
            nyu.a(1, this.f24136a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24136a != null) {
            return b + nyu.f(1, this.f24136a.intValue());
        }
        return b;
    }

    private kyz m28154b(nyt nyt) {
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
                            this.f24136a = Integer.valueOf(a);
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
