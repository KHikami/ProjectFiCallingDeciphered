package p000;

public final class ndq extends nyx<ndq> {
    public ogb f29574a;

    public /* synthetic */ nzf m34452a(nyt nyt) {
        return m34451b(nyt);
    }

    public ndq() {
        this.cachedSize = -1;
    }

    public void m34453a(nyu nyu) {
        if (this.f29574a != null) {
            nyu.m37182b(1, this.f29574a);
        }
        super.a(nyu);
    }

    protected int m34454b() {
        int b = super.b();
        if (this.f29574a != null) {
            return b + nyu.m37145d(1, this.f29574a);
        }
        return b;
    }

    private ndq m34451b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29574a == null) {
                        this.f29574a = new ogb();
                    }
                    nyt.m37101a(this.f29574a);
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
