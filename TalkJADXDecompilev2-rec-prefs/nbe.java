package p000;

public final class nbe extends nyx<nbe> {
    public String f29420a;
    public String f29421b;

    public /* synthetic */ nzf m34161a(nyt nyt) {
        return m34159b(nyt);
    }

    public nbe() {
        m34160d();
    }

    private nbe m34160d() {
        this.f29420a = null;
        this.f29421b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34162a(nyu nyu) {
        if (this.f29420a != null) {
            nyu.m37170a(1, this.f29420a);
        }
        if (this.f29421b != null) {
            nyu.m37170a(2, this.f29421b);
        }
        super.a(nyu);
    }

    protected int m34163b() {
        int b = super.b();
        if (this.f29420a != null) {
            b += nyu.m37137b(1, this.f29420a);
        }
        if (this.f29421b != null) {
            return b + nyu.m37137b(2, this.f29421b);
        }
        return b;
    }

    private nbe m34159b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29420a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29421b = nyt.m37117j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
