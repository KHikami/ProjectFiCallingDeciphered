package p000;

public final class noe extends nyx<noe> {
    public Boolean f30348a;
    public nog f30349b;
    public nof f30350c;

    public /* synthetic */ nzf m35879a(nyt nyt) {
        return m35877b(nyt);
    }

    public noe() {
        m35878d();
    }

    private noe m35878d() {
        this.f30348a = null;
        this.f30349b = null;
        this.f30350c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35880a(nyu nyu) {
        if (this.f30348a != null) {
            nyu.m37172a(1, this.f30348a.booleanValue());
        }
        if (this.f30349b != null) {
            nyu.m37182b(2, this.f30349b);
        }
        if (this.f30350c != null) {
            nyu.m37182b(3, this.f30350c);
        }
        super.a(nyu);
    }

    protected int m35881b() {
        int b = super.b();
        if (this.f30348a != null) {
            this.f30348a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30349b != null) {
            b += nyu.m37145d(2, this.f30349b);
        }
        if (this.f30350c != null) {
            return b + nyu.m37145d(3, this.f30350c);
        }
        return b;
    }

    private noe m35877b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30348a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30349b == null) {
                        this.f30349b = new nog();
                    }
                    nyt.m37101a(this.f30349b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30350c == null) {
                        this.f30350c = new nof();
                    }
                    nyt.m37101a(this.f30350c);
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
