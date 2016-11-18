package p000;

public final class nfj extends nyx<nfj> {
    public Integer f29677a;
    public Integer f29678b;

    public /* synthetic */ nzf m34683a(nyt nyt) {
        return m34681b(nyt);
    }

    public nfj() {
        m34682d();
    }

    private nfj m34682d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34684a(nyu nyu) {
        if (this.f29677a != null) {
            nyu.m37168a(1, this.f29677a.intValue());
        }
        if (this.f29678b != null) {
            nyu.m37168a(3, this.f29678b.intValue());
        }
        super.a(nyu);
    }

    protected int m34685b() {
        int b = super.b();
        if (this.f29677a != null) {
            b += nyu.m37147f(1, this.f29677a.intValue());
        }
        if (this.f29678b != null) {
            return b + nyu.m37147f(3, this.f29678b.intValue());
        }
        return b;
    }

    private nfj m34681b(nyt nyt) {
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
                            this.f29677a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29678b = Integer.valueOf(a);
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
