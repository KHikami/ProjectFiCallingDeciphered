package p000;

public final class mam extends nyx<mam> {
    public lzj f27121a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31444b(nyt);
    }

    public mam() {
        m31445d();
    }

    private mam m31445d() {
        this.responseHeader = null;
        this.f27121a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f27121a != null) {
            nyu.b(2, this.f27121a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f27121a != null) {
            return b + nyu.d(2, this.f27121a);
        }
        return b;
    }

    private mam m31444b(nyt nyt) {
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
                    if (this.f27121a == null) {
                        this.f27121a = new lzj();
                    }
                    nyt.a(this.f27121a);
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
