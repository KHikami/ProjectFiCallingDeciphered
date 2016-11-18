package p000;

public final class num extends nyx<num> {
    public String f30897a;
    public String f30898b;
    public String f30899c;
    public String f30900d;

    public /* synthetic */ nzf m36611a(nyt nyt) {
        return m36609b(nyt);
    }

    public num() {
        m36610d();
    }

    private num m36610d() {
        this.f30897a = null;
        this.f30898b = null;
        this.f30899c = null;
        this.f30900d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36612a(nyu nyu) {
        if (this.f30897a != null) {
            nyu.m37170a(1, this.f30897a);
        }
        if (this.f30898b != null) {
            nyu.m37170a(2, this.f30898b);
        }
        if (this.f30899c != null) {
            nyu.m37170a(3, this.f30899c);
        }
        if (this.f30900d != null) {
            nyu.m37170a(4, this.f30900d);
        }
        super.a(nyu);
    }

    protected int m36613b() {
        int b = super.b();
        if (this.f30897a != null) {
            b += nyu.m37137b(1, this.f30897a);
        }
        if (this.f30898b != null) {
            b += nyu.m37137b(2, this.f30898b);
        }
        if (this.f30899c != null) {
            b += nyu.m37137b(3, this.f30899c);
        }
        if (this.f30900d != null) {
            return b + nyu.m37137b(4, this.f30900d);
        }
        return b;
    }

    private num m36609b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30897a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30898b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f30899c = nyt.m37117j();
                    continue;
                case 34:
                    this.f30900d = nyt.m37117j();
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
