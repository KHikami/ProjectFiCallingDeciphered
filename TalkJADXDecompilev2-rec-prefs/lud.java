package p000;

public final class lud extends nyx<lud> {
    public String f26439a;
    public lod f26440b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30572b(nyt);
    }

    public lud() {
        m30573d();
    }

    private lud m30573d() {
        this.f26439a = null;
        this.f26440b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26439a != null) {
            nyu.a(1, this.f26439a);
        }
        if (this.f26440b != null) {
            nyu.b(2, this.f26440b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26439a != null) {
            b += nyu.b(1, this.f26439a);
        }
        if (this.f26440b != null) {
            return b + nyu.d(2, this.f26440b);
        }
        return b;
    }

    private lud m30572b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26439a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f26440b == null) {
                        this.f26440b = new lod();
                    }
                    nyt.a(this.f26440b);
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
