package p000;

public final class kuc extends nyx<kuc> {
    public String f23360a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27539b(nyt);
    }

    public kuc() {
        this.f23360a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23360a != null) {
            nyu.a(1, this.f23360a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23360a != null) {
            return b + nyu.b(1, this.f23360a);
        }
        return b;
    }

    private kuc m27539b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23360a = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
