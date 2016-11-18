package p000;

public final class krw extends nyx<krw> {
    public String f22939a;
    public String f22940b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27254b(nyt);
    }

    public krw() {
        this.f22939a = null;
        this.f22940b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22939a != null) {
            nyu.a(1, this.f22939a);
        }
        if (this.f22940b != null) {
            nyu.a(2, this.f22940b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22939a != null) {
            b += nyu.b(1, this.f22939a);
        }
        if (this.f22940b != null) {
            return b + nyu.b(2, this.f22940b);
        }
        return b;
    }

    private krw m27254b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22939a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22940b = nyt.j();
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
