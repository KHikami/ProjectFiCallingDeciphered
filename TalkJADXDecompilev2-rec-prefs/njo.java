package p000;

public final class njo extends nyx<njo> {
    public String f30000a;
    public String f30001b;

    public /* synthetic */ nzf m35254a(nyt nyt) {
        return m35252b(nyt);
    }

    public njo() {
        m35253d();
    }

    private njo m35253d() {
        this.f30000a = null;
        this.f30001b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35255a(nyu nyu) {
        if (this.f30000a != null) {
            nyu.m37170a(1, this.f30000a);
        }
        if (this.f30001b != null) {
            nyu.m37170a(2, this.f30001b);
        }
        super.a(nyu);
    }

    protected int m35256b() {
        int b = super.b();
        if (this.f30000a != null) {
            b += nyu.m37137b(1, this.f30000a);
        }
        if (this.f30001b != null) {
            return b + nyu.m37137b(2, this.f30001b);
        }
        return b;
    }

    private njo m35252b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30000a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30001b = nyt.m37117j();
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
