package p000;

public final class kho extends nyx<kho> {
    public Boolean f21770a;
    public Boolean f21771b;
    public Boolean f21772c;
    public Boolean f21773d;
    public Boolean f21774e;
    public Boolean f21775f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25868b(nyt);
    }

    public kho() {
        this.f21770a = null;
        this.f21771b = null;
        this.f21772c = null;
        this.f21773d = null;
        this.f21774e = null;
        this.f21775f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21770a != null) {
            nyu.a(1, this.f21770a.booleanValue());
        }
        if (this.f21771b != null) {
            nyu.a(2, this.f21771b.booleanValue());
        }
        if (this.f21772c != null) {
            nyu.a(3, this.f21772c.booleanValue());
        }
        if (this.f21773d != null) {
            nyu.a(4, this.f21773d.booleanValue());
        }
        if (this.f21774e != null) {
            nyu.a(5, this.f21774e.booleanValue());
        }
        if (this.f21775f != null) {
            nyu.a(6, this.f21775f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21770a != null) {
            this.f21770a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f21771b != null) {
            this.f21771b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f21772c != null) {
            this.f21772c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f21773d != null) {
            this.f21773d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f21774e != null) {
            this.f21774e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f21775f == null) {
            return b;
        }
        this.f21775f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private kho m25868b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21770a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f21771b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f21772c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f21773d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f21774e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f21775f = Boolean.valueOf(nyt.i());
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
