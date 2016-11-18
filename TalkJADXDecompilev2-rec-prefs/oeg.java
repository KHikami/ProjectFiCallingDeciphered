package p000;

public final class oeg extends nyx<oeg> {
    public int f32463a;

    public /* synthetic */ nzf m37947a(nyt nyt) {
        return m37946b(nyt);
    }

    public oeg() {
        this.f32463a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37948a(nyu nyu) {
        if (this.f32463a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32463a);
        }
        super.a(nyu);
    }

    protected int m37949b() {
        int b = super.b();
        if (this.f32463a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(1, this.f32463a);
        }
        return b;
    }

    private oeg m37946b(nyt nyt) {
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
                            this.f32463a = a;
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
