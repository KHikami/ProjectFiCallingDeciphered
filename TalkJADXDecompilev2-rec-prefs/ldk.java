package p000;

public final class ldk extends nyx<ldk> {
    public static final nyy<Object, ldk> f24674a = nyy.a(11, ldk.class, 158821898);
    private static final ldk[] f24675f = new ldk[0];
    public int f24676b;
    public String f24677c;
    public lay f24678d;
    public int f24679e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28745b(nyt);
    }

    public ldk() {
        this.f24676b = nzf.UNSET_ENUM_VALUE;
        this.f24677c = null;
        this.f24679e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24676b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f24676b);
        }
        if (this.f24677c != null) {
            nyu.a(2, this.f24677c);
        }
        if (this.f24678d != null) {
            nyu.b(3, this.f24678d);
        }
        if (this.f24679e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.f24679e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24676b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f24676b);
        }
        if (this.f24677c != null) {
            b += nyu.b(2, this.f24677c);
        }
        if (this.f24678d != null) {
            b += nyu.d(3, this.f24678d);
        }
        if (this.f24679e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(4, this.f24679e);
        }
        return b;
    }

    private ldk m28745b(nyt nyt) {
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
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.f24676b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f24677c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24678d == null) {
                        this.f24678d = new lay();
                    }
                    nyt.a(this.f24678d);
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
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                            this.f24679e = a;
                            break;
                        default:
                            continue;
                    }
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
