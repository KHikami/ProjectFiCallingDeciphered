package p000;

public final class ncn extends nyx<ncn> {
    public ncl f29508a;
    public nci f29509b;
    public nqf f29510c;

    public /* synthetic */ nzf m34326a(nyt nyt) {
        return m34325b(nyt);
    }

    public ncn() {
        this.cachedSize = -1;
    }

    public void m34327a(nyu nyu) {
        if (this.f29508a != null) {
            nyu.m37182b(1, this.f29508a);
        }
        if (this.f29509b != null) {
            nyu.m37182b(2, this.f29509b);
        }
        if (this.f29510c != null) {
            nyu.m37182b(3, this.f29510c);
        }
        super.a(nyu);
    }

    protected int m34328b() {
        int b = super.b();
        if (this.f29508a != null) {
            b += nyu.m37145d(1, this.f29508a);
        }
        if (this.f29509b != null) {
            b += nyu.m37145d(2, this.f29509b);
        }
        if (this.f29510c != null) {
            return b + nyu.m37145d(3, this.f29510c);
        }
        return b;
    }

    private ncn m34325b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29508a == null) {
                        this.f29508a = new ncl();
                    }
                    nyt.m37101a(this.f29508a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29509b == null) {
                        this.f29509b = new nci();
                    }
                    nyt.m37101a(this.f29509b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29510c == null) {
                        this.f29510c = new nqf();
                    }
                    nyt.m37101a(this.f29510c);
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
