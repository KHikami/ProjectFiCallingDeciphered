package p000;

public final class nor extends nyx<nor> {
    public non f30393a;
    public String f30394b;

    public /* synthetic */ nzf m35942a(nyt nyt) {
        return m35941b(nyt);
    }

    public nor() {
        this.f30394b = null;
        this.cachedSize = -1;
    }

    public void m35943a(nyu nyu) {
        if (this.f30393a != null) {
            nyu.m37182b(1, this.f30393a);
        }
        if (this.f30394b != null) {
            nyu.m37170a(2, this.f30394b);
        }
        super.a(nyu);
    }

    protected int m35944b() {
        int b = super.b();
        if (this.f30393a != null) {
            b += nyu.m37145d(1, this.f30393a);
        }
        if (this.f30394b != null) {
            return b + nyu.m37137b(2, this.f30394b);
        }
        return b;
    }

    private nor m35941b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30393a == null) {
                        this.f30393a = new non();
                    }
                    nyt.m37101a(this.f30393a);
                    continue;
                case wi.dH /*18*/:
                    this.f30394b = nyt.m37117j();
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
