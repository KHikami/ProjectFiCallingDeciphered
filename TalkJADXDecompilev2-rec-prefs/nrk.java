package p000;

public final class nrk extends nyx<nrk> {
    public Boolean f30592a;
    public nsk f30593b;
    public ntr f30594c;
    public ndj f30595d;
    public nct f30596e;

    public /* synthetic */ nzf m36263a(nyt nyt) {
        return m36262b(nyt);
    }

    public nrk() {
        this.f30592a = null;
        this.cachedSize = -1;
    }

    public void m36264a(nyu nyu) {
        if (this.f30592a != null) {
            nyu.m37172a(1, this.f30592a.booleanValue());
        }
        if (this.f30593b != null) {
            nyu.m37182b(2, this.f30593b);
        }
        if (this.f30594c != null) {
            nyu.m37182b(3, this.f30594c);
        }
        if (this.f30595d != null) {
            nyu.m37182b(4, this.f30595d);
        }
        if (this.f30596e != null) {
            nyu.m37182b(5, this.f30596e);
        }
        super.a(nyu);
    }

    protected int m36265b() {
        int b = super.b();
        if (this.f30592a != null) {
            this.f30592a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30593b != null) {
            b += nyu.m37145d(2, this.f30593b);
        }
        if (this.f30594c != null) {
            b += nyu.m37145d(3, this.f30594c);
        }
        if (this.f30595d != null) {
            b += nyu.m37145d(4, this.f30595d);
        }
        if (this.f30596e != null) {
            return b + nyu.m37145d(5, this.f30596e);
        }
        return b;
    }

    private nrk m36262b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30592a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30593b == null) {
                        this.f30593b = new nsk();
                    }
                    nyt.m37101a(this.f30593b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30594c == null) {
                        this.f30594c = new ntr();
                    }
                    nyt.m37101a(this.f30594c);
                    continue;
                case 34:
                    if (this.f30595d == null) {
                        this.f30595d = new ndj();
                    }
                    nyt.m37101a(this.f30595d);
                    continue;
                case 42:
                    if (this.f30596e == null) {
                        this.f30596e = new nct();
                    }
                    nyt.m37101a(this.f30596e);
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
