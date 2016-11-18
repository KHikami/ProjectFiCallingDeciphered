package p000;

public final class mys extends nyx<mys> {
    public nah f29174a;
    public int f29175b;

    public /* synthetic */ nzf m33854a(nyt nyt) {
        return m33853b(nyt);
    }

    public mys() {
        this.f29175b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m33855a(nyu nyu) {
        if (this.f29174a != null) {
            nyu.m37182b(1, this.f29174a);
        }
        if (this.f29175b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f29175b);
        }
        super.a(nyu);
    }

    protected int m33856b() {
        int b = super.b();
        if (this.f29174a != null) {
            b += nyu.m37145d(1, this.f29174a);
        }
        if (this.f29175b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(2, this.f29175b);
        }
        return b;
    }

    private mys m33853b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29174a == null) {
                        this.f29174a = new nah();
                    }
                    nyt.m37101a(this.f29174a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29175b = a;
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
