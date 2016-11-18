package defpackage;

public final class ogm extends nyx<ogm> {
    public static final nyy<Object, ogm> a = nyy.a(11, ogm.class, 375452826);
    private static final ogm[] d = new ogm[0];
    public int b;
    public ogj c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ogm() {
        this.b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.b);
        }
        if (this.c != null) {
            return b + nyu.d(2, this.c);
        }
        return b;
    }

    private ogm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new ogj();
                    }
                    nyt.a(this.c);
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
