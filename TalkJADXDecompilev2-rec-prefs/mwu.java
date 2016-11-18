package p000;

public final class mwu extends nyx<mwu> {
    public mwx f28628a;
    public mww f28629b;
    public mwy f28630c;
    public mwv f28631d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33258b(nyt);
    }

    public mwu() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28628a != null) {
            nyu.b(1, this.f28628a);
        }
        if (this.f28629b != null) {
            nyu.b(2, this.f28629b);
        }
        if (this.f28630c != null) {
            nyu.b(3, this.f28630c);
        }
        if (this.f28631d != null) {
            nyu.b(4, this.f28631d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28628a != null) {
            b += nyu.d(1, this.f28628a);
        }
        if (this.f28629b != null) {
            b += nyu.d(2, this.f28629b);
        }
        if (this.f28630c != null) {
            b += nyu.d(3, this.f28630c);
        }
        if (this.f28631d != null) {
            return b + nyu.d(4, this.f28631d);
        }
        return b;
    }

    private mwu m33258b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28628a == null) {
                        this.f28628a = new mwx();
                    }
                    nyt.a(this.f28628a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f28629b == null) {
                        this.f28629b = new mww();
                    }
                    nyt.a(this.f28629b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28630c == null) {
                        this.f28630c = new mwy();
                    }
                    nyt.a(this.f28630c);
                    continue;
                case 34:
                    if (this.f28631d == null) {
                        this.f28631d = new mwv();
                    }
                    nyt.a(this.f28631d);
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
