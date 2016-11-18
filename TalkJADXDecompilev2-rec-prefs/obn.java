package p000;

public final class obn extends nyx<obn> {
    public int f32002a;
    public String f32003b;

    public /* synthetic */ nzf m37645a(nyt nyt) {
        return m37644b(nyt);
    }

    public obn() {
        this.f32002a = nzf.UNSET_ENUM_VALUE;
        this.f32003b = null;
        this.cachedSize = -1;
    }

    public void m37646a(nyu nyu) {
        if (this.f32002a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32002a);
        }
        if (this.f32003b != null) {
            nyu.m37170a(2, this.f32003b);
        }
        super.a(nyu);
    }

    protected int m37647b() {
        int b = super.b();
        if (this.f32002a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32002a);
        }
        if (this.f32003b != null) {
            return b + nyu.m37137b(2, this.f32003b);
        }
        return b;
    }

    private obn m37644b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f32002a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32003b = nyt.m37117j();
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
