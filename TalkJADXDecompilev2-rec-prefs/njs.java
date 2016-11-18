package p000;

public final class njs extends nyx<njs> {
    public String f30007a;
    public njt f30008b;
    public nju f30009c;

    public /* synthetic */ nzf m35274a(nyt nyt) {
        return m35272b(nyt);
    }

    public njs() {
        m35273d();
    }

    private njs m35273d() {
        this.f30007a = null;
        this.f30008b = null;
        this.f30009c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35275a(nyu nyu) {
        if (this.f30007a != null) {
            nyu.m37170a(1, this.f30007a);
        }
        if (this.f30008b != null) {
            nyu.m37182b(2, this.f30008b);
        }
        if (this.f30009c != null) {
            nyu.m37182b(3, this.f30009c);
        }
        super.a(nyu);
    }

    protected int m35276b() {
        int b = super.b();
        if (this.f30007a != null) {
            b += nyu.m37137b(1, this.f30007a);
        }
        if (this.f30008b != null) {
            b += nyu.m37145d(2, this.f30008b);
        }
        if (this.f30009c != null) {
            return b + nyu.m37145d(3, this.f30009c);
        }
        return b;
    }

    private njs m35272b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30007a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30008b == null) {
                        this.f30008b = new njt();
                    }
                    nyt.m37101a(this.f30008b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30009c == null) {
                        this.f30009c = new nju();
                    }
                    nyt.m37101a(this.f30009c);
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
