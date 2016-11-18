package p000;

public final class nic extends nyx<nic> {
    public njs f29873a;

    public /* synthetic */ nzf m35059a(nyt nyt) {
        return m35057b(nyt);
    }

    public nic() {
        m35058d();
    }

    private nic m35058d() {
        this.f29873a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35060a(nyu nyu) {
        if (this.f29873a != null) {
            nyu.m37182b(1, this.f29873a);
        }
        super.a(nyu);
    }

    protected int m35061b() {
        int b = super.b();
        if (this.f29873a != null) {
            return b + nyu.m37145d(1, this.f29873a);
        }
        return b;
    }

    private nic m35057b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29873a == null) {
                        this.f29873a = new njs();
                    }
                    nyt.m37101a(this.f29873a);
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
