package p000;

public final class kmn extends nyx<kmn> {
    public kmo f22373a;
    public kmq f22374b;
    public String f22375c;
    public String f22376d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26557b(nyt);
    }

    public kmn() {
        m26558d();
    }

    private kmn m26558d() {
        this.f22373a = null;
        this.f22374b = null;
        this.f22375c = null;
        this.f22376d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22373a != null) {
            nyu.b(1, this.f22373a);
        }
        if (this.f22374b != null) {
            nyu.b(2, this.f22374b);
        }
        if (this.f22375c != null) {
            nyu.a(3, this.f22375c);
        }
        if (this.f22376d != null) {
            nyu.a(4, this.f22376d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22373a != null) {
            b += nyu.d(1, this.f22373a);
        }
        if (this.f22374b != null) {
            b += nyu.d(2, this.f22374b);
        }
        if (this.f22375c != null) {
            b += nyu.b(3, this.f22375c);
        }
        if (this.f22376d != null) {
            return b + nyu.b(4, this.f22376d);
        }
        return b;
    }

    private kmn m26557b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22373a == null) {
                        this.f22373a = new kmo();
                    }
                    nyt.a(this.f22373a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22374b == null) {
                        this.f22374b = new kmq();
                    }
                    nyt.a(this.f22374b);
                    continue;
                case wi.dx /*26*/:
                    this.f22375c = nyt.j();
                    continue;
                case 34:
                    this.f22376d = nyt.j();
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
