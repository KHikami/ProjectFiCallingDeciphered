package p000;

public final class lxw extends nyx<lxw> {
    public lzj f26819a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31068b(nyt);
    }

    public lxw() {
        m31069d();
    }

    private lxw m31069d() {
        this.responseHeader = null;
        this.f26819a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26819a != null) {
            nyu.b(2, this.f26819a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26819a != null) {
            return b + nyu.d(2, this.f26819a);
        }
        return b;
    }

    private lxw m31068b(nyt nyt) {
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
                    if (this.f26819a == null) {
                        this.f26819a = new lzj();
                    }
                    nyt.a(this.f26819a);
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
