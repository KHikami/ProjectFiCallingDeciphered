package p000;

public final class lza extends nyx<lza> {
    public lzj f26971a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31229b(nyt);
    }

    public lza() {
        m31230d();
    }

    private lza m31230d() {
        this.responseHeader = null;
        this.f26971a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26971a != null) {
            nyu.b(2, this.f26971a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26971a != null) {
            return b + nyu.d(2, this.f26971a);
        }
        return b;
    }

    private lza m31229b(nyt nyt) {
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
                    if (this.f26971a == null) {
                        this.f26971a = new lzj();
                    }
                    nyt.a(this.f26971a);
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
