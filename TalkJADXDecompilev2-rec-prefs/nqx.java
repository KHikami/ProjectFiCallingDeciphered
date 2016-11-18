package p000;

public final class nqx extends nyx<nqx> {
    public nqw f30531a;
    public int f30532b;
    public Long f30533c;
    public npi f30534d;

    public /* synthetic */ nzf m36209a(nyt nyt) {
        return m36208b(nyt);
    }

    public nqx() {
        this.f30532b = nzf.UNSET_ENUM_VALUE;
        this.f30533c = null;
        this.cachedSize = -1;
    }

    public void m36210a(nyu nyu) {
        if (this.f30531a != null) {
            nyu.m37182b(1, this.f30531a);
        }
        if (this.f30532b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f30532b);
        }
        if (this.f30533c != null) {
            nyu.m37181b(3, this.f30533c.longValue());
        }
        if (this.f30534d != null) {
            nyu.m37182b(4, this.f30534d);
        }
        super.a(nyu);
    }

    protected int m36211b() {
        int b = super.b();
        if (this.f30531a != null) {
            b += nyu.m37145d(1, this.f30531a);
        }
        if (this.f30532b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f30532b);
        }
        if (this.f30533c != null) {
            b += nyu.m37148f(3, this.f30533c.longValue());
        }
        if (this.f30534d != null) {
            return b + nyu.m37145d(4, this.f30534d);
        }
        return b;
    }

    private nqx m36208b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30531a == null) {
                        this.f30531a = new nqw();
                    }
                    nyt.m37101a(this.f30531a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f30532b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f30533c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f30534d == null) {
                        this.f30534d = new npi();
                    }
                    nyt.m37101a(this.f30534d);
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
