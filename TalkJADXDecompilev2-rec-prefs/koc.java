package p000;

public final class koc extends nyx<koc> {
    public String f22474a;
    public String f22475b;
    public String f22476c;
    public String f22477d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26762b(nyt);
    }

    public koc() {
        this.f22474a = null;
        this.f22475b = null;
        this.f22476c = null;
        this.f22477d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22474a != null) {
            nyu.a(1, this.f22474a);
        }
        if (this.f22475b != null) {
            nyu.a(2, this.f22475b);
        }
        if (this.f22476c != null) {
            nyu.a(3, this.f22476c);
        }
        if (this.f22477d != null) {
            nyu.a(4, this.f22477d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22474a != null) {
            b += nyu.b(1, this.f22474a);
        }
        if (this.f22475b != null) {
            b += nyu.b(2, this.f22475b);
        }
        if (this.f22476c != null) {
            b += nyu.b(3, this.f22476c);
        }
        if (this.f22477d != null) {
            return b + nyu.b(4, this.f22477d);
        }
        return b;
    }

    private koc m26762b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22474a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22475b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22476c = nyt.j();
                    continue;
                case 34:
                    this.f22477d = nyt.j();
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
