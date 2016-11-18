package p000;

public final class kso extends nyx<kso> {
    public Integer f23121a;
    public Integer f23122b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27341b(nyt);
    }

    public kso() {
        m27342d();
    }

    private kso m27342d() {
        this.f23121a = null;
        this.f23122b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.b(1, this.f23121a.intValue());
        nyu.b(2, this.f23122b.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23121a.intValue();
        b += nyu.h(1) + 4;
        this.f23122b.intValue();
        return b + (nyu.h(2) + 4);
    }

    private kso m27341b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f23121a = Integer.valueOf(nyt.h());
                    continue;
                case 21:
                    this.f23122b = Integer.valueOf(nyt.h());
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
