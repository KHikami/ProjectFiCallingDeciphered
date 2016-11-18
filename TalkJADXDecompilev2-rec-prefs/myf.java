package p000;

public final class myf extends nyx<myf> {
    public Integer f29137a;

    public /* synthetic */ nzf m33792a(nyt nyt) {
        return m33790b(nyt);
    }

    public myf() {
        m33791d();
    }

    private myf m33791d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33793a(nyu nyu) {
        if (this.f29137a != null) {
            nyu.m37168a(1, this.f29137a.intValue());
        }
        super.a(nyu);
    }

    protected int m33794b() {
        int b = super.b();
        if (this.f29137a != null) {
            return b + nyu.m37147f(1, this.f29137a.intValue());
        }
        return b;
    }

    private myf m33790b(nyt nyt) {
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
                            this.f29137a = Integer.valueOf(a);
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
