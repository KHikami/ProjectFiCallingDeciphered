package p000;

public final class nse extends nyx<nse> {
    public int f30682a;
    public nrg f30683b;
    public nox f30684c;
    public ndr f30685d;
    public nor f30686e;
    public ncd f30687f;

    public /* synthetic */ nzf m36346a(nyt nyt) {
        return m36345b(nyt);
    }

    public nse() {
        this.f30682a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36347a(nyu nyu) {
        if (this.f30682a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30682a);
        }
        if (this.f30683b != null) {
            nyu.m37182b(2, this.f30683b);
        }
        if (this.f30684c != null) {
            nyu.m37182b(3, this.f30684c);
        }
        if (this.f30685d != null) {
            nyu.m37182b(4, this.f30685d);
        }
        if (this.f30686e != null) {
            nyu.m37182b(5, this.f30686e);
        }
        if (this.f30687f != null) {
            nyu.m37182b(6, this.f30687f);
        }
        super.a(nyu);
    }

    protected int m36348b() {
        int b = super.b();
        if (this.f30682a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30682a);
        }
        if (this.f30683b != null) {
            b += nyu.m37145d(2, this.f30683b);
        }
        if (this.f30684c != null) {
            b += nyu.m37145d(3, this.f30684c);
        }
        if (this.f30685d != null) {
            b += nyu.m37145d(4, this.f30685d);
        }
        if (this.f30686e != null) {
            b += nyu.m37145d(5, this.f30686e);
        }
        if (this.f30687f != null) {
            return b + nyu.m37145d(6, this.f30687f);
        }
        return b;
    }

    private nse m36345b(nyt nyt) {
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
                        case 4:
                        case 5:
                            this.f30682a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30683b == null) {
                        this.f30683b = new nrg();
                    }
                    nyt.m37101a(this.f30683b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30684c == null) {
                        this.f30684c = new nox();
                    }
                    nyt.m37101a(this.f30684c);
                    continue;
                case 34:
                    if (this.f30685d == null) {
                        this.f30685d = new ndr();
                    }
                    nyt.m37101a(this.f30685d);
                    continue;
                case 42:
                    if (this.f30686e == null) {
                        this.f30686e = new nor();
                    }
                    nyt.m37101a(this.f30686e);
                    continue;
                case 50:
                    if (this.f30687f == null) {
                        this.f30687f = new ncd();
                    }
                    nyt.m37101a(this.f30687f);
                    continue;
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
