package p000;

public final class mwy extends nyx<mwy> {
    public Long f28639a;
    public String f28640b;
    public String f28641c;
    public String f28642d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33275b(nyt);
    }

    public mwy() {
        this.f28639a = null;
        this.f28640b = null;
        this.f28641c = null;
        this.f28642d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28639a != null) {
            nyu.c(1, this.f28639a.longValue());
        }
        if (this.f28640b != null) {
            nyu.a(2, this.f28640b);
        }
        if (this.f28641c != null) {
            nyu.a(3, this.f28641c);
        }
        if (this.f28642d != null) {
            nyu.a(4, this.f28642d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28639a != null) {
            this.f28639a.longValue();
            b += nyu.h(1) + 8;
        }
        if (this.f28640b != null) {
            b += nyu.b(2, this.f28640b);
        }
        if (this.f28641c != null) {
            b += nyu.b(3, this.f28641c);
        }
        if (this.f28642d != null) {
            return b + nyu.b(4, this.f28642d);
        }
        return b;
    }

    private mwy m33275b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28639a = Long.valueOf(nyt.g());
                    continue;
                case wi.dH /*18*/:
                    this.f28640b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f28641c = nyt.j();
                    continue;
                case 34:
                    this.f28642d = nyt.j();
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
