package p000;

public final class odl extends nyx<odl> {
    public odt f32429a;
    public int f32430b;

    public /* synthetic */ nzf m37866a(nyt nyt) {
        return m37865b(nyt);
    }

    public odl() {
        this.f32430b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37867a(nyu nyu) {
        if (this.f32429a != null) {
            nyu.m37182b(1, this.f32429a);
        }
        if (this.f32430b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f32430b);
        }
        super.a(nyu);
    }

    protected int m37868b() {
        int b = super.b();
        if (this.f32429a != null) {
            b += nyu.m37145d(1, this.f32429a);
        }
        if (this.f32430b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(2, this.f32430b);
        }
        return b;
    }

    private odl m37865b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32429a == null) {
                        this.f32429a = new odt();
                    }
                    nyt.m37101a(this.f32429a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32430b = a;
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
