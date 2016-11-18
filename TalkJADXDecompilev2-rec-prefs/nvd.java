package p000;

public final class nvd extends nyx<nvd> {
    public Integer f31116a;
    public Integer f31117b;

    public /* synthetic */ nzf m36695a(nyt nyt) {
        return m36693b(nyt);
    }

    public nvd() {
        m36694d();
    }

    private nvd m36694d() {
        this.f31116a = null;
        this.f31117b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36696a(nyu nyu) {
        if (this.f31116a != null) {
            nyu.m37168a(1, this.f31116a.intValue());
        }
        if (this.f31117b != null) {
            nyu.m37168a(2, this.f31117b.intValue());
        }
        super.a(nyu);
    }

    protected int m36697b() {
        int b = super.b();
        if (this.f31116a != null) {
            b += nyu.m37147f(1, this.f31116a.intValue());
        }
        if (this.f31117b != null) {
            return b + nyu.m37147f(2, this.f31117b.intValue());
        }
        return b;
    }

    private nvd m36693b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31116a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31117b = Integer.valueOf(nyt.m37112f());
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
