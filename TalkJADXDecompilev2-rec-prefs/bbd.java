package p000;

public final class bbd extends nyx<bbd> {
    public Integer f2753a;
    public Integer f2754b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4714b(nyt);
    }

    public bbd() {
        this.f2753a = null;
        this.f2754b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f2753a != null) {
            nyu.a(1, this.f2753a.intValue());
        }
        if (this.f2754b != null) {
            nyu.a(2, this.f2754b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f2753a != null) {
            b += nyu.f(1, this.f2753a.intValue());
        }
        if (this.f2754b != null) {
            return b + nyu.f(2, this.f2754b.intValue());
        }
        return b;
    }

    private bbd m4714b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f2753a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f2754b = Integer.valueOf(nyt.f());
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
