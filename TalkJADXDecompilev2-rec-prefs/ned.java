package p000;

public final class ned extends nyx<ned> {
    public nhj f29595a;
    public nec f29596b;
    public nec f29597c;
    public nec f29598d;

    public /* synthetic */ nzf m34522a(nyt nyt) {
        return m34520b(nyt);
    }

    public ned() {
        m34521d();
    }

    private ned m34521d() {
        this.f29595a = null;
        this.f29596b = null;
        this.f29597c = null;
        this.f29598d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34523a(nyu nyu) {
        if (this.f29595a != null) {
            nyu.m37182b(1, this.f29595a);
        }
        if (this.f29596b != null) {
            nyu.m37182b(2, this.f29596b);
        }
        if (this.f29597c != null) {
            nyu.m37182b(3, this.f29597c);
        }
        if (this.f29598d != null) {
            nyu.m37182b(4, this.f29598d);
        }
        super.a(nyu);
    }

    protected int m34524b() {
        int b = super.b();
        if (this.f29595a != null) {
            b += nyu.m37145d(1, this.f29595a);
        }
        if (this.f29596b != null) {
            b += nyu.m37145d(2, this.f29596b);
        }
        if (this.f29597c != null) {
            b += nyu.m37145d(3, this.f29597c);
        }
        if (this.f29598d != null) {
            return b + nyu.m37145d(4, this.f29598d);
        }
        return b;
    }

    private ned m34520b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29595a == null) {
                        this.f29595a = new nhj();
                    }
                    nyt.m37101a(this.f29595a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29596b == null) {
                        this.f29596b = new nec();
                    }
                    nyt.m37101a(this.f29596b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29597c == null) {
                        this.f29597c = new nec();
                    }
                    nyt.m37101a(this.f29597c);
                    continue;
                case 34:
                    if (this.f29598d == null) {
                        this.f29598d = new nec();
                    }
                    nyt.m37101a(this.f29598d);
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
