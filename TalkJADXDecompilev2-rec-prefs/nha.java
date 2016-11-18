package p000;

public final class nha extends nyx<nha> {
    public Boolean f29816a;

    public /* synthetic */ nzf m34912a(nyt nyt) {
        return m34910b(nyt);
    }

    public nha() {
        m34911d();
    }

    private nha m34911d() {
        this.f29816a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34913a(nyu nyu) {
        if (this.f29816a != null) {
            nyu.m37172a(1, this.f29816a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34914b() {
        int b = super.b();
        if (this.f29816a == null) {
            return b;
        }
        this.f29816a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nha m34910b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29816a = Boolean.valueOf(nyt.m37116i());
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
