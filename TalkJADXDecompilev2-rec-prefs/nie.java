package p000;

public final class nie extends nyx<nie> {
    public njs f29875a;

    public /* synthetic */ nzf m35069a(nyt nyt) {
        return m35067b(nyt);
    }

    public nie() {
        m35068d();
    }

    private nie m35068d() {
        this.f29875a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35070a(nyu nyu) {
        if (this.f29875a != null) {
            nyu.m37182b(1, this.f29875a);
        }
        super.a(nyu);
    }

    protected int m35071b() {
        int b = super.b();
        if (this.f29875a != null) {
            return b + nyu.m37145d(1, this.f29875a);
        }
        return b;
    }

    private nie m35067b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29875a == null) {
                        this.f29875a = new njs();
                    }
                    nyt.m37101a(this.f29875a);
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
