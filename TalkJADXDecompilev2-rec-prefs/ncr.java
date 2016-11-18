package p000;

public final class ncr extends nyx<ncr> {
    public ncn f29520a;

    public /* synthetic */ nzf m34343a(nyt nyt) {
        return m34342b(nyt);
    }

    public ncr() {
        this.cachedSize = -1;
    }

    public void m34344a(nyu nyu) {
        if (this.f29520a != null) {
            nyu.m37182b(1, this.f29520a);
        }
        super.a(nyu);
    }

    protected int m34345b() {
        int b = super.b();
        if (this.f29520a != null) {
            return b + nyu.m37145d(1, this.f29520a);
        }
        return b;
    }

    private ncr m34342b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29520a == null) {
                        this.f29520a = new ncn();
                    }
                    nyt.m37101a(this.f29520a);
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
