package p000;

public final class ooe extends nyx<ooe> {
    public int f33371a;
    public Integer f33372b;

    public /* synthetic */ nzf m38887a(nyt nyt) {
        return m38886b(nyt);
    }

    public ooe() {
        this.f33371a = nzf.UNSET_ENUM_VALUE;
        this.f33372b = null;
        this.cachedSize = -1;
    }

    public void m38888a(nyu nyu) {
        if (this.f33371a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f33371a);
        }
        if (this.f33372b != null) {
            nyu.m37168a(2, this.f33372b.intValue());
        }
        super.a(nyu);
    }

    protected int m38889b() {
        int b = super.b();
        if (this.f33371a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f33371a);
        }
        if (this.f33372b != null) {
            return b + nyu.m37147f(2, this.f33372b.intValue());
        }
        return b;
    }

    private ooe m38886b(nyt nyt) {
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
                            this.f33371a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f33372b = Integer.valueOf(nyt.m37112f());
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
