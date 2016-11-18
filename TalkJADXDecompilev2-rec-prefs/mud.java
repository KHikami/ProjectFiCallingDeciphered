package p000;

public final class mud extends nyx<mud> {
    public long f28343a;
    public long f28344b;
    public ozn f28345c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32925b(nyt);
    }

    public mud() {
        m32926d();
    }

    private mud m32926d() {
        this.f28343a = 0;
        this.f28344b = 0;
        this.f28345c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.c(1, this.f28343a);
        nyu.c(2, this.f28344b);
        if (this.f28345c != null) {
            nyu.b(3, this.f28345c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        long j = this.f28343a;
        b += nyu.h(1) + 8;
        j = this.f28344b;
        b += nyu.h(2) + 8;
        if (this.f28345c != null) {
            return b + nyu.d(3, this.f28345c);
        }
        return b;
    }

    private mud m32925b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28343a = nyt.g();
                    continue;
                case wi.dK /*17*/:
                    this.f28344b = nyt.g();
                    continue;
                case wi.dx /*26*/:
                    if (this.f28345c == null) {
                        this.f28345c = new ozn();
                    }
                    nyt.a(this.f28345c);
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
