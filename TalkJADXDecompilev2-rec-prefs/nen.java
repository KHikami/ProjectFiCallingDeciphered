package p000;

public final class nen extends nyx<nen> {
    public npo f29616a;
    public neo f29617b;

    public /* synthetic */ nzf m34573a(nyt nyt) {
        return m34571b(nyt);
    }

    public nen() {
        m34572d();
    }

    private nen m34572d() {
        this.f29616a = null;
        this.f29617b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34574a(nyu nyu) {
        if (this.f29616a != null) {
            nyu.m37182b(1, this.f29616a);
        }
        if (this.f29617b != null) {
            nyu.m37182b(2, this.f29617b);
        }
        super.a(nyu);
    }

    protected int m34575b() {
        int b = super.b();
        if (this.f29616a != null) {
            b += nyu.m37145d(1, this.f29616a);
        }
        if (this.f29617b != null) {
            return b + nyu.m37145d(2, this.f29617b);
        }
        return b;
    }

    private nen m34571b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29616a == null) {
                        this.f29616a = new npo();
                    }
                    nyt.m37101a(this.f29616a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29617b == null) {
                        this.f29617b = new neo();
                    }
                    nyt.m37101a(this.f29617b);
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
