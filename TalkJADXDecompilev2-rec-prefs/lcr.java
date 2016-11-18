package p000;

public final class lcr extends nyx<lcr> {
    public String f24608a;
    public String f24609b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28642b(nyt);
    }

    public lcr() {
        m28643d();
    }

    private lcr m28643d() {
        this.f24608a = null;
        this.f24609b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24608a != null) {
            nyu.a(1, this.f24608a);
        }
        if (this.f24609b != null) {
            nyu.a(2, this.f24609b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24608a != null) {
            b += nyu.b(1, this.f24608a);
        }
        if (this.f24609b != null) {
            return b + nyu.b(2, this.f24609b);
        }
        return b;
    }

    private lcr m28642b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24608a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24609b = nyt.j();
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
