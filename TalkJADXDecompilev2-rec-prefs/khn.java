package p000;

public final class khn extends nyx<khn> {
    private static volatile khn[] f21768b;
    public int f21769a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25863b(nyt);
    }

    public static khn[] m25864d() {
        if (f21768b == null) {
            synchronized (nzc.c) {
                if (f21768b == null) {
                    f21768b = new khn[0];
                }
            }
        }
        return f21768b;
    }

    public khn() {
        this.f21769a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21769a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f21769a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21769a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.f21769a);
        }
        return b;
    }

    private khn m25863b(nyt nyt) {
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
                        case 16:
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
                        case 27:
                            this.f21769a = a;
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
