package p000;

public final class lzk extends nyx<lzk> {
    public String f27005a;
    public Long f27006b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31283b(nyt);
    }

    public lzk() {
        m31284d();
    }

    private lzk m31284d() {
        this.f27005a = null;
        this.f27006b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27005a != null) {
            nyu.a(1, this.f27005a);
        }
        if (this.f27006b != null) {
            nyu.b(2, this.f27006b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27005a != null) {
            b += nyu.b(1, this.f27005a);
        }
        if (this.f27006b != null) {
            return b + nyu.f(2, this.f27006b.longValue());
        }
        return b;
    }

    private lzk m31283b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27005a = nyt.j();
                    continue;
                case 16:
                    this.f27006b = Long.valueOf(nyt.e());
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
