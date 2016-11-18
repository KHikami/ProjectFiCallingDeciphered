package p000;

public final class ntp extends nyx<ntp> {
    public String f30765a;
    public String f30766b;
    public String f30767c;
    public Double f30768d;
    public Double f30769e;

    public /* synthetic */ nzf m36502a(nyt nyt) {
        return m36501b(nyt);
    }

    public ntp() {
        this.f30765a = null;
        this.f30766b = null;
        this.f30767c = null;
        this.f30768d = null;
        this.f30769e = null;
        this.cachedSize = -1;
    }

    public void m36503a(nyu nyu) {
        if (this.f30765a != null) {
            nyu.m37170a(1, this.f30765a);
        }
        if (this.f30766b != null) {
            nyu.m37170a(2, this.f30766b);
        }
        if (this.f30767c != null) {
            nyu.m37170a(3, this.f30767c);
        }
        if (this.f30768d != null) {
            nyu.m37166a(4, this.f30768d.doubleValue());
        }
        if (this.f30769e != null) {
            nyu.m37166a(5, this.f30769e.doubleValue());
        }
        super.a(nyu);
    }

    protected int m36504b() {
        int b = super.b();
        if (this.f30765a != null) {
            b += nyu.m37137b(1, this.f30765a);
        }
        if (this.f30766b != null) {
            b += nyu.m37137b(2, this.f30766b);
        }
        if (this.f30767c != null) {
            b += nyu.m37137b(3, this.f30767c);
        }
        if (this.f30768d != null) {
            this.f30768d.doubleValue();
            b += nyu.m37154h(4) + 8;
        }
        if (this.f30769e == null) {
            return b;
        }
        this.f30769e.doubleValue();
        return b + (nyu.m37154h(5) + 8);
    }

    private ntp m36501b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30765a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30766b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f30767c = nyt.m37117j();
                    continue;
                case 33:
                    this.f30768d = Double.valueOf(nyt.m37104b());
                    continue;
                case 41:
                    this.f30769e = Double.valueOf(nyt.m37104b());
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
