package defpackage;

public final class ndi extends nyx<ndi> {
    public int a;
    public int b;
    public ndk c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ndi() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(4, this.b);
        }
        return b;
    }

    private ndi b(nyt nyt) {
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
                        case 6:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new ndk();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = a;
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
