package p000;

public final class kzg extends nyx<kzg> {
    public String f24190a;
    public Boolean f24191b;
    public String f24192c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28217b(nyt);
    }

    public kzg() {
        m28218d();
    }

    private kzg m28218d() {
        this.f24190a = null;
        this.f24191b = null;
        this.f24192c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24190a != null) {
            nyu.a(1, this.f24190a);
        }
        if (this.f24191b != null) {
            nyu.a(2, this.f24191b.booleanValue());
        }
        if (this.f24192c != null) {
            nyu.a(3, this.f24192c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24190a != null) {
            b += nyu.b(1, this.f24190a);
        }
        if (this.f24191b != null) {
            this.f24191b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f24192c != null) {
            return b + nyu.b(3, this.f24192c);
        }
        return b;
    }

    private kzg m28217b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24190a = nyt.j();
                    continue;
                case 16:
                    this.f24191b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f24192c = nyt.j();
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
