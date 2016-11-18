package p000;

public final class nfx extends nyx<nfx> {
    public njh f29738a;
    public nin f29739b;
    public njd f29740c;

    public /* synthetic */ nzf m34756a(nyt nyt) {
        return m34754b(nyt);
    }

    public nfx() {
        m34755d();
    }

    private nfx m34755d() {
        this.f29738a = null;
        this.f29739b = null;
        this.f29740c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34757a(nyu nyu) {
        if (this.f29738a != null) {
            nyu.m37182b(1, this.f29738a);
        }
        if (this.f29739b != null) {
            nyu.m37182b(2, this.f29739b);
        }
        if (this.f29740c != null) {
            nyu.m37182b(3, this.f29740c);
        }
        super.a(nyu);
    }

    protected int m34758b() {
        int b = super.b();
        if (this.f29738a != null) {
            b += nyu.m37145d(1, this.f29738a);
        }
        if (this.f29739b != null) {
            b += nyu.m37145d(2, this.f29739b);
        }
        if (this.f29740c != null) {
            return b + nyu.m37145d(3, this.f29740c);
        }
        return b;
    }

    private nfx m34754b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29738a == null) {
                        this.f29738a = new njh();
                    }
                    nyt.m37101a(this.f29738a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29739b == null) {
                        this.f29739b = new nin();
                    }
                    nyt.m37101a(this.f29739b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29740c == null) {
                        this.f29740c = new njd();
                    }
                    nyt.m37101a(this.f29740c);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
