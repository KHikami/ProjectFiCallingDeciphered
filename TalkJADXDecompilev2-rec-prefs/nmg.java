package p000;

public final class nmg extends nyx<nmg> {
    public Integer f30219a;
    public Integer f30220b;
    public String f30221c;
    public nmp f30222d;

    public /* synthetic */ nzf m35622a(nyt nyt) {
        return m35620b(nyt);
    }

    public nmg() {
        m35621d();
    }

    private nmg m35621d() {
        this.f30220b = null;
        this.f30221c = null;
        this.f30222d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35623a(nyu nyu) {
        if (this.f30220b != null) {
            nyu.m37168a(1, this.f30220b.intValue());
        }
        if (this.f30221c != null) {
            nyu.m37170a(2, this.f30221c);
        }
        if (this.f30219a != null) {
            nyu.m37168a(3, this.f30219a.intValue());
        }
        if (this.f30222d != null) {
            nyu.m37182b(4, this.f30222d);
        }
        super.a(nyu);
    }

    protected int m35624b() {
        int b = super.b();
        if (this.f30220b != null) {
            b += nyu.m37147f(1, this.f30220b.intValue());
        }
        if (this.f30221c != null) {
            b += nyu.m37137b(2, this.f30221c);
        }
        if (this.f30219a != null) {
            b += nyu.m37147f(3, this.f30219a.intValue());
        }
        if (this.f30222d != null) {
            return b + nyu.m37145d(4, this.f30222d);
        }
        return b;
    }

    private nmg m35620b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30220b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    this.f30221c = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30219a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f30222d == null) {
                        this.f30222d = new nmp();
                    }
                    nyt.m37101a(this.f30222d);
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
