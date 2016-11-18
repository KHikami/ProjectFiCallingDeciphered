package p000;

public final class ogm extends nyx<ogm> {
    public static final nyy<Object, ogm> f32730a = nyy.m37203a(11, ogm.class, 375452826);
    private static final ogm[] f32731d = new ogm[0];
    public int f32732b;
    public ogj f32733c;

    public /* synthetic */ nzf m38206a(nyt nyt) {
        return m38205b(nyt);
    }

    public ogm() {
        this.f32732b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38207a(nyu nyu) {
        if (this.f32732b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32732b);
        }
        if (this.f32733c != null) {
            nyu.m37182b(2, this.f32733c);
        }
        super.a(nyu);
    }

    protected int m38208b() {
        int b = super.b();
        if (this.f32732b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32732b);
        }
        if (this.f32733c != null) {
            return b + nyu.m37145d(2, this.f32733c);
        }
        return b;
    }

    private ogm m38205b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f32732b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f32733c == null) {
                        this.f32733c = new ogj();
                    }
                    nyt.m37101a(this.f32733c);
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
