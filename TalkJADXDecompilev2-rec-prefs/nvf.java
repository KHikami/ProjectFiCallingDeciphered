package p000;

public final class nvf extends nyx<nvf> {
    public Integer f31122a;
    public Integer f31123b;

    public /* synthetic */ nzf m36705a(nyt nyt) {
        return m36704b(nyt);
    }

    public nvf() {
        this.f31122a = null;
        this.f31123b = null;
        this.cachedSize = -1;
    }

    public void m36706a(nyu nyu) {
        if (this.f31122a != null) {
            nyu.m37168a(1, this.f31122a.intValue());
        }
        if (this.f31123b != null) {
            nyu.m37168a(2, this.f31123b.intValue());
        }
        super.a(nyu);
    }

    protected int m36707b() {
        int b = super.b();
        if (this.f31122a != null) {
            b += nyu.m37147f(1, this.f31122a.intValue());
        }
        if (this.f31123b != null) {
            return b + nyu.m37147f(2, this.f31123b.intValue());
        }
        return b;
    }

    private nvf m36704b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31122a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f31123b = Integer.valueOf(nyt.m37112f());
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
