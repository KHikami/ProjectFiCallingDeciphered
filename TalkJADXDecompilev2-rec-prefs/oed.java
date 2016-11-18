package p000;

public final class oed extends nyx<oed> {
    public int f32461a;

    public /* synthetic */ nzf m37937a(nyt nyt) {
        return m37936b(nyt);
    }

    public oed() {
        this.f32461a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37938a(nyu nyu) {
        if (this.f32461a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32461a);
        }
        super.a(nyu);
    }

    protected int m37939b() {
        int b = super.b();
        if (this.f32461a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f32461a);
        }
        return b;
    }

    private oed m37936b(nyt nyt) {
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
                            this.f32461a = a;
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
