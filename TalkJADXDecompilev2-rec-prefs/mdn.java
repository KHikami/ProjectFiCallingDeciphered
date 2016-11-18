package p000;

public final class mdn extends nyx<mdn> {
    public Integer f27487a;
    public Integer f27488b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31868b(nyt);
    }

    public mdn() {
        m31869d();
    }

    private mdn m31869d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27487a != null) {
            nyu.a(1, this.f27487a.intValue());
        }
        if (this.f27488b != null) {
            nyu.a(2, this.f27488b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27487a != null) {
            b += nyu.f(1, this.f27487a.intValue());
        }
        if (this.f27488b != null) {
            return b + nyu.f(2, this.f27488b.intValue());
        }
        return b;
    }

    private mdn m31868b(nyt nyt) {
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
                            this.f27487a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27488b = Integer.valueOf(a);
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
