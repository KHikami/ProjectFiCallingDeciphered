package p000;

public final class ngv extends nyx<ngv> {
    public Boolean f29805a;

    public /* synthetic */ nzf m34881a(nyt nyt) {
        return m34879b(nyt);
    }

    public ngv() {
        m34880d();
    }

    private ngv m34880d() {
        this.f29805a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34882a(nyu nyu) {
        if (this.f29805a != null) {
            nyu.m37172a(1, this.f29805a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34883b() {
        int b = super.b();
        if (this.f29805a == null) {
            return b;
        }
        this.f29805a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ngv m34879b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29805a = Boolean.valueOf(nyt.m37116i());
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
