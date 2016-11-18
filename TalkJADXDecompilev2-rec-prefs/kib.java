package p000;

public final class kib extends nyx<kib> {
    private static volatile kib[] f21814d;
    public int f21815a;
    public int f21816b;
    public String f21817c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25931b(nyt);
    }

    public static kib[] m25932d() {
        if (f21814d == null) {
            synchronized (nzc.c) {
                if (f21814d == null) {
                    f21814d = new kib[0];
                }
            }
        }
        return f21814d;
    }

    public kib() {
        this.f21815a = nzf.UNSET_ENUM_VALUE;
        this.f21816b = nzf.UNSET_ENUM_VALUE;
        this.f21817c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21815a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f21815a);
        }
        if (this.f21816b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f21816b);
        }
        if (this.f21817c != null) {
            nyu.a(3, this.f21817c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21815a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f21815a);
        }
        if (this.f21816b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f21816b);
        }
        if (this.f21817c != null) {
            return b + nyu.b(3, this.f21817c);
        }
        return b;
    }

    private kib m25931b(nyt nyt) {
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
                            this.f21815a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f21816b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f21817c = nyt.j();
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
