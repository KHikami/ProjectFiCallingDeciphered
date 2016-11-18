package p000;

public final class nmk extends nyx<nmk> {
    public Boolean f30242a;
    public nml f30243b;

    public /* synthetic */ nzf m35642a(nyt nyt) {
        return m35640b(nyt);
    }

    public nmk() {
        m35641d();
    }

    private nmk m35641d() {
        this.f30242a = null;
        this.f30243b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35643a(nyu nyu) {
        if (this.f30242a != null) {
            nyu.m37172a(1, this.f30242a.booleanValue());
        }
        if (this.f30243b != null) {
            nyu.m37182b(2, this.f30243b);
        }
        super.a(nyu);
    }

    protected int m35644b() {
        int b = super.b();
        if (this.f30242a != null) {
            this.f30242a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30243b != null) {
            return b + nyu.m37145d(2, this.f30243b);
        }
        return b;
    }

    private nmk m35640b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30242a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30243b == null) {
                        this.f30243b = new nml();
                    }
                    nyt.m37101a(this.f30243b);
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
