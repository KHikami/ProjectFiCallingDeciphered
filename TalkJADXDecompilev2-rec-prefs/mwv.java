package p000;

public final class mwv extends nyx<mwv> {
    public Long f28632a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33262b(nyt);
    }

    public mwv() {
        this.f28632a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28632a != null) {
            nyu.c(1, this.f28632a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28632a == null) {
            return b;
        }
        this.f28632a.longValue();
        return b + (nyu.h(1) + 8);
    }

    private mwv m33262b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28632a = Long.valueOf(nyt.g());
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
