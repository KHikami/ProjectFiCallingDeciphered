package p000;

public final class mrr extends nyx<mrr> {
    public String f28219a;
    public Integer f28220b;
    public String f28221c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32792b(nyt);
    }

    public mrr() {
        m32793d();
    }

    private mrr m32793d() {
        this.f28219a = null;
        this.f28220b = null;
        this.f28221c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28219a != null) {
            nyu.a(1, this.f28219a);
        }
        if (this.f28220b != null) {
            nyu.a(2, this.f28220b.intValue());
        }
        if (this.f28221c != null) {
            nyu.a(3, this.f28221c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28219a != null) {
            b += nyu.b(1, this.f28219a);
        }
        if (this.f28220b != null) {
            b += nyu.f(2, this.f28220b.intValue());
        }
        if (this.f28221c != null) {
            return b + nyu.b(3, this.f28221c);
        }
        return b;
    }

    private mrr m32792b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28219a = nyt.j();
                    continue;
                case 16:
                    this.f28220b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    this.f28221c = nyt.j();
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
