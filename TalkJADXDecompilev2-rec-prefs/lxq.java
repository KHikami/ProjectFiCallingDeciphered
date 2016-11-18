package p000;

public final class lxq extends nyx<lxq> {
    public String f26799a;
    public Integer f26800b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31038b(nyt);
    }

    public lxq() {
        m31039d();
    }

    private lxq m31039d() {
        this.f26799a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26799a != null) {
            nyu.a(1, this.f26799a);
        }
        if (this.f26800b != null) {
            nyu.a(2, this.f26800b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26799a != null) {
            b += nyu.b(1, this.f26799a);
        }
        if (this.f26800b != null) {
            return b + nyu.f(2, this.f26800b.intValue());
        }
        return b;
    }

    private lxq m31038b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26799a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26800b = Integer.valueOf(a);
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
