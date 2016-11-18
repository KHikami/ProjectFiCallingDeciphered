package p000;

public final class kqy extends nyx<kqy> {
    public Boolean f22829a;
    public Boolean f22830b;
    public Boolean f22831c;
    public Boolean f22832d;
    public Boolean f22833e;
    public Boolean f22834f;
    public Boolean f22835g;
    public Boolean f22836h;
    public Boolean f22837i;
    public Boolean f22838j;
    public Boolean f22839k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27131b(nyt);
    }

    public kqy() {
        m27132d();
    }

    private kqy m27132d() {
        this.f22829a = null;
        this.f22830b = null;
        this.f22831c = null;
        this.f22832d = null;
        this.f22833e = null;
        this.f22834f = null;
        this.f22835g = null;
        this.f22836h = null;
        this.f22837i = null;
        this.f22838j = null;
        this.f22839k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22829a != null) {
            nyu.a(1, this.f22829a.booleanValue());
        }
        if (this.f22830b != null) {
            nyu.a(2, this.f22830b.booleanValue());
        }
        if (this.f22831c != null) {
            nyu.a(3, this.f22831c.booleanValue());
        }
        if (this.f22832d != null) {
            nyu.a(5, this.f22832d.booleanValue());
        }
        if (this.f22833e != null) {
            nyu.a(6, this.f22833e.booleanValue());
        }
        if (this.f22834f != null) {
            nyu.a(7, this.f22834f.booleanValue());
        }
        if (this.f22835g != null) {
            nyu.a(8, this.f22835g.booleanValue());
        }
        if (this.f22836h != null) {
            nyu.a(9, this.f22836h.booleanValue());
        }
        if (this.f22837i != null) {
            nyu.a(10, this.f22837i.booleanValue());
        }
        if (this.f22838j != null) {
            nyu.a(11, this.f22838j.booleanValue());
        }
        if (this.f22839k != null) {
            nyu.a(12, this.f22839k.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22829a != null) {
            this.f22829a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22830b != null) {
            this.f22830b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22831c != null) {
            this.f22831c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22832d != null) {
            this.f22832d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f22833e != null) {
            this.f22833e.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f22834f != null) {
            this.f22834f.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f22835g != null) {
            this.f22835g.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f22836h != null) {
            this.f22836h.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f22837i != null) {
            this.f22837i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.f22838j != null) {
            this.f22838j.booleanValue();
            b += nyu.h(11) + 1;
        }
        if (this.f22839k == null) {
            return b;
        }
        this.f22839k.booleanValue();
        return b + (nyu.h(12) + 1);
    }

    private kqy m27131b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22829a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f22830b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f22831c = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f22832d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f22833e = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f22834f = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f22835g = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.f22836h = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f22837i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.f22838j = Boolean.valueOf(nyt.i());
                    continue;
                case 96:
                    this.f22839k = Boolean.valueOf(nyt.i());
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
