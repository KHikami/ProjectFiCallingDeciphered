package p000;

public final class koe extends nyx<koe> {
    public int f22479a;
    public int f22480b;
    public mwg f22481c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26770b(nyt);
    }

    public koe() {
        this.f22479a = nzf.UNSET_ENUM_VALUE;
        this.f22480b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22479a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f22479a);
        }
        if (this.f22480b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f22480b);
        }
        if (this.f22481c != null) {
            nyu.b(4, this.f22481c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22479a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f22479a);
        }
        if (this.f22480b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f22480b);
        }
        if (this.f22481c != null) {
            return b + nyu.d(4, this.f22481c);
        }
        return b;
    }

    private koe m26770b(nyt nyt) {
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
                            this.f22479a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f22480b = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f22481c == null) {
                        this.f22481c = new mwg();
                    }
                    nyt.a(this.f22481c);
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
