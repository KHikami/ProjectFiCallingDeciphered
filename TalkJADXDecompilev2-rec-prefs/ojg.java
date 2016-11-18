package p000;

public final class ojg extends nyx<ojg> {
    public Integer f33080a;

    public /* synthetic */ nzf m38558a(nyt nyt) {
        return m38556b(nyt);
    }

    public ojg() {
        m38557d();
    }

    private ojg m38557d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38559a(nyu nyu) {
        if (this.f33080a != null) {
            nyu.m37168a(1, this.f33080a.intValue());
        }
        super.a(nyu);
    }

    protected int m38560b() {
        int b = super.b();
        if (this.f33080a != null) {
            return b + nyu.m37147f(1, this.f33080a.intValue());
        }
        return b;
    }

    private ojg m38556b(nyt nyt) {
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
                        case 5:
                        case 6:
                        case 7:
                            this.f33080a = Integer.valueOf(a);
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
