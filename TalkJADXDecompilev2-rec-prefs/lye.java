package p000;

public final class lye extends nyx<lye> {
    public lzj f26858a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31116b(nyt);
    }

    public lye() {
        m31117d();
    }

    private lye m31117d() {
        this.responseHeader = null;
        this.f26858a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26858a != null) {
            nyu.b(2, this.f26858a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26858a != null) {
            return b + nyu.d(2, this.f26858a);
        }
        return b;
    }

    private lye m31116b(nyt nyt) {
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
                    if (this.f26858a == null) {
                        this.f26858a = new lzj();
                    }
                    nyt.a(this.f26858a);
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
