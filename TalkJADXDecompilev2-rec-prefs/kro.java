package p000;

public final class kro extends nyx<kro> {
    public Integer f22920a;
    public Integer f22921b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27216b(nyt);
    }

    public kro() {
        this.f22920a = null;
        this.f22921b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22920a != null) {
            nyu.a(1, this.f22920a.intValue());
        }
        if (this.f22921b != null) {
            nyu.a(2, this.f22921b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22920a != null) {
            b += nyu.f(1, this.f22920a.intValue());
        }
        if (this.f22921b != null) {
            return b + nyu.f(2, this.f22921b.intValue());
        }
        return b;
    }

    private kro m27216b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22920a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f22921b = Integer.valueOf(nyt.f());
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
