package defpackage;

public final class kxm extends nyx<kxm> {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kxm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.f = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.e);
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            nyu.a(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.e);
        }
        if (this.f != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(6, this.f);
        }
        return b;
    }

    private kxm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f = a;
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
