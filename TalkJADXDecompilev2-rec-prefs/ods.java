package p000;

public final class ods extends nyx<ods> {
    public int f32453a;

    public /* synthetic */ nzf m37895a(nyt nyt) {
        return m37894b(nyt);
    }

    public ods() {
        this.f32453a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37896a(nyu nyu) {
        if (this.f32453a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32453a);
        }
        super.a(nyu);
    }

    protected int m37897b() {
        int b = super.b();
        if (this.f32453a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f32453a);
        }
        return b;
    }

    private ods m37894b(nyt nyt) {
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
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f32453a = a;
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
