package p000;

public final class ldi extends nyx<ldi> {
    public Integer f24668a;
    public Integer f24669b;
    public Integer f24670c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28735b(nyt);
    }

    public ldi() {
        m28736d();
    }

    private ldi m28736d() {
        this.f24669b = null;
        this.f24670c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24668a != null) {
            nyu.a(1, this.f24668a.intValue());
        }
        if (this.f24669b != null) {
            nyu.a(2, this.f24669b.intValue());
        }
        if (this.f24670c != null) {
            nyu.a(3, this.f24670c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24668a != null) {
            b += nyu.f(1, this.f24668a.intValue());
        }
        if (this.f24669b != null) {
            b += nyu.f(2, this.f24669b.intValue());
        }
        if (this.f24670c != null) {
            return b + nyu.f(3, this.f24670c.intValue());
        }
        return b;
    }

    private ldi m28735b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f24668a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f24669b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f24670c = Integer.valueOf(nyt.f());
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
