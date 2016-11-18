package p000;

public final class lac extends nyx<lac> {
    public String f24334a;
    public String f24335b;
    public String f24336c;
    public Boolean f24337d;
    public Boolean f24338e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28328b(nyt);
    }

    public lac() {
        this.f24334a = null;
        this.f24335b = null;
        this.f24336c = null;
        this.f24337d = null;
        this.f24338e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24334a != null) {
            nyu.a(1, this.f24334a);
        }
        if (this.f24335b != null) {
            nyu.a(2, this.f24335b);
        }
        if (this.f24336c != null) {
            nyu.a(3, this.f24336c);
        }
        if (this.f24337d != null) {
            nyu.a(5, this.f24337d.booleanValue());
        }
        if (this.f24338e != null) {
            nyu.a(6, this.f24338e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24334a != null) {
            b += nyu.b(1, this.f24334a);
        }
        if (this.f24335b != null) {
            b += nyu.b(2, this.f24335b);
        }
        if (this.f24336c != null) {
            b += nyu.b(3, this.f24336c);
        }
        if (this.f24337d != null) {
            this.f24337d.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24338e == null) {
            return b;
        }
        this.f24338e.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lac m28328b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24334a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24335b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24336c = nyt.j();
                    continue;
                case 40:
                    this.f24337d = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f24338e = Boolean.valueOf(nyt.i());
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
