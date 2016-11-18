package p000;

public final class nev extends nyx<nev> {
    public neu f29643a;

    public /* synthetic */ nzf m34613a(nyt nyt) {
        return m34611b(nyt);
    }

    public nev() {
        m34612d();
    }

    private nev m34612d() {
        this.f29643a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34614a(nyu nyu) {
        if (this.f29643a != null) {
            nyu.m37182b(1, this.f29643a);
        }
        super.a(nyu);
    }

    protected int m34615b() {
        int b = super.b();
        if (this.f29643a != null) {
            return b + nyu.m37145d(1, this.f29643a);
        }
        return b;
    }

    private nev m34611b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29643a == null) {
                        this.f29643a = new neu();
                    }
                    nyt.m37101a(this.f29643a);
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
