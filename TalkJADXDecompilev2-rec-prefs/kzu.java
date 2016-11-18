package p000;

public final class kzu extends nyx<kzu> {
    public kik f24300a;
    public String f24301b;
    public kin f24302c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28284b(nyt);
    }

    public kzu() {
        this.f24301b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24300a != null) {
            nyu.b(1, this.f24300a);
        }
        if (this.f24301b != null) {
            nyu.a(2, this.f24301b);
        }
        if (this.f24302c != null) {
            nyu.b(3, this.f24302c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24300a != null) {
            b += nyu.d(1, this.f24300a);
        }
        if (this.f24301b != null) {
            b += nyu.b(2, this.f24301b);
        }
        if (this.f24302c != null) {
            return b + nyu.d(3, this.f24302c);
        }
        return b;
    }

    private kzu m28284b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24300a == null) {
                        this.f24300a = new kik();
                    }
                    nyt.a(this.f24300a);
                    continue;
                case wi.dH /*18*/:
                    this.f24301b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24302c == null) {
                        this.f24302c = new kin();
                    }
                    nyt.a(this.f24302c);
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
