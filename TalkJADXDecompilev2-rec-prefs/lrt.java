package p000;

public final class lrt extends nyx<lrt> {
    public Integer f26275a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30227b(nyt);
    }

    public lrt() {
        m30228d();
    }

    private lrt m30228d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26275a != null) {
            nyu.a(1, this.f26275a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26275a != null) {
            return b + nyu.f(1, this.f26275a.intValue());
        }
        return b;
    }

    private lrt m30227b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f26275a = Integer.valueOf(a);
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
