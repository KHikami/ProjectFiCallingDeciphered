package p000;

public final class mch extends nyx<mch> {
    public Boolean f27321a;
    public Integer f27322b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31701b(nyt);
    }

    public mch() {
        m31702d();
    }

    private mch m31702d() {
        this.f27321a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27321a != null) {
            nyu.a(1, this.f27321a.booleanValue());
        }
        if (this.f27322b != null) {
            nyu.a(2, this.f27322b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27321a != null) {
            this.f27321a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f27322b != null) {
            return b + nyu.f(2, this.f27322b.intValue());
        }
        return b;
    }

    private mch m31701b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27321a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f27322b = Integer.valueOf(a);
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
