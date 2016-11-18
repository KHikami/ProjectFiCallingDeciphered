package p000;

public final class oxw extends nyx<oxw> {
    public Integer f34559a;

    public /* synthetic */ nzf m39844a(nyt nyt) {
        return m39842b(nyt);
    }

    public oxw() {
        m39843d();
    }

    private oxw m39843d() {
        this.f34559a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39845a(nyu nyu) {
        if (this.f34559a != null) {
            nyu.m37168a(1, this.f34559a.intValue());
        }
        super.a(nyu);
    }

    protected int m39846b() {
        int b = super.b();
        if (this.f34559a != null) {
            return b + nyu.m37147f(1, this.f34559a.intValue());
        }
        return b;
    }

    private oxw m39842b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34559a = Integer.valueOf(nyt.m37112f());
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
