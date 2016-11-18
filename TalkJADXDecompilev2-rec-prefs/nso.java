package p000;

public final class nso extends nyx<nso> {
    public Integer f30716a;
    public Boolean f30717b;
    public nsn f30718c;

    public /* synthetic */ nzf m36387a(nyt nyt) {
        return m36386b(nyt);
    }

    public nso() {
        this.f30716a = null;
        this.f30717b = null;
        this.cachedSize = -1;
    }

    public void m36388a(nyu nyu) {
        if (this.f30716a != null) {
            nyu.m37168a(1, this.f30716a.intValue());
        }
        if (this.f30717b != null) {
            nyu.m37172a(2, this.f30717b.booleanValue());
        }
        if (this.f30718c != null) {
            nyu.m37182b(3, this.f30718c);
        }
        super.a(nyu);
    }

    protected int m36389b() {
        int b = super.b();
        if (this.f30716a != null) {
            b += nyu.m37147f(1, this.f30716a.intValue());
        }
        if (this.f30717b != null) {
            this.f30717b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f30718c != null) {
            return b + nyu.m37145d(3, this.f30718c);
        }
        return b;
    }

    private nso m36386b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30716a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30717b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f30718c == null) {
                        this.f30718c = new nsn();
                    }
                    nyt.m37101a(this.f30718c);
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
