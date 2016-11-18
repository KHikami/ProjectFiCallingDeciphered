package p000;

public final class krq extends nyx<krq> {
    public Integer f22929a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27225b(nyt);
    }

    public krq() {
        m27226d();
    }

    private krq m27226d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22929a != null) {
            nyu.a(1, this.f22929a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22929a != null) {
            return b + nyu.f(1, this.f22929a.intValue());
        }
        return b;
    }

    private krq m27225b(nyt nyt) {
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
                        case 3:
                        case 4:
                            this.f22929a = Integer.valueOf(a);
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
