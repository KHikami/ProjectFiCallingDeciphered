package p000;

public final class lae extends nyx<lae> {
    public String f24341a;
    public String f24342b;
    public Boolean f24343c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28336b(nyt);
    }

    public lae() {
        this.f24341a = null;
        this.f24342b = null;
        this.f24343c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24341a != null) {
            nyu.a(1, this.f24341a);
        }
        if (this.f24342b != null) {
            nyu.a(2, this.f24342b);
        }
        if (this.f24343c != null) {
            nyu.a(3, this.f24343c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24341a != null) {
            b += nyu.b(1, this.f24341a);
        }
        if (this.f24342b != null) {
            b += nyu.b(2, this.f24342b);
        }
        if (this.f24343c == null) {
            return b;
        }
        this.f24343c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private lae m28336b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24341a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24342b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24343c = Boolean.valueOf(nyt.i());
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
