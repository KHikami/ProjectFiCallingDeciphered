package p000;

public final class nkd extends nyx<nkd> {
    public nea f30031a;

    public /* synthetic */ nzf m35330a(nyt nyt) {
        return m35328b(nyt);
    }

    public nkd() {
        m35329d();
    }

    private nkd m35329d() {
        this.f30031a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35331a(nyu nyu) {
        if (this.f30031a != null) {
            nyu.m37182b(1, this.f30031a);
        }
        super.a(nyu);
    }

    protected int m35332b() {
        int b = super.b();
        if (this.f30031a != null) {
            return b + nyu.m37145d(1, this.f30031a);
        }
        return b;
    }

    private nkd m35328b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30031a == null) {
                        this.f30031a = new nea();
                    }
                    nyt.m37101a(this.f30031a);
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
