package p000;

public final class kqg extends nyx<kqg> {
    public kqd f22758a;
    public String f22759b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27038b(nyt);
    }

    public kqg() {
        m27039d();
    }

    private kqg m27039d() {
        this.f22758a = null;
        this.f22759b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22758a != null) {
            nyu.b(1, this.f22758a);
        }
        if (this.f22759b != null) {
            nyu.a(2, this.f22759b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22758a != null) {
            b += nyu.d(1, this.f22758a);
        }
        if (this.f22759b != null) {
            return b + nyu.b(2, this.f22759b);
        }
        return b;
    }

    private kqg m27038b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22758a == null) {
                        this.f22758a = new kqd();
                    }
                    nyt.a(this.f22758a);
                    continue;
                case wi.dH /*18*/:
                    this.f22759b = nyt.j();
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
