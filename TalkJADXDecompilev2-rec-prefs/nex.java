package p000;

public final class nex extends nyx<nex> {
    public Boolean f29645a;

    public /* synthetic */ nzf m34623a(nyt nyt) {
        return m34621b(nyt);
    }

    public nex() {
        m34622d();
    }

    private nex m34622d() {
        this.f29645a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34624a(nyu nyu) {
        if (this.f29645a != null) {
            nyu.m37172a(1, this.f29645a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34625b() {
        int b = super.b();
        if (this.f29645a == null) {
            return b;
        }
        this.f29645a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nex m34621b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29645a = Boolean.valueOf(nyt.m37116i());
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
