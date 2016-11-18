package p000;

public final class kvv extends nyx<kvv> {
    public String f23679a;
    public String f23680b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27740b(nyt);
    }

    public kvv() {
        this.f23679a = null;
        this.f23680b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23679a != null) {
            nyu.a(1, this.f23679a);
        }
        if (this.f23680b != null) {
            nyu.a(2, this.f23680b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23679a != null) {
            b += nyu.b(1, this.f23679a);
        }
        if (this.f23680b != null) {
            return b + nyu.b(2, this.f23680b);
        }
        return b;
    }

    private kvv m27740b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23679a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23680b = nyt.j();
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
