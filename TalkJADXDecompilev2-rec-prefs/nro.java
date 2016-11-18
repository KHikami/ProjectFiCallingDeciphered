package p000;

public final class nro extends nyx<nro> {
    public nrn f30606a;
    public nrr f30607b;
    public nrt f30608c;
    public nrn f30609d;

    public /* synthetic */ nzf m36280a(nyt nyt) {
        return m36279b(nyt);
    }

    public nro() {
        this.cachedSize = -1;
    }

    public void m36281a(nyu nyu) {
        if (this.f30606a != null) {
            nyu.m37182b(1, this.f30606a);
        }
        if (this.f30607b != null) {
            nyu.m37182b(2, this.f30607b);
        }
        if (this.f30608c != null) {
            nyu.m37182b(3, this.f30608c);
        }
        if (this.f30609d != null) {
            nyu.m37182b(4, this.f30609d);
        }
        super.a(nyu);
    }

    protected int m36282b() {
        int b = super.b();
        if (this.f30606a != null) {
            b += nyu.m37145d(1, this.f30606a);
        }
        if (this.f30607b != null) {
            b += nyu.m37145d(2, this.f30607b);
        }
        if (this.f30608c != null) {
            b += nyu.m37145d(3, this.f30608c);
        }
        if (this.f30609d != null) {
            return b + nyu.m37145d(4, this.f30609d);
        }
        return b;
    }

    private nro m36279b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30606a == null) {
                        this.f30606a = new nrn();
                    }
                    nyt.m37101a(this.f30606a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30607b == null) {
                        this.f30607b = new nrr();
                    }
                    nyt.m37101a(this.f30607b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30608c == null) {
                        this.f30608c = new nrt();
                    }
                    nyt.m37101a(this.f30608c);
                    continue;
                case 34:
                    if (this.f30609d == null) {
                        this.f30609d = new nrn();
                    }
                    nyt.m37101a(this.f30609d);
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
