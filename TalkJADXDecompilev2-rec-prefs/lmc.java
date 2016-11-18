package p000;

public final class lmc extends nyx<lmc> {
    public Integer f25509a;
    public String f25510b;
    public ona f25511c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29450b(nyt);
    }

    public lmc() {
        m29451d();
    }

    private lmc m29451d() {
        this.f25509a = null;
        this.f25510b = null;
        this.f25511c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25509a != null) {
            nyu.c(1, this.f25509a.intValue());
        }
        if (this.f25510b != null) {
            nyu.a(2, this.f25510b);
        }
        if (this.f25511c != null) {
            nyu.b(3, this.f25511c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25509a != null) {
            b += nyu.g(1, this.f25509a.intValue());
        }
        if (this.f25510b != null) {
            b += nyu.b(2, this.f25510b);
        }
        if (this.f25511c != null) {
            return b + nyu.d(3, this.f25511c);
        }
        return b;
    }

    private lmc m29450b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25509a = Integer.valueOf(nyt.l());
                    continue;
                case wi.dH /*18*/:
                    this.f25510b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f25511c == null) {
                        this.f25511c = new ona();
                    }
                    nyt.a(this.f25511c);
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
