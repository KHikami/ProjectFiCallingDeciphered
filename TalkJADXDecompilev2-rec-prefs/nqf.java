package p000;

public final class nqf extends nyx<nqf> {
    public nsu f30484a;
    public ncp f30485b;
    public ncp f30486c;
    public ncp f30487d;

    public /* synthetic */ nzf m36134a(nyt nyt) {
        return m36133b(nyt);
    }

    public nqf() {
        this.cachedSize = -1;
    }

    public void m36135a(nyu nyu) {
        if (this.f30484a != null) {
            nyu.m37182b(1, this.f30484a);
        }
        if (this.f30485b != null) {
            nyu.m37182b(2, this.f30485b);
        }
        if (this.f30486c != null) {
            nyu.m37182b(3, this.f30486c);
        }
        if (this.f30487d != null) {
            nyu.m37182b(4, this.f30487d);
        }
        super.a(nyu);
    }

    protected int m36136b() {
        int b = super.b();
        if (this.f30484a != null) {
            b += nyu.m37145d(1, this.f30484a);
        }
        if (this.f30485b != null) {
            b += nyu.m37145d(2, this.f30485b);
        }
        if (this.f30486c != null) {
            b += nyu.m37145d(3, this.f30486c);
        }
        if (this.f30487d != null) {
            return b + nyu.m37145d(4, this.f30487d);
        }
        return b;
    }

    private nqf m36133b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30484a == null) {
                        this.f30484a = new nsu();
                    }
                    nyt.m37101a(this.f30484a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30485b == null) {
                        this.f30485b = new ncp();
                    }
                    nyt.m37101a(this.f30485b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30486c == null) {
                        this.f30486c = new ncp();
                    }
                    nyt.m37101a(this.f30486c);
                    continue;
                case 34:
                    if (this.f30487d == null) {
                        this.f30487d = new ncp();
                    }
                    nyt.m37101a(this.f30487d);
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
