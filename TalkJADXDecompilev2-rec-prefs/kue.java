package p000;

public final class kue extends nyx<kue> {
    public Integer f23413a;
    public Integer f23414b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27548b(nyt);
    }

    public kue() {
        this.f23413a = null;
        this.f23414b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.b(1, this.f23413a.intValue());
        nyu.b(2, this.f23414b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23413a.intValue();
        b += nyu.h(1) + 4;
        this.f23414b.intValue();
        return b + (nyu.h(2) + 4);
    }

    private kue m27548b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f23413a = Integer.valueOf(nyt.h());
                    continue;
                case 21:
                    this.f23414b = Integer.valueOf(nyt.h());
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
