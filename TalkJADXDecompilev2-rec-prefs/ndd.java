package p000;

public final class ndd extends nyx<ndd> {
    public Boolean f29549a;

    public /* synthetic */ nzf m34399a(nyt nyt) {
        return m34398b(nyt);
    }

    public ndd() {
        this.f29549a = null;
        this.cachedSize = -1;
    }

    public void m34400a(nyu nyu) {
        if (this.f29549a != null) {
            nyu.m37172a(1, this.f29549a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34401b() {
        int b = super.b();
        if (this.f29549a == null) {
            return b;
        }
        this.f29549a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ndd m34398b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29549a = Boolean.valueOf(nyt.m37116i());
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
