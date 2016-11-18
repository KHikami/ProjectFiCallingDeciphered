package p000;

public final class opz extends nyx<opz> {
    public oqv f33665a;

    public /* synthetic */ nzf m39129a(nyt nyt) {
        return m39127b(nyt);
    }

    public opz() {
        m39128d();
    }

    private opz m39128d() {
        this.f33665a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39130a(nyu nyu) {
        if (this.f33665a != null) {
            nyu.m37182b(1, this.f33665a);
        }
        super.a(nyu);
    }

    protected int m39131b() {
        int b = super.b();
        if (this.f33665a != null) {
            return b + nyu.m37145d(1, this.f33665a);
        }
        return b;
    }

    private opz m39127b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33665a == null) {
                        this.f33665a = new oqv();
                    }
                    nyt.m37101a(this.f33665a);
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
