package p000;

public final class ozf extends nyx<ozf> {
    public Integer f34684a;

    public /* synthetic */ nzf m40006a(nyt nyt) {
        return m40004b(nyt);
    }

    public ozf() {
        m40005d();
    }

    private ozf m40005d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m40007a(nyu nyu) {
        if (this.f34684a != null) {
            nyu.m37168a(1, this.f34684a.intValue());
        }
        super.a(nyu);
    }

    protected int m40008b() {
        int b = super.b();
        if (this.f34684a != null) {
            return b + nyu.m37147f(1, this.f34684a.intValue());
        }
        return b;
    }

    private ozf m40004b(nyt nyt) {
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
                            this.f34684a = Integer.valueOf(a);
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
