package p000;

public final class oyh extends nyx<oyh> {
    public Integer f34631a;
    public Integer f34632b;

    public /* synthetic */ nzf m39902a(nyt nyt) {
        return m39900b(nyt);
    }

    public oyh() {
        m39901d();
    }

    private oyh m39901d() {
        this.f34631a = null;
        this.f34632b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39903a(nyu nyu) {
        if (this.f34631a != null) {
            nyu.m37168a(1, this.f34631a.intValue());
        }
        if (this.f34632b != null) {
            nyu.m37168a(2, this.f34632b.intValue());
        }
        super.a(nyu);
    }

    protected int m39904b() {
        int b = super.b();
        if (this.f34631a != null) {
            b += nyu.m37147f(1, this.f34631a.intValue());
        }
        if (this.f34632b != null) {
            return b + nyu.m37147f(2, this.f34632b.intValue());
        }
        return b;
    }

    private oyh m39900b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34631a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34632b = Integer.valueOf(nyt.m37112f());
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
