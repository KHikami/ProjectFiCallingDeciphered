package p000;

public final class nma extends nyx<nma> {
    public nlz f30197a;
    public nlz f30198b;

    public /* synthetic */ nzf m35590a(nyt nyt) {
        return m35588b(nyt);
    }

    public nma() {
        m35589d();
    }

    private nma m35589d() {
        this.f30197a = null;
        this.f30198b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35591a(nyu nyu) {
        if (this.f30197a != null) {
            nyu.m37182b(1, this.f30197a);
        }
        if (this.f30198b != null) {
            nyu.m37182b(2, this.f30198b);
        }
        super.a(nyu);
    }

    protected int m35592b() {
        int b = super.b();
        if (this.f30197a != null) {
            b += nyu.m37145d(1, this.f30197a);
        }
        if (this.f30198b != null) {
            return b + nyu.m37145d(2, this.f30198b);
        }
        return b;
    }

    private nma m35588b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30197a == null) {
                        this.f30197a = new nlz();
                    }
                    nyt.m37101a(this.f30197a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30198b == null) {
                        this.f30198b = new nlz();
                    }
                    nyt.m37101a(this.f30198b);
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
