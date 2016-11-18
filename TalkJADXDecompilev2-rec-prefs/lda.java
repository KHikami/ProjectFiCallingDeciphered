package p000;

public final class lda extends nyx<lda> {
    public String f24643a;
    public Boolean f24644b;
    public String f24645c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28692b(nyt);
    }

    public lda() {
        m28693d();
    }

    private lda m28693d() {
        this.f24643a = null;
        this.f24644b = null;
        this.f24645c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24643a != null) {
            nyu.a(1, this.f24643a);
        }
        if (this.f24644b != null) {
            nyu.a(2, this.f24644b.booleanValue());
        }
        if (this.f24645c != null) {
            nyu.a(3, this.f24645c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24643a != null) {
            b += nyu.b(1, this.f24643a);
        }
        if (this.f24644b != null) {
            this.f24644b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f24645c != null) {
            return b + nyu.b(3, this.f24645c);
        }
        return b;
    }

    private lda m28692b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24643a = nyt.j();
                    continue;
                case 16:
                    this.f24644b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f24645c = nyt.j();
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
