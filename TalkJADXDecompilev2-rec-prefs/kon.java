package p000;

public final class kon extends nyx<kon> {
    public String f22535a;
    public String f22536b;
    public koo f22537c;
    public String f22538d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26806b(nyt);
    }

    public kon() {
        m26807d();
    }

    private kon m26807d() {
        this.f22535a = null;
        this.f22536b = null;
        this.f22537c = null;
        this.f22538d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22535a != null) {
            nyu.a(1, this.f22535a);
        }
        if (this.f22536b != null) {
            nyu.a(2, this.f22536b);
        }
        if (this.f22537c != null) {
            nyu.b(3, this.f22537c);
        }
        if (this.f22538d != null) {
            nyu.a(4, this.f22538d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22535a != null) {
            b += nyu.b(1, this.f22535a);
        }
        if (this.f22536b != null) {
            b += nyu.b(2, this.f22536b);
        }
        if (this.f22537c != null) {
            b += nyu.d(3, this.f22537c);
        }
        if (this.f22538d != null) {
            return b + nyu.b(4, this.f22538d);
        }
        return b;
    }

    private kon m26806b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22535a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22536b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f22537c == null) {
                        this.f22537c = new koo();
                    }
                    nyt.a(this.f22537c);
                    continue;
                case 34:
                    this.f22538d = nyt.j();
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
