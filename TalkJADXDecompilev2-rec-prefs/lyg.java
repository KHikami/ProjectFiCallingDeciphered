package p000;

public final class lyg extends nyx<lyg> {
    public String f26861a;
    public String f26862b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31126b(nyt);
    }

    public lyg() {
        m31127d();
    }

    private lyg m31127d() {
        this.f26861a = null;
        this.f26862b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26861a != null) {
            nyu.a(1, this.f26861a);
        }
        if (this.f26862b != null) {
            nyu.a(2, this.f26862b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26861a != null) {
            b += nyu.b(1, this.f26861a);
        }
        if (this.f26862b != null) {
            return b + nyu.b(2, this.f26862b);
        }
        return b;
    }

    private lyg m31126b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26861a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26862b = nyt.j();
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
