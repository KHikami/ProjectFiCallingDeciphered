package p000;

public final class nnn extends nyx<nnn> {
    public Boolean f30296a;
    public Integer f30297b;

    public /* synthetic */ nzf m35792a(nyt nyt) {
        return m35790b(nyt);
    }

    public nnn() {
        m35791d();
    }

    private nnn m35791d() {
        this.f30296a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35793a(nyu nyu) {
        if (this.f30296a != null) {
            nyu.m37172a(1, this.f30296a.booleanValue());
        }
        if (this.f30297b != null) {
            nyu.m37168a(2, this.f30297b.intValue());
        }
        super.a(nyu);
    }

    protected int m35794b() {
        int b = super.b();
        if (this.f30296a != null) {
            this.f30296a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30297b != null) {
            return b + nyu.m37147f(2, this.f30297b.intValue());
        }
        return b;
    }

    private nnn m35790b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30296a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30297b = Integer.valueOf(a);
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
