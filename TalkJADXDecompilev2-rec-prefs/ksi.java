package p000;

public final class ksi extends nyx<ksi> {
    public Double f23051a;
    public Double f23052b;
    public Double f23053c;
    public Double f23054d;
    public Double f23055e;
    public Boolean f23056f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27308b(nyt);
    }

    public ksi() {
        m27309d();
    }

    private ksi m27309d() {
        this.f23051a = null;
        this.f23052b = null;
        this.f23053c = null;
        this.f23054d = null;
        this.f23055e = null;
        this.f23056f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23051a.doubleValue());
        nyu.a(2, this.f23052b.doubleValue());
        if (this.f23053c != null) {
            nyu.a(3, this.f23053c.doubleValue());
        }
        if (this.f23054d != null) {
            nyu.a(4, this.f23054d.doubleValue());
        }
        if (this.f23055e != null) {
            nyu.a(5, this.f23055e.doubleValue());
        }
        if (this.f23056f != null) {
            nyu.a(6, this.f23056f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23051a.doubleValue();
        b += nyu.h(1) + 8;
        this.f23052b.doubleValue();
        b += nyu.h(2) + 8;
        if (this.f23053c != null) {
            this.f23053c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.f23054d != null) {
            this.f23054d.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.f23055e != null) {
            this.f23055e.doubleValue();
            b += nyu.h(5) + 8;
        }
        if (this.f23056f == null) {
            return b;
        }
        this.f23056f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private ksi m27308b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23051a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23052b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.f23053c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.f23054d = Double.valueOf(nyt.b());
                    continue;
                case 41:
                    this.f23055e = Double.valueOf(nyt.b());
                    continue;
                case 48:
                    this.f23056f = Boolean.valueOf(nyt.i());
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
