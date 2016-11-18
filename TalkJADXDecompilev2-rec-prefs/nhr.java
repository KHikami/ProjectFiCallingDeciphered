package p000;

public final class nhr extends nyx<nhr> {
    public Boolean f29844a;

    public /* synthetic */ nzf m34997a(nyt nyt) {
        return m34995b(nyt);
    }

    public nhr() {
        m34996d();
    }

    private nhr m34996d() {
        this.f29844a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34998a(nyu nyu) {
        if (this.f29844a != null) {
            nyu.m37172a(1, this.f29844a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34999b() {
        int b = super.b();
        if (this.f29844a == null) {
            return b;
        }
        this.f29844a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nhr m34995b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29844a = Boolean.valueOf(nyt.m37116i());
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
