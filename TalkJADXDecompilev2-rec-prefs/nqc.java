package p000;

public final class nqc extends nyx<nqc> {
    public String f30474a;
    public nqd f30475b;

    public /* synthetic */ nzf m36122a(nyt nyt) {
        return m36121b(nyt);
    }

    public nqc() {
        this.f30474a = null;
        this.cachedSize = -1;
    }

    public void m36123a(nyu nyu) {
        if (this.f30474a != null) {
            nyu.m37170a(1, this.f30474a);
        }
        if (this.f30475b != null) {
            nyu.m37182b(2, this.f30475b);
        }
        super.a(nyu);
    }

    protected int m36124b() {
        int b = super.b();
        if (this.f30474a != null) {
            b += nyu.m37137b(1, this.f30474a);
        }
        if (this.f30475b != null) {
            return b + nyu.m37145d(2, this.f30475b);
        }
        return b;
    }

    private nqc m36121b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30474a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30475b == null) {
                        this.f30475b = new nqd();
                    }
                    nyt.m37101a(this.f30475b);
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
