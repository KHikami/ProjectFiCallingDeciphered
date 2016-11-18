package p000;

public final class muo extends nyx<muo> {
    public mur f28390a;
    public muq f28391b;
    public muq f28392c;
    public mup f28393d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32978b(nyt);
    }

    public muo() {
        m32979d();
    }

    private muo m32979d() {
        this.f28390a = null;
        this.f28391b = null;
        this.f28392c = null;
        this.f28393d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28390a != null) {
            nyu.b(1, this.f28390a);
        }
        if (this.f28391b != null) {
            nyu.b(2, this.f28391b);
        }
        if (this.f28392c != null) {
            nyu.b(3, this.f28392c);
        }
        if (this.f28393d != null) {
            nyu.b(4, this.f28393d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28390a != null) {
            b += nyu.d(1, this.f28390a);
        }
        if (this.f28391b != null) {
            b += nyu.d(2, this.f28391b);
        }
        if (this.f28392c != null) {
            b += nyu.d(3, this.f28392c);
        }
        if (this.f28393d != null) {
            return b + nyu.d(4, this.f28393d);
        }
        return b;
    }

    private muo m32978b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28390a == null) {
                        this.f28390a = new mur();
                    }
                    nyt.a(this.f28390a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f28391b == null) {
                        this.f28391b = new muq();
                    }
                    nyt.a(this.f28391b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28392c == null) {
                        this.f28392c = new muq();
                    }
                    nyt.a(this.f28392c);
                    continue;
                case 34:
                    if (this.f28393d == null) {
                        this.f28393d = new mup();
                    }
                    nyt.a(this.f28393d);
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
