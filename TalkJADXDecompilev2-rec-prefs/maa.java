package p000;

public final class maa extends nyx<maa> {
    public lzj f27080a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31382b(nyt);
    }

    public maa() {
        m31383d();
    }

    private maa m31383d() {
        this.responseHeader = null;
        this.f27080a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f27080a != null) {
            nyu.b(2, this.f27080a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f27080a != null) {
            return b + nyu.d(2, this.f27080a);
        }
        return b;
    }

    private maa m31382b(nyt nyt) {
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
                    if (this.f27080a == null) {
                        this.f27080a = new lzj();
                    }
                    nyt.a(this.f27080a);
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
