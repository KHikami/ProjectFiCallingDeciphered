package p000;

public final class mau extends nyx<mau> {
    public Integer f27155a;
    public Integer f27156b;
    public Integer f27157c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31487b(nyt);
    }

    public mau() {
        m31488d();
    }

    private mau m31488d() {
        this.f27155a = null;
        this.f27156b = null;
        this.f27157c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27155a != null) {
            nyu.a(1, this.f27155a.intValue());
        }
        if (this.f27156b != null) {
            nyu.a(2, this.f27156b.intValue());
        }
        if (this.f27157c != null) {
            nyu.a(3, this.f27157c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27155a != null) {
            b += nyu.f(1, this.f27155a.intValue());
        }
        if (this.f27156b != null) {
            b += nyu.f(2, this.f27156b.intValue());
        }
        if (this.f27157c != null) {
            return b + nyu.f(3, this.f27157c.intValue());
        }
        return b;
    }

    private mau m31487b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27155a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27156b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27157c = Integer.valueOf(nyt.f());
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
