package p000;

public final class oyr extends nyx<oyr> {
    public Integer f34669a;

    public /* synthetic */ nzf m39953a(nyt nyt) {
        return m39951b(nyt);
    }

    public oyr() {
        m39952d();
    }

    private oyr m39952d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39954a(nyu nyu) {
        if (this.f34669a != null) {
            nyu.m37168a(1, this.f34669a.intValue());
        }
        super.a(nyu);
    }

    protected int m39955b() {
        int b = super.b();
        if (this.f34669a != null) {
            return b + nyu.m37147f(1, this.f34669a.intValue());
        }
        return b;
    }

    private oyr m39951b(nyt nyt) {
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
                        case 8:
                        case 9:
                            this.f34669a = Integer.valueOf(a);
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
