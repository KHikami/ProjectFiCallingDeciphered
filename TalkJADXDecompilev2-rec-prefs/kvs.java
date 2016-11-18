package p000;

public final class kvs extends nyx<kvs> {
    public Boolean f23663a;
    public Boolean f23664b;
    public Boolean f23665c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27728b(nyt);
    }

    public kvs() {
        this.f23663a = null;
        this.f23664b = null;
        this.f23665c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23663a != null) {
            nyu.a(1, this.f23663a.booleanValue());
        }
        if (this.f23664b != null) {
            nyu.a(2, this.f23664b.booleanValue());
        }
        if (this.f23665c != null) {
            nyu.a(3, this.f23665c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23663a != null) {
            this.f23663a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f23664b != null) {
            this.f23664b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23665c == null) {
            return b;
        }
        this.f23665c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kvs m27728b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23663a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f23664b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f23665c = Boolean.valueOf(nyt.i());
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
