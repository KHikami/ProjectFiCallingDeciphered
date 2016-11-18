package p000;

public final class neo extends nyx<neo> {
    public Boolean f29618a;

    public /* synthetic */ nzf m34578a(nyt nyt) {
        return m34576b(nyt);
    }

    public neo() {
        m34577d();
    }

    private neo m34577d() {
        this.f29618a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34579a(nyu nyu) {
        if (this.f29618a != null) {
            nyu.m37172a(1, this.f29618a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34580b() {
        int b = super.b();
        if (this.f29618a == null) {
            return b;
        }
        this.f29618a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private neo m34576b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29618a = Boolean.valueOf(nyt.m37116i());
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
