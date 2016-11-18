package p000;

public final class pbn extends nyx<pbn> {
    public Integer f34952a;
    public String f34953b;
    public pbo f34954c;

    public /* synthetic */ nzf m40207a(nyt nyt) {
        return m40206b(nyt);
    }

    public pbn() {
        this.f34952a = null;
        this.f34953b = null;
        this.cachedSize = -1;
    }

    public void m40208a(nyu nyu) {
        if (this.f34952a != null) {
            nyu.m37168a(1, this.f34952a.intValue());
        }
        if (this.f34953b != null) {
            nyu.m37170a(2, this.f34953b);
        }
        if (this.f34954c != null) {
            nyu.m37182b(3, this.f34954c);
        }
        super.a(nyu);
    }

    protected int m40209b() {
        int b = super.b();
        if (this.f34952a != null) {
            b += nyu.m37147f(1, this.f34952a.intValue());
        }
        if (this.f34953b != null) {
            b += nyu.m37137b(2, this.f34953b);
        }
        if (this.f34954c != null) {
            return b + nyu.m37145d(3, this.f34954c);
        }
        return b;
    }

    private pbn m40206b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34952a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    this.f34953b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f34954c == null) {
                        this.f34954c = new pbo();
                    }
                    nyt.m37101a(this.f34954c);
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
