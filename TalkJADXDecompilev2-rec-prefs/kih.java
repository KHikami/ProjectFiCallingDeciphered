package p000;

public final class kih extends nyx<kih> {
    public String f21843a;
    public Integer f21844b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25960b(nyt);
    }

    public kih() {
        m25961d();
    }

    private kih m25961d() {
        this.f21843a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21843a != null) {
            nyu.a(1, this.f21843a);
        }
        if (this.f21844b != null) {
            nyu.a(2, this.f21844b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21843a != null) {
            b += nyu.b(1, this.f21843a);
        }
        if (this.f21844b != null) {
            return b + nyu.f(2, this.f21844b.intValue());
        }
        return b;
    }

    private kih m25960b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21843a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21844b = Integer.valueOf(a);
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
