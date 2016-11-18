package p000;

public final class opg extends nyx<opg> {
    public String f33546a;
    public String f33547b;

    public /* synthetic */ nzf m39029a(nyt nyt) {
        return m39027b(nyt);
    }

    public opg() {
        m39028d();
    }

    private opg m39028d() {
        this.f33546a = null;
        this.f33547b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39030a(nyu nyu) {
        if (this.f33546a != null) {
            nyu.m37170a(1, this.f33546a);
        }
        if (this.f33547b != null) {
            nyu.m37170a(2, this.f33547b);
        }
        super.a(nyu);
    }

    protected int m39031b() {
        int b = super.b();
        if (this.f33546a != null) {
            b += nyu.m37137b(1, this.f33546a);
        }
        if (this.f33547b != null) {
            return b + nyu.m37137b(2, this.f33547b);
        }
        return b;
    }

    private opg m39027b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33546a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33547b = nyt.m37117j();
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
