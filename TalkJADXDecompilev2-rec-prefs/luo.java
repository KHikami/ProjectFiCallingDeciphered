package p000;

public final class luo extends nyx<luo> {
    public lom f26505a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30627b(nyt);
    }

    public luo() {
        m30628d();
    }

    private luo m30628d() {
        this.responseHeader = null;
        this.f26505a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26505a != null) {
            nyu.b(2, this.f26505a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26505a != null) {
            return b + nyu.d(2, this.f26505a);
        }
        return b;
    }

    private luo m30627b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26505a == null) {
                        this.f26505a = new lom();
                    }
                    nyt.a(this.f26505a);
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
