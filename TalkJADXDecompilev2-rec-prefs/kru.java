package p000;

public final class kru extends nyx<kru> {
    private static volatile kru[] f22933d;
    public int f22934a;
    public String f22935b;
    public String f22936c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27245b(nyt);
    }

    public static kru[] m27246d() {
        if (f22933d == null) {
            synchronized (nzc.c) {
                if (f22933d == null) {
                    f22933d = new kru[0];
                }
            }
        }
        return f22933d;
    }

    public kru() {
        this.f22934a = nzf.UNSET_ENUM_VALUE;
        this.f22935b = null;
        this.f22936c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22934a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f22934a);
        }
        if (this.f22935b != null) {
            nyu.a(2, this.f22935b);
        }
        if (this.f22936c != null) {
            nyu.a(3, this.f22936c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22934a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f22934a);
        }
        if (this.f22935b != null) {
            b += nyu.b(2, this.f22935b);
        }
        if (this.f22936c != null) {
            return b + nyu.b(3, this.f22936c);
        }
        return b;
    }

    private kru m27245b(nyt nyt) {
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
                            this.f22934a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22935b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22936c = nyt.j();
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
