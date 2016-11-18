package p000;

public final class kou extends nyx<kou> {
    public Boolean f22578a;
    public Integer f22579b;
    public Integer f22580c;
    public String f22581d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26837b(nyt);
    }

    public kou() {
        this.f22578a = null;
        this.f22579b = null;
        this.f22580c = null;
        this.f22581d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22578a != null) {
            nyu.a(1, this.f22578a.booleanValue());
        }
        if (this.f22579b != null) {
            nyu.a(2, this.f22579b.intValue());
        }
        if (this.f22580c != null) {
            nyu.a(3, this.f22580c.intValue());
        }
        if (this.f22581d != null) {
            nyu.a(4, this.f22581d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22578a != null) {
            this.f22578a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22579b != null) {
            b += nyu.f(2, this.f22579b.intValue());
        }
        if (this.f22580c != null) {
            b += nyu.f(3, this.f22580c.intValue());
        }
        if (this.f22581d != null) {
            return b + nyu.b(4, this.f22581d);
        }
        return b;
    }

    private kou m26837b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22578a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f22579b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f22580c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f22581d = nyt.j();
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
