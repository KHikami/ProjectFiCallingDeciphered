package p000;

public final class oeb extends nyx<oeb> {
    public int f32460a;

    public /* synthetic */ nzf m37931a(nyt nyt) {
        return m37930b(nyt);
    }

    public oeb() {
        this.f32460a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37932a(nyu nyu) {
        if (this.f32460a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32460a);
        }
        super.a(nyu);
    }

    protected int m37933b() {
        int b = super.b();
        if (this.f32460a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f32460a);
        }
        return b;
    }

    private oeb m37930b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f32460a = a;
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
