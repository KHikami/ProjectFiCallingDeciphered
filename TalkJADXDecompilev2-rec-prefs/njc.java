package p000;

public final class njc extends nyx<njc> {
    public nkb f29971a;

    public /* synthetic */ nzf m35193a(nyt nyt) {
        return m35191b(nyt);
    }

    public njc() {
        m35192d();
    }

    private njc m35192d() {
        this.f29971a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35194a(nyu nyu) {
        if (this.f29971a != null) {
            nyu.m37182b(1, this.f29971a);
        }
        super.a(nyu);
    }

    protected int m35195b() {
        int b = super.b();
        if (this.f29971a != null) {
            return b + nyu.m37145d(1, this.f29971a);
        }
        return b;
    }

    private njc m35191b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29971a == null) {
                        this.f29971a = new nkb();
                    }
                    nyt.m37101a(this.f29971a);
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
