package p000;

public final class kmf extends nyx<kmf> {
    public kmi f22351a;
    public kmg f22352b;
    public kmh f22353c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26517b(nyt);
    }

    public kmf() {
        m26518d();
    }

    private kmf m26518d() {
        this.f22351a = null;
        this.f22352b = null;
        this.f22353c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22351a != null) {
            nyu.b(1, this.f22351a);
        }
        if (this.f22352b != null) {
            nyu.b(2, this.f22352b);
        }
        if (this.f22353c != null) {
            nyu.b(3, this.f22353c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22351a != null) {
            b += nyu.d(1, this.f22351a);
        }
        if (this.f22352b != null) {
            b += nyu.d(2, this.f22352b);
        }
        if (this.f22353c != null) {
            return b + nyu.d(3, this.f22353c);
        }
        return b;
    }

    private kmf m26517b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22351a == null) {
                        this.f22351a = new kmi();
                    }
                    nyt.a(this.f22351a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22352b == null) {
                        this.f22352b = new kmg();
                    }
                    nyt.a(this.f22352b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22353c == null) {
                        this.f22353c = new kmh();
                    }
                    nyt.a(this.f22353c);
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
