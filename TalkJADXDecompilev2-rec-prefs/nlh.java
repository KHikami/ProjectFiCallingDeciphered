package p000;

public final class nlh extends nyx<nlh> {
    public Integer f30110a;

    public /* synthetic */ nzf m35491a(nyt nyt) {
        return m35489b(nyt);
    }

    public nlh() {
        m35490d();
    }

    private nlh m35490d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35492a(nyu nyu) {
        if (this.f30110a != null) {
            nyu.m37168a(1, this.f30110a.intValue());
        }
        super.a(nyu);
    }

    protected int m35493b() {
        int b = super.b();
        if (this.f30110a != null) {
            return b + nyu.m37147f(1, this.f30110a.intValue());
        }
        return b;
    }

    private nlh m35489b(nyt nyt) {
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
                        case 10:
                        case 11:
                            this.f30110a = Integer.valueOf(a);
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
