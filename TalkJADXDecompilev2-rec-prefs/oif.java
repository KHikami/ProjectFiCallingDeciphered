package p000;

public final class oif extends nyx<oif> {
    public String f32967a;
    public String f32968b;

    public /* synthetic */ nzf m38464a(nyt nyt) {
        return m38462b(nyt);
    }

    public oif() {
        m38463d();
    }

    private oif m38463d() {
        this.f32967a = null;
        this.f32968b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38465a(nyu nyu) {
        if (this.f32967a != null) {
            nyu.m37170a(1, this.f32967a);
        }
        if (this.f32968b != null) {
            nyu.m37170a(2, this.f32968b);
        }
        super.a(nyu);
    }

    protected int m38466b() {
        int b = super.b();
        if (this.f32967a != null) {
            b += nyu.m37137b(1, this.f32967a);
        }
        if (this.f32968b != null) {
            return b + nyu.m37137b(2, this.f32968b);
        }
        return b;
    }

    private oif m38462b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32967a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32968b = nyt.m37117j();
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
