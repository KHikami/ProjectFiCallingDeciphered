package p000;

public final class koq extends nyx<koq> {
    public nuq f22566a;
    public String f22567b;
    public Boolean f22568c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26821b(nyt);
    }

    public koq() {
        this.f22567b = null;
        this.f22568c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22566a != null) {
            nyu.b(1, this.f22566a);
        }
        if (this.f22567b != null) {
            nyu.a(2, this.f22567b);
        }
        if (this.f22568c != null) {
            nyu.a(3, this.f22568c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22566a != null) {
            b += nyu.d(1, this.f22566a);
        }
        if (this.f22567b != null) {
            b += nyu.b(2, this.f22567b);
        }
        if (this.f22568c == null) {
            return b;
        }
        this.f22568c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private koq m26821b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22566a == null) {
                        this.f22566a = new nuq();
                    }
                    nyt.a(this.f22566a);
                    continue;
                case wi.dH /*18*/:
                    this.f22567b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22568c = Boolean.valueOf(nyt.i());
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
