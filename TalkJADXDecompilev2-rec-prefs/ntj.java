package p000;

public final class ntj extends nyx<ntj> {
    public Integer f30750a;
    public Float f30751b;

    public /* synthetic */ nzf m36478a(nyt nyt) {
        return m36476b(nyt);
    }

    public ntj() {
        m36477d();
    }

    private ntj m36477d() {
        this.f30751b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36479a(nyu nyu) {
        if (this.f30750a != null) {
            nyu.m37168a(1, this.f30750a.intValue());
        }
        if (this.f30751b != null) {
            nyu.m37167a(2, this.f30751b.floatValue());
        }
        super.a(nyu);
    }

    protected int m36480b() {
        int b = super.b();
        if (this.f30750a != null) {
            b += nyu.m37147f(1, this.f30750a.intValue());
        }
        if (this.f30751b == null) {
            return b;
        }
        this.f30751b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private ntj m36476b(nyt nyt) {
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
                            this.f30750a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 21:
                    this.f30751b = Float.valueOf(nyt.m37106c());
                    continue;
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
