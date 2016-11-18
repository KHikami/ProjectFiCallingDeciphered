package p000;

public final class ntk extends nyx<ntk> {
    public int f30752a;
    public Float f30753b;

    public /* synthetic */ nzf m36482a(nyt nyt) {
        return m36481b(nyt);
    }

    public ntk() {
        this.f30752a = nzf.UNSET_ENUM_VALUE;
        this.f30753b = null;
        this.cachedSize = -1;
    }

    public void m36483a(nyu nyu) {
        if (this.f30752a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30752a);
        }
        if (this.f30753b != null) {
            nyu.m37167a(2, this.f30753b.floatValue());
        }
        super.a(nyu);
    }

    protected int m36484b() {
        int b = super.b();
        if (this.f30752a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30752a);
        }
        if (this.f30753b == null) {
            return b;
        }
        this.f30753b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private ntk m36481b(nyt nyt) {
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
                            this.f30752a = a;
                            break;
                        default:
                            continue;
                    }
                case 21:
                    this.f30753b = Float.valueOf(nyt.m37106c());
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
