package defpackage;

public final class ldk extends nyx<ldk> {
    public static final nyy<Object, ldk> a = nyy.a(11, ldk.class, 158821898);
    private static final ldk[] f = new ldk[0];
    public int b;
    public String c;
    public lay d;
    public int e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ldk() {
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.b);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(4, this.e);
        }
        return b;
    }

    private ldk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new lay();
                    }
                    nyt.a(this.d);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
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
