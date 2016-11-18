package defpackage;

public final class lbr extends nyx<lbr> {
    public int a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbr() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        super.a(nyu);
    }

    protected int b() {
        return super.b() + nyu.f(1, this.a);
    }

    private lbr b(nyt nyt) {
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
                            this.a = a;
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
