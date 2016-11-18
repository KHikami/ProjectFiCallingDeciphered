package p000;

public final class nqp extends nyx<nqp> {
    public int f30515a;
    public mzw f30516b;
    public int f30517c;
    public nqq f30518d;

    public /* synthetic */ nzf m36177a(nyt nyt) {
        return m36176b(nyt);
    }

    public nqp() {
        this.f30515a = nzf.UNSET_ENUM_VALUE;
        this.f30517c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36178a(nyu nyu) {
        if (this.f30515a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30515a);
        }
        if (this.f30516b != null) {
            nyu.m37182b(2, this.f30516b);
        }
        if (this.f30517c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f30517c);
        }
        if (this.f30518d != null) {
            nyu.m37182b(5, this.f30518d);
        }
        super.a(nyu);
    }

    protected int m36179b() {
        int b = super.b();
        if (this.f30515a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30515a);
        }
        if (this.f30516b != null) {
            b += nyu.m37145d(2, this.f30516b);
        }
        if (this.f30517c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f30517c);
        }
        if (this.f30518d != null) {
            return b + nyu.m37145d(5, this.f30518d);
        }
        return b;
    }

    private nqp m36176b(nyt nyt) {
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
                            this.f30515a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30516b == null) {
                        this.f30516b = new mzw();
                    }
                    nyt.m37101a(this.f30516b);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30517c = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f30518d == null) {
                        this.f30518d = new nqq();
                    }
                    nyt.m37101a(this.f30518d);
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
