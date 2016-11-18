package p000;

public final class kmo extends nyx<kmo> {
    public String f22377a;
    public kmp f22378b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26562b(nyt);
    }

    public kmo() {
        m26563d();
    }

    private kmo m26563d() {
        this.f22377a = null;
        this.f22378b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22377a != null) {
            nyu.a(1, this.f22377a);
        }
        if (this.f22378b != null) {
            nyu.b(2, this.f22378b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22377a != null) {
            b += nyu.b(1, this.f22377a);
        }
        if (this.f22378b != null) {
            return b + nyu.d(2, this.f22378b);
        }
        return b;
    }

    private kmo m26562b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22377a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22378b == null) {
                        this.f22378b = new kmp();
                    }
                    nyt.a(this.f22378b);
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
