package p000;

public final class kpk extends nyx<kpk> {
    public kpd f22651a;
    public kpd f22652b;
    public Boolean f22653c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26919b(nyt);
    }

    public kpk() {
        m26920d();
    }

    private kpk m26920d() {
        this.f22651a = null;
        this.f22652b = null;
        this.f22653c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22651a != null) {
            nyu.b(1, this.f22651a);
        }
        if (this.f22652b != null) {
            nyu.b(2, this.f22652b);
        }
        if (this.f22653c != null) {
            nyu.a(3, this.f22653c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22651a != null) {
            b += nyu.d(1, this.f22651a);
        }
        if (this.f22652b != null) {
            b += nyu.d(2, this.f22652b);
        }
        if (this.f22653c == null) {
            return b;
        }
        this.f22653c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kpk m26919b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22651a == null) {
                        this.f22651a = new kpd();
                    }
                    nyt.a(this.f22651a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22652b == null) {
                        this.f22652b = new kpd();
                    }
                    nyt.a(this.f22652b);
                    continue;
                case wi.dA /*24*/:
                    this.f22653c = Boolean.valueOf(nyt.i());
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
