package p000;

public final class oyu extends nyx<oyu> {
    public Integer f34674a;
    public Integer f34675b;

    public /* synthetic */ nzf m39965a(nyt nyt) {
        return m39963b(nyt);
    }

    public oyu() {
        m39964d();
    }

    private oyu m39964d() {
        this.f34674a = null;
        this.f34675b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39966a(nyu nyu) {
        if (this.f34674a != null) {
            nyu.m37168a(1, this.f34674a.intValue());
        }
        if (this.f34675b != null) {
            nyu.m37168a(2, this.f34675b.intValue());
        }
        super.a(nyu);
    }

    protected int m39967b() {
        int b = super.b();
        if (this.f34674a != null) {
            b += nyu.m37147f(1, this.f34674a.intValue());
        }
        if (this.f34675b != null) {
            return b + nyu.m37147f(2, this.f34675b.intValue());
        }
        return b;
    }

    private oyu m39963b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34674a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34675b = Integer.valueOf(nyt.m37112f());
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
