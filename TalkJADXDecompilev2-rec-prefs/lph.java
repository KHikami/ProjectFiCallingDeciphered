package p000;

public final class lph extends nyx<lph> {
    public lor f25997a;
    public lpg f25998b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29890b(nyt);
    }

    public lph() {
        m29891d();
    }

    private lph m29891d() {
        this.f25997a = null;
        this.f25998b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25997a != null) {
            nyu.b(1, this.f25997a);
        }
        if (this.f25998b != null) {
            nyu.b(2, this.f25998b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25997a != null) {
            b += nyu.d(1, this.f25997a);
        }
        if (this.f25998b != null) {
            return b + nyu.d(2, this.f25998b);
        }
        return b;
    }

    private lph m29890b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25997a == null) {
                        this.f25997a = new lor();
                    }
                    nyt.a(this.f25997a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25998b == null) {
                        this.f25998b = new lpg();
                    }
                    nyt.a(this.f25998b);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
