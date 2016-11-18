package p000;

public final class ngj extends nyx<ngj> {
    public Boolean f29791a;

    public /* synthetic */ nzf m34821a(nyt nyt) {
        return m34819b(nyt);
    }

    public ngj() {
        m34820d();
    }

    private ngj m34820d() {
        this.f29791a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34822a(nyu nyu) {
        if (this.f29791a != null) {
            nyu.m37172a(1, this.f29791a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34823b() {
        int b = super.b();
        if (this.f29791a == null) {
            return b;
        }
        this.f29791a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngj m34819b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29791a = Boolean.valueOf(nyt.m37116i());
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
