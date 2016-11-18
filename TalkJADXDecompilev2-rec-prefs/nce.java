package p000;

public final class nce extends nyx<nce> {
    public Boolean f29489a;

    public /* synthetic */ nzf m34288a(nyt nyt) {
        return m34287b(nyt);
    }

    public nce() {
        this.f29489a = null;
        this.cachedSize = -1;
    }

    public void m34289a(nyu nyu) {
        if (this.f29489a != null) {
            nyu.m37172a(1, this.f29489a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34290b() {
        int b = super.b();
        if (this.f29489a == null) {
            return b;
        }
        this.f29489a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nce m34287b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29489a = Boolean.valueOf(nyt.m37116i());
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
