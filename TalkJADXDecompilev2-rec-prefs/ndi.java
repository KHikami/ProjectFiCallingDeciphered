package p000;

public final class ndi extends nyx<ndi> {
    public int f29556a;
    public int f29557b;
    public ndk f29558c;
    public String f29559d;

    public /* synthetic */ nzf m34419a(nyt nyt) {
        return m34418b(nyt);
    }

    public ndi() {
        this.f29556a = nzf.UNSET_ENUM_VALUE;
        this.f29557b = nzf.UNSET_ENUM_VALUE;
        this.f29559d = null;
        this.cachedSize = -1;
    }

    public void m34420a(nyu nyu) {
        if (this.f29556a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29556a);
        }
        if (this.f29558c != null) {
            nyu.m37182b(2, this.f29558c);
        }
        if (this.f29559d != null) {
            nyu.m37170a(3, this.f29559d);
        }
        if (this.f29557b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f29557b);
        }
        super.a(nyu);
    }

    protected int m34421b() {
        int b = super.b();
        if (this.f29556a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29556a);
        }
        if (this.f29558c != null) {
            b += nyu.m37145d(2, this.f29558c);
        }
        if (this.f29559d != null) {
            b += nyu.m37137b(3, this.f29559d);
        }
        if (this.f29557b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(4, this.f29557b);
        }
        return b;
    }

    private ndi m34418b(nyt nyt) {
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
                        case 2:
                        case 3:
                        case 6:
                            this.f29556a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29558c == null) {
                        this.f29558c = new ndk();
                    }
                    nyt.m37101a(this.f29558c);
                    continue;
                case wi.dx /*26*/:
                    this.f29559d = nyt.m37117j();
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29557b = a;
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
